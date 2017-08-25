# correios-android-client

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
    <artifactId>correios-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sensedia:correios-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/correios-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import br.com.sensedia.correios.api.v1.CEPApi;

public class CEPApiExample {

    public static void main(String[] args) {
        CEPApi apiInstance = new CEPApi();
        String clientId = "clientId_example"; // String | Identificaçáo do cliente usado na autenticaçáo.
        String accessToken = "accessToken_example"; // String | Access token usado na autenticaçáo.
        String estado = "estado_example"; // String | Abreviaçáo do Estado.
        String municipio = "municipio_example"; // String | Nome do Município.
        try {
            List<FaixaCEP> result = apiInstance.getCeps(clientId, accessToken, estado, municipio);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CEPApi#getCeps");
            e.printStackTrace();
        }
    }
}

```

