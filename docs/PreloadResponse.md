

# PreloadResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**org** | [**Org**](Org.md) |  |  |
|**orgs** | [**List&lt;Org&gt;**](Org.md) |  |  |
|**user** | [**User**](User.md) |  |  |
|**role** | [**Role**](Role.md) |  |  [optional] |
|**viewUser** | [**User**](User.md) |  |  [optional] |
|**viewRole** | [**Role**](Role.md) |  |  [optional] |
|**groups** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  |
|**scenarios** | [**List&lt;Scenario&gt;**](Scenario.md) |  |  |
|**users** | [**List&lt;User&gt;**](User.md) |  |  |
|**fields** | [**List&lt;Field&gt;**](Field.md) |  |  |
|**forms** | [**List&lt;Form&gt;**](Form.md) |  |  |
|**exchangeRate** | [**ExchangeRate**](ExchangeRate.md) |  |  [optional] |
|**stock** | [**OrgStockData**](OrgStockData.md) |  |  [optional] |
|**job** | [**Job**](Job.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**customerDetails** | [**CustomerDetails**](CustomerDetails.md) |  |  [optional] |
|**featureAccess** | [**List&lt;FeatureAccessEnum&gt;**](#List&lt;FeatureAccessEnum&gt;) |  |  |
|**enabledFeatureOptions** | [**List&lt;FeatureAccessOption&gt;**](FeatureAccessOption.md) |  |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |  |
|**categorySort** | [**CategorySort**](CategorySort.md) |  |  [optional] |
|**orgConfig** | [**OrgConfig**](OrgConfig.md) |  |  [optional] |
|**jobs** | **List&lt;Object&gt;** |  |  |
|**persons** | [**List&lt;Person&gt;**](Person.md) |  |  |
|**compBands** | [**List&lt;CompBand&gt;**](CompBand.md) |  |  |
|**uiAccess** | **Set&lt;String&gt;** |  |  [optional] |
|**questions** | [**List&lt;Question&gt;**](Question.md) |  |  |



## Enum: List&lt;FeatureAccessEnum&gt;

| Name | Value |
|---- | -----|
| ATS_SYNC | &quot;ATS_SYNC&quot; |
| COMPENSATION_REVIEW | &quot;COMPENSATION_REVIEW&quot; |
| CUSTOM_FIELD | &quot;CUSTOM_FIELD&quot; |
| CUSTOM_FIELD_READONLY | &quot;CUSTOM_FIELD_READONLY&quot; |
| CUSTOM_FORM | &quot;CUSTOM_FORM&quot; |
| CUSTOM_PROFILE_TAB | &quot;CUSTOM_PROFILE_TAB&quot; |
| CUSTOM_ROLE | &quot;CUSTOM_ROLE&quot; |
| MULTI_PAYROLL | &quot;MULTI_PAYROLL&quot; |
| PERFORMANCE_REVIEW | &quot;PERFORMANCE_REVIEW&quot; |
| REPORT | &quot;REPORT&quot; |
| REPORT_READONLY | &quot;REPORT_READONLY&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| SURVEY | &quot;SURVEY&quot; |
| TABLE | &quot;TABLE&quot; |
| TEMPLATE | &quot;TEMPLATE&quot; |
| WORKDAY_ADAPTIVE | &quot;WORKDAY_ADAPTIVE&quot; |
| PAYROLL_OUTBOUND | &quot;PAYROLL_OUTBOUND&quot; |



