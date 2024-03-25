

# CreateTimeOffEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**personId** | **String** | person taking the time off |  |
|**externalId** | **String** | external identifier, if time off synced from external system |  [optional] |
|**startDate** | **LocalDate** | start date of time off, inclusive |  |
|**endDate** | **LocalDate** | end date of time off, inclusive |  |
|**days** | **Double** | number of days used |  [optional] |
|**hours** | **Double** | number of hours used |  [optional] |
|**typeDescription** | **String** | type of time off |  [optional] |
|**note** | **String** | notes on the time off |  [optional] |
|**approval** | [**ApprovalEnum**](#ApprovalEnum) | approval status of the time off |  [optional] |



## Enum: ApprovalEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| SUPERSEDED | &quot;SUPERSEDED&quot; |



