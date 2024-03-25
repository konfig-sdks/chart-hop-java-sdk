

# ApprovalChain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**entityId** | **String** | entity id |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | entity type |  [optional] |
|**name** | **String** | human-readable name of approval chain |  |
|**isPreview** | **Boolean** | isPreview specifies that this is a preview for implementations that use it (e.g. Compensation Reviews) |  [optional] |
|**fallbackApproverJobId** | **String** | the jobId of the fallback approver |  [optional] |
|**fallbackApproverJobError** | **String** | most recent error for fallback approver |  [optional] |
|**approvalNotifierUserIds** | **Set&lt;String&gt;** | ids of any users who should be notified when approval is complete |  |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |



