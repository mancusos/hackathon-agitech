# EventsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventIdGet**](EventsApi.md#eventsEventIdGet) | **GET** /events/{eventId} | 
[**eventsEventIdSectorsGet**](EventsApi.md#eventsEventIdSectorsGet) | **GET** /events/{eventId}/sectors | 
[**eventsEventIdSectorsSectorIdGet**](EventsApi.md#eventsEventIdSectorsSectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId} | 
[**eventsEventIdSectorsSectorIdSubsectorsGet**](EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors | 
[**eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**](EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
[**eventsGet**](EventsApi.md#eventsGet) | **GET** /events | 


<a name="eventsEventIdGet"></a>
# **eventsEventIdGet**
> InlineResponse200 eventsEventIdGet(clientId, accessToken, eventId)



Returns the details for a specific occurring event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
try {
    InlineResponse200 result = apiInstance.eventsEventIdGet(clientId, accessToken, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsEventIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsGet"></a>
# **eventsEventIdSectorsGet**
> InlineResponse2001 eventsEventIdSectorsGet(clientId, accessToken, eventId)



Returns a list of sector for the given event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
try {
    InlineResponse2001 result = apiInstance.eventsEventIdSectorsGet(clientId, accessToken, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsEventIdSectorsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsSectorIdGet"></a>
# **eventsEventIdSectorsSectorIdGet**
> InlineResponse2002 eventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId)



Returns the details of a specific sector.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
String sectorId = "sectorId_example"; // String | Sector to search.
try {
    InlineResponse2002 result = apiInstance.eventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsEventIdSectorsSectorIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |
 **sectorId** | **String**| Sector to search. |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsSectorIdSubsectorsGet"></a>
# **eventsEventIdSectorsSectorIdSubsectorsGet**
> InlineResponse2002 eventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId)



Returns a list of subcsectors for a given sector.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
String sectorId = "sectorId_example"; // String | Sector to search.
try {
    InlineResponse2002 result = apiInstance.eventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsEventIdSectorsSectorIdSubsectorsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |
 **sectorId** | **String**| Sector to search. |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet"></a>
# **eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**
> List&lt;InlineResponse2003&gt; eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId)



Returns a list of seat&#39;s information for each row of a given subsector.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
String sectorId = "sectorId_example"; // String | Sector to search.
String subsectorId = "subsectorId_example"; // String | Subsector to search.
try {
    List<InlineResponse2003> result = apiInstance.eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |
 **sectorId** | **String**| Sector to search. |
 **subsectorId** | **String**| Subsector to search. |

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsGet"></a>
# **eventsGet**
> List&lt;InlineResponse200&gt; eventsGet(clientId, accessToken)



Returns a list of existing events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
try {
    List<InlineResponse200> result = apiInstance.eventsGet(clientId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

