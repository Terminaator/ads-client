# swagger-java-client

sample application API
- API version: 1.0.0
  - Build date: 2020-10-05T12:46:40.910754800+03:00[Europe/Helsinki]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

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

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsMenetlusApi;

import java.io.File;
import java.util.*;

public class AdsMenetlusApiExample {

    public static void main(String[] args) {
        
        AdsMenetlusApi apiInstance = new AdsMenetlusApi();
        OperationDTO body = new OperationDTO(); // OperationDTO | xml päringu JSON keha
        String adsType = "adsType_example"; // String | Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku.
        try {
            AdsProceedingsDTO result = apiInstance.check(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsMenetlusApi#check");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsMenetlusApi;

import java.io.File;
import java.util.*;

public class AdsMenetlusApiExample {

    public static void main(String[] args) {
        
        AdsMenetlusApi apiInstance = new AdsMenetlusApi();
        CheckOperationDTO body = new CheckOperationDTO(); // CheckOperationDTO | xml päringu JSON keha
        try {
            AdsProceedingsDTO result = apiInstance.checkProceeding(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsMenetlusApi#checkProceeding");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsMenetlusApi;

import java.io.File;
import java.util.*;

public class AdsMenetlusApiExample {

    public static void main(String[] args) {
        
        AdsMenetlusApi apiInstance = new AdsMenetlusApi();
        List<BuildingDTO> body = Arrays.asList(new BuildingDTO()); // List<BuildingDTO> | xml päringu JSON keha
        String adsType = "adsType_example"; // String | Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku.
        try {
            List<NecessityDTO> result = apiInstance.isNeeded(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsMenetlusApi#isNeeded");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsMenetlusApi;

import java.io.File;
import java.util.*;

public class AdsMenetlusApiExample {

    public static void main(String[] args) {
        
        AdsMenetlusApi apiInstance = new AdsMenetlusApi();
        OperationDTO body = new OperationDTO(); // OperationDTO | xml päringu JSON keha
        String adsType = "adsType_example"; // String | Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku.
        try {
            AdsProceedingsDTO result = apiInstance.send(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsMenetlusApi#send");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsMenetlusApi;

import java.io.File;
import java.util.*;

public class AdsMenetlusApiExample {

    public static void main(String[] args) {
        
        AdsMenetlusApi apiInstance = new AdsMenetlusApi();
        List<BuildingDTO> body = Arrays.asList(new BuildingDTO()); // List<BuildingDTO> | xml päringu JSON keha
        String adsType = "adsType_example"; // String | Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku.
        try {
            List<AdsXmlRequestDTO> result = apiInstance.xml(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsMenetlusApi#xml");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://devkluster.ehr.ee/api/ads/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdsMenetlusApi* | [**check**](docs/AdsMenetlusApi.md#check) | **POST** /proceeding/{adsType}/check | ADS kontroll esitamine (DELETE, SEND, DELETE, RESTORE)
*AdsMenetlusApi* | [**checkProceeding**](docs/AdsMenetlusApi.md#checkProceeding) | **POST** /proceeding/check | ADS menetluse kontrollimine
*AdsMenetlusApi* | [**isNeeded**](docs/AdsMenetlusApi.md#isNeeded) | **POST** /proceeding/{adsType}/check/necessity | 
*AdsMenetlusApi* | [**send**](docs/AdsMenetlusApi.md#send) | **POST** /proceeding/{adsType} | ADS esitamine (DELETE, SEND, DELETE, RESTORE)
*AdsMenetlusApi* | [**xml**](docs/AdsMenetlusApi.md#xml) | **POST** /proceeding/{adsType}/xml | ADS päringu XML (DELETE, SEND, DELETE, RESTORE)

## Documentation for Models

 - [AdsProceedingDTO](docs/AdsProceedingDTO.md)
 - [AdsProceedingObject](docs/AdsProceedingObject.md)
 - [AdsProceedingObjectProblemDTO](docs/AdsProceedingObjectProblemDTO.md)
 - [AdsProceedingXmlDTO](docs/AdsProceedingXmlDTO.md)
 - [AdsProceedingsDTO](docs/AdsProceedingsDTO.md)
 - [AdsXmlRequestDTO](docs/AdsXmlRequestDTO.md)
 - [BuildingDTO](docs/BuildingDTO.md)
 - [CheckOperationDTO](docs/CheckOperationDTO.md)
 - [NecessityDTO](docs/NecessityDTO.md)
 - [OperationDTO](docs/OperationDTO.md)
 - [ProceedingDTO](docs/ProceedingDTO.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


