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

package br.com.sensedia.correios.api.v1;

import br.com.sensedia.correios.api.v1.client.ApiInvoker;
import br.com.sensedia.correios.api.v1.client.ApiException;
import br.com.sensedia.correios.api.v1.client.Pair;

import br.com.sensedia.correios.api.v1.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import br.com.sensedia.correios.api.v1.model.DetalhesEventos;
import br.com.sensedia.correios.api.v1.model.Erro;
import br.com.sensedia.correios.api.v1.model.Eventos;
import br.com.sensedia.correios.api.v1.model.ObjetoPostal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjetoPostalApi {
  String basePath = "https://api-visa.sensedia.com/sandbox/visa/correios/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 
  * Retorna uma lista de possiveis status para um determinado evento.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo.
   * @param accessToken Access token usado na autenticaçáo.
   * @param tipoEvento Tipo de evento a ser pesquisado.
   * @param statusEvento Status a ser filtrado.
   * @return List<DetalhesEventos>
  */
  public List<DetalhesEventos> getDetalhesEventos (String clientId, String accessToken, String tipoEvento, String statusEvento) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getDetalhesEventos",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getDetalhesEventos"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDetalhesEventos",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDetalhesEventos"));
    }
    // verify the required parameter 'tipoEvento' is set
    if (tipoEvento == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'tipoEvento' when calling getDetalhesEventos",
        new ApiException(400, "Missing the required parameter 'tipoEvento' when calling getDetalhesEventos"));
    }

    // create path and map variables
    String path = "/eventos/{tipoEvento}".replaceAll("\\{" + "tipoEvento" + "\\}", apiInvoker.escapeString(tipoEvento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusEvento", statusEvento));
    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<DetalhesEventos>) ApiInvoker.deserialize(localVarResponse, "array", DetalhesEventos.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * Retorna uma lista de possiveis status para um determinado evento.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo.   * @param accessToken Access token usado na autenticaçáo.   * @param tipoEvento Tipo de evento a ser pesquisado.   * @param statusEvento Status a ser filtrado.
  */
  private void getDetalhesEventos (String clientId, String accessToken, String tipoEvento, String statusEvento, final Response.Listener<List<DetalhesEventos>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getDetalhesEventos",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getDetalhesEventos"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDetalhesEventos",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDetalhesEventos"));
    }
    // verify the required parameter 'tipoEvento' is set
    if (tipoEvento == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'tipoEvento' when calling getDetalhesEventos",
        new ApiException(400, "Missing the required parameter 'tipoEvento' when calling getDetalhesEventos"));
    }

    // create path and map variables
    String path = "/eventos/{tipoEvento}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "tipoEvento" + "\\}", apiInvoker.escapeString(tipoEvento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusEvento", statusEvento));

    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<DetalhesEventos>) ApiInvoker.deserialize(localVarResponse,  "array", DetalhesEventos.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * Pesquisa por informações relacionadas a um objeto postal especifico.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo.
   * @param accessToken Access token usado na autenticaçáo.
   * @param codigoObjeto Codigo do objeto a ser pesquisado.
   * @param tipoEvento Tipo de evento a ser filtrado.
   * @return List<Eventos>
  */
  public List<Eventos> getEventos (String clientId, String accessToken, String codigoObjeto, String tipoEvento) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getEventos",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getEventos"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getEventos",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getEventos"));
    }
    // verify the required parameter 'codigoObjeto' is set
    if (codigoObjeto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'codigoObjeto' when calling getEventos",
        new ApiException(400, "Missing the required parameter 'codigoObjeto' when calling getEventos"));
    }

    // create path and map variables
    String path = "/objetos/{codigoObjeto}".replaceAll("\\{" + "codigoObjeto" + "\\}", apiInvoker.escapeString(codigoObjeto.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));
    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<Eventos>) ApiInvoker.deserialize(localVarResponse, "array", Eventos.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * Pesquisa por informações relacionadas a um objeto postal especifico.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo.   * @param accessToken Access token usado na autenticaçáo.   * @param codigoObjeto Codigo do objeto a ser pesquisado.   * @param tipoEvento Tipo de evento a ser filtrado.
  */
  private void getEventos (String clientId, String accessToken, String codigoObjeto, String tipoEvento, final Response.Listener<List<Eventos>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getEventos",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getEventos"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getEventos",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getEventos"));
    }
    // verify the required parameter 'codigoObjeto' is set
    if (codigoObjeto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'codigoObjeto' when calling getEventos",
        new ApiException(400, "Missing the required parameter 'codigoObjeto' when calling getEventos"));
    }

    // create path and map variables
    String path = "/objetos/{codigoObjeto}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "codigoObjeto" + "\\}", apiInvoker.escapeString(codigoObjeto.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));

    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Eventos>) ApiInvoker.deserialize(localVarResponse,  "array", Eventos.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * Pesquisa por informações relacionados a uma lista de objetos postais.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo.
   * @param accessToken Access token usado na autenticaçáo.
   * @param codigoObjeto Lista, separada por virgula, com codigos de objetos postais.
   * @return List<ObjetoPostal>
  */
  public List<ObjetoPostal> getObjetos (String clientId, String accessToken, String codigoObjeto) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getObjetos",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getObjetos"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getObjetos",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getObjetos"));
    }
    // verify the required parameter 'codigoObjeto' is set
    if (codigoObjeto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'codigoObjeto' when calling getObjetos",
        new ApiException(400, "Missing the required parameter 'codigoObjeto' when calling getObjetos"));
    }

    // create path and map variables
    String path = "/objetos";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoObjeto", codigoObjeto));
    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<ObjetoPostal>) ApiInvoker.deserialize(localVarResponse, "array", ObjetoPostal.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * Pesquisa por informações relacionados a uma lista de objetos postais.
   * @param clientId Identificaçáo do cliente usado na autenticaçáo.   * @param accessToken Access token usado na autenticaçáo.   * @param codigoObjeto Lista, separada por virgula, com codigos de objetos postais.
  */
  private void getObjetos (String clientId, String accessToken, String codigoObjeto, final Response.Listener<List<ObjetoPostal>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getObjetos",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getObjetos"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getObjetos",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getObjetos"));
    }
    // verify the required parameter 'codigoObjeto' is set
    if (codigoObjeto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'codigoObjeto' when calling getObjetos",
        new ApiException(400, "Missing the required parameter 'codigoObjeto' when calling getObjetos"));
    }

    // create path and map variables
    String path = "/objetos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoObjeto", codigoObjeto));

    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ObjetoPostal>) ApiInvoker.deserialize(localVarResponse,  "array", ObjetoPostal.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
