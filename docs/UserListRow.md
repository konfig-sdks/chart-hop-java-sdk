

# UserListRow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**Name**](Name.md) |  |  |
|**inviteStatus** | [**InviteStatusEnum**](#InviteStatusEnum) |  |  |
|**isOrgMember** | **Boolean** |  |  |
|**userId** | **String** |  |  [optional] |
|**personId** | **String** |  |  [optional] |
|**imagePath** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**access** | **String** |  |  [optional] |
|**roleLabel** | **String** |  |  [optional] |
|**expr** | **String** |  |  [optional] |
|**groupIds** | **Set&lt;String&gt;** |  |  [optional] |
|**loginAt** | **Long** |  |  [optional] |
|**activeAt** | **Long** |  |  [optional] |



## Enum: InviteStatusEnum

| Name | Value |
|---- | -----|
| INVITED | &quot;INVITED&quot; |
| JOINED | &quot;JOINED&quot; |
| NOT_INVITED | &quot;NOT_INVITED&quot; |



