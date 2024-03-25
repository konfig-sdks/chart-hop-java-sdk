

# Comment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | org id the comment belongs to |  |
|**parentEntityId** | **String** | parent entity id that this comment belongs to, should be used with entityId |  [optional] |
|**entityId** | **String** | entity the comment was posted on |  |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | type of entity the comment was posted on |  |
|**content** | [**Markup**](Markup.md) |  |  |
|**createAt** | **String** | timestamp that the comment was posted |  |
|**createId** | **String** | user id who posted the comment |  |
|**deleteAt** | **String** | deleted timestamp |  [optional] |
|**deleteId** | **String** | user who deleted the comment |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| CHANGE | &quot;CHANGE&quot; |
| ASSESSMENT | &quot;ASSESSMENT&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| APPROVAL_APPROVE | &quot;APPROVAL_APPROVE&quot; |
| APPROVAL_REJECT | &quot;APPROVAL_REJECT&quot; |
| APPROVAL_REASSIGN | &quot;APPROVAL_REASSIGN&quot; |
| APPROVAL_WITHDRAW | &quot;APPROVAL_WITHDRAW&quot; |



