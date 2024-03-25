

# UpdateAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | tags to organize the purpose of the action |  [optional] |
|**description** | **String** | description of the action |  [optional] |
|**event** | **String** | event pattern to match on, such as change.create.* |  [optional] |
|**cronSchedule** | **String** | cron schedule to run on, in crontab format |  [optional] |
|**filter** | **String** | only run when matching a particular filter |  [optional] |
|**steps** | [**List&lt;ActionStep&gt;**](ActionStep.md) | list of steps to run when matching the event, schedule, and filter |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the action |  [optional] |
|**sensitive** | **Boolean** | whether to run with access to sensitive events or not |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | organizational category for HRIS-themed actions |  [optional] |



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



