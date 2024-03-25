

# FileEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id of file |  |
|**orgId** | **String** | parent org id |  [optional] |
|**entityId** | **String** | entity id that the file is attached to |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | entity type (should only be PERSON or USER) |  [optional] |
|**field** | **String** | field name that the file uses, if the file is tied to a field |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | level of sensitivity of the file, if the file is not tied to a field |  [optional] |
|**filename** | **String** | customer facing filename of file |  |
|**originalFilename** | **String** | original filename of file |  |
|**type** | **String** | mime type of file |  |
|**ext** | **String** | extension of file |  |
|**bytes** | **Long** | size of file in bytes |  |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| ACTION | &quot;ACTION&quot; |
| AGREEMENT | &quot;AGREEMENT&quot; |
| APP | &quot;APP&quot; |
| APP_CONFIG | &quot;APP_CONFIG&quot; |
| APPROVAL_CHAIN | &quot;APPROVAL_CHAIN&quot; |
| APPROVAL_CHAIN_STAGE | &quot;APPROVAL_CHAIN_STAGE&quot; |
| APPROVAL_REQUEST | &quot;APPROVAL_REQUEST&quot; |
| ASSESSMENT | &quot;ASSESSMENT&quot; |
| BUDGET_POOL | &quot;BUDGET_POOL&quot; |
| BUNDLE | &quot;BUNDLE&quot; |
| CATEGORY | &quot;CATEGORY&quot; |
| CATEGORY_SORT | &quot;CATEGORY_SORT&quot; |
| CHANGE | &quot;CHANGE&quot; |
| COMMENT | &quot;COMMENT&quot; |
| COMP_BAND | &quot;COMP_BAND&quot; |
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |
| CONTENT | &quot;CONTENT&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |
| DATA_VIEW | &quot;DATA_VIEW&quot; |
| EXCHANGE_RATE | &quot;EXCHANGE_RATE&quot; |
| EMAIL_TEMPLATE | &quot;EMAIL_TEMPLATE&quot; |
| FIELD | &quot;FIELD&quot; |
| FILE | &quot;FILE&quot; |
| FORM | &quot;FORM&quot; |
| FORM_DRAFT | &quot;FORM_DRAFT&quot; |
| FORM_RESPONSE | &quot;FORM_RESPONSE&quot; |
| GEOCODE | &quot;GEOCODE&quot; |
| GROUP | &quot;GROUP&quot; |
| GUIDELINE | &quot;GUIDELINE&quot; |
| JOB | &quot;JOB&quot; |
| JOB_LEVEL | &quot;JOB_LEVEL&quot; |
| MEDIA | &quot;MEDIA&quot; |
| MESSAGE | &quot;MESSAGE&quot; |
| MULTIPLIER | &quot;MULTIPLIER&quot; |
| ORG | &quot;ORG&quot; |
| ORG_CONFIG | &quot;ORG_CONFIG&quot; |
| PERSON | &quot;PERSON&quot; |
| PROFILE_TAB | &quot;PROFILE_TAB&quot; |
| POLICY | &quot;POLICY&quot; |
| POSITION | &quot;POSITION&quot; |
| PROCESS | &quot;PROCESS&quot; |
| PRODUCT | &quot;PRODUCT&quot; |
| QUERY_TOKEN | &quot;QUERY_TOKEN&quot; |
| QUESTION | &quot;QUESTION&quot; |
| REPORT | &quot;REPORT&quot; |
| REPORT_CHART | &quot;REPORT_CHART&quot; |
| ROLE | &quot;ROLE&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| STOCK_PRICE | &quot;STOCK_PRICE&quot; |
| TABLE | &quot;TABLE&quot; |
| TABLE_ROW | &quot;TABLE_ROW&quot; |
| TASK_CONFIG | &quot;TASK_CONFIG&quot; |
| TEMPLATE | &quot;TEMPLATE&quot; |
| TASK | &quot;TASK&quot; |
| TOKEN | &quot;TOKEN&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| TRACKED_GROUP | &quot;TRACKED_GROUP&quot; |
| USER | &quot;USER&quot; |



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



