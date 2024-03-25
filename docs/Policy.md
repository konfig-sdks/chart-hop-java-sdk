

# Policy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | description of policy |  [optional] |
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id (empty if global) |  [optional] |
|**label** | **String** | human-readable full name of policy |  |
|**rules** | [**List&lt;PolicyRule&gt;**](PolicyRule.md) | the rules that define the policy |  [optional] |
|**roles** | [**Set&lt;Role&gt;**](Role.md) | the roles the policy is attached to |  [optional] |
|**users** | [**Set&lt;User&gt;**](User.md) | the users the policy is attached to |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



