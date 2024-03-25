

# OrgConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  [optional] |
|**hiddenFieldIds** | **Set&lt;String&gt;** | set of hidden field ids of an org |  [optional] |
|**builtinCategoryMap** | [**Set&lt;BuiltInCategoryMap&gt;**](BuiltInCategoryMap.md) | set of maps of the custom fields that belongs to a built-in category |  [optional] |
|**builtinFieldConfig** | [**Set&lt;BuiltInFieldConfig&gt;**](BuiltInFieldConfig.md) | Org configuration for built-in fields |  [optional] |
|**compensationBandsConfig** | [**CompensationBandsConfig**](CompensationBandsConfig.md) |  |  [optional] |
|**smartCurrencyOptions** | [**List&lt;SmartCurrencyOption&gt;**](SmartCurrencyOption.md) | Options for where to source a currency to use when currency is unknown. order specific |  [optional] |
|**smartCurrencyDefault** | **String** | The default currency to use when currency is unknown and there are no options set in smartCurrencyOptions |  [optional] |
|**requiredJobFields** | **Set&lt;String&gt;** | Org configuration for required job fields |  [optional] |
|**scenarioApprovalChains** | **Map&lt;String, String&gt;** | Configures which approval chains to use with specific scenario types |  [optional] |
|**isOpenJobRoleApprovalEnabled** | **Boolean** | Whether to show open job approval on Open Job Profile page |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |
|**grantConfiguration** | [**Set&lt;GrantAlias&gt;**](GrantAlias.md) | Org Grant Configuration |  [optional] |



