

# CreateGuideline


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**compReviewId** | **String** | comp review id |  |
|**label** | **String** | guideline name |  |
|**budgetPoolId** | **String** | the budget pool the guideline is allocated from |  [optional] |
|**participantsExpr** | **String** | CQL filter to determine which employees the guideline applies to |  [optional] |
|**appliedField** | **String** | the field the guideline applies to |  |
|**sourceField** | **String** | the field the guideline is calculated from |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | how does the guideline calculate the target value? e.g. is there a range (min/max) or only a target |  |
|**flagMode** | [**FlagModeEnum**](#FlagModeEnum) | how does the guideline indicate deviations from the target amount |  |
|**flagDeviationThreshold** | **Double** | the threshold (percent) against which deviations from the guideline are flagged |  [optional] |
|**enablePopulateValue** | **Boolean** | whether or not the target values from the guidelines are pre-populated in the given columns |  |
|**basisType** | [**BasisTypeEnum**](#BasisTypeEnum) | how an individual guideline value itself is calculated, e.g. percentage of the appliedField, fixed amount, or custom CQL |  |
|**basisExpr** | **String** | if basisType.CUSTOM, the custom CQL expression used to generate the guideline value |  [optional] |
|**basisFieldMatrix** | [**BasisFieldMatrix**](BasisFieldMatrix.md) |  |  [optional] |
|**fixedAmountRange** | [**MoneyRange**](MoneyRange.md) |  |  [optional] |
|**fixedValueRange** | [**ValueRange**](ValueRange.md) |  |  [optional] |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| RANGE | &quot;RANGE&quot; |
| TARGET | &quot;TARGET&quot; |



## Enum: FlagModeEnum

| Name | Value |
|---- | -----|
| DEVIATION_THRESHOLD | &quot;DEVIATION_THRESHOLD&quot; |
| NONE | &quot;NONE&quot; |



## Enum: BasisTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| FIXED | &quot;FIXED&quot; |
| CUSTOM_FIXED | &quot;CUSTOM_FIXED&quot; |
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| CUSTOM_PERCENTAGE | &quot;CUSTOM_PERCENTAGE&quot; |



