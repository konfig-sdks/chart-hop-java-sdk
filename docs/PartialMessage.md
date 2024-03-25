

# PartialMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | message title |  [optional] |
|**id** | **String** | globally unique id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of message |  [optional] |
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | type of notification (SUCCESS, ERR, ANNOUNCEMENT etc.) |  [optional] |
|**userId** | **String** | user who receives the message |  [optional] |
|**content** | **String** | message content |  [optional] |
|**messageUrl** | **String** | link to message content (if applicable) |  [optional] |
|**key** | **String** | key of message if applicable (e.g. product-tour, import-complete-{id}) |  [optional] |
|**readAt** | **String** | read timestamp |  [optional] |
|**seenAt** | **String** | seen timestamp |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHAT | &quot;CHAT&quot; |
| EMAIL | &quot;EMAIL&quot; |
| WEB | &quot;WEB&quot; |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| WARN | &quot;WARN&quot; |
| ERROR | &quot;ERROR&quot; |
| COMMENT | &quot;COMMENT&quot; |
| TASK_COMPLETED | &quot;TASK_COMPLETED&quot; |
| TASK_ASSIGNED | &quot;TASK_ASSIGNED&quot; |
| REMINDER | &quot;REMINDER&quot; |
| ANNOUNCEMENT | &quot;ANNOUNCEMENT&quot; |
| PROCESS_ERROR | &quot;PROCESS_ERROR&quot; |
| PROCESS_DONE | &quot;PROCESS_DONE&quot; |



