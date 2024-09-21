package Model;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class JsonConverter {
    public String toJson(Etudiant e ) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson =gsonBuilder.create();
        return gson.toJson(e);
    }
    public Etudiant fromJson(String json) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson =gsonBuilder.create();
        return gson.fromJson(json, Etudiant.class);
    }

}
