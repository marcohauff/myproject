package com.marco.firstspring;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;


public class SendJason {

        public void Post_JSON() {
        String query_url = "https://int-travelhub.gcsip.nl/travelhub/api/tpa/v1/paymentMethods";
        String json = "{\n  \"merchantId\" : \"23456780\"\n}";



        System.out.println(json);

        try {
            URL url = new URL(query_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty( "Authorization", "Basic MjZhZjZiMTdjZTE5NWIwZDozMjFjNzc2M2Q0MzAwNTk1" );
            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes("UTF-8"));
            os.close();
            // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
            String result = IOUtils.toString(in, "UTF-8");
            System.out.println(result);
            System.out.println("result after Reading JSON Response");
            JSONObject myResponse = new JSONObject(result);


            System.out.println("antwoord"+myResponse.get("paymentMethod"));
            in.close();
            conn.disconnect();
        } catch (Exception e) {
            System.out.println(e);

          // include code to go back to main screen

          //  MarcoSpringApplication x = new MarcoSpringApplication();
         //   x.main();

        }
    }
}

