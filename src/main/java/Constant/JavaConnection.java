package Constant;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

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
}
