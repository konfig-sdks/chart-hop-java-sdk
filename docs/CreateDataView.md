

# CreateDataView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | data view name |  |
|**columns** | **String** | comma delimited list of columns |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of data view |  [optional] |
|**entityType** | **String** | entity type being viewed |  [optional] |
|**columnWidths** | **Map&lt;String, Double&gt;** | map of column names to widths in pixels |  [optional] |
|**date** | **String** | date of view, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today |  [optional] |
|**startDate** | **String** | start date of view, if displaying a date range, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today |  [optional] |
|**endDate** | **String** | end date of view, if displaying a date range, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today |  [optional] |
|**filter** | **String** | filter query |  [optional] |
|**sort** | **String** | comma delimited list of columns by which to sort |  [optional] |
|**groupBy** | **String** | column to group duplicates by |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to view or edit this data view |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | sensitivity level of data view |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANY | &quot;ANY&quot; |
| DATA_SHEET | &quot;DATA_SHEET&quot; |
| ORG_CHART | &quot;ORG_CHART&quot; |
| MAP | &quot;MAP&quot; |



## Enum: SensitiveEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;GLOBAL&quot; |
| ORG | &quot;ORG&quot; |
| ORG_OTHER | &quot;ORG_OTHER&quot; |
| PERSONAL_DEMOG | &quot;PERSONAL_DEMOG&quot; |
| PERSONAL_BIRTH | &quot;PERSONAL_BIRTH&quot; |
| PERSONAL_CONTACT | &quot;PERSONAL_CONTACT&quot; |
| PERSONAL_PRIVATE | &quot;PERSONAL_PRIVATE&quot; |
| SENSITIVE_BIRTH | &quot;SENSITIVE_BIRTH&quot; |
| SENSITIVE_CONTACT | &quot;SENSITIVE_CONTACT&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| COMP_CASH | &quot;COMP_CASH&quot; |
| COMP_EQUITY | &quot;COMP_EQUITY&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| PERSONAL | &quot;PERSONAL&quot; |
| MANAGER | &quot;MANAGER&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |
| DIRECT | &quot;DIRECT&quot; |
| PEERS | &quot;PEERS&quot; |
| HIGH | &quot;HIGH&quot; |
| PRIVATE | &quot;PRIVATE&quot; |



