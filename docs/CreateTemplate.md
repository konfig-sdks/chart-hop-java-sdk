

# CreateTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | tags to organize the purpose of the template |  [optional] |
|**description** | **String** | description of template |  [optional] |
|**name** | **String** | template name, must be unique to organization |  |
|**content** | **String** | template content |  |
|**stylesheet** | **String** | template inline stylesheet |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of template |  [optional] |
|**filename** | **String** | document filename CQL |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOCUMENT | &quot;DOCUMENT&quot; |
| EMAIL | &quot;EMAIL&quot; |



