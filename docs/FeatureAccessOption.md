

# FeatureAccessOption


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the feature option |  [optional] |
|**name** | [**NameEnum**](#NameEnum) | The name of the feature option tied to the feature access |  |
|**type** | [**TypeEnum**](#TypeEnum) | The feature option type |  |
|**limit** | **Integer** | The feature option limit |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| CONFIGURED_ROLES | &quot;CONFIGURED_ROLES&quot; |
| SMART_FIELDS | &quot;SMART_FIELDS&quot; |
| APP_FIELD_MAPPERS | &quot;APP_FIELD_MAPPERS&quot; |
| MULTI_PAYROLL_INSTALLS | &quot;MULTI_PAYROLL_INSTALLS&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIMIT | &quot;LIMIT&quot; |
| FULL_ACCESS | &quot;FULL_ACCESS&quot; |



