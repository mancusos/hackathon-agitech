/**
 * API Agillitas Cartões Pré-pagos
 * API para manipular recursos relacionadas aos  cartões pré-pagos Agillitas.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.ApiInvoker;
import com.sensedia.agillitas.api.v1.client.ApiException;
import com.sensedia.agillitas.api.v1.client.Pair;

import com.sensedia.agillitas.api.v1.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.Pagamento;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PagamentosApi {
  String basePath = "https://api-visa.sensedia.com/sandbox/visa/agillitas/v1";
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
  * Pagamento de boletos.
  * &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação.
   * @param accessToken Token de acesso utilizado na autenticação.
   * @param boleto Objeto de requisição
   * @return void
  */
  public void realizarPagamento (String clientId, String accessToken, Pagamento boleto) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = boleto;
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling realizarPagamento",
        new ApiException(400, "Missing the required parameter 'clientId' when calling realizarPagamento"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling realizarPagamento",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling realizarPagamento"));
    }
    // verify the required parameter 'boleto' is set
    if (boleto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'boleto' when calling realizarPagamento",
        new ApiException(400, "Missing the required parameter 'boleto' when calling realizarPagamento"));
    }

    // create path and map variables
    String path = "/pagamentos";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));
    String[] contentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
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
   * Pagamento de boletos.
   * &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação.   * @param accessToken Token de acesso utilizado na autenticação.   * @param boleto Objeto de requisição
  */
  private void realizarPagamento (String clientId, String accessToken, Pagamento boleto, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = boleto;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling realizarPagamento",
        new ApiException(400, "Missing the required parameter 'clientId' when calling realizarPagamento"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling realizarPagamento",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling realizarPagamento"));
    }
    // verify the required parameter 'boleto' is set
    if (boleto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'boleto' when calling realizarPagamento",
        new ApiException(400, "Missing the required parameter 'boleto' when calling realizarPagamento"));
    }

    // create path and map variables
    String path = "/pagamentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("client_id", ApiInvoker.parameterToString(clientId));
    headerParams.put("access_token", ApiInvoker.parameterToString(accessToken));

    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
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
