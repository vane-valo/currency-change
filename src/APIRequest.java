import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIRequest {

    public CurrencyRecord currencyConversion(String base_code, String target_code, double amount){

        URI link = URI.create("https://v6.exchangerate-api.com/v6/6eb8752d684bda000bfdce8a/pair/"
                + base_code + "/"
                + target_code + "/"
                + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CurrencyRecord.class);
        } catch (Exception e){
            throw new RuntimeException("Error: " + e);
        }
    }
}
