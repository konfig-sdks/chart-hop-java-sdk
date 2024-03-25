

# UpdateField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | description of field |  [optional] |
|**name** | **String** | short field name |  [optional] |
|**label** | **String** | human-readable full name of field |  [optional] |
|**question** | **String** | human-readable question associated with field |  [optional] |
|**inUse** | **Boolean** | disallow any updates to this Field (except for field.question string) |  [optional] |
|**expr** | **String** | calculated expression |  [optional] |
|**exprType** | [**ExprTypeEnum**](#ExprTypeEnum) | the expected type of the evaluated expression |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of field |  [optional] |
|**plural** | [**PluralEnum**](#PluralEnum) | plural type of the field (either SINGLE, LIST, or SET) |  [optional] |
|**values** | [**List&lt;EnumValue&gt;**](EnumValue.md) | possible values (enum type only) |  [optional] |
|**defaultValue** | **Object** | default value if field is not set |  [optional] |
|**options** | **Object** | validation options |  [optional] |
|**sensitive** | [**SensitiveEnum**](#SensitiveEnum) | sensitivity level of data |  [optional] |
|**hideExpr** | **Boolean** | hide expression-derived values from non-sensitive users |  [optional] |
|**expireDays** | **Integer** | number of days after which the data becomes invalid |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | the status of the field |  [optional] |
|**tableRef** | [**TableRef**](TableRef.md) |  |  [optional] |
|**isUnique** | **Boolean** | indicates that this field value is unique in conjunction with entityType PERSON or JOB |  [optional] |
|**isRequired** | **Boolean** | indicates that this field value is required |  [optional] |
|**isEffectiveDated** | **Boolean** | indicates that this field value is effective-dated |  [optional] |
|**dataFetchTypes** | [**Set&lt;DataFetchTypesEnum&gt;**](#Set&lt;DataFetchTypesEnum&gt;) | set of data fetch types |  [optional] |
|**aliases** | **Set&lt;String&gt;** | set of aliases for this field |  [optional] |
|**calc** | [**CalcEnum**](#CalcEnum) | unique ID for the function that runs to calculate the value of this field. For native fields only |  [optional] |
|**categoryId** | **String** | ID of the category to which this field belongs, if any |  [optional] |
|**classification** | [**ClassificationEnum**](#ClassificationEnum) | indicates how this field is calculated (whether it&#39;s stored in the DB, evaluated through the expression service, or compound) |  [optional] |
|**places** | **Integer** | number of decimal places for money values |  [optional] |



## Enum: ExprTypeEnum

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



## Enum: TypeEnum

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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| HIDDEN | &quot;HIDDEN&quot; |



## Enum: Set&lt;DataFetchTypesEnum&gt;

| Name | Value |
|---- | -----|
| BASIC | &quot;BASIC&quot; |
| UPDATE | &quot;UPDATE&quot; |
| CHANGE | &quot;CHANGE&quot; |
| RELATIONSHIP_MANAGER | &quot;RELATIONSHIP_MANAGER&quot; |
| RELATIONSHIP_ALL | &quot;RELATIONSHIP_ALL&quot; |
| TITLE | &quot;TITLE&quot; |
| PROMOTION | &quot;PROMOTION&quot; |
| GROUP | &quot;GROUP&quot; |
| COMP | &quot;COMP&quot; |
| COMP_HISTORY | &quot;COMP_HISTORY&quot; |
| GRANT | &quot;GRANT&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| PERSON_JOIN | &quot;PERSON_JOIN&quot; |
| ALL_DATA | &quot;ALL_DATA&quot; |



## Enum: CalcEnum

| Name | Value |
|---- | -----|
| ADDRESS | &quot;ADDRESS&quot; |
| AGE | &quot;AGE&quot; |
| ANNIVERSARY | &quot;ANNIVERSARY&quot; |
| ANNUAL_BASE_MONEY | &quot;ANNUAL_BASE_MONEY&quot; |
| BACKFILL | &quot;BACKFILL&quot; |
| BAND | &quot;BAND&quot; |
| BAND_RANGE | &quot;BAND_RANGE&quot; |
| BASE | &quot;BASE&quot; |
| BASE_CAL_YEAR_PRORATED | &quot;BASE_CAL_YEAR_PRORATED&quot; |
| BASE_CAL_YTD | &quot;BASE_CAL_YTD&quot; |
| BASE_COMP | &quot;BASE_COMP&quot; |
| BASE_COMP_AMOUNT | &quot;BASE_COMP_AMOUNT&quot; |
| BASE_COMP_ANNUALIZED | &quot;BASE_COMP_ANNUALIZED&quot; |
| BASE_COMP_ANNUALIZED_AS_ORG_CURRENCY | &quot;BASE_COMP_ANNUALIZED_AS_ORG_CURRENCY&quot; |
| BASE_COMP_AS_ORG_CURRENCY | &quot;BASE_COMP_AS_ORG_CURRENCY&quot; |
| BASE_COMP_CHANGES | &quot;BASE_COMP_CHANGES&quot; |
| BASE_COMP_CURRENCY | &quot;BASE_COMP_CURRENCY&quot; |
| BASE_COMP_HOURS_PER_WEEK | &quot;BASE_COMP_HOURS_PER_WEEK&quot; |
| BASE_COMP_INTERVAL | &quot;BASE_COMP_INTERVAL&quot; |
| BASE_COMP_LAST_RAISE_DATE | &quot;BASE_COMP_LAST_RAISE_DATE&quot; |
| BASE_COMP_LAST_RAISE_MONTHS_SINCE | &quot;BASE_COMP_LAST_RAISE_MONTHS_SINCE&quot; |
| BASE_COMP_LAST_RAISE_PAY | &quot;BASE_COMP_LAST_RAISE_PAY&quot; |
| BASE_COMP_LAST_RAISE_PAY_AS_ORG_CURRENCY | &quot;BASE_COMP_LAST_RAISE_PAY_AS_ORG_CURRENCY&quot; |
| BASE_COMP_LAST_RAISE_PERCENT | &quot;BASE_COMP_LAST_RAISE_PERCENT&quot; |
| BASE_COMP_LAST_RAISE_TYPE | &quot;BASE_COMP_LAST_RAISE_TYPE&quot; |
| BASE_COMP_PAY | &quot;BASE_COMP_PAY&quot; |
| BASE_COMP_PAY_AS_ORG_CURRENCY | &quot;BASE_COMP_PAY_AS_ORG_CURRENCY&quot; |
| BASE_COMP_WEEKS_PER_YEAR | &quot;BASE_COMP_WEEKS_PER_YEAR&quot; |
| BASE_FISCAL_YEAR_PRORATED | &quot;BASE_FISCAL_YEAR_PRORATED&quot; |
| BASE_FISCAL_YTD | &quot;BASE_FISCAL_YTD&quot; |
| BASE_PRIMARY | &quot;BASE_PRIMARY&quot; |
| BASE_RAISE_AMOUNT | &quot;BASE_RAISE_AMOUNT&quot; |
| BASE_RAISE_DATE | &quot;BASE_RAISE_DATE&quot; |
| BASE_RAISE_PERCENT | &quot;BASE_RAISE_PERCENT&quot; |
| BIRTH_DATE | &quot;BIRTH_DATE&quot; |
| BIRTHDAY | &quot;BIRTHDAY&quot; |
| BONUS_TARGET | &quot;BONUS_TARGET&quot; |
| BUDGET_COST | &quot;BUDGET_COST&quot; |
| BUSINESS_UNITS | &quot;BUSINESS_UNITS&quot; |
| CAL_YEAR_VEST_SHARES | &quot;CAL_YEAR_VEST_SHARES&quot; |
| CAL_YEAR_VEST_VALUE | &quot;CAL_YEAR_VEST_VALUE&quot; |
| CAN_APPROVE_CHANGE | &quot;CAN_APPROVE_CHANGE&quot; |
| CAN_EDIT_JOB | &quot;CAN_EDIT_JOB&quot; |
| CASH_COMP | &quot;CASH_COMP&quot; |
| CASH_COMP_LOCAL | &quot;CASH_COMP_LOCAL&quot; |
| CHANGE | &quot;CHANGE&quot; |
| CHANGE_ID | &quot;CHANGE_ID&quot; |
| COMMISSION_TARGET | &quot;COMMISSION_TARGET&quot; |
| COMP | &quot;COMP&quot; |
| COMP_CHANGE_PERCENT | &quot;COMP_CHANGE_PERCENT&quot; |
| COMPA_RATIO_MID | &quot;COMPA_RATIO_MID&quot; |
| COMPA_RATIO_TARGET | &quot;COMPA_RATIO_TARGET&quot; |
| CONTACT | &quot;CONTACT&quot; |
| COST | &quot;COST&quot; |
| CREATE_DATE | &quot;CREATE_DATE&quot; |
| CURRENCY | &quot;CURRENCY&quot; |
| DATA | &quot;DATA&quot; |
| DATE | &quot;DATE&quot; |
| DATE_OF | &quot;DATE_OF&quot; |
| DAYS_ACTIVE | &quot;DAYS_ACTIVE&quot; |
| DAYS_OFF | &quot;DAYS_OFF&quot; |
| DAYS_OFF_TAKEN | &quot;DAYS_OFF_TAKEN&quot; |
| DAYS_OFF_UPCOMING | &quot;DAYS_OFF_UPCOMING&quot; |
| DAYS_OPEN | &quot;DAYS_OPEN&quot; |
| DB | &quot;DB&quot; |
| DEPART | &quot;DEPART&quot; |
| DEPARTMENT | &quot;DEPARTMENT&quot; |
| DEPARTMENT_FUNC | &quot;DEPARTMENT_FUNC&quot; |
| DIRECT_JOBS | &quot;DIRECT_JOBS&quot; |
| DIRECT_JOB_COUNT | &quot;DIRECT_JOB_COUNT&quot; |
| DIRECT_PERSON_COUNT | &quot;DIRECT_PERSON_COUNT&quot; |
| EMPLOYMENT | &quot;EMPLOYMENT&quot; |
| END_DATE_JOB | &quot;END_DATE_JOB&quot; |
| END_DATE_ORG | &quot;END_DATE_ORG&quot; |
| ETHNICITY | &quot;ETHNICITY&quot; |
| FISCAL_YEAR_COST | &quot;FISCAL_YEAR_COST&quot; |
| GENDER | &quot;GENDER&quot; |
| GEOIP | &quot;GEOIP&quot; |
| GEOIP_ADDRESS | &quot;GEOIP_ADDRESS&quot; |
| GRAND_MANAGER | &quot;GRAND_MANAGER&quot; |
| GRANT_SHARES | &quot;GRANT_SHARES&quot; |
| GRANT_TYPE | &quot;GRANT_TYPE&quot; |
| GRANT_VALUE | &quot;GRANT_VALUE&quot; |
| GRANTS | &quot;GRANTS&quot; |
| GROUP_IDS | &quot;GROUP_IDS&quot; |
| HEADCOUNT | &quot;HEADCOUNT&quot; |
| HISTORIC_BACKFILL | &quot;HISTORIC_BACKFILL&quot; |
| HOUR | &quot;HOUR&quot; |
| HOURLY | &quot;HOURLY&quot; |
| HOURLY_PRIMARY | &quot;HOURLY_PRIMARY&quot; |
| HOURS_PER_WEEK | &quot;HOURS_PER_WEEK&quot; |
| IMAGE | &quot;IMAGE&quot; |
| INDIRECT | &quot;INDIRECT&quot; |
| INDIRECT_JOBS | &quot;INDIRECT_JOBS&quot; |
| JOB | &quot;JOB&quot; |
| JOB_ID | &quot;JOB_ID&quot; |
| JOB_CODE | &quot;JOB_CODE&quot; |
| JOBCOUNT | &quot;JOBCOUNT&quot; |
| LAST_GRANT | &quot;LAST_GRANT&quot; |
| LAST_GRANT_DATE | &quot;LAST_GRANT_DATE&quot; |
| LAST_GRANT_ORIGINAL_VALUE | &quot;LAST_GRANT_ORIGINAL_VALUE&quot; |
| LOCATION | &quot;LOCATION&quot; |
| MANAGE_JOBS | &quot;MANAGE_JOBS&quot; |
| MANAGE_PERSONS | &quot;MANAGE_PERSONS&quot; |
| MANAGER | &quot;MANAGER&quot; |
| MANAGER_COUNT | &quot;MANAGER_COUNT&quot; |
| MANAGER_FILLED | &quot;MANAGER_FILLED&quot; |
| MANAGER_ID | &quot;MANAGER_ID&quot; |
| MANAGERS | &quot;MANAGERS&quot; |
| MANAGER_PERSON | &quot;MANAGER_PERSON&quot; |
| MANAGER_PERSONS | &quot;MANAGER_PERSONS&quot; |
| ME | &quot;ME&quot; |
| MERGE_SCENARIO_ID | &quot;MERGE_SCENARIO_ID&quot; |
| NAME | &quot;NAME&quot; |
| NAME_AUDIO | &quot;NAME_AUDIO&quot; |
| NAME_TITLE | &quot;NAME_TITLE&quot; |
| NEXT_DAY_OFF | &quot;NEXT_DAY_OFF&quot; |
| NEXT_TIME_OFF | &quot;NEXT_TIME_OFF&quot; |
| NEXT_YEAR_VEST_SHARES | &quot;NEXT_YEAR_VEST_SHARES&quot; |
| NEXT_YEAR_VEST_VALUE | &quot;NEXT_YEAR_VEST_VALUE&quot; |
| NOTE | &quot;NOTE&quot; |
| NOOP | &quot;NOOP&quot; |
| OPEN | &quot;OPEN&quot; |
| ORG | &quot;ORG&quot; |
| PERSON | &quot;PERSON&quot; |
| PERSON_ID | &quot;PERSON_ID&quot; |
| PLACEMENT | &quot;PLACEMENT&quot; |
| PREV_DAY_OFF | &quot;PREV_DAY_OFF&quot; |
| PREV_TIME_OFF | &quot;PREV_TIME_OFF&quot; |
| PROMOTION | &quot;PROMOTION&quot; |
| PROMOTION_DATE | &quot;PROMOTION_DATE&quot; |
| PROPOSED | &quot;PROPOSED&quot; |
| Q | &quot;Q&quot; |
| RAISE_AMOUNT | &quot;RAISE_AMOUNT&quot; |
| RAISE_DATE | &quot;RAISE_DATE&quot; |
| RAISE_PERCENT | &quot;RAISE_PERCENT&quot; |
| RAISE_PROMOTION_DATE | &quot;RAISE_PROMOTION_DATE&quot; |
| REASON | &quot;REASON&quot; |
| REGRET | &quot;REGRET&quot; |
| RELATIONSHIPS | &quot;RELATIONSHIPS&quot; |
| REMOTE_WORK_ADDRESS | &quot;REMOTE_WORK_ADDRESS&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| SCENARIO_CHANGED | &quot;SCENARIO_CHANGED&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| SENSITIVE_FIELDS | &quot;SENSITIVE_FIELDS&quot; |
| START_DATE | &quot;START_DATE&quot; |
| START_DATE_JOB | &quot;START_DATE_JOB&quot; |
| START_DATE_ORG | &quot;START_DATE_ORG&quot; |
| START_DATE_PLANNED | &quot;START_DATE_PLANNED&quot; |
| STATE | &quot;STATE&quot; |
| STRIKE_PRICE | &quot;STRIKE_PRICE&quot; |
| TARGET_HOURS_PER_WEEK | &quot;TARGET_HOURS_PER_WEEK&quot; |
| TARGET_WEEKS_PER_YEAR | &quot;TARGET_WEEKS_PER_YEAR&quot; |
| TEAM | &quot;TEAM&quot; |
| TENURE_JOB | &quot;TENURE_JOB&quot; |
| TENURE_ORG | &quot;TENURE_ORG&quot; |
| TIMEZONE_OFFSET | &quot;TIMEZONE_OFFSET&quot; |
| TITLE | &quot;TITLE&quot; |
| TITLE_DATE | &quot;TITLE_DATE&quot; |
| TODAY | &quot;TODAY&quot; |
| TOTAL_COMP | &quot;TOTAL_COMP&quot; |
| TOTAL_COMP_LOCAL | &quot;TOTAL_COMP_LOCAL&quot; |
| TOTAL_ORG_SHARES | &quot;TOTAL_ORG_SHARES&quot; |
| TOTAL_SHARES | &quot;TOTAL_SHARES&quot; |
| TOTAL_SHARES_VALUE | &quot;TOTAL_SHARES_VALUE&quot; |
| UNDER | &quot;UNDER&quot; |
| UNDER_INCLUDING | &quot;UNDER_INCLUDING&quot; |
| UNDER_JOBS | &quot;UNDER_JOBS&quot; |
| UNVESTED_SHARES | &quot;UNVESTED_SHARES&quot; |
| UNVESTED_VALUE | &quot;UNVESTED_VALUE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| USER_ACTIVE_DAYS | &quot;USER_ACTIVE_DAYS&quot; |
| USER_CAN_EDIT_COMP_FOR_JOB | &quot;USER_CAN_EDIT_COMP_FOR_JOB&quot; |
| USER | &quot;USER&quot; |
| VARIABLE | &quot;VARIABLE&quot; |
| VARIABLE_AMOUNT | &quot;VARIABLE_AMOUNT&quot; |
| VARIABLE_INTERVAL | &quot;VARIABLE_INTERVAL&quot; |
| VARIABLE_PERCENT | &quot;VARIABLE_PERCENT&quot; |
| VARIABLE_PRIMARY | &quot;VARIABLE_PRIMARY&quot; |
| VARIABLE_TARGET | &quot;VARIABLE_TARGET&quot; |
| VARIABLE_TARGET_AMOUNT | &quot;VARIABLE_TARGET_AMOUNT&quot; |
| VARIABLE_TARGET_ANNUALIZED | &quot;VARIABLE_TARGET_ANNUALIZED&quot; |
| VARIABLE_TARGET_CURRENCY | &quot;VARIABLE_TARGET_CURRENCY&quot; |
| VARIABLE_TARGET_PERCENT | &quot;VARIABLE_TARGET_PERCENT&quot; |
| VARIABLE_TARGET_TYPE | &quot;VARIABLE_TARGET_TYPE&quot; |
| VARIABLE_TARGETS | &quot;VARIABLE_TARGETS&quot; |
| VARIABLE_TARGETS_LAST_RAISE_DATE | &quot;VARIABLE_TARGETS_LAST_RAISE_DATE&quot; |
| VARIABLE_TARGETS_LAST_RAISE_MONTHS_SINCE | &quot;VARIABLE_TARGETS_LAST_RAISE_MONTHS_SINCE&quot; |
| VARIABLE_TARGETS_LAST_RAISE_PAY | &quot;VARIABLE_TARGETS_LAST_RAISE_PAY&quot; |
| VARIABLE_TARGETS_LAST_RAISE_PERCENT | &quot;VARIABLE_TARGETS_LAST_RAISE_PERCENT&quot; |
| VARIABLE_TYPE | &quot;VARIABLE_TYPE&quot; |
| VESTED_DATE | &quot;VESTED_DATE&quot; |
| VESTED_SHARES | &quot;VESTED_SHARES&quot; |
| VESTED_VALUE | &quot;VESTED_VALUE&quot; |
| WEEKS_PER_YEAR | &quot;WEEKS_PER_YEAR&quot; |
| WORK_ADDRESS | &quot;WORK_ADDRESS&quot; |



## Enum: ClassificationEnum

| Name | Value |
|---- | -----|
| COMPOUND | &quot;COMPOUND&quot; |



