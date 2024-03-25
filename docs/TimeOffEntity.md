

# TimeOffEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id of time off |  |
|**orgId** | **String** | org that the time off belongs to |  |
|**personId** | **String** | person taking the time off |  |
|**externalId** | **String** | external identifier, if time off synced from external system |  [optional] |
|**startDate** | **LocalDate** | start date of time off, inclusive |  |
|**endDate** | **LocalDate** | end date of time off, inclusive |  |
|**days** | **Double** | number of days used |  [optional] |
|**hours** | **Double** | number of hours used |  [optional] |
|**typeDescription** | **String** | type of time off |  [optional] |
|**note** | **String** | notes on the time off |  [optional] |
|**approval** | [**ApprovalEnum**](#ApprovalEnum) | approval status of the time off |  [optional] |
|**approvalAt** | **String** | timestamp of approval |  [optional] |
|**approvalUserId** | **String** | user who either is the next one requesting approval, or the user who did the final approval or rejection |  [optional] |
|**requestAt** | **String** | requested at timestamp -- often the same as createAt |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateAt** | **String** | updated timestamp |  [optional] |
|**updateId** | **String** | updated by user id |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: ApprovalEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| SUPERSEDED | &quot;SUPERSEDED&quot; |



