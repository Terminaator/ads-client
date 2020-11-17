# AdsProceedingObjectDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | Objekti origtunnus |  [optional]
**adsOid** | **String** |  |  [optional]
**adobId** | **String** |  |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**problems** | [**List&lt;AdsProceedingObjectProblemDTO&gt;**](AdsProceedingObjectProblemDTO.md) |  |  [optional]

<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
EE_VALUE_EE_ | &quot;AdsTypeEnum.EE(value&#x3D;EE)&quot;
K_VALUE_K_ | &quot;AdsTypeEnum.K(value&#x3D;K)&quot;
ME_VALUE_ME_ | &quot;AdsTypeEnum.ME(value&#x3D;ME)&quot;
M_VALUE_M_ | &quot;AdsTypeEnum.M(value&#x3D;M)&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
T | &quot;T&quot;
K | &quot;K&quot;
O | &quot;O&quot;
