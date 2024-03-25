

# OrgAccess


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgId** | **String** | org id |  |
|**personId** | **String** | person id, if this user directly corresponds with a person |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | legacy access permission level |  |
|**groupIds** | **Set&lt;String&gt;** | group ids that the above access applies to |  [optional] |
|**expr** | **String** | expression that the above access applies to |  [optional] |
|**expireAt** | **String** | timestamp that this org access will expire |  [optional] |
|**roleId** | **String** | the role id that defines the users access |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| VIEW | &quot;VIEW&quot; |
| LIMITED | &quot;LIMITED&quot; |
| MEMBER_LIMITED_COMP | &quot;MEMBER_LIMITED_COMP&quot; |
| MEMBER | &quot;MEMBER&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| TECH_OWNER | &quot;TECH_OWNER&quot; |
| TIMEOFF | &quot;TIMEOFF&quot; |
| CONTACT | &quot;CONTACT&quot; |
| COMP_CASH | &quot;COMP_CASH&quot; |
| COMP_EQUITY | &quot;COMP_EQUITY&quot; |
| COMP_ALL | &quot;COMP_ALL&quot; |
| RECRUIT_SENSITIVE | &quot;RECRUIT_SENSITIVE&quot; |
| RECRUIT_PRIMARY | &quot;RECRUIT_PRIMARY&quot; |
| SENSITIVE_LIMITED_COMP | &quot;SENSITIVE_LIMITED_COMP&quot; |
| SENSITIVE | &quot;SENSITIVE&quot; |
| PRIMARY | &quot;PRIMARY&quot; |
| PEOPLE_OPS_ADMIN | &quot;PEOPLE_OPS_ADMIN&quot; |
| PEOPLE_OPS_ADMIN_NO_COMP_DATA | &quot;PEOPLE_OPS_ADMIN_NO_COMP_DATA&quot; |
| PEOPLE_OPS_ADMIN_NO_SENSITIVE_DATA | &quot;PEOPLE_OPS_ADMIN_NO_SENSITIVE_DATA&quot; |
| OWNER | &quot;OWNER&quot; |



