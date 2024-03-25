

# CompensationBandsConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annualizedSalaries** | **Boolean** | whether annualized salaries are used |  |
|**annualizedSalariesType** | **String** | how annualized salaries are represented |  [optional] |
|**hourlySalaries** | **Boolean** | whether hourly salaries are used |  |
|**hourlySalariesType** | **String** | how hourly salaries are represented |  [optional] |
|**hoursPerWeek** | **Double** | how many hours per week to use when calculating comp bands |  |
|**weeksPerYear** | **Double** | how many weeks per year to use when calculating comp bands |  |
|**hasTargetSalary** | **Boolean** | target salary within a comp band |  |
|**targetSalaryType** | **String** | how target salaries are represented |  [optional] |
|**equityFormat** | **String** | equity format |  [optional] |
|**variableBonusFormat** | **String** | variable bonus format |  [optional] |
|**tiersNotMappedToCodes** | **Boolean** | whether or not the tiers are mapped to fields. after we migrate all the tiers to be mapped, this flag can be removed |  [optional] |
|**firstTier** | **String** | the org&#39;s first tier for their comp bands |  [optional] |
|**secondTier** | **String** | the org&#39;s second tier for their comp bands |  [optional] |
|**thirdTier** | **String** | the org&#39;s third tier for their comp bands |  [optional] |
|**hasLocationMultiplier** | **Boolean** | whether the org&#39;s location data is used as multipliers |  |
|**jobLevelSource** | **String** | the source for the band job levels |  [optional] |
|**marketJobLevelSystem** | **String** | comparable market job level system |  [optional] |
|**currencyRounding** | [**Set&lt;Money&gt;**](Money.md) | currency rounding settings in the UI |  |
|**hasMigratedBands** | **Boolean** | has migrated V1 bands |  [optional] |



