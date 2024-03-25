

# Template


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | tags to organize the purpose of the template |  |
|**description** | **String** | description of template |  [optional] |
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**name** | **String** | template name, must be unique to organization |  |
|**content** | **String** | template content |  |
|**stylesheet** | **String** | template inline stylesheet |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | template content format - must be MARKDOWN |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of template |  |
|**filename** | **String** | document filename CQL |  [optional] |
|**createId** | **String** | created by user id |  |
|**createAt** | **String** | created timestamp |  |
|**updateId** | **String** | last updated by user id |  |
|**updateAt** | **String** | last updated timestamp |  |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| HTML | &quot;HTML&quot; |
| MARKDOWN | &quot;MARKDOWN&quot; |
| TEXT | &quot;TEXT&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOCUMENT | &quot;DOCUMENT&quot; |
| EMAIL | &quot;EMAIL&quot; |



