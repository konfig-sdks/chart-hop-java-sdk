

# CompReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**label** | **String** | human-readable label of goal |  |
|**config** | [**CompReviewConfig**](CompReviewConfig.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Whether the compensation review has been approved by the final approvers |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who have been granted access to this comp review |  |
|**reviewerCount** | **Integer** | count of reviewers in the comp review |  [optional] |
|**submittedCount** | **Integer** | count of reviews that have been submitted and approved |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PAUSED | &quot;PAUSED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| REJECTED | &quot;REJECTED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| COMPLETE_APPROVED | &quot;COMPLETE_APPROVED&quot; |



