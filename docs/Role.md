

# Role


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | description of role |  [optional] |
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id (empty if global) |  [optional] |
|**label** | **String** | human-readable full name of role |  |
|**policyIds** | **Set&lt;String&gt;** | the policies that define the role |  [optional] |
|**policies** | [**Set&lt;Policy&gt;**](Policy.md) | the policies attached to the role |  [optional] |
|**users** | [**Set&lt;User&gt;**](User.md) | the users the role is attached to |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



