

# Task


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**userId** | **String** | user who is responsible for the task |  |
|**assessmentId** | **String** | parent assessment id that this task belongs to |  [optional] |
|**parentEntityId** | **String** | parent entity id that this task belongs to, should be used with entityId |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of task |  |
|**entityId** | **String** | the primary entity being referenced by the task - for example for a FORM_SUBMIT, this will be the form |  |
|**targetId** | **String** | the optional target entity being referenced by the task - for example for a FORM_SUBMIT, this will be the person |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of this task |  |
|**doneAt** | **String** | timestamp that the task was done, if it was done |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**message** | **String** | The message attached to this task |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to view or edit this task |  [optional] |
|**path** | **String** | the optional path of this task (only applies to Type &#x3D;&#x3D; ORG_IMPORT) |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |
|**taskConfigId** | **String** | id of the TaskConfig |  [optional] |
|**slug** | **String** | slug used to reference tasks in events |  [optional] |
|**dueAt** | **String** | due date for the task |  [optional] |
|**pastDueAction** | [**PastDueActionEnum**](#PastDueActionEnum) | what action to take when the task is past its due date |  [optional] |
|**isSkippable** | **Boolean** | check for if the task can be skipped |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FORM_SUBMIT | &quot;FORM_SUBMIT&quot; |
| CHANGE_APPROVE | &quot;CHANGE_APPROVE&quot; |
| TIMEOFF_APPROVE | &quot;TIMEOFF_APPROVE&quot; |
| SCENARIO_CHANGES_APPROVE | &quot;SCENARIO_CHANGES_APPROVE&quot; |
| SCENARIO_CHANGES_CREATE | &quot;SCENARIO_CHANGES_CREATE&quot; |
| ORG_IMPORT | &quot;ORG_IMPORT&quot; |
| COMP_REVIEW_APPROVAL_SUBMIT | &quot;COMP_REVIEW_APPROVAL_SUBMIT&quot; |
| SCENARIO_APPROVAL_SUBMIT | &quot;SCENARIO_APPROVAL_SUBMIT&quot; |
| APPROVAL_CHAIN_UPDATE_FALLBACK_APPROVER | &quot;APPROVAL_CHAIN_UPDATE_FALLBACK_APPROVER&quot; |
| ACTION | &quot;ACTION&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| DONE | &quot;DONE&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |



## Enum: PastDueActionEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| SET_EXPIRED | &quot;SET_EXPIRED&quot; |



