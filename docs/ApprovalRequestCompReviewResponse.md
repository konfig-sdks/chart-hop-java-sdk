

# ApprovalRequestCompReviewResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**parentStatus** | [**ParentStatusEnum**](#ParentStatusEnum) |  |  [optional] |
|**isFullySubmitted** | **Boolean** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  |
|**entityId** | **String** |  |  |
|**approvalChainId** | **String** |  |  |
|**stageOverrides** | [**List&lt;ApprovalChainStageOverride&gt;**](ApprovalChainStageOverride.md) |  |  |
|**createId** | **String** |  |  [optional] |
|**createAt** | **Long** |  |  [optional] |
|**updateId** | **String** |  |  [optional] |
|**updateAt** | **Long** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| PENDING | &quot;PENDING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| REVIEWED | &quot;REVIEWED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| SUBMITTED | &quot;SUBMITTED&quot; |



## Enum: ParentStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| PENDING | &quot;PENDING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| REVIEWED | &quot;REVIEWED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| SUBMITTED | &quot;SUBMITTED&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |



