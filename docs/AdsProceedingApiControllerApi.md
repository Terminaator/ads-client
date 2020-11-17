# AdsProceedingApiControllerApi

All URIs are relative to *https://devkluster.ehr.ee/api/ads/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsProceedingXml**](AdsProceedingApiControllerApi.md#adsProceedingXml) | **POST** /proceeding/{adsType}/xml | Tagastab ehitise ads päringu xml
[**checkAdsProceeding**](AdsProceedingApiControllerApi.md#checkAdsProceeding) | **POST** /proceeding/check | Kontrollib adsis olevat menetlust. Õnnestumise korral salvestakse andmed.
[**checkAdsRequest**](AdsProceedingApiControllerApi.md#checkAdsRequest) | **POST** /proceeding/{adsType}/check | Teeb adsi kontrollpäringu (SEND, DELETE, RESTORE). Andmeid ei salvestada.
[**isAdsNecessary**](AdsProceedingApiControllerApi.md#isAdsNecessary) | **POST** /proceeding/{adsType}/check/necessity | Kontrollib ads vajadust (vaatab ads_esitamise seisundit)
[**sendAdsRequest**](AdsProceedingApiControllerApi.md#sendAdsRequest) | **POST** /proceeding/do/{adsType} | Teeb adsi päringu (SEND, DELETE, RESTORE). Andmeid salvestakse õnnestumise korral.

<a name="adsProceedingXml"></a>
# **adsProceedingXml**
> AdsRequestsXmlDTO adsProceedingXml(body, adsType)

Tagastab ehitise ads päringu xml

Korjab ehitise ads päringu xml kokku /do/{adsType} loogika järgi. Päringut ei tehta.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingApiControllerApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BuildingDTO&gt;**](BuildingDTO.md)|  |
 **adsType** | **String**| Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks. | [enum: send, delete, restore]

### Return type

[**AdsRequestsXmlDTO**](AdsRequestsXmlDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkAdsProceeding"></a>
# **checkAdsProceeding**
> AdsProceedingsDTO checkAdsProceeding(body)

Kontrollib adsis olevat menetlust. Õnnestumise korral salvestakse andmed.

Teeb ads menetlusnumbri korral adsi päringu. Päringu kehas peab olema selle menetlusnumbri ehitis. Puudumise korral andmeid ei salvestada.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingApiControllerApi;


AdsProceedingApiControllerApi apiInstance = new AdsProceedingApiControllerApi();
ProceedingsDTO body = new ProceedingsDTO(); // ProceedingsDTO | 
try {
    AdsProceedingsDTO result = apiInstance.checkAdsProceeding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdsProceedingApiControllerApi#checkAdsProceeding");
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

<a name="checkAdsRequest"></a>
# **checkAdsRequest**
> AdsProceedingsDTO checkAdsRequest(body, adsType)

Teeb adsi kontrollpäringu (SEND, DELETE, RESTORE). Andmeid ei salvestada.

Teeb ads kontrollpäringu ehitise andmete põhjal. Tuleb eristada SEND, DELETE ja RESTORE ads seisundit. SEND korral kogutakse kokku ehitise osad ja ruumikujud, mille adsi esitamise seisund on ADS_ESITAMATA.SEND korral sõltub osa ja ruumikuju ads seisund reeglitest.DELETE korral kogutakse kokku ehitise osad ja ruumikuju ning ads seisund pannakse neile T. Vaadatakse esitamise seisundit ADS_ESITAMATA.RESTORE korral asendakse osa või kuju andmed ära aktuaalsetega, kui aktuaalne eksisteerib ning ads seisund pannakse reeglite järgi. Muidu saab ads seisundi T.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingApiControllerApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BuildingsDTO**](BuildingsDTO.md)|  |
 **adsType** | **String**| Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks. | [enum: send, delete, restore]

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="isAdsNecessary"></a>
# **isAdsNecessary**
> AdsNecessitiesDTO isAdsNecessary(body, adsType)

Kontrollib ads vajadust (vaatab ads_esitamise seisundit)

Kontrollib ehitise ads esitamise seisundit ja tagastab, et kas on vaja esitada.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingApiControllerApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BuildingDTO&gt;**](BuildingDTO.md)|  |
 **adsType** | **String**| Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks. | [enum: send, delete, restore]

### Return type

[**AdsNecessitiesDTO**](AdsNecessitiesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendAdsRequest"></a>
# **sendAdsRequest**
> AdsProceedingsDTO sendAdsRequest(body, adsType)

Teeb adsi päringu (SEND, DELETE, RESTORE). Andmeid salvestakse õnnestumise korral.

Esitab ehitise andmed adsi. Tuleb eristada SEND, DELETE ja RESTORE ads seisundit. SEND korral kogutakse kokku ehitise osad ja ruumikujud, mille adsi esitamise seisund on ADS_ESITAMATA.SEND korral sõltub osa ja ruumikuju ads seisund reeglitest.DELETE korral kogutakse kokku ehitise osad ja ruumikuju ning ads seisund pannakse neile T. Vaadatakse esitamise seisundit ADS_ESITAMATA.RESTORE korral asendakse osa või kuju andmed ära aktuaalsetega, kui aktuaalne eksisteerib ning ads seisund pannakse reeglite järgi. Muidu saab ads seisundi T.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdsProceedingApiControllerApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BuildingsDTO**](BuildingsDTO.md)|  |
 **adsType** | **String**| Ads andmete korjamise tüüp.Send korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund tuleb reeglite järgi.Delete korjab kokku ruumikujud ja osad, mille seisund on ads_esitamata. Ads seisund on T.Restore korjab kokku ruumikujud ja osad, mille seisund on ads_esitatud.Kui eksisteerib A seisundis objekt, siis tehakse andmete vahetus restore korral. Ülejäänud saavad seisundi T. Mõeldud taastamiseks. | [enum: send, delete, restore]

### Return type

[**AdsProceedingsDTO**](AdsProceedingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

