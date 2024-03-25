

# FormResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent organization id |  [optional] |
|**externalId** | **String** | if the response was imported from an external system, the unique identifier of the response from that system |  [optional] |
|**formId** | **String** | form id that the response is a response for |  [optional] |
|**formVersionId** | **String** | form version id that the response is a response for |  [optional] |
|**submitPersonId** | **String** | person id who filled out the form response (null if anonymous) |  [optional] |
|**submitUserId** | **String** | user id who filled out the form response (can be null if anonymous or imported data) |  [optional] |
|**changeId** | **String** | change id, if the form response is linked to a DATA change |  [optional] |
|**assessmentId** | **String** | assessment id, if the form response is related to an assesment |  [optional] |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | list of share access, if the form response has been shared with anyone |  [optional] |
|**authorSensitive** | [**AuthorSensitiveEnum**](#AuthorSensitiveEnum) | sensitivity level of the author of the form response, if it differs from the form response |  [optional] |
|**targetEntityId** | **String** | target entity id -- the entity that the form response is about |  [optional] |
|**targetEntityType** | [**TargetEntityTypeEnum**](#TargetEntityTypeEnum) | target entity type -- the entity that the form response is about |  [optional] |
|**answers** | [**List&lt;FormResponseAnswer&gt;**](FormResponseAnswer.md) | list of answers in the form response |  [optional] |
|**submitAt** | **Long** | timestamp that the form response was submitted |  [optional] |
|**approvalAt** | **Long** | timestamp that the form response was approved |  [optional] |
|**approvalId** | **String** | user id who approved the form response |  [optional] |
|**approvalNote** | **String** | note left by the user who approved -- this is for backwards compatibility with the old approval system |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of form response |  [optional] |
|**createId** | **String** | created by user id |  [optional] |
|**createAt** | **String** | created timestamp |  [optional] |
|**updateId** | **String** | last updated by user id |  [optional] |
|**updateAt** | **String** | last updated timestamp |  [optional] |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



## Enum: AuthorSensitiveEnum

| Name | Value |
|---- | -----|
| ANONYMOUS | &quot;ANONYMOUS&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| HIGH | &quot;HIGH&quot; |
| MANAGER | &quot;MANAGER&quot; |



## Enum: TargetEntityTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| PERSON | &quot;PERSON&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| PROPOSED | &quot;PROPOSED&quot; |
| REJECTED | &quot;REJECTED&quot; |



