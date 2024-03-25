

# AppConfigField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**label** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**details** | **String** |  |  [optional] |
|**subdomain** | **String** |  |  [optional] |
|**optional** | **Boolean** |  |  [optional] |
|**configSection** | **String** |  |  [optional] |
|**oauthUrl** | **URI** |  |  [optional] |
|**requiredFields** | **List&lt;String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| SUBDOMAIN | &quot;SUBDOMAIN&quot; |
| URL | &quot;URL&quot; |
| SECRET | &quot;SECRET&quot; |
| XML | &quot;XML&quot; |
| OAUTH | &quot;OAUTH&quot; |
| INSTRUCTION | &quot;INSTRUCTION&quot; |



