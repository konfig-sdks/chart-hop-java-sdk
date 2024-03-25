

# PartialJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | job title |  [optional] |
|**jobId** | **String** | globally unique job id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**snapshotId** | **String** | snapshot that this job belongs to |  [optional] |
|**comp** | [**Comp**](Comp.md) |  |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | view sensitive of the job while open |  [optional] |
|**relationships** | [**Set&lt;JobRelationship&gt;**](JobRelationship.md) | relationship to other jobs |  [optional] |
|**groupIds** | **List&lt;String&gt;** | groups that this job is a member of |  [optional] |
|**groupAssignments** | [**Set&lt;GroupAssignment&gt;**](GroupAssignment.md) | tracked group assignments that this job is a member or lead of |  [optional] |
|**placement** | [**PlacementEnum**](#PlacementEnum) | guidance on placement |  [optional] |
|**employment** | [**EmploymentEnum**](#EmploymentEnum) | employment status |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | current state - whether the job is open, filled, or has someone departed or hired |  [optional] |
|**fields** | **Map&lt;String, Object&gt;** | fields containing custom data |  [optional] |
|**fieldDates** | **Map&lt;String, LocalDate&gt;** | dates of the field data |  [optional] |
|**fieldsProposed** | **Map&lt;String, Object&gt;** | proposed values for fields |  [optional] |
|**createDate** | **LocalDate** | job creation date |  [optional] |
|**startDate** | **LocalDate** | for empty jobs, expected start date - for filled jobs, confirmed start date |  [optional] |
|**startDatePlanned** | **LocalDate** | expected start date whether job is open or has been filled - doesn&#39;t change when job is filled |  [optional] |
|**personStartDate** | **LocalDate** | if personId is present, the first day of that person in the org after the latest departure (if any) |  [optional] |
|**personEndDate** | **LocalDate** | if personId is present and the person is departing, the last day of that person in the org |  [optional] |
|**personJobStartDate** | **LocalDate** | if personId is present, the first day of that person in the job |  [optional] |
|**personIdDate** | **LocalDate** | if personId is present, the first day that the personId actually filled the job |  [optional] |
|**personJobEndDate** | **LocalDate** | if personId is present and the person is departing or moving out, the last day of that person in the job |  [optional] |
|**personId** | **String** | the person holding this job -- either currently in the job, or upcoming announced hire |  [optional] |
|**backfillPersonId** | **String** | the person who most recently held the job, who this represents a backfill for |  [optional] |
|**backfillByJobId** | **String** | another job which is planned to be a backfill for this job |  [optional] |
|**upcoming** | [**List&lt;UpcomingChange&gt;**](UpcomingChange.md) | if a HIRE, MOVE, or DEPART are upcoming, the details on those changes - should only include id, type, date, announceDate, personId |  [optional] |
|**scenarioId** | **String** | scenario that the job was created in (null if job is on primary timeline) |  [optional] |
|**scenarioChangedId** | **String** | scenario that the job was changed in (null if job is on primary timeline) |  [optional] |



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



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| FILLED | &quot;FILLED&quot; |
| DEPART | &quot;DEPART&quot; |
| START | &quot;START&quot; |



