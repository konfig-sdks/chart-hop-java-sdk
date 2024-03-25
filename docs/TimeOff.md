

# TimeOff


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique id of a time off request |  |
|**startDate** | **LocalDate** | start date of time off, inclusive |  |
|**endDate** | **LocalDate** | end date of time off, inclusive |  |
|**days** | **Double** | number of days used |  [optional] |
|**hours** | **Double** | number of hours used |  [optional] |
|**type** | **String** | type of time off |  [optional] |
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



