

# FormRender


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**label** | **String** |  |  |
|**options** | **Map&lt;String, Object&gt;** |  |  |
|**blocks** | [**List&lt;FormRenderBlock&gt;**](FormRenderBlock.md) |  |  |
|**rerenderQuestionIds** | **Set&lt;String&gt;** |  |  |
|**responseSensitive** | [**ResponseSensitiveEnum**](#ResponseSensitiveEnum) |  |  |
|**authorSensitive** | [**AuthorSensitiveEnum**](#AuthorSensitiveEnum) |  |  [optional] |



## Enum: ResponseSensitiveEnum

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



## Enum: AuthorSensitiveEnum

| Name | Value |
|---- | -----|
| ANONYMOUS | &quot;ANONYMOUS&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| HIGH | &quot;HIGH&quot; |
| MANAGER | &quot;MANAGER&quot; |



