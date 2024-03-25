

# CreateOrgConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgId** | **String** | parent organization id |  |
|**hiddenFieldIds** | **Set&lt;String&gt;** | set of hidden field ids of an org |  [optional] |
|**builtinCategoryMap** | [**Set&lt;BuiltInCategoryMap&gt;**](BuiltInCategoryMap.md) | set of maps of the custom fields that belongs to a built-in category |  [optional] |
|**builtinFieldConfig** | [**Set&lt;BuiltInFieldConfig&gt;**](BuiltInFieldConfig.md) | Org configuration for built-in fields |  [optional] |
|**compensationBandsConfig** | [**CompensationBandsConfig**](CompensationBandsConfig.md) |  |  [optional] |
|**smartCurrencyOptions** | [**List&lt;SmartCurrencyOption&gt;**](SmartCurrencyOption.md) | Options for where to source a currency to use when currency is unknown. order specific |  [optional] |
|**smartCurrencyDefault** | **String** | The default currency to use when currency is unknown and there are no options set in smartCurrencyOptions |  [optional] |
|**requiredJobFields** | **Set&lt;String&gt;** | Org configuration for required job fields |  [optional] |
|**scenarioApprovalChains** | **Map&lt;String, String&gt;** | Configures which approval chains to use with specific scenario types |  [optional] |
|**isOpenJobRoleApprovalEnabled** | **Boolean** | Whether to show open job approval on Open Job Profile page |  [optional] |
|**grantConfiguration** | [**Set&lt;GrantAlias&gt;**](GrantAlias.md) | Org Grant Configuration |  [optional] |



