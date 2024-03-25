

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**userId** | **String** | user id who caused the event |  |
|**orgId** | **String** | parent organization id |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of event |  |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | type of target entity |  |
|**entityId** | **String** | id of target entity |  |
|**tableId** | **String** | id of table, if entity is a table row |  [optional] |
|**jobId** | **String** | jobId of the entity, if the entity is a job or closely connected to a single job |  [optional] |
|**personId** | **String** | personId of the entity, if the entity is a person or closely connected to a single person |  [optional] |
|**subtype** | **String** | subtype of entity |  [optional] |
|**payload** | **Object** | event-specific payload containing information about the change that took place |  [optional] |
|**at** | **Long** | timestamp of event |  |
|**processId** | **String** | id of process |  [optional] |
|**date** | **LocalDate** | effective date, if in use |  [optional] |
|**scenarioId** | **String** | id of scenario |  [optional] |
|**parentEntityId** | **String** | id of associated entity, such as comp cycle |  [optional] |
|**fields** | **Set&lt;String&gt;** | set of fields that were updated by the event |  [optional] |
|**code** | **String** | event code, for example job.update |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APP | &quot;APP&quot; |
| APPROVE | &quot;APPROVE&quot; |
| COMBINE | &quot;COMBINE&quot; |
| CREATE | &quot;CREATE&quot; |
| DELETE | &quot;DELETE&quot; |
| DONE | &quot;DONE&quot; |
| ERROR | &quot;ERROR&quot; |
| EXPORT_CSV | &quot;EXPORT_CSV&quot; |
| EXPORT_ORG_CHART | &quot;EXPORT_ORG_CHART&quot; |
| GENERATE | &quot;GENERATE&quot; |
| GEOIP | &quot;GEOIP&quot; |
| INCOMING | &quot;INCOMING&quot; |
| INSTALL | &quot;INSTALL&quot; |
| INVITE | &quot;INVITE&quot; |
| INBOUND | &quot;INBOUND&quot; |
| LOGIN | &quot;LOGIN&quot; |
| MERGE | &quot;MERGE&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
| PREVIEW_AS | &quot;PREVIEW_AS&quot; |
| READ | &quot;READ&quot; |
| READ_SENSITIVE | &quot;READ_SENSITIVE&quot; |
| READ_ATS | &quot;READ_ATS&quot; |
| READ_ATS_WEBHOOK | &quot;READ_ATS_WEBHOOK&quot; |
| READ_FULL_NAME | &quot;READ_FULL_NAME&quot; |
| READ_FUTURE_DATE | &quot;READ_FUTURE_DATE&quot; |
| READ_METADATA | &quot;READ_METADATA&quot; |
| READ_COMP | &quot;READ_COMP&quot; |
| READ_BILLING | &quot;READ_BILLING&quot; |
| READ_PENDING | &quot;READ_PENDING&quot; |
| READ_PAYROLL | &quot;READ_PAYROLL&quot; |
| READ_SENSITIVE_FILTERS | &quot;READ_SENSITIVE_FILTERS&quot; |
| REJECT | &quot;REJECT&quot; |
| REMIND | &quot;REMIND&quot; |
| REMOVE_PASSWORD | &quot;REMOVE_PASSWORD&quot; |
| REQUEST | &quot;REQUEST&quot; |
| RESTORE | &quot;RESTORE&quot; |
| RESUME | &quot;RESUME&quot; |
| REVOKE | &quot;REVOKE&quot; |
| RUN | &quot;RUN&quot; |
| RUN_ATS | &quot;RUN_ATS&quot; |
| SECURITY | &quot;SECURITY&quot; |
| SHOW_DASHBOARD_DAYS_AHEAD | &quot;SHOW_DASHBOARD_DAYS_AHEAD&quot; |
| SHOW_OPEN_JOBS | &quot;SHOW_OPEN_JOBS&quot; |
| STEP | &quot;STEP&quot; |
| SUBMIT | &quot;SUBMIT&quot; |
| SYNC | &quot;SYNC&quot; |
| TEST | &quot;TEST&quot; |
| TOKEN | &quot;TOKEN&quot; |
| UNINSTALL | &quot;UNINSTALL&quot; |
| UPDATE | &quot;UPDATE&quot; |
| UPDATE_PASSWORD | &quot;UPDATE_PASSWORD&quot; |
| UPLOAD_CSV | &quot;UPLOAD_CSV&quot; |
| WRITE | &quot;WRITE&quot; |
| VIEW_AS | &quot;VIEW_AS&quot; |



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



