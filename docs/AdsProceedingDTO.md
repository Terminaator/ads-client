# AdsProceedingDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**ResultEnum**](#ResultEnum) |  |  [optional]
**buildingId** | **Long** |  |  [optional]
**notice** | **String** |  |  [optional]
**enacted** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**adsProcedureNr** | **Integer** |  |  [optional]
**objects** | [**List&lt;AdsProceedingObject&gt;**](AdsProceedingObject.md) |  |  [optional]
**xml** | [**AdsProceedingXmlDTO**](AdsProceedingXmlDTO.md) |  |  [optional]

<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
ADS_TASK_FAILED | &quot;ADS_TASK_FAILED&quot;
EHR_TASK_FAILED | &quot;EHR_TASK_FAILED&quot;
ADS_TASK_CANCELED | &quot;ADS_TASK_CANCELED&quot;
ADS_TASK_IN_CHECK | &quot;ADS_TASK_IN_CHECK&quot;
ADS_TASK_SUCCEEDED | &quot;ADS_TASK_SUCCEEDED&quot;
