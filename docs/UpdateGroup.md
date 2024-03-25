

# UpdateGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | unique name of group |  [optional] |
|**slug** | **String** | unique slug of group |  [optional] |
|**code** | **String** | external code identifier of the group |  [optional] |
|**aliases** | **Set&lt;String&gt;** | aliases for group |  [optional] |
|**leadJobIds** | **Set&lt;String&gt;** | a list of group leaders, or null if the leader of the group should be automatically derived from the org chart |  [optional] |
|**fields** | **Object** | group fields (currently only description) |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**level** | **Integer** | level of the group, for BAND type only |  [optional] |
|**func** | [**FuncEnum**](#FuncEnum) | Job function category of the group, for DEPARTMENT type only |  [optional] |
|**locationType** | [**LocationTypeEnum**](#LocationTypeEnum) | Type of the location, for LOCATION type only |  [optional] |
|**parentGroupId** | **String** | parent group id |  [optional] |
|**timezone** | **String** | timezone of the group, for LOCATION type only |  [optional] |
|**compMin** | [**Money**](Money.md) |  |  [optional] |
|**compMax** | [**Money**](Money.md) |  |  [optional] |
|**imagePath** | **String** | path to profile image |  [optional] |
|**color** | **String** | color of group |  [optional] |



## Enum: FuncEnum

| Name | Value |
|---- | -----|
| BD | &quot;BD&quot; |
| CS | &quot;CS&quot; |
| DESIGN | &quot;DESIGN&quot; |
| ENGINEERING | &quot;ENGINEERING&quot; |
| EXECUTIVE | &quot;EXECUTIVE&quot; |
| FINANCE | &quot;FINANCE&quot; |
| GENERAL | &quot;GENERAL&quot; |
| IT | &quot;IT&quot; |
| LEGAL | &quot;LEGAL&quot; |
| MARKETING | &quot;MARKETING&quot; |
| OPERATIONS | &quot;OPERATIONS&quot; |
| PEOPLE | &quot;PEOPLE&quot; |
| PRODUCT | &quot;PRODUCT&quot; |
| RECRUITING | &quot;RECRUITING&quot; |
| SALES | &quot;SALES&quot; |
| SECURITY | &quot;SECURITY&quot; |
| SUPPORT | &quot;SUPPORT&quot; |



## Enum: LocationTypeEnum

| Name | Value |
|---- | -----|
| OFFICE | &quot;OFFICE&quot; |
| REMOTE | &quot;REMOTE&quot; |



