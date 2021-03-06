# swagger-java-client

Ehr ads api
- API version: 1.0.0
  - Build date: 2020-11-17T14:08:15.631610300+02:00[Europe/Helsinki]

Ehitisregistri ads teenus. Kood asub: https://git.mkm.ee/ehr/ehr-k8s-pipeline/ehr-ads-api


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
import io.swagger.client.api.AdsProceedingApiControllerApi;

import java.io.File;
import java.util.*;

public class AdsProceedingApiControllerApiExample {

    public static void main(String[] args) {
        
        AdsProceedingApiControllerApi apiInstance = new AdsProceedingApiControllerApi();
        List<BuildingDTO> body = Arrays.asList(new BuildingDTO()); // List<BuildingDTO> | 
        String adsType = "adsType_example"; // String | Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks.
        try {
            AdsRequestsXmlDTO result = apiInstance.adsProceedingXml(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsProceedingApiControllerApi#adsProceedingXml");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsProceedingApiControllerApi;

import java.io.File;
import java.util.*;

public class AdsProceedingApiControllerApiExample {

    public static void main(String[] args) {
        
        AdsProceedingApiControllerApi apiInstance = new AdsProceedingApiControllerApi();
        ProceedingsDTO body = new ProceedingsDTO(); // ProceedingsDTO | 
        try {
            AdsProceedingsDTO result = apiInstance.checkAdsProceeding(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsProceedingApiControllerApi#checkAdsProceeding");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsProceedingApiControllerApi;

import java.io.File;
import java.util.*;

public class AdsProceedingApiControllerApiExample {

    public static void main(String[] args) {
        
        AdsProceedingApiControllerApi apiInstance = new AdsProceedingApiControllerApi();
        BuildingsDTO body = new BuildingsDTO(); // BuildingsDTO | 
        String adsType = "adsType_example"; // String | Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks.
        try {
            AdsProceedingsDTO result = apiInstance.checkAdsRequest(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsProceedingApiControllerApi#checkAdsRequest");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsProceedingApiControllerApi;

import java.io.File;
import java.util.*;

public class AdsProceedingApiControllerApiExample {

    public static void main(String[] args) {
        
        AdsProceedingApiControllerApi apiInstance = new AdsProceedingApiControllerApi();
        List<BuildingDTO> body = Arrays.asList(new BuildingDTO()); // List<BuildingDTO> | 
        String adsType = "adsType_example"; // String | Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks.
        try {
            AdsNecessitiesDTO result = apiInstance.isAdsNecessary(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsProceedingApiControllerApi#isAdsNecessary");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdsProceedingApiControllerApi;

import java.io.File;
import java.util.*;

public class AdsProceedingApiControllerApiExample {

    public static void main(String[] args) {
        
        AdsProceedingApiControllerApi apiInstance = new AdsProceedingApiControllerApi();
        BuildingsDTO body = new BuildingsDTO(); // BuildingsDTO | 
        String adsType = "adsType_example"; // String | Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks.
        try {
            AdsProceedingsDTO result = apiInstance.sendAdsRequest(body, adsType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdsProceedingApiControllerApi#sendAdsRequest");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://devkluster.ehr.ee/api/ads/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdsProceedingApiControllerApi* | [**adsProceedingXml**](docs/AdsProceedingApiControllerApi.md#adsProceedingXml) | **POST** /proceeding/{adsType}/xml | Tagastab ehitise ads päringu xml
*AdsProceedingApiControllerApi* | [**checkAdsProceeding**](docs/AdsProceedingApiControllerApi.md#checkAdsProceeding) | **POST** /proceeding/check | Kontrollib adsis olevat menetlust. Õnnestumise korral salvestakse andmed.
*AdsProceedingApiControllerApi* | [**checkAdsRequest**](docs/AdsProceedingApiControllerApi.md#checkAdsRequest) | **POST** /proceeding/{adsType}/check | Teeb adsi kontrollpäringu (SEND, DELETE, RESTORE). Andmeid ei salvestada.
*AdsProceedingApiControllerApi* | [**isAdsNecessary**](docs/AdsProceedingApiControllerApi.md#isAdsNecessary) | **POST** /proceeding/{adsType}/check/necessity | Kontrollib ads vajadust (vaatab ads_esitamise seisundit)
*AdsProceedingApiControllerApi* | [**sendAdsRequest**](docs/AdsProceedingApiControllerApi.md#sendAdsRequest) | **POST** /proceeding/do/{adsType} | Teeb adsi päringu (SEND, DELETE, RESTORE). Andmeid salvestakse õnnestumise korral.

## Documentation for Models

 - [AdsNecessitiesDTO](docs/AdsNecessitiesDTO.md)
 - [AdsNecessityDTO](docs/AdsNecessityDTO.md)
 - [AdsProceedingDTO](docs/AdsProceedingDTO.md)
 - [AdsProceedingObjectDTO](docs/AdsProceedingObjectDTO.md)
 - [AdsProceedingObjectProblemDTO](docs/AdsProceedingObjectProblemDTO.md)
 - [AdsProceedingsDTO](docs/AdsProceedingsDTO.md)
 - [AdsRequestsXmlDTO](docs/AdsRequestsXmlDTO.md)
 - [AdsXmlDTO](docs/AdsXmlDTO.md)
 - [BuildingDTO](docs/BuildingDTO.md)
 - [BuildingsDTO](docs/BuildingsDTO.md)
 - [ProceedingDTO](docs/ProceedingDTO.md)
 - [ProceedingsDTO](docs/ProceedingsDTO.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


