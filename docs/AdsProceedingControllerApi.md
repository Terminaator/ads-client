# AdsProceedingControllerApi

All URIs are relative to *https://devkluster.ehr.ee/api/ads/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check**](AdsProceedingControllerApi.md#check) | **POST** /proceeding/{adsType}/check | 
[**checkAdsProceeding**](AdsProceedingControllerApi.md#checkAdsProceeding) | **POST** /proceeding/check | 
[**isNecessary**](AdsProceedingControllerApi.md#isNecessary) | **POST** /proceeding/{adsType}/check/necessity | 
[**send**](AdsProceedingControllerApi.md#send) | **POST** /proceeding/{adsType} | 
[**xml**](AdsProceedingControllerApi.md#xml) | **POST** /proceeding/{adsType}/xml | 

<a name="check"></a>
# **check**
> AdsProceedingsDTO check(body, adsType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingControllerApi;


AdsProceedingControllerApi apiInstance = new AdsProceedingControllerApi();
BuildingsDTO body = new BuildingsDTO(); // BuildingsDTO | 
String adsType = "adsType_example"; // String | 
try {
    AdsProceedingsDTO result = apiInstance.check(body, adsType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsProceedingControllerApi#check");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BuildingsDTO**](BuildingsDTO.md)|  |
 **adsType** | **String**|  |

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkAdsProceeding"></a>
# **checkAdsProceeding**
> AdsProceedingsDTO checkAdsProceeding(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingControllerApi;


AdsProceedingControllerApi apiInstance = new AdsProceedingControllerApi();
ProceedingsDTO body = new ProceedingsDTO(); // ProceedingsDTO | 
try {
    AdsProceedingsDTO result = apiInstance.checkAdsProceeding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsProceedingControllerApi#checkAdsProceeding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProceedingsDTO**](ProceedingsDTO.md)|  |

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="isNecessary"></a>
# **isNecessary**
> AdsNecessitiesDTO isNecessary(body, adsType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingControllerApi;


AdsProceedingControllerApi apiInstance = new AdsProceedingControllerApi();
List<BuildingDTO> body = Arrays.asList(new BuildingDTO()); // List<BuildingDTO> | 
String adsType = "adsType_example"; // String | 
try {
    AdsNecessitiesDTO result = apiInstance.isNecessary(body, adsType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsProceedingControllerApi#isNecessary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BuildingDTO&gt;**](BuildingDTO.md)|  |
 **adsType** | **String**|  |

### Return type

[**AdsNecessitiesDTO**](AdsNecessitiesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="send"></a>
# **send**
> AdsProceedingsDTO send(body, adsType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingControllerApi;


AdsProceedingControllerApi apiInstance = new AdsProceedingControllerApi();
BuildingsDTO body = new BuildingsDTO(); // BuildingsDTO | 
String adsType = "adsType_example"; // String | 
try {
    AdsProceedingsDTO result = apiInstance.send(body, adsType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsProceedingControllerApi#send");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BuildingsDTO**](BuildingsDTO.md)|  |
 **adsType** | **String**|  |

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="xml"></a>
# **xml**
> AdsRequestsXmlDTO xml(body, adsType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingControllerApi;


AdsProceedingControllerApi apiInstance = new AdsProceedingControllerApi();
List<BuildingDTO> body = Arrays.asList(new BuildingDTO()); // List<BuildingDTO> | 
String adsType = "adsType_example"; // String | 
try {
    AdsRequestsXmlDTO result = apiInstance.xml(body, adsType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsProceedingControllerApi#xml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BuildingDTO&gt;**](BuildingDTO.md)|  |
 **adsType** | **String**|  |

### Return type

[**AdsRequestsXmlDTO**](AdsRequestsXmlDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

