

# UpdateTask


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | status of this task |  [optional] |
|**message** | **String** | The message attached to this task |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to view or edit this task |  [optional] |
|**taskConfigId** | **String** | id of the TaskConfig |  [optional] |
|**slug** | **String** | slug used to reference tasks in events |  [optional] |
|**dueAt** | **String** | due date for the task |  [optional] |
|**pastDueAction** | [**PastDueActionEnum**](#PastDueActionEnum) | what action to take when the task is past its due date |  [optional] |
|**isSkippable** | **Boolean** | check for if the task can be skipped |  [optional] |



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



