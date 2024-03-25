

# UpdateApprovalChainStage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inclusionExpression** | **String** | optional custom expression to determine stage inclusion behavior |  [optional] |
|**inclusionBehavior** | [**InclusionBehaviorEnum**](#InclusionBehaviorEnum) | determines whether stage is conditional based on an expression |  [optional] |
|**expandExpression** | **String** | optional custom expression to determine approval request tree |  [optional] |
|**rejectBehavior** | [**RejectBehaviorEnum**](#RejectBehaviorEnum) | determines which stage becomes active when a rejection event happens |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the stage |  [optional] |
|**approvalCommentRequired** | **Boolean** | requires a comment on an approval event |  [optional] |
|**rejectionCommentRequired** | **Boolean** | requires a comment on an rejection event |  [optional] |
|**order** | **Integer** | order of stage in approval chain |  [optional] |
|**groups** | [**List&lt;ApprovalGroup&gt;**](ApprovalGroup.md) | list of groups that are involved in this approval stage |  [optional] |



## Enum: InclusionBehaviorEnum

| Name | Value |
|---- | -----|
| ONLY_INCLUDE_IF | &quot;ONLY_INCLUDE_IF&quot; |
| EXCLUDE_IF | &quot;EXCLUDE_IF&quot; |



## Enum: RejectBehaviorEnum

| Name | Value |
|---- | -----|
| BACK_TO_BEGINNING | &quot;BACK_TO_BEGINNING&quot; |
| PREVIOUS_PHASE | &quot;PREVIOUS_PHASE&quot; |



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



