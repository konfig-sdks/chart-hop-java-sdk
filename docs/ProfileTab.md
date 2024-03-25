

# ProfileTab


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**label** | **String** | human-readable name of profile tab |  |
|**blocks** | [**List&lt;Block&gt;**](Block.md) | ordered list of blocks contained by profile tab |  |
|**status** | [**StatusEnum**](#StatusEnum) | status of the profile tab |  |
|**targetFilter** | **String** | filter that controls on which profiles this tab will appear |  [optional] |
|**readFilter** | **String** | filter that controls which viewers can read this profile tab. The profileTab:read permission, if present, overrides this filter |  [optional] |
|**sort** | **Integer** | sort order |  |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



