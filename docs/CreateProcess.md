

# CreateProcess


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgId** | **String** | parent org id |  |
|**label** | **String** | human-readable label that identifies this process |  |
|**type** | **String** | process type |  |
|**status** | [**StatusEnum**](#StatusEnum) | current status of process |  |
|**filePath** | **String** | data file path |  [optional] |
|**runUserId** | **String** | user id who is running the process |  |
|**parentProcessId** | **String** | process id of parent process |  [optional] |
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



