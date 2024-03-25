

# UpdateContent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | title of the content page |  [optional] |
|**parentContentId** | **String** | parent content id in the hierarchy |  [optional] |
|**path** | **String** | full path to the content, if not set, defaults to an id/slug generated URL |  [optional] |
|**blocks** | [**List&lt;ContentBlock&gt;**](ContentBlock.md) | content blocks |  [optional] |
|**imagePath** | **String** | path to the image for the page |  [optional] |
|**emoji** | **String** | emoji, if an emoji is used to represent the page |  [optional] |
|**coverImagePath** | **String** | path to the cover image for the content page |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | sensitivity level (ORG public, HIGHly sensitive, or PRIVATE) |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | list of users and groups who have the content shared with them |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | current status of the content page |  [optional] |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



