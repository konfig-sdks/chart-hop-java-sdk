

# CreateCompReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | human-readable label of goal |  |
|**config** | [**CompReviewConfig**](CompReviewConfig.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Whether the compensation review has been approved by the final approvers |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who have been granted access to this comp review |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PAUSED | &quot;PAUSED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| REJECTED | &quot;REJECTED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| COMPLETE_APPROVED | &quot;COMPLETE_APPROVED&quot; |



