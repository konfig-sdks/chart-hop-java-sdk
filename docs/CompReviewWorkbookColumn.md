

# CompReviewWorkbookColumn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | field name |  |
|**label** | **String** | display name in workbook |  |
|**color** | **String** | color used in the column header |  [optional] |
|**editableFor** | **String** | cql evaluated on the reviewee job specifying whether field is editable |  |
|**visibleTo** | **String** | cql specifying who can view |  |
|**visibleToGroups** | **Set&lt;String&gt;** | list of groupIds with viewing permissions |  |
|**visibleToType** | [**VisibleToTypeEnum**](#VisibleToTypeEnum) | type of cql filter used in the visible to |  |
|**visibleToRoles** | [**InCycleViewFeatures**](InCycleViewFeatures.md) |  |  [optional] |



## Enum: VisibleToTypeEnum

| Name | Value |
|---- | -----|
| EVERYONE | &quot;EVERYONE&quot; |
| DEPARTMENT | &quot;DEPARTMENT&quot; |
| TEAM | &quot;TEAM&quot; |
| LOCATION | &quot;LOCATION&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



