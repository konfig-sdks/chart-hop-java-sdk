

# Table


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | parent org id |  [optional] |
|**name** | **String** | name of table |  |
|**label** | **String** | human readable label for the table |  |
|**labelColumnId** | **String** | if set, use this column id as the label when referencing rows |  [optional] |
|**effectiveDated** | **Boolean** | whether or not the table is time tracked with effective dates (allows time travel or not). If false, then the values set in the table will be the same across all dates. |  |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | base sensitivity of this table and entities in it -- should be either ORG or HIGH |  |
|**shareAccess** | [**List&lt;ShareAccess&gt;**](ShareAccess.md) | users who are specifically granted permission to this table |  |
|**rowCount** | **Long** | number of rows in the table |  |
|**createId** | **String** | created by user id |  |
|**createAt** | **String** | created timestamp |  |
|**updateId** | **String** | last updated by user id |  |
|**updateAt** | **String** | last updated timestamp |  |
|**deleteId** | **String** | deleted by user id |  [optional] |
|**deleteAt** | **String** | deleted timestamp |  [optional] |



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



