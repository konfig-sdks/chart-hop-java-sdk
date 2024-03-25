

# ApprovalGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | globally unique id |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | What type of group this is |  |
|**approvers** | [**List&lt;ApprovalGroupApprover&gt;**](ApprovalGroupApprover.md) | approvers that make up the group |  |
|**expandExpression** | **String** | optional custom expression to determine approval request tree |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REVIEWER | &quot;REVIEWER&quot; |
| COLLABORATOR | &quot;COLLABORATOR&quot; |
| FINAL_APPROVER | &quot;FINAL_APPROVER&quot; |



