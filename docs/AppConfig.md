

# AppConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  [optional] |
|**appId** | **String** | app id |  |
|**userId** | **String** | user id, if this person corresponds with a user |  [optional] |
|**orgId** | **String** | org id, if this app config corresponds with an org |  [optional] |
|**fieldMappers** | [**List&lt;FieldMapper&gt;**](FieldMapper.md) | list of default field mappers |  [optional] |
|**customFieldMappers** | [**List&lt;FieldMapper&gt;**](FieldMapper.md) | list of custom field mappers by a user |  [optional] |
|**defaultOutboundFieldMappers** | [**List&lt;OutboundFieldMapper&gt;**](OutboundFieldMapper.md) | list of default outbound field mappers |  [optional] |
|**customOutboundFieldMappers** | [**List&lt;OutboundFieldMapper&gt;**](OutboundFieldMapper.md) | list of custom outbound field mappers |  [optional] |
|**disabledFieldMappers** | **Set&lt;String&gt;** | list of disabled inbound field mappers by id |  [optional] |
|**enabledOutboundFieldMappers** | **Set&lt;String&gt;** | list of enabled outbound field mappers by id |  [optional] |
|**templateMatchers** | **List&lt;Map&lt;String, String&gt;&gt;** | template field matchers defined by a user |  [optional] |
|**createId** | **String** | created by user id |  |
|**createAt** | **String** | created timestamp |  |
|**updateId** | **String** | last updated by user id |  |
|**updateAt** | **String** | last updated timestamp |  |
|**options** | **Object** | app specific options |  [optional] |



