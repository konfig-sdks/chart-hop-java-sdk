

# ReportQuery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**series** | [**List&lt;ReportSeriesQuery&gt;**](ReportSeriesQuery.md) | series to evaluate |  [optional] |
|**filters** | [**List&lt;ReportFilter&gt;**](ReportFilter.md) | filters to crosstab all results by (deprecated in reports V2, should use groupBy instead) |  [optional] |
|**content** | **String** | content block to evaluate as a Carrot Template, as an alternative to using series |  [optional] |
|**startDate** | **String** | start date, in either relative (-7d) or exact (YYYY-MM-DD) format |  [optional] |
|**endDate** | **String** | end date, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today |  [optional] |
|**interval** | [**IntervalEnum**](#IntervalEnum) | interval, if the query is a timeseries; if no interval, query is crosstabbed |  [optional] |
|**intervalDates** | **List&lt;LocalDate&gt;** | interval dates, if a specific set of irregular dates are being queried in a timeseries |  [optional] |
|**options** | **Object** | options, including format, scenarioId, projectHires |  |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| QUARTER | &quot;QUARTER&quot; |
| FISCAL_QUARTER | &quot;FISCAL_QUARTER&quot; |
| YEAR | &quot;YEAR&quot; |
| FISCAL_YEAR | &quot;FISCAL_YEAR&quot; |



