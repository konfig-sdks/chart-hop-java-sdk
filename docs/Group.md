

# Group


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**name** | **String** | unique name of group |  |
|**slug** | **String** | unique slug of group |  |
|**code** | **String** | external code identifier of the group |  [optional] |
|**aliases** | **Set&lt;String&gt;** | aliases for group |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of group |  |
|**leadJobIds** | **Set&lt;String&gt;** | a list of group leaders, or null if the leader of the group should be automatically derived from the org chart |  [optional] |
|**fields** | **Object** | group fields (currently only description) |  |
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
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOCATION | &quot;LOCATION&quot; |
| DEPARTMENT | &quot;DEPARTMENT&quot; |
| TEAM | &quot;TEAM&quot; |
| BAND | &quot;BAND&quot; |
| JOBCODE | &quot;JOBCODE&quot; |



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



