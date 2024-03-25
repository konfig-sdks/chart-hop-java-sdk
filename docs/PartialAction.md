

# PartialAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | tags to organize the purpose of the action |  [optional] |
|**description** | **String** | description of the action |  [optional] |
|**id** | **String** | globally unique id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**event** | **String** | event pattern to match on, such as change.create.* |  [optional] |
|**cronSchedule** | **String** | cron schedule to run on, in crontab format |  [optional] |
|**filter** | **String** | only run when matching a particular filter |  [optional] |
|**steps** | [**List&lt;ActionStep&gt;**](ActionStep.md) | list of steps to run when matching the event, schedule, and filter |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the action |  [optional] |
|**runUserId** | **String** | the user to run the action as - normally the same as the user who created the action |  [optional] |
|**sensitive** | **Boolean** | whether to run with access to sensitive events or not |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | organizational category for HRIS-themed actions |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ONBOARDING | &quot;ONBOARDING&quot; |
| OFFBOARDING | &quot;OFFBOARDING&quot; |



