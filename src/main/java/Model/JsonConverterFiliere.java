package Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConverterFiliere {
    public String toJson(Filiere f) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.toJson(f);
    }
    public Filiere fromJson(String json) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.fromJson(json, Filiere.class);
    }
}
