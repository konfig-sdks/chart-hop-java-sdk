

# GroupByConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**overrides** | [**List&lt;LabelOverride&gt;**](LabelOverride.md) | Overrides by label of label, color, or sort order |  [optional] |
|**limit** | **Integer** | Maximum number of results to display |  [optional] |
|**includeOther** | **Boolean** | When combined with limit, whether to include an &#39;Other&#39; group |  [optional] |
|**includeNone** | **Boolean** | Whether to include a &#39;None&#39; group (null values aggregated) |  [optional] |
|**includeAllValues** | **Boolean** | When combined with fieldId or questionId, will include all values from that fieldId or questionId, even if none of them were used |  [optional] |
|**fieldId** | **String** | The field to use to retrieve values, when includeAllValues is in use |  [optional] |
|**questionId** | **String** | The question to use to retrieve values, when includeAllValues is in use |  [optional] |
|**sortBy** | [**SortByEnum**](#SortByEnum) | Whether to sort the results -- by default, will sort by label if there is no limit, will sort by value descending if there is a limit |  [optional] |
|**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) | The direction to sort the results |  [optional] |



## Enum: SortByEnum

| Name | Value |
|---- | -----|
| LABEL | &quot;LABEL&quot; |
| KEY | &quot;KEY&quot; |
| VALUE | &quot;VALUE&quot; |
| COUNT | &quot;COUNT&quot; |



## Enum: SortDirectionEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



