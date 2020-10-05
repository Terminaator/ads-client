# AdsMenetlusApi

All URIs are relative to *https://devkluster.ehr.ee/api/ads/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check**](AdsMenetlusApi.md#check) | **POST** /proceeding/{adsType}/check | ADS kontroll esitamine (DELETE, SEND, DELETE, RESTORE)
[**checkProceeding**](AdsMenetlusApi.md#checkProceeding) | **POST** /proceeding/check | ADS menetluse kontrollimine
[**isNeeded**](AdsMenetlusApi.md#isNeeded) | **POST** /proceeding/{adsType}/check/necessity | 
[**send**](AdsMenetlusApi.md#send) | **POST** /proceeding/{adsType} | ADS esitamine (DELETE, SEND, DELETE, RESTORE)
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
OperationDTO body = new OperationDTO(); // OperationDTO | xml päringu JSON keha
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
 **body** | [**OperationDTO**](OperationDTO.md)| xml päringu JSON keha |
 **adsType** | **String**| Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku. |

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkProceeding"></a>
# **checkProceeding**
> AdsProceedingsDTO checkProceeding(body)

ADS menetluse kontrollimine

Esitab ADS&#x27;i ADS menetluse numbri. Positiivse vastuse korral andmed salvestatakse baasi.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsMenetlusApi;


AdsMenetlusApi apiInstance = new AdsMenetlusApi();
CheckOperationDTO body = new CheckOperationDTO(); // CheckOperationDTO | xml päringu JSON keha
try {
    AdsProceedingsDTO result = apiInstance.checkProceeding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsMenetlusApi#checkProceeding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckOperationDTO**](CheckOperationDTO.md)| xml päringu JSON keha |

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="isNeeded"></a>
# **isNeeded**
> List&lt;NecessityDTO&gt; isNeeded(body, adsType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsMenetlusApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BuildingDTO&gt;**](BuildingDTO.md)| xml päringu JSON keha |
 **adsType** | **String**| Määrab ADS tegevuse liigi (DELETE, SEND, RESTORE, CANCEL). ADS tegevuse all mõeldakse, et kuidas API korjab andmed kokku. |

### Return type

[**List&lt;NecessityDTO&gt;**](NecessityDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="send"></a>
# **send**
> AdsProceedingsDTO send(body, adsType)

ADS esitamine (DELETE, SEND, DELETE, RESTORE)

Esitab andmed ADS&#x27;i vastavalt tegevuse järgi. Positiivse vastuse korral uuendakse ehitise andmeid. ADS ADSmenadresit päringus on kontrolli väär.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsMenetlusApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OperationDTO**](OperationDTO.md)| xml päringu JSON keha |
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

