
var clientId = "" // {String} Customer identifier used for authentication.
var accessToken = ""; // {String} Access token used in the authentication.

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + JSON.stringify(response));
  }
};

var ApiDoFutebolcard = require('api_do_futebolcard');
var apiInstance = new ApiDoFutebolcard.EventsApi()

var eventId = "5000"; // {String} Event to search.
var sectorId = "2484227"; // String | Sector to search.
var subsectorId = "2484233"; // String | Subsector to search.


//apiInstance.eventsGet(clientId, accessToken, callback);
apiInstance.eventsEventIdGet(clientId, accessToken, eventId, callback);
//apiInstance.eventsEventIdSectorsGet(clientId, accessToken, eventId, callback);
//apiInstance.eventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId, callback);
//apiInstance.eventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId, callback);
//apiInstance.eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId, callback);

