

# PartialReportChart


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**reportId** | **String** | parent report id |  [optional] |
|**label** | **String** | chart label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | chart type |  [optional] |
|**filter** | **String** | filter that applies to this chart |  [optional] |
|**filterOverride** | **Boolean** | whether the chart filter overrides the global filter |  [optional] |
|**query** | [**ReportQuery**](ReportQuery.md) |  |  [optional] |
|**sort** | **Integer** | sort order |  [optional] |
|**isAdvancedQueryMode** | **Boolean** | whether the chart configuration is using advanced mode |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LINE | &quot;LINE&quot; |
| AREA | &quot;AREA&quot; |
| STACKED | &quot;STACKED&quot; |
| BAR | &quot;BAR&quot; |
| VERTICAL_BAR | &quot;VERTICAL_BAR&quot; |
| HORIZONTAL_BAR | &quot;HORIZONTAL_BAR&quot; |
| PIE | &quot;PIE&quot; |
| TABLE | &quot;TABLE&quot; |
| TABLE_CROSSTAB | &quot;TABLE_CROSSTAB&quot; |
| SINGLE_METRIC | &quot;SINGLE_METRIC&quot; |
| HEADER | &quot;HEADER&quot; |
| TEXT | &quot;TEXT&quot; |



