import org.json.JSONArray;
import org.json.JSONObject;

void main() throws Exception {
  JSONObject dane = Api.pobierz("https://store.steampowered.com/api/featuredcategories/?cc=pl&l=polish");
  JSONArray gry = dane.getJSONObject("specials").getJSONArray("items");
  int minimalnyRabat = 75;
  for (int i = 0; i < gry.length(); i++) {
    JSONObject gra = gry.getJSONObject(i);
    int rabat = gra.getInt("discount_percent");
    if (rabat >= minimalnyRabat) {
      System.out.println(gra.getString("name") + ": " + rabat + "%");
    }
  }
}
