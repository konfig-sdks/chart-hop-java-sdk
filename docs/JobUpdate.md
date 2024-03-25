

# JobUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | new title |  [optional] |
|**addRelationships** | [**Set&lt;JobRelationship&gt;**](JobRelationship.md) | relationships to add |  [optional] |
|**removeRelationships** | [**Set&lt;JobRelationship&gt;**](JobRelationship.md) | relationships to remove |  [optional] |
|**addGroupIds** | **Set&lt;String&gt;** | groups to add |  [optional] |
|**removeGroupIds** | **Set&lt;String&gt;** | groups to remove |  [optional] |
|**setGroupIds** | **Map&lt;String, String&gt;** | groups to set |  [optional] |
|**addGroupAssignments** | [**Set&lt;GroupAssignment&gt;**](GroupAssignment.md) | group assignments to add |  [optional] |
|**removeGroupAssignments** | [**Set&lt;GroupAssignment&gt;**](GroupAssignment.md) | group assignments to remove |  [optional] |
|**grant** | [**StockGrant**](StockGrant.md) |  |  [optional] |
|**timeOff** | [**TimeOff**](TimeOff.md) |  |  [optional] |
|**comp** | [**Comp**](Comp.md) |  |  [optional] |
|**placement** | [**PlacementEnum**](#PlacementEnum) | new placement |  [optional] |
|**employment** | [**EmploymentEnum**](#EmploymentEnum) | new employment status |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | new view sensitivity |  [optional] |
|**startDatePlanned** | **LocalDate** | planned start date |  [optional] |
|**startDatePlannedRemove** | **Boolean** | remove planned start date. if both startDatePlanned and startDatePlannedRemove are set, startDatePlanned takes precedence |  [optional] |
|**startDate** | **LocalDate** | new expected start date - will update to person start date in future |  [optional] |
|**backfillPersonId** | **Object** | set who this job is backfilling |  [optional] |
|**hasUnsetFields** | **Boolean** | set who this job is backfilling |  [optional] |
|**fields** | **Map&lt;String, Object&gt;** | custom fields values to set |  [optional] |
|**orderedFields** | [**List&lt;PairStringObject&gt;**](PairStringObject.md) | custom ordered fields values to set |  [optional] |



## Enum: PlacementEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| ASSISTANT | &quot;ASSISTANT&quot; |



## Enum: EmploymentEnum

| Name | Value |
|---- | -----|
| FULL | &quot;FULL&quot; |
| PART | &quot;PART&quot; |
| TEMP | &quot;TEMP&quot; |
| CONTRACT | &quot;CONTRACT&quot; |
| INTERN | &quot;INTERN&quot; |
| EXPAT | &quot;EXPAT&quot; |



## Enum: SensitiveEnum

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



