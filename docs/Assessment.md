

# Assessment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**label** | **String** | human-readable label of assessment |  |
|**slug** | **String** | unique slug of assessment |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of assessment |  |
|**fields** | **Object** | assessment fields (description) |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who have been granted access to this assessment |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | view sensitivity of this assessment |  [optional] |
|**color** | **String** | color of assessment |  [optional] |
|**startDate** | **LocalDate** | Date this assessment begins. In the context of REVIEW goals, the date the review cycle begins. |  [optional] |
|**endDate** | **LocalDate** | Date this assessment ends, or is completed. In the context of REVIEW assessment, the date the review cycle ends. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of this assessment - DRAFT, ACTIVE, DONE |  [optional] |
|**doneAt** | **String** | timestamp when the status of this assessment was set to done |  [optional] |
|**taskCount** | **Integer** | number of tasks associated with this assessment |  [optional] |
|**taskDoneCount** | **Integer** | number of tasks associated with this assessment that are done |  [optional] |
|**peopleIncludedCount** | **Integer** | number of people included in this assessment |  [optional] |
|**query** | **String** | Query for which people/jobs can be included in the review. |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REVIEW | &quot;REVIEW&quot; |
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |
| SURVEY | &quot;SURVEY&quot; |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| DONE | &quot;DONE&quot; |



