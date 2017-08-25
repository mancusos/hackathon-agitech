# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EventsApi;

import java.io.File;
import java.util.*;

public class EventsApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsApi* | [**eventsEventIdGet**](docs/EventsApi.md#eventsEventIdGet) | **GET** /events/{eventId} | 
*EventsApi* | [**eventsEventIdSectorsGet**](docs/EventsApi.md#eventsEventIdSectorsGet) | **GET** /events/{eventId}/sectors | 
*EventsApi* | [**eventsEventIdSectorsSectorIdGet**](docs/EventsApi.md#eventsEventIdSectorsSectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId} | 
*EventsApi* | [**eventsEventIdSectorsSectorIdSubsectorsGet**](docs/EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors | 
*EventsApi* | [**eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**](docs/EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
*EventsApi* | [**eventsGet**](docs/EventsApi.md#eventsGet) | **GET** /events | 


## Documentation for Models

 - [Coordinate](docs/Coordinate.md)
 - [Error](docs/Error.md)
 - [Events](docs/Events.md)
 - [EventseventIdsectorssectorIdsubsectorssubsectorIdSeats](docs/EventseventIdsectorssectorIdsubsectorssubsectorIdSeats.md)
 - [Gates](docs/Gates.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Gates](docs/InlineResponse2001Gates.md)
 - [InlineResponse2001Map](docs/InlineResponse2001Map.md)
 - [InlineResponse2001MapCoordinates](docs/InlineResponse2001MapCoordinates.md)
 - [InlineResponse2001Sectors](docs/InlineResponse2001Sectors.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Subsectors](docs/InlineResponse2002Subsectors.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [Row](docs/Row.md)
 - [Seat](docs/Seat.md)
 - [SectorDetail](docs/SectorDetail.md)
 - [Sectors](docs/Sectors.md)
 - [SubSectorDetails](docs/SubSectorDetails.md)
 - [SubSectors](docs/SubSectors.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



