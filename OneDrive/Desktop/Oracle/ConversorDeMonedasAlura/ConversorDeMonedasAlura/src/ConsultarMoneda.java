import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ConsultarMoneda {
    private static final String API_KEY = "c2b977d118e7378ba9f62a48";

    public ConsultarMoneda() {
    }

    public Monedas buscarMoneda(String monedaBase, String monedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c2b977d118e7378ba9f62a48/pair/" + monedaBase + "/" + monedaTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la API: " + (String)response.body());
            } else {
                Gson gson = new Gson();
                ExchangeRateResponse apiResponse = (ExchangeRateResponse)gson.fromJson((String)response.body(), ExchangeRateResponse.class);
                return new Monedas(apiResponse.getBase_code(), apiResponse.getTarget_code(), apiResponse.getConversion_rate());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la moneda: " + e.getMessage(), e);
        }
    }
}

