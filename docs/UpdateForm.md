

# UpdateForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | description of form |  [optional] |
|**label** | **String** | human-readable full name of form |  [optional] |
|**fields** | [**List&lt;FormField&gt;**](FormField.md) | ordered list of fields being collected in this form |  [optional] |
|**blocks** | [**List&lt;FormBlock&gt;**](FormBlock.md) | ordered list of blocks being collected in this form |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the form |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of the form |  [optional] |
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) | target type that the form can be filled out about (null defaults to PERSON for backwards compatibility) |  [optional] |
|**targetFilter** | **String** | filter that controls on which profiles this tab will appear |  [optional] |
|**submitFilter** | **String** | filter that controls which respondents can submit this form. The form:submit permission, if present, overrides this filter |  [optional] |
|**responseReadFilter** | **String** | filter that controls who can read the form responses. The formResponse:read permission, if present, overrides this filter |  [optional] |
|**useFieldAccess** | **Boolean** | if this option is on, then form response answers will use field permissions to determine access to those responses |  [optional] |
|**approval** | [**ApprovalEnum**](#ApprovalEnum) | approval needed, if any approval is required |  [optional] |
|**authorSensitive** | [**AuthorSensitiveEnum**](#AuthorSensitiveEnum) | view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author&#39;s identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author&#39;s identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author&#39;s identity is not stored in ChartHop at all. |  [optional] |
|**options** | **Object** | options, such as notification settings |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUILT_IN | &quot;BUILT_IN&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: TargetTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| PERSON | &quot;PERSON&quot; |



## Enum: ApprovalEnum

| Name | Value |
|---- | -----|
| MANAGER | &quot;MANAGER&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |



## Enum: AuthorSensitiveEnum

| Name | Value |
|---- | -----|
| ANONYMOUS | &quot;ANONYMOUS&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| HIGH | &quot;HIGH&quot; |
| MANAGER | &quot;MANAGER&quot; |



