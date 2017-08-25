# ApiDoFutebolcard.EventsApi

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
> Events eventsEventIdGet(clientId, accessToken, eventId)



Returns the details for a specific occurring event.

### Example
```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var apiInstance = new ApiDoFutebolcard.EventsApi();

var clientId = "clientId_example"; // String | Customer identifier used for authentication.

var accessToken = "accessToken_example"; // String | Access token used in the authentication.

var eventId = "eventId_example"; // String | Event to search.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventsEventIdGet(clientId, accessToken, eventId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. | 
 **accessToken** | **String**| Access token used in the authentication. | 
 **eventId** | **String**| Event to search. | 

### Return type

[**Events**](Events.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsGet"></a>
# **eventsEventIdSectorsGet**
> Sectors eventsEventIdSectorsGet(clientId, accessToken, eventId)



Returns a list of sector for the given event.

### Example
```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var apiInstance = new ApiDoFutebolcard.EventsApi();

var clientId = "clientId_example"; // String | Customer identifier used for authentication.

var accessToken = "accessToken_example"; // String | Access token used in the authentication.

var eventId = "eventId_example"; // String | Event to search.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventsEventIdSectorsGet(clientId, accessToken, eventId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. | 
 **accessToken** | **String**| Access token used in the authentication. | 
 **eventId** | **String**| Event to search. | 

### Return type

[**Sectors**](Sectors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsSectorIdGet"></a>
# **eventsEventIdSectorsSectorIdGet**
> SubSectors eventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId)



Returns the details of a specific sector.

### Example
```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var apiInstance = new ApiDoFutebolcard.EventsApi();

var clientId = "clientId_example"; // String | Customer identifier used for authentication.

var accessToken = "accessToken_example"; // String | Access token used in the authentication.

var eventId = "eventId_example"; // String | Event to search.

var sectorId = "sectorId_example"; // String | Sector to search.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. | 
 **accessToken** | **String**| Access token used in the authentication. | 
 **eventId** | **String**| Event to search. | 
 **sectorId** | **String**| Sector to search. | 

### Return type

[**SubSectors**](SubSectors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsSectorIdSubsectorsGet"></a>
# **eventsEventIdSectorsSectorIdSubsectorsGet**
> SubSectors eventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId)



Returns a list of subcsectors for a given sector.

### Example
```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var apiInstance = new ApiDoFutebolcard.EventsApi();

var clientId = "clientId_example"; // String | Customer identifier used for authentication.

var accessToken = "accessToken_example"; // String | Access token used in the authentication.

var eventId = "eventId_example"; // String | Event to search.

var sectorId = "sectorId_example"; // String | Sector to search.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. | 
 **accessToken** | **String**| Access token used in the authentication. | 
 **eventId** | **String**| Event to search. | 
 **sectorId** | **String**| Sector to search. | 

### Return type

[**SubSectors**](SubSectors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet"></a>
# **eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**
> [Row] eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId)



Returns a list of seat&#39;s information for each row of a given subsector.

### Example
```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var apiInstance = new ApiDoFutebolcard.EventsApi();

var clientId = "clientId_example"; // String | Customer identifier used for authentication.

var accessToken = "accessToken_example"; // String | Access token used in the authentication.

var eventId = "eventId_example"; // String | Event to search.

var sectorId = "sectorId_example"; // String | Sector to search.

var subsectorId = "subsectorId_example"; // String | Subsector to search.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId, callback);
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

[**[Row]**](Row.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventsGet"></a>
# **eventsGet**
> [Events] eventsGet(clientId, accessToken)



Returns a list of existing events.

### Example
```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var apiInstance = new ApiDoFutebolcard.EventsApi();

var clientId = "clientId_example"; // String | Customer identifier used for authentication.

var accessToken = "accessToken_example"; // String | Access token used in the authentication.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventsGet(clientId, accessToken, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. | 
 **accessToken** | **String**| Access token used in the authentication. | 

### Return type

[**[Events]**](Events.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

