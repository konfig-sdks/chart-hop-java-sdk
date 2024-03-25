

# ApprovalGroupApprover


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | A job ID that is part of the group |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the approver |  |
|**commentId** | **String** | Last comment of the approver |  [optional] |
|**reassignCommentId** | **String** | Last comment associated with a reassignment |  [optional] |
|**isFallback** | **Boolean** | Whether approver is a fallback |  [optional] |
|**fallbackFor** | **String** | What jobId approver is a fallback for |  [optional] |
|**updateAt** | **Long** | The date the status was updated last |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



