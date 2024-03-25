

# CreateApprovalChain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **String** | entity id |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | entity type |  [optional] |
|**name** | **String** | human-readable name of approval chain |  |
|**isPreview** | **Boolean** | isPreview specifies that this is a preview for implementations that use it (e.g. Compensation Reviews) |  |
|**fallbackApproverJobId** | **String** | the jobId of the fallback approver |  [optional] |
|**fallbackApproverJobError** | **String** | most recent error for fallback approver |  [optional] |
|**approvalNotifierUserIds** | **Set&lt;String&gt;** | ids of any users who should be notified when approval is complete |  |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |



