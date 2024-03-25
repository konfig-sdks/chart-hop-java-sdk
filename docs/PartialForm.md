

# PartialForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | description of form |  [optional] |
|**id** | **String** | globally unique id |  [optional] |
|**orgId** | **String** | parent organization id |  [optional] |
|**label** | **String** | human-readable full name of form |  [optional] |
|**fields** | [**List&lt;FormField&gt;**](FormField.md) | ordered list of fields being collected in this form |  [optional] |
|**blocks** | [**List&lt;FormBlock&gt;**](FormBlock.md) | ordered list of blocks being collected in this form |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the form |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of the form |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | view sensitivity of the form - only people with view access to the form can collect the data |  [optional] |
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) | target type that the form can be filled out about (null defaults to PERSON for backwards compatibility) |  [optional] |
|**targetFilter** | **String** | filter that controls on which profiles this tab will appear |  [optional] |
|**submitFilter** | **String** | filter that controls which respondents can submit this form. The form:submit permission, if present, overrides this filter |  [optional] |
|**responseReadFilter** | **String** | filter that controls who can read the form responses. The formResponse:read permission, if present, overrides this filter |  [optional] |
|**useFieldAccess** | **Boolean** | if this option is on, then form response answers will use field permissions to determine access to those responses |  [optional] |
|**approval** | [**ApprovalEnum**](#ApprovalEnum) | approval needed, if any approval is required |  [optional] |
|**authorSensitive** | [**AuthorSensitiveEnum**](#AuthorSensitiveEnum) | view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author&#39;s identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author&#39;s identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author&#39;s identity is not stored in ChartHop at all. |  [optional] |
|**options** | **Object** | options, such as notification settings |  [optional] |
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
| ARCHIVED | &quot;ARCHIVED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUILT_IN | &quot;BUILT_IN&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: SensitiveEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;GLOBAL&quot; |
| ORG | &quot;ORG&quot; |
| ORG_OTHER | &quot;ORG_OTHER&quot; |
| PERSONAL_DEMOG | &quot;PERSONAL_DEMOG&quot; |
| PERSONAL_BIRTH | &quot;PERSONAL_BIRTH&quot; |
| PERSONAL_CONTACT | &quot;PERSONAL_CONTACT&quot; |
| PERSONAL_PRIVATE | &quot;PERSONAL_PRIVATE&quot; |
| SENSITIVE_BIRTH | &quot;SENSITIVE_BIRTH&quot; |
| SENSITIVE_CONTACT | &quot;SENSITIVE_CONTACT&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| COMP_CASH | &quot;COMP_CASH&quot; |
| COMP_EQUITY | &quot;COMP_EQUITY&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| PERSONAL | &quot;PERSONAL&quot; |
| MANAGER | &quot;MANAGER&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |
| DIRECT | &quot;DIRECT&quot; |
| PEERS | &quot;PEERS&quot; |
| HIGH | &quot;HIGH&quot; |
| PRIVATE | &quot;PRIVATE&quot; |



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



