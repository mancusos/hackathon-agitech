/**
 * API dos Correios
 * API de rastreios de Objetos Postais
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package br.com.sensedia.correios.api.v1.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import br.com.sensedia.correios.api.v1.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CalculoPrecoFrete".equalsIgnoreCase(className)) {
      return new TypeToken<List<CalculoPrecoFrete>>(){}.getType();
    }
    
    if ("DetalhesEventos".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalhesEventos>>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<Endereco>>(){}.getType();
    }
    
    if ("Erro".equalsIgnoreCase(className)) {
      return new TypeToken<List<Erro>>(){}.getType();
    }
    
    if ("Eventos".equalsIgnoreCase(className)) {
      return new TypeToken<List<Eventos>>(){}.getType();
    }
    
    if ("FaixaCEP".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaixaCEP>>(){}.getType();
    }
    
    if ("ObjetoPostal".equalsIgnoreCase(className)) {
      return new TypeToken<List<ObjetoPostal>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CalculoPrecoFrete".equalsIgnoreCase(className)) {
      return new TypeToken<CalculoPrecoFrete>(){}.getType();
    }
    
    if ("DetalhesEventos".equalsIgnoreCase(className)) {
      return new TypeToken<DetalhesEventos>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<Endereco>(){}.getType();
    }
    
    if ("Erro".equalsIgnoreCase(className)) {
      return new TypeToken<Erro>(){}.getType();
    }
    
    if ("Eventos".equalsIgnoreCase(className)) {
      return new TypeToken<Eventos>(){}.getType();
    }
    
    if ("FaixaCEP".equalsIgnoreCase(className)) {
      return new TypeToken<FaixaCEP>(){}.getType();
    }
    
    if ("ObjetoPostal".equalsIgnoreCase(className)) {
      return new TypeToken<ObjetoPostal>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
