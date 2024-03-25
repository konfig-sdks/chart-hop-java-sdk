

# CreateChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | job id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**scenarioId** | **String** | scenario that this change belongs to |  [optional] |
|**personId** | **String** | the id of the person involved, or empty if no person attached to job |  [optional] |
|**otherJobId** | **String** | for MOVE changes, the id of the job moving from; for RELATE changes, the id of the other job |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of change |  [optional] |
|**date** | **LocalDate** | date of change |  [optional] |
|**announceDate** | **LocalDate** | for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change |  [optional] |
|**departType** | [**DepartTypeEnum**](#DepartTypeEnum) | for DEPART changes, the type of departure |  [optional] |
|**departRegret** | [**DepartRegretEnum**](#DepartRegretEnum) | for DEPART changes, whether the departure is regrettable |  [optional] |
|**reason** | **String** | the reason of the change |  [optional] |
|**promotionType** | [**PromotionTypeEnum**](#PromotionTypeEnum) | if it&#39;s a promotion or a demotion |  [optional] |
|**job** | [**PartialJob**](PartialJob.md) |  |  [optional] |
|**update** | [**JobUpdate**](JobUpdate.md) |  |  [optional] |
|**note** | **String** | note on the change |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HIRE | &quot;HIRE&quot; |
| DEPART | &quot;DEPART&quot; |
| MOVE | &quot;MOVE&quot; |
| UPCOMING | &quot;UPCOMING&quot; |
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DATA | &quot;DATA&quot; |
| DELETE | &quot;DELETE&quot; |
| RELATE | &quot;RELATE&quot; |
| BACKFILL | &quot;BACKFILL&quot; |



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



