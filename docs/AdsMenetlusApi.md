# AdsMenetlusApi

All URIs are relative to *https://devkluster.ehr.ee/api/ads/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check**](AdsMenetlusApi.md#check) | **POST** /proceeding/{adsType}/check | ADS kontroll esitamine (DELETE, SEND, DELETE, RESTORE)
[**xml**](AdsMenetlusApi.md#xml) | **POST** /proceeding/{adsType}/xml | ADS päringu XML (DELETE, SEND, DELETE, RESTORE)

<a name="check"></a>
# **check**
> AdsProceedingsDTO check(body, adsType)

ADS kontroll esitamine (DELETE, SEND, DELETE, RESTORE)

Esitab andmed ADS&#x27;i vastavalt tegevuse järgi. ADS ADSmenadresit päringus on kontrolli tõene.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsMenetlusApi;


AdsMenetlusApi apiInstance = new AdsMenetlusApi();
OperationDTO body = new OperationDTO(); // OperationDTO | 
String adsType = "adsType_example"; // String | Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku.
try {
    AdsProceedingsDTO result = apiInstance.check(body, adsType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsMenetlusApi#check");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OperationDTO**](OperationDTO.md)|  |
 **adsType** | **String**| Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku. |

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="xml"></a>
# **xml**
> List&lt;AdsXmlRequestDTO&gt; xml(body, adsType)

ADS päringu XML (DELETE, SEND, DELETE, RESTORE)

Paneb kokku ADS päringu vastavalt tegevuse järgi ja tagastab kodeeringus xml stringi.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsMenetlusApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BuildingDTO&gt;**](BuildingDTO.md)| xml päringu JSON keha |
 **adsType** | **String**| Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku. |

### Return type

[**List&lt;AdsXmlRequestDTO&gt;**](AdsXmlRequestDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

