import org.json.JSONArray;
import org.json.JSONObject;

void main() throws Exception {
  JSONObject dane = Api.pobierz("https://store.steampowered.com/api/featuredcategories/?cc=pl&l=polish");
  JSONArray gry = dane.getJSONObject("specials").getJSONArray("items");
  if (gry.length() > 0) {
    JSONObject gra = gry.getJSONObject(0);
    String nazwa = gra.getString("name");
    int rabat = gra.getInt("discount_percent");
    System.out.println(nazwa + ", rabat: " + rabat + "%");
  }
}
