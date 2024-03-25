

# CompReviewEligibleEmployees


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ineligibilityType** | [**IneligibilityTypeEnum**](#IneligibilityTypeEnum) | Defines who is ineligible for this cycle |  |
|**excludedEmploymentStatuses** | [**Set&lt;ExcludedEmploymentStatusesEnum&gt;**](#Set&lt;ExcludedEmploymentStatusesEnum&gt;) | Exclude these employment types if specified |  [optional] |
|**excludeGroupIds** | **Set&lt;String&gt;** | Exclude these groups from the cycle |  [optional] |
|**filter** | **String** | The filter to apply when custom ineligibility rules is selected |  [optional] |
|**lastRaiseDate** | **LocalDate** | The cutoff date of last raise if specified |  [optional] |
|**startDate** | **LocalDate** | The cutoff start date if specified |  [optional] |
|**individualExclusions** | **Set&lt;String&gt;** | List of individuals by personId to exclude from the review |  [optional] |
|**individualInclusions** | **Set&lt;String&gt;** | List of individuals by personId to include in the review |  [optional] |



## Enum: IneligibilityTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| DEPARTMENT | &quot;DEPARTMENT&quot; |
| DIVISION | &quot;DIVISION&quot; |
| LOCATION | &quot;LOCATION&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: Set&lt;ExcludedEmploymentStatusesEnum&gt;

| Name | Value |
|---- | -----|
| FULL | &quot;FULL&quot; |
| PART | &quot;PART&quot; |
| TEMP | &quot;TEMP&quot; |
| CONTRACT | &quot;CONTRACT&quot; |
| INTERN | &quot;INTERN&quot; |
| EXPAT | &quot;EXPAT&quot; |



