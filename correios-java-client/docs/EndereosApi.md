# EndereosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enderecosCepGet**](EndereosApi.md#enderecosCepGet) | **GET** /enderecos/{cep} | 


<a name="enderecosCepGet"></a>
# **enderecosCepGet**
> List&lt;InlineResponse2002&gt; enderecosCepGet(clientId, accessToken, cep)



Pesquisa pelo endereço de um dado CEP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EndereosApi;


EndereosApi apiInstance = new EndereosApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String cep = "cep_example"; // String | CEP a ser pesquisado.
try {
    List<InlineResponse2002> result = apiInstance.enderecosCepGet(clientId, accessToken, cep);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndereosApi#enderecosCepGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **cep** | **String**| CEP a ser pesquisado. |

### Return type

[**List&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

