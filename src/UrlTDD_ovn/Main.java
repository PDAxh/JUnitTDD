package UrlTDD_ovn;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;


public class Main {

    public static void main(String[] args) throws Exception {

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet();
        CloseableHttpResponse response = client.execute(request);
        try{
            HttpEntity entity = response.getEntity();
            //JSONArray arr = (JSONObject)
        } catch (Exception e){

        }

    }
}
