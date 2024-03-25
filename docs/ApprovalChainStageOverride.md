

# ApprovalChainStageOverride


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stageOverrideId** | **String** | unique id for stage |  |
|**approvalChainStageId** | **String** | parent approval chain stage id |  |
|**groups** | [**List&lt;ApprovalGroup&gt;**](ApprovalGroup.md) | approval group override |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the stage |  |
|**order** | **Integer** | order of the stage |  |



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



