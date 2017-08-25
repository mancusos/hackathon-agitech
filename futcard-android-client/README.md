# swagger-android-client

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
    <groupId>com.sensedia</groupId>
    <artifactId>futcard-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sensedia:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/futcard-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sensedia.client.api.EventsApi;

public class EventsApiExample {

    public static void main(String[] args) {
        EventsApi apiInstance = new EventsApi();
        String clientId = "clientId_example"; // String | Customer identifier used for authentication.
        String accessToken = "accessToken_example"; // String | Access token used in the authentication.
        String eventId = "eventId_example"; // String | Event to search.
        try {
            Events result = apiInstance.getEvent(clientId, accessToken, eventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEvent");
            e.printStackTrace();
        }
    }
}

```



