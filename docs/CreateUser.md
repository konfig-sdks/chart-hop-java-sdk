

# CreateUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | if the user is an app user, the id of the app |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**email** | **String** | email address of user |  [optional] |
|**orgs** | [**Set&lt;OrgAccess&gt;**](OrgAccess.md) | list of member orgs with permission levels |  |
|**imagePath** | **String** | path to full-sized profile image in storage |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | current status of user |  [optional] |
|**options** | **Object** | for apps, options (specific options are specific to the particular app); for users, user-set preferences |  [optional] |
|**internalOptions** | **Object** | internal (ChartHop controlled) options |  [optional] |
|**secrets** | **Object** | write-only secrets; the content of these secrets are not retrievable via the external-facing API |  [optional] |
|**emailSettings** | [**List&lt;UserEmailSetting&gt;**](UserEmailSetting.md) | Email settings for the user |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUPERUSER | &quot;SUPERUSER&quot; |
| NORMAL | &quot;NORMAL&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| UNINSTALLED | &quot;UNINSTALLED&quot; |



