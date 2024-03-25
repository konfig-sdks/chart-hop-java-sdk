

# CreateOrg


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | customer for billing processing |  [optional] |
|**name** | **String** | name of organization |  |
|**slug** | **String** | unique slug of organization |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of organization |  |
|**industry** | **String** | industry |  [optional] |
|**estEmployees** | **Integer** | approximate number of employees |  |
|**estRevenue** | **Integer** | approximate amount of revenue |  [optional] |
|**foundedYear** | **Integer** | year of founding |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**phone** | **String** | company phone number in E.164 format |  [optional] |
|**email** | **String** | primary contact email |  [optional] |
|**url** | **URI** | website URL |  [optional] |
|**domains** | [**List&lt;OrgDomain&gt;**](OrgDomain.md) | domains used by this org |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | current status of organization |  |
|**imagePath** | **String** | path to full-sized profile image in storage |  [optional] |
|**currencies** | **List&lt;String&gt;** | types of currencies in use, with the first currency the primary currency |  |
|**stock** | **String** | stock symbol |  [optional] |
|**timezone** | **String** | timezone in use |  |
|**appTime** | **String** | approximate time of day for daily app syncs to run (defaults to 9am Eastern time) |  [optional] |
|**zone** | **Integer** | infrastructure zone |  [optional] |
|**fiscalStart** | **Integer** | number of months into the calendar year that the fiscal year starts (1 &#x3D; February, 2 &#x3D; March) |  [optional] |
|**startDate** | **String** | start date of history |  [optional] |
|**sensitiveFields** | **Object** | map of sensitive field defaults |  [optional] |
|**options** | **Object** | org-public options |  [optional] |
|**internalOptions** | **Object** | internal (ChartHop controlled) options |  [optional] |
|**onboardSteps** | [**List&lt;OnboardStepResult&gt;**](OnboardStepResult.md) | list of onboard steps that this Org has completed (or skipped) |  [optional] |
|**onboarding** | **Boolean** | current onboarding status of an organization, allowing clearing of org |  |
|**selfServeImporting** | **Boolean** | completion status of initial import for orgs signed up via self serve |  [optional] |
|**headCount** | **Integer** | number of total headcount currently in the org |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |
| EDU | &quot;EDU&quot; |
| GOV | &quot;GOV&quot; |
| NONPROFIT | &quot;NONPROFIT&quot; |
| DEMO | &quot;DEMO&quot; |
| TEST | &quot;TEST&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DISABLED | &quot;DISABLED&quot; |



