

# GenerateTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | **String** |  |  [optional] |
|**emailSubject** | **String** |  |  [optional] |
|**emailMessage** | **String** |  |  [optional] |
|**saveToFiles** | **Boolean** |  |  |
|**fileSensitive** | [**FileSensitiveEnum**](#FileSensitiveEnum) |  |  [optional] |
|**fileField** | **String** |  |  [optional] |
|**sendToManagers** | **Boolean** |  |  |
|**sendToPersons** | **Boolean** |  |  |
|**scenarioId** | **String** |  |  [optional] |
|**date** | **LocalDate** |  |  [optional] |
|**useScenarioChanges** | **Boolean** |  |  |
|**changeGroupingType** | [**ChangeGroupingTypeEnum**](#ChangeGroupingTypeEnum) |  |  [optional] |
|**changeGroupingId** | **String** |  |  [optional] |



## Enum: FileSensitiveEnum

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



## Enum: ChangeGroupingTypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| COMP_REVIEW | &quot;COMP_REVIEW&quot; |



