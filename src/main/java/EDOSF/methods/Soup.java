package EDOSF.methods;

import okhttp3.*;

public class Soup {
    public static String responseString;

    public static String send(String srt){
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/xml");
            RequestBody body = RequestBody.create(mediaType, srt);
            Request request = new Request.Builder()
                    .url("http://10.48.0.13:8077/ws/iit/portal/DataExchangeService")
                    .method("POST", body)
                    .addHeader("Content-Type", "text/xml")
                    .build();
            Response response = client.newCall(request).execute();
            responseString = response.body().string();
            System.out.println(responseString);
            responseString = responseString.substring(216, 252);
            System.out.println(responseString);
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Проблема в отправке SOAP запроса");
        }
            return responseString;
    }
}
