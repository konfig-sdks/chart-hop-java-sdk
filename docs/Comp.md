

# Comp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseComp** | [**PayInterval**](PayInterval.md) |  |  [optional] |
|**variableTargets** | [**List&lt;VariableComp&gt;**](VariableComp.md) | variable compensation (money or percent) |  [optional] |
|**grantShares** | **Integer** | planned stock grant, in shares |  [optional] |
|**grantValue** | **Integer** | planned stock grant, in value (based on the stock&#39;s currency, not the comp) |  [optional] |
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | planned stock grant type |  [optional] |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| ISO | &quot;ISO&quot; |
| NSO | &quot;NSO&quot; |
| RSU | &quot;RSU&quot; |
| SAR | &quot;SAR&quot; |
| PERFORMANCE_SHARES | &quot;PERFORMANCE_SHARES&quot; |
| PHANTOM_STOCK | &quot;PHANTOM_STOCK&quot; |
| RSA | &quot;RSA&quot; |



