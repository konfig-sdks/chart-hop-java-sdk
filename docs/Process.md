

# Process


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent org id |  |
|**label** | **String** | human-readable label that identifies this process |  |
|**type** | **String** | process type |  |
|**status** | [**StatusEnum**](#StatusEnum) | current status of process |  |
|**filePath** | **String** | data file path |  [optional] |
|**logPath** | **String** | data log path |  [optional] |
|**runUserId** | **String** | user id who is running the process |  |
|**parentProcessId** | **String** | process id of parent process |  [optional] |
|**createId** | **String** | created by user id (user who requested the process run) |  |
|**createAt** | **String** | created timestamp |  |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**startAt** | **String** | started at timestamp |  [optional] |
|**endAt** | **String** | ended at timestamp |  [optional] |
|**message** | **String** | status or error message |  [optional] |
|**progress** | **Double** | percent progress so far |  [optional] |
|**internalError** | **String** | internal-only error message |  [optional] |
|**options** | **Object** | options passed to the process |  |
|**results** | **Map&lt;String, Object&gt;** | results summary for the process |  [optional] |
|**logDataList** | [**List&lt;LogData&gt;**](LogData.md) | list of log data that occurred during running of this process |  [optional] |
|**state** | **Object** | process-specific state data |  [optional] |
|**appId** | **String** | app id of the process |  [optional] |
|**uuid** | **String** | unique ID of the process at queue time |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| DONE | &quot;DONE&quot; |
| ERROR | &quot;ERROR&quot; |



