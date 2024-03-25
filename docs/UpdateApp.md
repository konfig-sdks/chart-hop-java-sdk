

# UpdateApp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | tags/categories the app belongs to |  [optional] |
|**summary** | **String** | short summary of app |  [optional] |
|**title** | **String** | human-readable name of app |  [optional] |
|**description** | **String** | full description of app, in Markdown |  [optional] |
|**name** | **String** | short unique name |  [optional] |
|**redirectUris** | **List&lt;URI&gt;** | list of acceptable Oauth2 redirect URIs, if Oauth2 is supported for this app |  [optional] |
|**allowedIps** | **List&lt;String&gt;** | allowlist of IPs or IP ranges that are allowed to make API calls on behalf of this app |  [optional] |
|**configFields** | [**List&lt;AppConfigField&gt;**](AppConfigField.md) | list of configuration fields |  [optional] |
|**setupInstructions** | **String** | setup instructions, in Markdown |  [optional] |
|**cronOrder** | **Integer** | execution order of the cron (lower numbers execute earlier) |  [optional] |
|**cronSchedule** | [**CronScheduleEnum**](#CronScheduleEnum) | cron schedule |  [optional] |
|**cronDayOfWeek** | [**CronDayOfWeekEnum**](#CronDayOfWeekEnum) | Day of week if cronSchedule is WEEKLY |  [optional] |
|**imagePath** | **String** | path to avatar profile image, should be approximately square dimensions and show logo |  [optional] |
|**wordmarkImagePath** | **String** | path to larger profile logo image containing brand wordmark, does not need to be square dimensions |  [optional] |
|**poweredByImagePath** | **String** | path to powered by image, should be approximately square dimensions and show logo |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | current status of app |  [optional] |
|**minAccess** | [**MinAccessEnum**](#MinAccessEnum) | minimum access level requested by app |  [optional] |
|**roleId** | **String** | roleId requested by app |  [optional] |
|**eventNotifyUrl** | **URI** | URL that should be notified on events |  [optional] |
|**payload** | **Map&lt;String, String&gt;** | custom payload to send in lieu of regular payload |  [optional] |
|**events** | **Set&lt;String&gt;** | set of events to notify on |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | APP, BUNDLE, or INTERNAL |  [optional] |
|**bundle** | [**Bundle**](Bundle.md) |  |  [optional] |
|**scopes** | **List&lt;String&gt;** | access scopes that the app is requesting |  [optional] |



## Enum: CronScheduleEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |



## Enum: CronDayOfWeekEnum

| Name | Value |
|---- | -----|
| MONDAY | &quot;MONDAY&quot; |
| TUESDAY | &quot;TUESDAY&quot; |
| WEDNESDAY | &quot;WEDNESDAY&quot; |
| THURSDAY | &quot;THURSDAY&quot; |
| FRIDAY | &quot;FRIDAY&quot; |
| SATURDAY | &quot;SATURDAY&quot; |
| SUNDAY | &quot;SUNDAY&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;GLOBAL&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DEVELOPMENT | &quot;DEVELOPMENT&quot; |



## Enum: MinAccessEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| VIEW | &quot;VIEW&quot; |
| LIMITED | &quot;LIMITED&quot; |
| MEMBER_LIMITED_COMP | &quot;MEMBER_LIMITED_COMP&quot; |
| MEMBER | &quot;MEMBER&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| TECH_OWNER | &quot;TECH_OWNER&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| CONTACT | &quot;CONTACT&quot; |
| COMP_CASH | &quot;COMP_CASH&quot; |
| COMP_EQUITY | &quot;COMP_EQUITY&quot; |
| COMP_ALL | &quot;COMP_ALL&quot; |
| RECRUIT_SENSITIVE | &quot;RECRUIT_SENSITIVE&quot; |
| RECRUIT_PRIMARY | &quot;RECRUIT_PRIMARY&quot; |
| SENSITIVE_LIMITED_COMP | &quot;SENSITIVE_LIMITED_COMP&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| PRIMARY | &quot;PRIMARY&quot; |
| PEOPLE_OPS_ADMIN | &quot;PEOPLE_OPS_ADMIN&quot; |
| PEOPLE_OPS_ADMIN_NO_COMP_DATA | &quot;PEOPLE_OPS_ADMIN_NO_COMP_DATA&quot; |
| PEOPLE_OPS_ADMIN_NO_SENSITIVE_DATA | &quot;PEOPLE_OPS_ADMIN_NO_SENSITIVE_DATA&quot; |
| OWNER | &quot;OWNER&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APP | &quot;APP&quot; |
| BUNDLE | &quot;BUNDLE&quot; |
| INTERNAL | &quot;INTERNAL&quot; |



