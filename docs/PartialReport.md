

# PartialReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | report description |  [optional] |
|**id** | **String** | globally unique id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**label** | **String** | report label |  [optional] |
|**filter** | **String** | filter automatically applied to every chart in this report |  [optional] |
|**share** | [**ShareEnum**](#ShareEnum) | sharing settings of report |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | sensitivity level of report |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to view or edit this report |  [optional] |
|**chartIds** | **List&lt;String&gt;** | list of charts in this report |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: ShareEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| FULL | &quot;FULL&quot; |



## Enum: SensitiveEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;GLOBAL&quot; |
| ORG | &quot;ORG&quot; |
| ORG_OTHER | &quot;ORG_OTHER&quot; |
| PERSONAL_DEMOG | &quot;PERSONAL_DEMOG&quot; |
| PERSONAL_BIRTH | &quot;PERSONAL_BIRTH&quot; |
| PERSONAL_CONTACT | &quot;PERSONAL_CONTACT&quot; |
| PERSONAL_PRIVATE | &quot;PERSONAL_PRIVATE&quot; |
| SENSITIVE_BIRTH | &quot;SENSITIVE_BIRTH&quot; |
| SENSITIVE_CONTACT | &quot;SENSITIVE_CONTACT&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| COMP_CASH | &quot;COMP_CASH&quot; |
| COMP_EQUITY | &quot;COMP_EQUITY&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| PERSONAL | &quot;PERSONAL&quot; |
| MANAGER | &quot;MANAGER&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |
| DIRECT | &quot;DIRECT&quot; |
| PEERS | &quot;PEERS&quot; |
| HIGH | &quot;HIGH&quot; |
| PRIVATE | &quot;PRIVATE&quot; |



