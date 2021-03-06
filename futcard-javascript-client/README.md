# api_do_futebolcard

ApiDoFutebolcard - JavaScript client for api_do_futebolcard
Futebolcard manipulation API
This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install api_do_futebolcard --save
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your api_do_futebolcard from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('api_do_futebolcard')` in javascript files from the directory you ran the last 
command above from.

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/YOUR_USERNAME/api_do_futebolcard
then install it via:

```shell
    npm install YOUR_USERNAME/api_do_futebolcard --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file, that's to say your javascript file where you actually 
use this library):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var ApiDoFutebolcard = require('api_do_futebolcard');

var api = new ApiDoFutebolcard.EventsApi()

var clientId = "clientId_example"; // {String} Customer identifier used for authentication.

var accessToken = "accessToken_example"; // {String} Access token used in the authentication.

var eventId = "eventId_example"; // {String} Event to search.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.eventsEventIdGet(clientId, accessToken, eventId, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiDoFutebolcard.EventsApi* | [**eventsEventIdGet**](docs/EventsApi.md#eventsEventIdGet) | **GET** /events/{eventId} | 
*ApiDoFutebolcard.EventsApi* | [**eventsEventIdSectorsGet**](docs/EventsApi.md#eventsEventIdSectorsGet) | **GET** /events/{eventId}/sectors | 
*ApiDoFutebolcard.EventsApi* | [**eventsEventIdSectorsSectorIdGet**](docs/EventsApi.md#eventsEventIdSectorsSectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId} | 
*ApiDoFutebolcard.EventsApi* | [**eventsEventIdSectorsSectorIdSubsectorsGet**](docs/EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors | 
*ApiDoFutebolcard.EventsApi* | [**eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**](docs/EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
*ApiDoFutebolcard.EventsApi* | [**eventsGet**](docs/EventsApi.md#eventsGet) | **GET** /events | 


## Documentation for Models

 - [ApiDoFutebolcard.Coordinate](docs/Coordinate.md)
 - [ApiDoFutebolcard.Error](docs/Error.md)
 - [ApiDoFutebolcard.Events](docs/Events.md)
 - [ApiDoFutebolcard.Gates](docs/Gates.md)
 - [ApiDoFutebolcard.Map](docs/Map.md)
 - [ApiDoFutebolcard.Row](docs/Row.md)
 - [ApiDoFutebolcard.Seat](docs/Seat.md)
 - [ApiDoFutebolcard.SectorDetail](docs/SectorDetail.md)
 - [ApiDoFutebolcard.Sectors](docs/Sectors.md)
 - [ApiDoFutebolcard.SubSectorDetails](docs/SubSectorDetails.md)
 - [ApiDoFutebolcard.SubSectors](docs/SubSectors.md)


## Documentation for Authorization

 All endpoints do not require authorization.

