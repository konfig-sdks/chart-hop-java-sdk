

# ReportSeriesResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | human-readable label for the series |  |
|**color** | **String** | suggested color for the series |  |
|**format** | **String** | number format (currently &#39;number&#39;, &#39;money&#39;, &#39;percent&#39; allowed) |  |
|**data** | **List&lt;Double&gt;** | array of numbers in the series |  |
|**xAxis** | [**List&lt;LabelColor&gt;**](LabelColor.md) |  |  [optional] [readonly] |
|**isIntervalMetric** | **Boolean** | true if the metric being returned is reporting on the entire interval (includes the intervalFrom or intervalUntil metric), false if just the last date in the interval |  |



