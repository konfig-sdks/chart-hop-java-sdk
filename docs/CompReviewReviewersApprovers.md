

# CompReviewReviewersApprovers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewers** | [**ReviewersEnum**](#ReviewersEnum) | Which individuals are included as reviewers |  |
|**reviewerLevels** | **List&lt;Integer&gt;** | Levels to be included if reviewers is only specific levels |  [optional] |
|**reviewerTitles** | **List&lt;String&gt;** | Titles to be included if reviewers is only specific titles |  [optional] |
|**reviewerFilter** | **String** | Filter to be applied if reviewers is custom |  [optional] |
|**excludedReviewerIds** | **Set&lt;String&gt;** | Job ids of individuals to exclude from the review |  [optional] |
|**approverIds** | **Set&lt;String&gt;** | Person ids of employees who will final approve |  [optional] |



## Enum: ReviewersEnum

| Name | Value |
|---- | -----|
| ALL_MANAGERS | &quot;ALL_MANAGERS&quot; |
| ONLY_SPECIFIC_LEVEL | &quot;ONLY_SPECIFIC_LEVEL&quot; |
| ONLY_SPECIFIC_TITLES | &quot;ONLY_SPECIFIC_TITLES&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



