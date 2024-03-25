

# Scenario


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | scenario description |  [optional] |
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**name** | **String** | scenario name |  |
|**startDate** | **String** | date that this scenario diverges from primary |  |
|**status** | [**StatusEnum**](#StatusEnum) | status of scenario |  |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to this scenario |  |
|**cost** | [**CostImpact**](CostImpact.md) |  |  [optional] |
|**changeCount** | **Integer** | number of changes contained in scenario |  [optional] |
|**changeCounts** | **Map&lt;String, Integer&gt;** | number of changes of each type contained in scenario |  [optional] |
|**createId** | **String** | created by user id |  |
|**createAt** | **String** | created timestamp |  |
|**updateId** | **String** | last updated by user id |  |
|**updateAt** | **String** | last updated timestamp |  |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |
|**mergeId** | **String** | merged by user id |  [optional] |
|**mergeAt** | **String** | merged timestamp |  [optional] |
|**calcStartAt** | **String** | most recent summary calculation started at timestamp |  [optional] |
|**calcEndAt** | **String** | most recent summary calculation ended at timestamp |  [optional] |
|**changeAt** | **String** | timestamp of most recent changes made to scenario |  [optional] |
|**changeId** | **String** | user who made the most recent change to scenario |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of scenario to be created |  [optional] |
|**startDateFixed** | [**StartDateFixedEnum**](#StartDateFixedEnum) | whether or not the start date should stay fixed in time, or update to today&#39;s date as time passes |  [optional] |
|**query** | **String** | Query for selecting which people/jobs are initially included in the scenario (only applies to promotion scenarios) |  [optional] |
|**validJobIdSet** | **Set&lt;String&gt;** | This scenario changes are restricted to the following jobIds |  [optional] |
|**approvalRequestId** | **String** | Approval request id, if the scenario has been submitted for approval |  [optional] |
|**entityId** | **String** | The entity this scenario is associated with |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | The type of entity associated with this scenario |  [optional] |
|**sharedViewConfig** | [**Set&lt;ScenarioSharedViewConfig&gt;**](ScenarioSharedViewConfig.md) | View configurations associated with this scenario |  [optional] |
|**budget** | [**Money**](Money.md) |  |  [optional] |
|**costCalc** | **String** | CQL used to calculate the budget allocation in the scenario |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| MERGED | &quot;MERGED&quot; |
| DRAFT | &quot;DRAFT&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GENERAL | &quot;GENERAL&quot; |
| COMP | &quot;COMP&quot; |
| PROMOTION | &quot;PROMOTION&quot; |
| TERMINATE | &quot;TERMINATE&quot; |
| CREATE_JOB | &quot;CREATE_JOB&quot; |
| UPDATE_JOB | &quot;UPDATE_JOB&quot; |
| BUDGET | &quot;BUDGET&quot; |



## Enum: StartDateFixedEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| TODAY | &quot;TODAY&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |



