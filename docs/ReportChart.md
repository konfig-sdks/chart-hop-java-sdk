

# ReportChart


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**reportId** | **String** | parent report id |  [optional] |
|**label** | **String** | chart label |  |
|**type** | [**TypeEnum**](#TypeEnum) | chart type |  [optional] |
|**filter** | **String** | filter that applies to this chart |  [optional] |
|**filterOverride** | **Boolean** | whether the chart filter overrides the global filter |  [optional] |
|**query** | [**ReportQuery**](ReportQuery.md) |  |  |
|**sort** | **Integer** | sort order |  [optional] |
|**isAdvancedQueryMode** | **Boolean** | whether the chart configuration is using advanced mode |  [optional] |
|**createId** | **String** | created by user id |  |
|**createAt** | **String** | created timestamp |  |
|**updateId** | **String** | last updated by user id |  |
|**updateAt** | **String** | last updated timestamp |  |
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


