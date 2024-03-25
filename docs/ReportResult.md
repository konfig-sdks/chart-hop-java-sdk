

# ReportResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent org id |  |
|**key** | **String** | identifying key for this report result |  |
|**startDate** | **LocalDate** | date that the report result interval begins, inclusive |  |
|**endDate** | **LocalDate** | date that the report result interval ends, exclusive |  |
|**options** | **Object** | date that the report result interval ends, exclusive |  |
|**queries** | [**List&lt;ReportQuery&gt;**](ReportQuery.md) | list of queries that were requested |  |
|**results** | [**List&lt;ReportQueryResult&gt;**](ReportQueryResult.md) | list of the results, one per query that was requested |  |
|**buildStartAt** | **String** | start time of last build |  [optional] |
|**buildEndAt** | **String** | end time of last build |  [optional] |
|**message** | **String** | status or error message |  [optional] |
|**progress** | **Double** | percent progress so far |  [optional] |
|**viewId** | **String** | viewer user id |  [optional] |
|**createId** | **String** | created by user id |  |
|**createAt** | **String** | created timestamp |  |
|**status** | [**StatusEnum**](#StatusEnum) | status of the report result |  |
|**reportId** | **String** | corresponding report id for the built query |  [optional] |
|**chartId** | **String** | corresponding chart id for the built query |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| LOCKED | &quot;LOCKED&quot; |
| RETRY | &quot;RETRY&quot; |
| ERROR | &quot;ERROR&quot; |



