

# UpdateChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **LocalDate** | date of change |  [optional] |
|**announceDate** | **LocalDate** | for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | whether the change is active or not |  [optional] |
|**departType** | [**DepartTypeEnum**](#DepartTypeEnum) | for DEPART changes, the type of departure |  [optional] |
|**departRegret** | [**DepartRegretEnum**](#DepartRegretEnum) | for DEPART changes, whether the departure is regrettable |  [optional] |
|**reason** | **String** | the reason of the change |  [optional] |
|**promotionType** | [**PromotionTypeEnum**](#PromotionTypeEnum) | if it&#39;s a promotion or a demotion |  [optional] |
|**job** | [**PartialJob**](PartialJob.md) |  |  [optional] |
|**update** | [**JobUpdate**](JobUpdate.md) |  |  [optional] |
|**note** | **String** | note on the change |  [optional] |
|**approvalNote** | **String** | approval/rejection note |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| STRUCK | &quot;STRUCK&quot; |
| CONFLICT | &quot;CONFLICT&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| PROPOSED | &quot;PROPOSED&quot; |



## Enum: DepartTypeEnum

| Name | Value |
|---- | -----|
| VOLUNTARY | &quot;VOLUNTARY&quot; |
| INVOLUNTARY | &quot;INVOLUNTARY&quot; |



## Enum: DepartRegretEnum

| Name | Value |
|---- | -----|
| REGRET | &quot;REGRET&quot; |
| NONREGRET | &quot;NONREGRET&quot; |



## Enum: PromotionTypeEnum

| Name | Value |
|---- | -----|
| PROMOTION | &quot;PROMOTION&quot; |
| DEMOTION | &quot;DEMOTION&quot; |
| NONE | &quot;NONE&quot; |



