package Constant;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

public class JavaConnection {

     public static Response get(String route) {
          Response response = null;
          try {
               OkHttpClient client = new OkHttpClient();
               Request request = new Request.Builder()
                    .url(new JavaBaseUrl().getBaseUrl() + route)
                    .header("Authorization", "Bearer " + JavaConstant.token)
                    .build();
               response = client.newCall(request).execute();

          } catch (Exception e) {
               System.err.println("getting error during call request " + e);
          }
          return response;
     }

     public static Response login(String route, JSONObject json) {
          Response response = null;
          try {
               OkHttpClient client = new OkHttpClient();
               RequestBody body = RequestBody.create(
                    JavaConstant.JSON,
                    json.toString());
               Request request = new Request.Builder()
                    .url(new JavaBaseUrl().getBaseUrl() + JavaRoute.login)
                    .post(body).build();
               response = client.newCall(request).execute();
          } catch (Exception e) {
               System.err.println("getting error during call request " + e);
          }
          return response;
     }

     public static Response post(String route, JSONObject json) {
          Response response = null;
          String url = new JavaBaseUrl().getBaseUrl() + route;
          try {
               OkHttpClient client = new OkHttpClient();
               RequestBody body = RequestBody.create(
                    JavaConstant.JSON,
                    json.toString());
               Request request = new Request.Builder()
                    .url(url)
                    .header("Authorization", "Bearer " + JavaConstant.token)
                    .post(body).build();
               response = client.newCall(request).execute();
               String data = response.body().string();
               System.err.println("message = " + data);
          } catch (Exception e) {
               System.err.println("getting error during call request " + e);
          }
          return response;
     }

}
