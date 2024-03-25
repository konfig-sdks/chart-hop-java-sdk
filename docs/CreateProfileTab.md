

# CreateProfileTab


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | human-readable name of profile tab |  |
|**blocks** | [**List&lt;Block&gt;**](Block.md) | ordered list of blocks contained by profile tab |  |
|**status** | [**StatusEnum**](#StatusEnum) | status of the profile tab |  |
|**targetFilter** | **String** | filter that controls on which profiles this tab will appear |  [optional] |
|**readFilter** | **String** | filter that controls which viewers can read this profile tab. The profileTab:read permission, if present, overrides this filter |  [optional] |
|**sort** | **Integer** | sort order |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



