

# ActionStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stepId** | **String** | unique id for action step |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of action to run |  |
|**formId** | **String** | If the action is FORM, the id of the form to fill out |  [optional] |
|**target** | **String** | If the action is MESSAGE, the target to send the message to. If the action is FORM/TASK, the person who should have the form filled out on/complete the task |  [optional] |
|**assignee** | **String** | If the action is FORM/TASK, the user who should fill out the form/complete the task (default is, same as target) |  [optional] |
|**message** | **String** | The message that will be sent -- supports CQLT templates |  [optional] |
|**emailSubject** | **String** | The email subject line that will be used -- supports CQLT templates. If not provided, will use &#39;Notification&#39; |  [optional] |
|**sensitive** | **Boolean** | whether to run with access to sensitive events or not - if this is left blank, will default to the sensitive setting of the Action |  [optional] |
|**httpUrl** | **URI** | If the action is HTTP, the url that will receive the HTTP request |  [optional] |
|**httpMethod** | **String** | If the action is HTTP, the method used by the HTTP request (defaults to POST) |  [optional] |
|**httpHeaders** | **Map&lt;String, String&gt;** | If the action is HTTP, the headers to add to the HTTP request |  [optional] |
|**httpContent** | **Object** | If the action is HTTP, the payload contained in the HTTP request |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FORM | &quot;FORM&quot; |
| MESSAGE | &quot;MESSAGE&quot; |
| HTTP | &quot;HTTP&quot; |
| TASK | &quot;TASK&quot; |



