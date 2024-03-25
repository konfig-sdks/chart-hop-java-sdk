

# UpdateProcess


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | current status of process |  [optional] |
|**filePath** | **String** | data file path |  [optional] |
|**message** | **String** | status or error message |  [optional] |
|**progress** | **Double** | percent progress so far |  [optional] |
|**internalError** | **String** | internal-only error message |  [optional] |
|**options** | **Object** | options passed to the process |  [optional] |
|**results** | **Map&lt;String, Object&gt;** | results summary for the process |  [optional] |
|**logDataList** | [**List&lt;LogData&gt;**](LogData.md) | list of log data that occurred during running of this process |  [optional] |
|**state** | **Object** | process-specific state data |  [optional] |
|**appId** | **String** | app id of the process |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| DONE | &quot;DONE&quot; |
| ERROR | &quot;ERROR&quot; |



