# CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cepEstadoGet**](CEPApi.md#cepEstadoGet) | **GET** /cep/{estado} | 


<a name="cepEstadoGet"></a>
# **cepEstadoGet**
> List&lt;InlineResponse200&gt; cepEstadoGet(clientId, accessToken, estado, municipio)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CEPApi;


CEPApi apiInstance = new CEPApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String estado = "estado_example"; // String | Abreviaçáo do Estado.
String municipio = "municipio_example"; // String | Nome do Município.
try {
    List<InlineResponse200> result = apiInstance.cepEstadoGet(clientId, accessToken, estado, municipio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CEPApi#cepEstadoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **estado** | **String**| Abreviaçáo do Estado. |
 **municipio** | **String**| Nome do Município. | [optional]

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

