import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;
import org.json.JSONObject;
import org.json.JSONTokener;

// Zwykła klasa (nie kompaktowy plik), bo inne pliki wywołują Api.pobierz(...)
public class Api {
  public static JSONObject pobierz(String adres) throws Exception {
    URLConnection polaczenie = URI.create(adres).toURL().openConnection();
    polaczenie.setConnectTimeout(20000);
    polaczenie.setReadTimeout(20000);
    try (InputStream dane = polaczenie.getInputStream()) {
      return new JSONObject(new JSONTokener(dane));
    }
  }
}
