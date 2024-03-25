

# ApprovalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**entityId** | **String** | entity id |  |
|**entityType** | **String** | entity type |  |
|**compReviewId** | **String** | comp review id |  [optional] |
|**approvalChainId** | **String** | parent approval chain id |  |
|**createId** | **String** | the user who requested the approval |  [optional] |
|**stageOverrides** | [**List&lt;ApprovalChainStageOverride&gt;**](ApprovalChainStageOverride.md) | list of configuration fields |  |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



