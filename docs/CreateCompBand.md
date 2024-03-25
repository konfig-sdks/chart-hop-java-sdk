

# CreateCompBand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | human-readable name of content |  |
|**color** | **String** | hex color associated with the band level |  |
|**baseCompMax** | [**Money**](Money.md) |  |  [optional] |
|**baseCompMid** | [**Money**](Money.md) |  |  [optional] |
|**baseCompMin** | [**Money**](Money.md) |  |  [optional] |
|**baseSpread** | **Double** | spread percent used to calculate base comp from the midpoint |  [optional] |
|**baseInterval** | [**EnumValue**](EnumValue.md) |  |  |
|**baseTargetPay** | [**Money**](Money.md) |  |  [optional] |
|**baseTargetPayPercentile** | **Double** | base target pay associated with open jobs at this band level, as a percentile |  [optional] |
|**equityTargetShares** | **Double** | target equity for the band, in shares |  [optional] |
|**equityTargetPercentOfBase** | **Double** | target equity for the band, as a percentage of base |  [optional] |
|**equityTargetValue** | **Double** | target equity for the band, as a monetary value, in the same currency as the base |  [optional] |
|**variableValue** | [**Money**](Money.md) |  |  [optional] |
|**variablePercentOfBase** | **Double** | variable compensation for the band, specified as a percentage of base |  [optional] |
|**jobTierOneField** | **String** | first job tier associated with the comp band |  [optional] |
|**jobTierTwoField** | **String** | second job tier associated with the comp band |  [optional] |
|**jobTierThreeField** | **String** | third job tier associated with the comp band |  [optional] |
|**jobLevel** | **String** | job level associated with the comp band |  |



