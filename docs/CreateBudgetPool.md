

# CreateBudgetPool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**compReviewId** | **String** | the ID of the comp review this budget is for |  |
|**label** | **String** | unique label |  |
|**participantsExpr** | **String** | expression that determines if a particular job is included in this budget pool |  [optional] |
|**appliedField** | **String** | the field this budget pool applies to |  |
|**sourceField** | **String** | the field this budget pool is calculated from |  |
|**basisType** | [**BasisTypeEnum**](#BasisTypeEnum) | the method for calculating the amount in the budget |  |
|**fixedAmount** | [**Money**](Money.md) |  |  [optional] |
|**fixedValue** | **Double** | a fixed amount for the budget (used with basisType&#x3D;FIXED || basisType&#x3D;PERCENTAGE) |  [optional] |
|**basisFieldMatrix** | [**BasisFieldMatrix**](BasisFieldMatrix.md) |  |  [optional] |
|**fixedBudgetMap** | [**Map&lt;String, Money&gt;**](Money.md) | a map of reviewer job IDs to fixed budget money amounts |  [optional] |
|**basisExpr** | **String** | expression that calculates how much each job contributes to the budget (used with basisType&#x3D;CUSTOM) |  [optional] |
|**defaultCurrency** | **String** | Default currency used when calculating budget pool, falls back to org primary currency if not set |  [optional] |



## Enum: BasisTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| FIXED | &quot;FIXED&quot; |
| CUSTOM_FIXED | &quot;CUSTOM_FIXED&quot; |
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| CUSTOM_PERCENTAGE | &quot;CUSTOM_PERCENTAGE&quot; |



