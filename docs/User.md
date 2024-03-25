

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | job title, if available |  [optional] |
|**id** | **String** | globally unique id |  |
|**appId** | **String** | if the user is an app user, the id of the app |  [optional] |
|**name** | [**Name**](Name.md) |  |  |
|**email** | **String** | email address of user |  [optional] |
|**password** | **String** | password of user (encrypted) |  [optional] |
|**orgs** | [**Set&lt;OrgAccess&gt;**](OrgAccess.md) | list of member orgs with permission levels |  [optional] |
|**imagePath** | **String** | path to full-sized profile image in storage |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | current status of user |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of user |  [optional] |
|**options** | **Object** | for apps, options (specific options are specific to the particular app); for users, user-set preferences |  [optional] |
|**internalOptions** | **Object** | internal (ChartHop controlled) options |  [optional] |
|**bundleInstall** | [**BundleInstall**](BundleInstall.md) |  |  [optional] |
|**secrets** | **Object** | write-only secrets; the content of these secrets are not retrievable via the external-facing API |  [optional] |
|**activeAt** | **String** | last activity timestamp |  [optional] |
|**loginAt** | **String** | last login timestamp |  [optional] |
|**loginFailCount** | **Integer** | number of consecutive failed logins |  [optional] |
|**remoteIp** | **String** | last IP address used |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**verifyAt** | **String** | email verified timestamp, if the email has been verified |  [optional] |
|**mfas** | [**List&lt;WebRegisteredCredential&gt;**](WebRegisteredCredential.md) | list of registered 2FA registered credentials |  [optional] |
|**emailSettings** | [**List&lt;UserEmailSetting&gt;**](UserEmailSetting.md) | Email settings for the user |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUPERUSER | &quot;SUPERUSER&quot; |
| NORMAL | &quot;NORMAL&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| UNINSTALLED | &quot;UNINSTALLED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| APP | &quot;APP&quot; |



