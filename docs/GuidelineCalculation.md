

# GuidelineCalculation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**guidelineId** | **String** |  |  |
|**jobId** | **String** |  |  |
|**compReviewId** | **String** |  |  |
|**budgetPoolId** | **String** |  |  [optional] |
|**guidelineLabel** | **String** |  |  |
|**min** | **Object** |  |  [optional] |
|**max** | **Object** |  |  [optional] |
|**target** | **Object** |  |  [optional] |
|**appliedField** | **String** |  |  |
|**flagMode** | [**FlagModeEnum**](#FlagModeEnum) |  |  |
|**flagDeviationThreshold** | **Double** |  |  [optional] |
|**isDeviated** | **Boolean** |  |  |
|**deviation** | [**Deviation**](Deviation.md) |  |  |
|**fields** | **Map&lt;String, Object&gt;** |  |  |



## Enum: FlagModeEnum

| Name | Value |
|---- | -----|
| DEVIATION_THRESHOLD | &quot;DEVIATION_THRESHOLD&quot; |
| NONE | &quot;NONE&quot; |



