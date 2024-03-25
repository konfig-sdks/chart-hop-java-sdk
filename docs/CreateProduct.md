

# CreateProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name of product |  |
|**sku** | **String** | unique sku of product |  [optional] |
|**salesforceProductId** | **String** | corresponding product id in salesforce |  |
|**stripeProductId** | **String** | corresponding product id in stripe |  |
|**features** | [**Set&lt;FeaturesEnum&gt;**](#Set&lt;FeaturesEnum&gt;) | set of features this product has access to |  |
|**featureOptions** | **Map&lt;String, List&lt;FeatureAccessOption&gt;&gt;** | map of options for the feature |  [optional] |



## Enum: Set&lt;FeaturesEnum&gt;

| Name | Value |
|---- | -----|
| ATS_SYNC | &quot;ATS_SYNC&quot; |
| COMPENSATION_REVIEW | &quot;COMPENSATION_REVIEW&quot; |
| CUSTOM_FIELD | &quot;CUSTOM_FIELD&quot; |
| CUSTOM_FIELD_READONLY | &quot;CUSTOM_FIELD_READONLY&quot; |
| CUSTOM_FORM | &quot;CUSTOM_FORM&quot; |
| CUSTOM_PROFILE_TAB | &quot;CUSTOM_PROFILE_TAB&quot; |
| CUSTOM_ROLE | &quot;CUSTOM_ROLE&quot; |
| MULTI_PAYROLL | &quot;MULTI_PAYROLL&quot; |
| PERFORMANCE_REVIEW | &quot;PERFORMANCE_REVIEW&quot; |
| REPORT | &quot;REPORT&quot; |
| REPORT_READONLY | &quot;REPORT_READONLY&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| SURVEY | &quot;SURVEY&quot; |
| TABLE | &quot;TABLE&quot; |
| TEMPLATE | &quot;TEMPLATE&quot; |
| WORKDAY_ADAPTIVE | &quot;WORKDAY_ADAPTIVE&quot; |
| PAYROLL_OUTBOUND | &quot;PAYROLL_OUTBOUND&quot; |



