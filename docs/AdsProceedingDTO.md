# AdsProceedingDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**ResultEnum**](#ResultEnum) | Ads menetluse tulemus |  [optional]
**buildingId** | **Long** |  |  [optional]
**notice** | **String** | Ads menetluse on kontrollis |  [optional]
**enacted** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**adsProcedureNr** | **Integer** | Ads menetluse number |  [optional]
**objects** | [**List&lt;AdsProceedingObjectDTO&gt;**](AdsProceedingObjectDTO.md) |  |  [optional]
**xml** | [**AdsXmlDTO**](AdsXmlDTO.md) |  |  [optional]

<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
ADS_TASK_FAILED | &quot;ADS_TASK_FAILED&quot;
EHR_TASK_FAILED | &quot;EHR_TASK_FAILED&quot;
ADS_TASK_CANCELED | &quot;ADS_TASK_CANCELED&quot;
ADS_TASK_IN_CHECK | &quot;ADS_TASK_IN_CHECK&quot;
ADS_TASK_SUCCEEDED | &quot;ADS_TASK_SUCCEEDED&quot;
