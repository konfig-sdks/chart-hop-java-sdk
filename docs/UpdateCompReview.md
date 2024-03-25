

# UpdateCompReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | human-readable label of goal |  [optional] |
|**config** | [**CompReviewConfig**](CompReviewConfig.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Whether the compensation review has been approved by the final approvers |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who have been granted access to this comp review |  [optional] |
|**reviewerCount** | **Integer** | count of reviewers in the comp review |  [optional] |
|**submittedCount** | **Integer** | count of reviews that have been submitted and approved |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PAUSED | &quot;PAUSED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| REJECTED | &quot;REJECTED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| COMPLETE_APPROVED | &quot;COMPLETE_APPROVED&quot; |



