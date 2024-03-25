

# ProcessEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**entityData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**updates** | [**List&lt;ProcessEventUpdate&gt;**](ProcessEventUpdate.md) |  |  |
|**at** | **Long** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HIRE | &quot;HIRE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| CREATE_PERSON | &quot;CREATE_PERSON&quot; |
| ERROR | &quot;ERROR&quot; |
| INBOUND | &quot;INBOUND&quot; |
| CHANGE | &quot;CHANGE&quot; |
| OUTBOUND_CREATE | &quot;OUTBOUND_CREATE&quot; |
| OUTBOUND_UPDATE | &quot;OUTBOUND_UPDATE&quot; |
| OUTBOUND_DELETE | &quot;OUTBOUND_DELETE&quot; |
| INITIATING_CREATE | &quot;INITIATING_CREATE&quot; |
| INITIATING_UPDATE | &quot;INITIATING_UPDATE&quot; |
| INITIATING_DELETE | &quot;INITIATING_DELETE&quot; |



