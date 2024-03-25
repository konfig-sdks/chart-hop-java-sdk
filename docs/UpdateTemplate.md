

# UpdateTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | tags to organize the purpose of the template |  [optional] |
|**description** | **String** | description of template |  [optional] |
|**name** | **String** | template name, must be unique to organization |  [optional] |
|**content** | **String** | template content |  [optional] |
|**stylesheet** | **String** | template inline stylesheet |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of template |  [optional] |
|**filename** | **String** | document filename CQL |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOCUMENT | &quot;DOCUMENT&quot; |
| EMAIL | &quot;EMAIL&quot; |



