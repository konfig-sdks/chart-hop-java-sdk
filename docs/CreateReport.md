

# CreateReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | report description |  [optional] |
|**label** | **String** | report label |  |
|**filter** | **String** | filter automatically applied to every chart in this report |  [optional] |
|**share** | [**ShareEnum**](#ShareEnum) | sharing settings of report |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | sensitivity level of report |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to view or edit this report |  [optional] |
|**chartIds** | **List&lt;String&gt;** | list of charts in this report |  [optional] |



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



