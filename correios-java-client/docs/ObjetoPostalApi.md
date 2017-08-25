# ObjetoPostalApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventosTipoEventoGet**](ObjetoPostalApi.md#eventosTipoEventoGet) | **GET** /eventos/{tipoEvento} | 
[**objetosCodigoObjetoGet**](ObjetoPostalApi.md#objetosCodigoObjetoGet) | **GET** /objetos/{codigoObjeto} | 
[**objetosGet**](ObjetoPostalApi.md#objetosGet) | **GET** /objetos | 


<a name="eventosTipoEventoGet"></a>
# **eventosTipoEventoGet**
> List&lt;InlineResponse2004&gt; eventosTipoEventoGet(clientId, accessToken, tipoEvento, statusEvento)



Retorna uma lista de possiveis status para um determinado evento.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObjetoPostalApi;


ObjetoPostalApi apiInstance = new ObjetoPostalApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String tipoEvento = "tipoEvento_example"; // String | Tipo de evento a ser pesquisado.
String statusEvento = "statusEvento_example"; // String | Status a ser filtrado.
try {
    List<InlineResponse2004> result = apiInstance.eventosTipoEventoGet(clientId, accessToken, tipoEvento, statusEvento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjetoPostalApi#eventosTipoEventoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **tipoEvento** | **String**| Tipo de evento a ser pesquisado. |
 **statusEvento** | **String**| Status a ser filtrado. | [optional]

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="objetosCodigoObjetoGet"></a>
# **objetosCodigoObjetoGet**
> List&lt;ObjetosEventos&gt; objetosCodigoObjetoGet(clientId, accessToken, codigoObjeto, tipoEvento)



Pesquisa por informações relacionadas a um objeto postal especifico.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObjetoPostalApi;


ObjetoPostalApi apiInstance = new ObjetoPostalApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String codigoObjeto = "codigoObjeto_example"; // String | Codigo do objeto a ser pesquisado.
String tipoEvento = "tipoEvento_example"; // String | Tipo de evento a ser filtrado.
try {
    List<ObjetosEventos> result = apiInstance.objetosCodigoObjetoGet(clientId, accessToken, codigoObjeto, tipoEvento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjetoPostalApi#objetosCodigoObjetoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **codigoObjeto** | **String**| Codigo do objeto a ser pesquisado. |
 **tipoEvento** | **String**| Tipo de evento a ser filtrado. | [optional]

### Return type

[**List&lt;ObjetosEventos&gt;**](ObjetosEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="objetosGet"></a>
# **objetosGet**
> List&lt;InlineResponse2003&gt; objetosGet(clientId, accessToken, codigoObjeto)



Pesquisa por informações relacionados a uma lista de objetos postais.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ObjetoPostalApi;


ObjetoPostalApi apiInstance = new ObjetoPostalApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String codigoObjeto = "codigoObjeto_example"; // String | Lista, separada por virgula, com codigos de objetos postais.
try {
    List<InlineResponse2003> result = apiInstance.objetosGet(clientId, accessToken, codigoObjeto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjetoPostalApi#objetosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **codigoObjeto** | **String**| Lista, separada por virgula, com codigos de objetos postais. |

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

