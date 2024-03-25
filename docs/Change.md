

# Change


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique id |  |
|**jobId** | **String** | job id |  |
|**orgId** | **String** | parent organization id |  |
|**scenarioId** | **String** | scenario that this change belongs to |  [optional] |
|**mergeScenarioId** | **String** | scenario that this change was merged in from, if the change originally came from a scenario |  [optional] |
|**parentChangeId** | **String** | change that this change emanates from |  [optional] |
|**priorStateChangeId** | **String** | connects this change to a previous version if itself that you might want to roll back to because of bad edits |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of change |  |
|**date** | **LocalDate** | date of change |  |
|**sort** | **Long** | sort order of change |  [optional] |
|**announceDate** | **LocalDate** | for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | whether the change is active or not |  |
|**personId** | **String** | the id of the person involved, or empty if no person attached to job |  [optional] |
|**otherJobId** | **String** | for MOVE changes, the id of the job moving from; for RELATE changes, the id of the other job |  [optional] |
|**otherPersonId** | **String** | for MOVE changes, the id of the other person involved in the move |  [optional] |
|**departType** | [**DepartTypeEnum**](#DepartTypeEnum) | for DEPART changes, the type of departure |  [optional] |
|**departRegret** | [**DepartRegretEnum**](#DepartRegretEnum) | for DEPART changes, whether the departure was regrettable |  [optional] |
|**promotionType** | [**PromotionTypeEnum**](#PromotionTypeEnum) | if it&#39;s a promotion or a demotion |  [optional] |
|**reason** | **String** | the reason for the change |  [optional] |
|**relateType** | [**RelateTypeEnum**](#RelateTypeEnum) | for RELATE changes, the type of the relationship |  [optional] |
|**refs** | **List&lt;Object&gt;** | list of ids referenced in text field body, for indexing purposes only |  [optional] |
|**job** | [**PartialJob**](PartialJob.md) |  |  [optional] |
|**otherJob** | [**PartialJob**](PartialJob.md) |  |  [optional] |
|**formId** | **String** | if this change was data submitted by a form, the id of that form |  [optional] |
|**assessmentId** | **String** | if this change is associated with a assessment, the id of that assessment |  [optional] |
|**update** | [**JobUpdate**](JobUpdate.md) |  |  [optional] |
|**upcoming** | [**UpcomingChange**](UpcomingChange.md) |  |  [optional] |
|**conflict** | **String** | for changes that have been struck due to a merge conflict, the description of the conflict |  [optional] |
|**note** | **String** | note on the change |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**mergeId** | **String** | merged by user id, if this change was merged |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateAt** | **String** | updated timestamp |  [optional] |
|**updateId** | **String** | updated by user id |  [optional] |
|**statusAt** | **String** | timestamp of status change |  [optional] |
|**approvalAt** | **String** | timestamp of approval |  [optional] |
|**approvalId** | **String** | approved by user id |  [optional] |
|**approvalNote** | **String** | approval/rejection note |  [optional] |
|**approval** | [**ApprovalEnum**](#ApprovalEnum) | if approval is required, who is allowed to approve |  [optional] |
|**authorSensitive** | [**AuthorSensitiveEnum**](#AuthorSensitiveEnum) | view sensitivity for the author author of this form - the level of view access required to view the createId and updateId fields |  [optional] |
|**canEdit** | **Boolean** | flag indicating whether authorized user can modify this change (will vary depending on user) |  [optional] |



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



## Enum: RelateTypeEnum

| Name | Value |
|---- | -----|
| MANAGER | &quot;MANAGER&quot; |
| DIRECT | &quot;DIRECT&quot; |
| INDIRECT_MANAGER | &quot;INDIRECT_MANAGER&quot; |
| INDIRECT | &quot;INDIRECT&quot; |
| NONE | &quot;NONE&quot; |



## Enum: ApprovalEnum

| Name | Value |
|---- | -----|
| MANAGER | &quot;MANAGER&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |



## Enum: AuthorSensitiveEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;GLOBAL&quot; |
| ORG | &quot;ORG&quot; |
| ORG_OTHER | &quot;ORG_OTHER&quot; |
| PERSONAL_DEMOG | &quot;PERSONAL_DEMOG&quot; |
| PERSONAL_BIRTH | &quot;PERSONAL_BIRTH&quot; |
| PERSONAL_CONTACT | &quot;PERSONAL_CONTACT&quot; |
| PERSONAL_PRIVATE | &quot;PERSONAL_PRIVATE&quot; |
| SENSITIVE_BIRTH | &quot;SENSITIVE_BIRTH&quot; |
| SENSITIVE_CONTACT | &quot;SENSITIVE_CONTACT&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| COMP_CASH | &quot;COMP_CASH&quot; |
| COMP_EQUITY | &quot;COMP_EQUITY&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| PERSONAL | &quot;PERSONAL&quot; |
| MANAGER | &quot;MANAGER&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |
| DIRECT | &quot;DIRECT&quot; |
| PEERS | &quot;PEERS&quot; |
| HIGH | &quot;HIGH&quot; |
| PRIVATE | &quot;PRIVATE&quot; |



