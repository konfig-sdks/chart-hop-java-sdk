

# PolicyRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allow** | **List&lt;String&gt;** | allow rules |  [optional] |
|**deny** | **List&lt;String&gt;** | deny rules |  [optional] |
|**categories** | **List&lt;String&gt;** | categories the rule is limited to |  [optional] |
|**fields** | **List&lt;String&gt;** | fields the rule is limited to |  [optional] |
|**departmentIds** | **Set&lt;String&gt;** | departments the rule is limited to |  [optional] |
|**filter** | **String** | custom filter the rule is limited to |  [optional] |
|**directions** | **List&lt;String&gt;** | directions that the rule applies to -- either self or under |  [optional] |
|**types** | **List&lt;String&gt;** | types that the rule applies to |  [optional] |
|**visibleSensitive** | **List&lt;String&gt;** | if specified, controls visibility of sensitive entities -- for example, [&#39;Manager Shared&#39;, &#39;Manager Only&#39;] |  [optional] |
|**fieldsSensitive** | **List&lt;String&gt;** | if specified, controls applicability of fields by sensitivity -- for example, [&#39;Manager Shared&#39;, &#39;Manager Only&#39;] |  [optional] |



