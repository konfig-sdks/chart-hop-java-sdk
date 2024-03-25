

# CompBand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  |
|**label** | **String** | human-readable name of content |  |
|**color** | **String** | hex color associated with the band level |  |
|**baseCompMax** | [**Money**](Money.md) |  |  [optional] |
|**baseCompMid** | [**Money**](Money.md) |  |  [optional] |
|**baseCompMin** | [**Money**](Money.md) |  |  [optional] |
|**baseSpread** | **Double** | spread percent used to calculate base comp from the midpoint |  [optional] |
|**baseInterval** | [**EnumValue**](EnumValue.md) |  |  |
|**baseTargetPay** | [**Money**](Money.md) |  |  [optional] |
|**baseTargetPayPercentile** | **Double** | target pay associated with open jobs at this band level, specified as a percentile of [min,max] |  [optional] |
|**jobTierOneField** | [**JobTierField**](JobTierField.md) |  |  [optional] |
|**jobTierTwoField** | [**JobTierField**](JobTierField.md) |  |  [optional] |
|**jobTierThreeField** | [**JobTierField**](JobTierField.md) |  |  [optional] |
|**jobLevel** | [**TableRowRef**](TableRowRef.md) |  |  [optional] |
|**equityTargetShares** | **Double** | target equity for the band, in shares |  [optional] |
|**equityTargetPercentOfBase** | **Double** | target equity for the band, as a percentage of base |  [optional] |
|**equityTargetValue** | **Double** | target equity for the band, as a monetary value, in the same currency as the base |  [optional] |
|**variableValue** | [**Money**](Money.md) |  |  [optional] |
|**variablePercentOfBase** | **Double** | variable compensation for the band, specified as a percentage of base |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



