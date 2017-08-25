# PreosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**precosGet**](PreosApi.md#precosGet) | **GET** /precos | 


<a name="precosGet"></a>
# **precosGet**
> List&lt;InlineResponse2001&gt; precosGet(clientId, accessToken, codigoServico, cepOrigem, cepDestino, peso, formato, comprimento, altura, largura, diametro, valorDeclarado, servicoMaoPropria, avisoRecebimento)



Cálculo de Preços por CEP origem + CEP Destino e tipo de entrega.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PreosApi;


PreosApi apiInstance = new PreosApi();
String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
String codigoServico = "codigoServico_example"; // String | Pode conter mais de um ódigo por consulta separados por virgula. 40010 - SEDEX Varejo, 40045 - SEDEX a Cobrar Varejo, 40215 - SEDEX 10 Varejo, 40290 - SEDEX Hoje Varejo, 41106 - PAC Varejo
String cepOrigem = "cepOrigem_example"; // String | CEP de Origem sem hífen.Exemplo: 05311900
String cepDestino = "cepDestino_example"; // String | CEP de Destino sem hífen
BigDecimal peso = new BigDecimal(); // BigDecimal | Peso da encomenda, incluindo sua embalagem. O peso deve ser informado em quilogramas. Se o formato for Envelope, o valor máximo permitido será 1 kg
Integer formato = 56; // Integer | Formato da encomenda (incluindo embalagem). 1 - Formato caixa/pacote, 2 - Formato rolo/prisma, 3 - Envelope
BigDecimal comprimento = new BigDecimal(); // BigDecimal | Comprimento da encomenda (incluindo embalagem), em centímetros.
BigDecimal altura = new BigDecimal(); // BigDecimal | Altura da encomenda (incluindo embalagem), em centímetros. Se o formato for envelope, informar zero (0).
BigDecimal largura = new BigDecimal(); // BigDecimal | Largura da encomenda (incluindo embalagem), em centímetros.
BigDecimal diametro = new BigDecimal(); // BigDecimal | Diâmetro da encomenda (incluindo embalagem), em centímetros.
BigDecimal valorDeclarado = new BigDecimal(); // BigDecimal | Indica se a encomenda será entregue com o serviço adicional valor declarado. Neste campo deve ser apresentado o valor declarado desejado, em Reais.
String servicoMaoPropria = "N"; // String | Indica se a encomenda será entregue com o serviço adicional mão própria. Valores possíveis: S ou N (S - Sim, N - Não)
String avisoRecebimento = "N"; // String | Indica se a encomenda será entregue com o serviço adicional aviso de recebimento. Valores possíveis: S ou N (S - Sim, N - Não)
try {
    List<InlineResponse2001> result = apiInstance.precosGet(clientId, accessToken, codigoServico, cepOrigem, cepDestino, peso, formato, comprimento, altura, largura, diametro, valorDeclarado, servicoMaoPropria, avisoRecebimento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreosApi#precosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificaçáo do cliente usado na autenticaçáo. |
 **accessToken** | **String**| Access token usado na autenticaçáo. |
 **codigoServico** | **String**| Pode conter mais de um ódigo por consulta separados por virgula. 40010 - SEDEX Varejo, 40045 - SEDEX a Cobrar Varejo, 40215 - SEDEX 10 Varejo, 40290 - SEDEX Hoje Varejo, 41106 - PAC Varejo |
 **cepOrigem** | **String**| CEP de Origem sem hífen.Exemplo: 05311900 |
 **cepDestino** | **String**| CEP de Destino sem hífen |
 **peso** | **BigDecimal**| Peso da encomenda, incluindo sua embalagem. O peso deve ser informado em quilogramas. Se o formato for Envelope, o valor máximo permitido será 1 kg |
 **formato** | **Integer**| Formato da encomenda (incluindo embalagem). 1 - Formato caixa/pacote, 2 - Formato rolo/prisma, 3 - Envelope |
 **comprimento** | **BigDecimal**| Comprimento da encomenda (incluindo embalagem), em centímetros. |
 **altura** | **BigDecimal**| Altura da encomenda (incluindo embalagem), em centímetros. Se o formato for envelope, informar zero (0). |
 **largura** | **BigDecimal**| Largura da encomenda (incluindo embalagem), em centímetros. |
 **diametro** | **BigDecimal**| Diâmetro da encomenda (incluindo embalagem), em centímetros. |
 **valorDeclarado** | **BigDecimal**| Indica se a encomenda será entregue com o serviço adicional valor declarado. Neste campo deve ser apresentado o valor declarado desejado, em Reais. |
 **servicoMaoPropria** | **String**| Indica se a encomenda será entregue com o serviço adicional mão própria. Valores possíveis: S ou N (S - Sim, N - Não) | [optional] [default to N]
 **avisoRecebimento** | **String**| Indica se a encomenda será entregue com o serviço adicional aviso de recebimento. Valores possíveis: S ou N (S - Sim, N - Não) | [optional] [default to N]

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

