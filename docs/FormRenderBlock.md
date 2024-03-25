

# FormRenderBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**id** | **String** |  |  |
|**name** | **String** |  |  [optional] |
|**question** | **String** |  |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  [optional] |
|**plural** | [**PluralEnum**](#PluralEnum) |  |  [optional] |
|**values** | [**List&lt;EnumValue&gt;**](EnumValue.md) |  |  [optional] |
|**options** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**value** | **Object** |  |  [optional] |
|**required** | **Boolean** |  |  [optional] |
|**content** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| QUESTION | &quot;QUESTION&quot; |
| CONTENT | &quot;CONTENT&quot; |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| ADDRESS | &quot;ADDRESS&quot; |
| BOOLEAN | &quot;BOOLEAN&quot; |
| COMP | &quot;COMP&quot; |
| COMPOUND | &quot;COMPOUND&quot; |
| COMP_BAND | &quot;COMP_BAND&quot; |
| CONTACTS | &quot;CONTACTS&quot; |
| CURRENCY | &quot;CURRENCY&quot; |
| DATE | &quot;DATE&quot; |
| DECIMAL | &quot;DECIMAL&quot; |
| ELAPSED_DAYS | &quot;ELAPSED_DAYS&quot; |
| ELAPSED_MONTHS | &quot;ELAPSED_MONTHS&quot; |
| ELAPSED_YEARS | &quot;ELAPSED_YEARS&quot; |
| EMAIL | &quot;EMAIL&quot; |
| ENUM | &quot;ENUM&quot; |
| ENUM_EXPR | &quot;ENUM_EXPR&quot; |
| ENUM_MULTI | &quot;ENUM_MULTI&quot; |
| ENUM_SCALE | &quot;ENUM_SCALE&quot; |
| EXPR | &quot;EXPR&quot; |
| FILE | &quot;FILE&quot; |
| GROUP | &quot;GROUP&quot; |
| GROUPS | &quot;GROUPS&quot; |
| GROUP_ASSIGNMENTS | &quot;GROUP_ASSIGNMENTS&quot; |
| GROUP_TYPE | &quot;GROUP_TYPE&quot; |
| IMAGE | &quot;IMAGE&quot; |
| INTEGER | &quot;INTEGER&quot; |
| JOB | &quot;JOB&quot; |
| JOBS | &quot;JOBS&quot; |
| JOB_TIER | &quot;JOB_TIER&quot; |
| LIST | &quot;LIST&quot; |
| MONEY | &quot;MONEY&quot; |
| NAME | &quot;NAME&quot; |
| OBJECT | &quot;OBJECT&quot; |
| PAY_INTERVAL | &quot;PAY_INTERVAL&quot; |
| PERCENT | &quot;PERCENT&quot; |
| PERSON | &quot;PERSON&quot; |
| PERSONS | &quot;PERSONS&quot; |
| PHONE | &quot;PHONE&quot; |
| STOCKGRANT | &quot;STOCKGRANT&quot; |
| STRING | &quot;STRING&quot; |
| TABLE_REF | &quot;TABLE_REF&quot; |
| TEXT | &quot;TEXT&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| TIMESTAMP | &quot;TIMESTAMP&quot; |
| TRACKED_GROUP | &quot;TRACKED_GROUP&quot; |
| URL | &quot;URL&quot; |
| USER | &quot;USER&quot; |
| VARIABLE_COMP | &quot;VARIABLE_COMP&quot; |
| VARIABLE_COMPS | &quot;VARIABLE_COMPS&quot; |



## Enum: PluralEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;SINGLE&quot; |
| LIST | &quot;LIST&quot; |
| SET | &quot;SET&quot; |


