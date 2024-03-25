<div align="center">

[![Visit Charthop](./header.png)](https://charthop.com)

# [Charthop](https://charthop.com)

REST API for ChartHop

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ChartHop&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>chart-hop-java-sdk</artifactId>
  <version>V1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:chart-hop-java-sdk:V1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/chart-hop-java-sdk-V1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Entity type
    String id = "id_example"; // Entity ids
    String action = "action_example"; // Actions, defaults to update,delete
    String fields = "fields_example"; // Fields to check, defaults to all fields
    LocalDate date = LocalDate.now(); // Date, defaults to today
    String scenarioId = "scenarioId_example"; // Scenario id, defaults to primary
    try {
      AccessResponse result = client
              .access
              .entityActions(orgId, type)
              .id(id)
              .action(action)
              .fields(fields)
              .date(date)
              .scenarioId(scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#entityActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessResponse> response = client
              .access
              .entityActions(orgId, type)
              .id(id)
              .action(action)
              .fields(fields)
              .date(date)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#entityActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.charthop.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessApi* | [**entityActions**](docs/AccessApi.md#entityActions) | **GET** /v1/org/{orgId}/access/entity/{type} | Return the appropriate actions that can be performed on an entity or set of entities
*ActionApi* | [**createNewAction**](docs/ActionApi.md#createNewAction) | **POST** /v1/org/{orgId}/action | Create an action
*ActionApi* | [**deleteActionById**](docs/ActionApi.md#deleteActionById) | **DELETE** /v1/org/{orgId}/action/{actionId} | Delete an action
*ActionApi* | [**executeActionForTesting**](docs/ActionApi.md#executeActionForTesting) | **POST** /v1/org/{orgId}/action/{actionId}/run | Run an action - for testing
*ActionApi* | [**getActionById**](docs/ActionApi.md#getActionById) | **GET** /v1/org/{orgId}/action/{actionId} | Return a particular action by id
*ActionApi* | [**getAllPaginated**](docs/ActionApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/action | Return all actions in the organization paginated
*ActionApi* | [**updateExistingActionById**](docs/ActionApi.md#updateExistingActionById) | **PATCH** /v1/org/{orgId}/action/{actionId} | Update an existing action
*AiApi* | [**generateTextSummary**](docs/AiApi.md#generateTextSummary) | **POST** /v1/org/{orgId}/ai/form-response/summary | Use AI to generate a summary of text form responses
*AppApi* | [**createNewApp**](docs/AppApi.md#createNewApp) | **POST** /v1/app | Create a new app
*AppApi* | [**findInstalledAppUsers**](docs/AppApi.md#findInstalledAppUsers) | **GET** /v1/app/org/{orgId}/install/{appUserId} | Get an installed app
*AppApi* | [**findInstalledAppUsers_0**](docs/AppApi.md#findInstalledAppUsers_0) | **GET** /v1/app/org/{orgId}/install | Find installed app users
*AppApi* | [**generateOrRegenerateAccessToken**](docs/AppApi.md#generateOrRegenerateAccessToken) | **POST** /v1/app/org/{orgId}/install/{appUserId}/token | Generate or regenerate a long-lived access token for the app
*AppApi* | [**getActiveAppsByOrg**](docs/AppApi.md#getActiveAppsByOrg) | **GET** /v1/app/org/{orgId} | Return all active apps available for a particular org
*AppApi* | [**getById**](docs/AppApi.md#getById) | **GET** /v1/app/{appId} | Return a particular app by id
*AppApi* | [**getByName**](docs/AppApi.md#getByName) | **GET** /v1/app/name/{appName} | Return a particular app by name
*AppApi* | [**getInstalledAppByName**](docs/AppApi.md#getInstalledAppByName) | **GET** /v1/app/org/{orgId}/install/name/{appName} | Get an installed app by name
*AppApi* | [**getOauth2AuthorizationCode**](docs/AppApi.md#getOauth2AuthorizationCode) | **POST** /v1/app/org/{orgId}/install/{appUserId}/code | Retrieve an Oauth2 authorization code for this app, which can be exchanged for an access token
*AppApi* | [**getTokenForApp**](docs/AppApi.md#getTokenForApp) | **GET** /v1/app/org/{orgId}/install/{appUserId}/token | Retrieve the current token for this app
*AppApi* | [**getTokenForApp_0**](docs/AppApi.md#getTokenForApp_0) | **GET** /v1/app/org/{orgId}/install/{appUserId}/installdata/{installDataName} | Retrieve the current token for this app
*AppApi* | [**installAppForOrg**](docs/AppApi.md#installAppForOrg) | **POST** /v1/app/org/{orgId}/install | Install an app for a particular org
*AppApi* | [**listPublicGlobalApps**](docs/AppApi.md#listPublicGlobalApps) | **GET** /v1/app | Return all publicly visible global apps
*AppApi* | [**removeById**](docs/AppApi.md#removeById) | **DELETE** /v1/app/{appId} | Delete an app
*AppApi* | [**runInstalledApp**](docs/AppApi.md#runInstalledApp) | **POST** /v1/app/org/{orgId}/install/{appUserId}/run | Run an installed app
*AppApi* | [**sendEmailNotification**](docs/AppApi.md#sendEmailNotification) | **POST** /v1/app/notify | Send an email notification to the configured notify users, on behalf of an app
*AppApi* | [**uninstallAppByUserId**](docs/AppApi.md#uninstallAppByUserId) | **DELETE** /v1/app/org/{orgId}/install/{appUserId} | Uninstall an app
*AppApi* | [**updateExistingApp**](docs/AppApi.md#updateExistingApp) | **PATCH** /v1/app/{appId} | Update an existing app
*AppApi* | [**updateInstalledApp**](docs/AppApi.md#updateInstalledApp) | **PATCH** /v1/app/org/{orgId}/install/{appUserId} | Update the settings of an installed app
*AppApi* | [**validateAppInstallation**](docs/AppApi.md#validateAppInstallation) | **POST** /v1/app/org/{orgId}/install/validate | Validate the installation of an app for a particular org
*AppConfigApi* | [**createNewConfig**](docs/AppConfigApi.md#createNewConfig) | **POST** /v1/app-config | Create a new app config
*AppConfigApi* | [**getDefaultConfigByApp**](docs/AppConfigApi.md#getDefaultConfigByApp) | **GET** /v1/app-config/{appId} | Return default app configuration by app
*AppConfigApi* | [**getUserConfigByAppAndUser**](docs/AppConfigApi.md#getUserConfigByAppAndUser) | **GET** /v1/app-config/{appId}/{userId} | Return user app configuration by app and user
*AppConfigApi* | [**updateById**](docs/AppConfigApi.md#updateById) | **PATCH** /v1/app-config/{appId}/{userId} | Update an existing app
*ApprovalApi* | [**createChain**](docs/ApprovalApi.md#createChain) | **POST** /v1/org/{orgId}/approval-chain | Create an approval chain
*ApprovalApi* | [**createChainStage**](docs/ApprovalApi.md#createChainStage) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage | Create an approval chain stage
*ApprovalApi* | [**createRequest**](docs/ApprovalApi.md#createRequest) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/request | Create an approval request
*ApprovalApi* | [**deleteApprovalChainStage**](docs/ApprovalApi.md#deleteApprovalChainStage) | **DELETE** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage/{approvalChainStageId} | Delete an approval chain stage
*ApprovalApi* | [**deleteChainById**](docs/ApprovalApi.md#deleteChainById) | **DELETE** /v1/org/{orgId}/approval-chain/{approvalChainId} | Delete a approval chain
*ApprovalApi* | [**deleteRequestApproval**](docs/ApprovalApi.md#deleteRequestApproval) | **DELETE** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId} | Delete an approval request
*ApprovalApi* | [**generateDefaultChainStages**](docs/ApprovalApi.md#generateDefaultChainStages) | **POST** /v1/org/{orgId}/approval-chain/create-default-chain | Build a default approval chain based on entity type
*ApprovalApi* | [**getAllApprovalRequestsForApprovalChain**](docs/ApprovalApi.md#getAllApprovalRequestsForApprovalChain) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request | Return all approval requests for an approval chain
*ApprovalApi* | [**getAllStagesForChain**](docs/ApprovalApi.md#getAllStagesForChain) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage/{approvalChainStageId} | Return all approval chain stages for an approval chain
*ApprovalApi* | [**getApprovalChainById**](docs/ApprovalApi.md#getApprovalChainById) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId} | Return a particular approval chain by id
*ApprovalApi* | [**getApprovalChainStages**](docs/ApprovalApi.md#getApprovalChainStages) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage | Return all approval chain stages for an approval chain
*ApprovalApi* | [**getApprovalChains**](docs/ApprovalApi.md#getApprovalChains) | **GET** /v1/org/{orgId}/approval-chain | Return approval chains
*ApprovalApi* | [**getCompReviewResponsesForChain**](docs/ApprovalApi.md#getCompReviewResponsesForChain) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/entity/comp-review | Return all approval request comp review responses for an approval chain
*ApprovalApi* | [**getScenarioResponses**](docs/ApprovalApi.md#getScenarioResponses) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/entity/scenario | Return all approval request scenario responses for an approval chain
*ApprovalApi* | [**reassignApproverAtStage**](docs/ApprovalApi.md#reassignApproverAtStage) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId}/reassign-approver | Reassigning an approver at a stage
*ApprovalApi* | [**requestApprovalRequest**](docs/ApprovalApi.md#requestApprovalRequest) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId} | Return an approval request
*ApprovalApi* | [**sendStageReviewerReminder**](docs/ApprovalApi.md#sendStageReviewerReminder) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId}/send-reminder | Send a reminder for a stage reviewer in an existing approval request
*ApprovalApi* | [**updateChain**](docs/ApprovalApi.md#updateChain) | **PATCH** /v1/org/{orgId}/approval-chain/{approvalChainId} | Update a approval chain
*ApprovalApi* | [**updateExistingRequest**](docs/ApprovalApi.md#updateExistingRequest) | **PATCH** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId} | Update an existing approval request
*ApprovalApi* | [**updateStageById**](docs/ApprovalApi.md#updateStageById) | **PATCH** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage/{approvalChainStageId} | Update an existing approval chain stage
*ApprovalRequestApi* | [**getAllApprovalRequestScenarioResponses**](docs/ApprovalRequestApi.md#getAllApprovalRequestScenarioResponses) | **GET** /v1/org/{orgId}/approval-request/entity/scenario | Return all approval request scenario responses for an org
*ApprovalRequestApi* | [**getApprovalRequestScenarioResponseByJobId**](docs/ApprovalRequestApi.md#getApprovalRequestScenarioResponseByJobId) | **GET** /v1/org/{orgId}/approval-request/scenario-job/{jobId} | Return a particular approval request scenario response by jobId
*ApprovalRequestApi* | [**getScenarioResponseById**](docs/ApprovalRequestApi.md#getScenarioResponseById) | **GET** /v1/org/{orgId}/approval-request/{approvalRequestId}/scenario-response | Return a particular approval request scenario response by id
*AssessmentApi* | [**bulkDelete**](docs/AssessmentApi.md#bulkDelete) | **POST** /v1/org/{orgId}/assessment/bulk/delete | Delete a set of assessments
*AssessmentApi* | [**bulkDuplicateAssessments**](docs/AssessmentApi.md#bulkDuplicateAssessments) | **POST** /v1/org/{orgId}/assessment/bulk/duplicate | Duplicate a set of assessments
*AssessmentApi* | [**completeAssessment**](docs/AssessmentApi.md#completeAssessment) | **POST** /v1/org/{orgId}/assessment/{assessmentId}/complete | Complete a assessment
*AssessmentApi* | [**createNewAssessment**](docs/AssessmentApi.md#createNewAssessment) | **POST** /v1/org/{orgId}/assessment | Create a assessment
*AssessmentApi* | [**expireFormTasks**](docs/AssessmentApi.md#expireFormTasks) | **POST** /v1/org/{orgId}/assessment/{assessmentId}/form/{formId}/expire | Expire all pending tasks for a form of an assessment
*AssessmentApi* | [**getAllPaginated**](docs/AssessmentApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/assessment | Return all assessments in the organization paginated
*AssessmentApi* | [**getById**](docs/AssessmentApi.md#getById) | **GET** /v1/org/{orgId}/assessment/{assessmentId} | Return a particular assessment by id
*AssessmentApi* | [**reactivateAssessment**](docs/AssessmentApi.md#reactivateAssessment) | **POST** /v1/org/{orgId}/assessment/{assessmentId}/reactivate | Reactivate a assessment
*AssessmentApi* | [**removeById**](docs/AssessmentApi.md#removeById) | **DELETE** /v1/org/{orgId}/assessment/{assessmentId} | Delete a assessment
*AssessmentApi* | [**updateAssessmentTypes**](docs/AssessmentApi.md#updateAssessmentTypes) | **POST** /v1/org/{orgId}/assessment/bulk/move | Update the types of a set of assessments
*AssessmentApi* | [**updateExistingAssessment**](docs/AssessmentApi.md#updateExistingAssessment) | **PATCH** /v1/org/{orgId}/assessment/{assessmentId} | Update an existing assessment
*BandApi* | [**createCompBand**](docs/BandApi.md#createCompBand) | **POST** /v1/org/{orgId}/band | Create a comp band
*BandApi* | [**deleteCompBandsOnDate**](docs/BandApi.md#deleteCompBandsOnDate) | **DELETE** /v1/org/{orgId}/band | Delete all comp bands on a date
*BandApi* | [**deleteCompBandsOnDate_0**](docs/BandApi.md#deleteCompBandsOnDate_0) | **DELETE** /v1/org/{orgId}/band/reset | Delete all comp band data on a date
*BandApi* | [**findCompBandsInOrg**](docs/BandApi.md#findCompBandsInOrg) | **GET** /v1/org/{orgId}/band/{bandId} | Return a particular comp band by id on an effective date
*BandApi* | [**findCompBandsInOrg_0**](docs/BandApi.md#findCompBandsInOrg_0) | **GET** /v1/org/{orgId}/band | Find comp bands in the organization
*BandApi* | [**removeCompBand**](docs/BandApi.md#removeCompBand) | **DELETE** /v1/org/{orgId}/band/{bandId} | Delete a comp band
*BandApi* | [**updateCompBandById**](docs/BandApi.md#updateCompBandById) | **PATCH** /v1/org/{orgId}/band/{bandId} | Update a comp band
*BillingApi* | [**cancelSubscriptionForCustomer**](docs/BillingApi.md#cancelSubscriptionForCustomer) | **POST** /v1/customer/{customerId}/billing/cancel | Cancel a subscription for a customer
*BillingApi* | [**customerBillingInfo**](docs/BillingApi.md#customerBillingInfo) | **GET** /v1/customer/{customerId}/billing | Return billing information for a customer
*BillingApi* | [**upgradeSubscription**](docs/BillingApi.md#upgradeSubscription) | **POST** /v1/customer/{customerId}/billing/checkout | Checks out customer to upgrade to pay for their subscription
*BudgetPoolApi* | [**calculateGuideline**](docs/BudgetPoolApi.md#calculateGuideline) | **GET** /v1/org/{orgId}/budget-pool/{id}/calculate | 
*BudgetPoolApi* | [**calculateGuideline_0**](docs/BudgetPoolApi.md#calculateGuideline_0) | **GET** /v1/org/{orgId}/budget-pool/{id}/preview | Generate tiering &amp; preview with the given budget calculated for the compensation review
*BudgetPoolApi* | [**createNewPool**](docs/BudgetPoolApi.md#createNewPool) | **POST** /v1/org/{orgId}/budget-pool | Create a new budget pool
*BudgetPoolApi* | [**deleteBudgetPoolById**](docs/BudgetPoolApi.md#deleteBudgetPoolById) | **DELETE** /v1/org/{orgId}/budget-pool/{id} | Delete a budget pool
*BudgetPoolApi* | [**getAllForOrg**](docs/BudgetPoolApi.md#getAllForOrg) | **GET** /v1/org/{orgId}/budget-pool | Get all budget pools for an org
*BudgetPoolApi* | [**getGuidelinesForBudgetPool**](docs/BudgetPoolApi.md#getGuidelinesForBudgetPool) | **GET** /v1/org/{orgId}/budget-pool/{id}/guidelines | Get the guidelines associated with a budget pool
*BudgetPoolApi* | [**getSpecificPool**](docs/BudgetPoolApi.md#getSpecificPool) | **GET** /v1/org/{orgId}/budget-pool/{id} | Get a specific budget pool
*BudgetPoolApi* | [**updateBudgetPool**](docs/BudgetPoolApi.md#updateBudgetPool) | **PATCH** /v1/org/{orgId}/budget-pool/{id} | Update a budget pool
*CalendarApi* | [**getEntriesByTimePeriod**](docs/CalendarApi.md#getEntriesByTimePeriod) | **GET** /v1/org/{orgId}/calendar | Return calendar entries in a given time period
*CategoryApi* | [**createNewCategory**](docs/CategoryApi.md#createNewCategory) | **POST** /v1/org/{orgId}/category | Create a category
*CategoryApi* | [**getAvailable**](docs/CategoryApi.md#getAvailable) | **GET** /v1/org/{orgId}/category | Return categories that are available to the organization
*CategoryApi* | [**getById**](docs/CategoryApi.md#getById) | **GET** /v1/org/{orgId}/category/{categoryId} | Return a particular category by id
*CategoryApi* | [**removeById**](docs/CategoryApi.md#removeById) | **DELETE** /v1/org/{orgId}/category/{categoryId} | Delete a category
*CategoryApi* | [**updateExistingCategory**](docs/CategoryApi.md#updateExistingCategory) | **PATCH** /v1/org/{orgId}/category/{categoryId} | Update an existing category
*CategorySortApi* | [**createIfNotExists**](docs/CategorySortApi.md#createIfNotExists) | **POST** /v1/org/{orgId}/category-sort | Create a category sort order if it doesn&#39;t exist
*CategorySortApi* | [**createOrUpdateSort**](docs/CategorySortApi.md#createOrUpdateSort) | **PUT** /v1/org/{orgId}/category-sort | Create or update category sort order for a given org and return the sort data
*CategorySortApi* | [**createOrUpdateSortOrder**](docs/CategorySortApi.md#createOrUpdateSortOrder) | **POST** /v1/org/{orgId}/category-sort/upsert | Create or update category sort order for a given org and return the sort data
*CategorySortApi* | [**deleteSortOrder**](docs/CategorySortApi.md#deleteSortOrder) | **DELETE** /v1/org/{orgId}/category-sort | Delete a category sort order
*CategorySortApi* | [**getCategorySortOrder**](docs/CategorySortApi.md#getCategorySortOrder) | **GET** /v1/org/{orgId}/category-sort | Return category sort order
*CategorySortApi* | [**updateExistingCategorySort**](docs/CategorySortApi.md#updateExistingCategorySort) | **PATCH** /v1/org/{orgId}/category-sort | Update an existing category sort order
*ChangeApi* | [**amendScenarioChange**](docs/ChangeApi.md#amendScenarioChange) | **PATCH** /v1/org/{orgId}/scenario/{scenarioId}/change/{changeId} | Amend a change within a scenario, and potentially return the updated data
*ChangeApi* | [**approveOrReject**](docs/ChangeApi.md#approveOrReject) | **POST** /v1/org/{orgId}/change/{changeId}/approve | Approve or reject a change
*ChangeApi* | [**bulkUpdateJobs**](docs/ChangeApi.md#bulkUpdateJobs) | **POST** /v1/org/{orgId}/change/bulkupdate | Perform a bulk update on a number of jobs
*ChangeApi* | [**checkApproverEligibility**](docs/ChangeApi.md#checkApproverEligibility) | **GET** /v1/org/{orgId}/change/{changeId}/approver | Given a of change id, see if the person can approve/reject
*ChangeApi* | [**createDepartRehirePair**](docs/ChangeApi.md#createDepartRehirePair) | **POST** /v1/org/{orgId}/change/depart-rehire | Create a depart-rehire pair of changes, for filling in historical data
*ChangeApi* | [**createIfNotExists**](docs/ChangeApi.md#createIfNotExists) | **POST** /v1/org/{orgId}/change/sync/{type} | Sync a change (create the change only if it does not already exist)
*ChangeApi* | [**createNewChange**](docs/ChangeApi.md#createNewChange) | **POST** /v1/org/{orgId}/change/{type} | Create a new change
*ChangeApi* | [**deletePreviousChange**](docs/ChangeApi.md#deletePreviousChange) | **DELETE** /v1/org/{orgId}/change/{changeId} | Delete a previous change
*ChangeApi* | [**findScenarioChanges**](docs/ChangeApi.md#findScenarioChanges) | **GET** /v1/org/{orgId}/change/scenario/{scenarioId} | Return all changes for a particular scenario, with before job
*ChangeApi* | [**getById**](docs/ChangeApi.md#getById) | **GET** /v1/org/{orgId}/change/{changeId} | Return a particular change by id
*ChangeApi* | [**getById_0**](docs/ChangeApi.md#getById_0) | **GET** /v2/org/{orgId}/change/{changeId} | Return a particular change by id
*ChangeApi* | [**getRecentChanges**](docs/ChangeApi.md#getRecentChanges) | **GET** /v1/org/{orgId}/change | Return recent changes across an org, or for a particular person or job
*ChangeApi* | [**getRecentChangesForOrgOrPerson**](docs/ChangeApi.md#getRecentChangesForOrgOrPerson) | **GET** /v2/org/{orgId}/change | Return recent changes across an org, or for a particular person or job
*ChangeApi* | [**getStatus**](docs/ChangeApi.md#getStatus) | **GET** /v1/org/{orgId}/scenario/{scenarioId}/change/{changeId}/status/{processId} | Get the status of a running change within a scenario
*ChangeApi* | [**performBulkChange**](docs/ChangeApi.md#performBulkChange) | **POST** /v1/org/{orgId}/change/bulkchange | Perform a series of changes at once
*ChangeApi* | [**updateChangeById**](docs/ChangeApi.md#updateChangeById) | **PATCH** /v1/org/{orgId}/change/{changeId} | Make a change to a change
*ChangeApi* | [**validateChangeOperation**](docs/ChangeApi.md#validateChangeOperation) | **POST** /v1/org/{orgId}/change/{type}/validate | Validate a change
*CommentApi* | [**createNewComment**](docs/CommentApi.md#createNewComment) | **POST** /v1/org/{orgId}/comment | Post a comment
*CommentApi* | [**getByEntityId**](docs/CommentApi.md#getByEntityId) | **GET** /v1/org/{orgId}/comment/entity/{entityId} | Return comments on a particular entity paginated
*CommentApi* | [**getById**](docs/CommentApi.md#getById) | **GET** /v1/org/{orgId}/comment/{commentId} | Return a particular comment by id
*CommentApi* | [**listCommentsOnCompReview**](docs/CommentApi.md#listCommentsOnCompReview) | **GET** /v1/org/{orgId}/comment/comp-review/{compReviewId} | Return comments on changes within a comp review, paginated
*CommentApi* | [**listCommentsOnScenarioAndChanges**](docs/CommentApi.md#listCommentsOnScenarioAndChanges) | **GET** /v1/org/{orgId}/comment/scenario/{scenarioId} | Return comments on a scenario and the changes within, paginated
*CommentApi* | [**removeById**](docs/CommentApi.md#removeById) | **DELETE** /v1/org/{orgId}/comment/{commentId} | Delete a comment
*CompReviewApi* | [**closeCompReview**](docs/CompReviewApi.md#closeCompReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/conclude | Concludes (or closes) the compensation review
*CompReviewApi* | [**createBulkDuplicate**](docs/CompReviewApi.md#createBulkDuplicate) | **POST** /v1/org/{orgId}/comp-review/bulk/duplicate | Duplicate a set of comp reviews
*CompReviewApi* | [**createCompReview**](docs/CompReviewApi.md#createCompReview) | **POST** /v1/org/{orgId}/comp-review | Create a comp review
*CompReviewApi* | [**createVisualizationData**](docs/CompReviewApi.md#createVisualizationData) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/visualizations | Get data for visualizations for a comp review
*CompReviewApi* | [**deleteBulkCompReviews**](docs/CompReviewApi.md#deleteBulkCompReviews) | **POST** /v1/org/{orgId}/comp-review/bulk/delete | Delete a set of comp reviews
*CompReviewApi* | [**deleteCompReview**](docs/CompReviewApi.md#deleteCompReview) | **DELETE** /v1/org/{orgId}/comp-review/{compReviewId} | Delete a comp review
*CompReviewApi* | [**duplicateCompReview**](docs/CompReviewApi.md#duplicateCompReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/duplicate | Duplicate a comp review
*CompReviewApi* | [**exportAuditLog**](docs/CompReviewApi.md#exportAuditLog) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/export/audit | Export a comp review&#39;s audit log
*CompReviewApi* | [**exportChanges**](docs/CompReviewApi.md#exportChanges) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/export | Export a comp review&#39;s changes
*CompReviewApi* | [**exportComments**](docs/CompReviewApi.md#exportComments) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/export/comments | Export a comp review&#39;s comments
*CompReviewApi* | [**findCompReviewById**](docs/CompReviewApi.md#findCompReviewById) | **GET** /v1/org/{orgId}/comp-review/{compReviewId} | Return a particular comp review by ID
*CompReviewApi* | [**findCompReviews**](docs/CompReviewApi.md#findCompReviews) | **GET** /v1/org/{orgId}/comp-review | Find comp reviews in the organization
*CompReviewApi* | [**generateCompReview**](docs/CompReviewApi.md#generateCompReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/generate | Generate a compensation review
*CompReviewApi* | [**generateTieringPreview**](docs/CompReviewApi.md#generateTieringPreview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/preview | Generate tiering &amp; preview for a compensation review
*CompReviewApi* | [**getChangeAndGuidelineFlags**](docs/CompReviewApi.md#getChangeAndGuidelineFlags) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle/changes/{changeId} | Get the change data and guideline flags associated with an in-cycle change
*CompReviewApi* | [**getChangesInCycle**](docs/CompReviewApi.md#getChangesInCycle) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle/changes | Get the changes for a set of scenarios in an in-cycle comp-review
*CompReviewApi* | [**getCollabicientInCycle**](docs/CompReviewApi.md#getCollabicientInCycle) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle/collabicient | Get a collaborator participant reviewer in-cycle comp-review
*CompReviewApi* | [**getDateCaches**](docs/CompReviewApi.md#getDateCaches) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/associated-entities | Get the necessary caches on a specific date for a compensation review
*CompReviewApi* | [**getEligibleEmployees**](docs/CompReviewApi.md#getEligibleEmployees) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/eligible-employees | Get a list of employees eligible for a given comp review
*CompReviewApi* | [**getMetadataById**](docs/CompReviewApi.md#getMetadataById) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/metadata | Return metadata for a particular comp review by ID
*CompReviewApi* | [**listRequestResponses**](docs/CompReviewApi.md#listRequestResponses) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/approval-requests | Get a list of approval request responses for a given comp review
*CompReviewApi* | [**overviewInCycleCompReview**](docs/CompReviewApi.md#overviewInCycleCompReview) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle | Get an overview for a given user in an in-cycle comp-review
*CompReviewApi* | [**pauseReview**](docs/CompReviewApi.md#pauseReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/pause | Pauses the compensation review to allow for editing by an admin
*CompReviewApi* | [**sendReminderEmail**](docs/CompReviewApi.md#sendReminderEmail) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/send-reminder-email | Send a reminder email to someone participating in a comp review 
*CompReviewApi* | [**updateApprovalRequestStatus**](docs/CompReviewApi.md#updateApprovalRequestStatus) | **PATCH** /v1/org/{orgId}/comp-review/{compReviewId}/approval-requests/{approvalRequestId} | Update approval request status, including any rollups
*CompReviewApi* | [**updateCompReview**](docs/CompReviewApi.md#updateCompReview) | **PATCH** /v1/org/{orgId}/comp-review/{compReviewId} | Update a comp review
*ContentApi* | [**createNewPiece**](docs/ContentApi.md#createNewPiece) | **POST** /v1/org/{orgId}/content | Create a new piece of content
*ContentApi* | [**getById**](docs/ContentApi.md#getById) | **GET** /v1/org/{orgId}/content/{contentId} | Return a particular content by id
*ContentApi* | [**getByPath**](docs/ContentApi.md#getByPath) | **GET** /v1/org/{orgId}/content/path/{path} | Return a particular content by path
*ContentApi* | [**getPaginated**](docs/ContentApi.md#getPaginated) | **GET** /v1/org/{orgId}/content | Return all content in the organization paginated
*ContentApi* | [**removeById**](docs/ContentApi.md#removeById) | **DELETE** /v1/org/{orgId}/content/{contentId} | Delete a content
*ContentApi* | [**renderByPath**](docs/ContentApi.md#renderByPath) | **GET** /v1/org/{orgId}/content/path/{path}/render | Return a particular content by path, and render its contents
*ContentApi* | [**renderHomepageContents**](docs/ContentApi.md#renderHomepageContents) | **GET** /v1/org/{orgId}/content/homepage/render | Render the contents of the homepage
*ContentApi* | [**updateHomepageContent**](docs/ContentApi.md#updateHomepageContent) | **PATCH** /v1/org/{orgId}/content/homepage | Update the homepage content
*ContentApi* | [**updatePieceById**](docs/ContentApi.md#updatePieceById) | **PATCH** /v1/org/{orgId}/content/{contentId} | Update an existing piece of content
*CustomerApi* | [**createNewCustomer**](docs/CustomerApi.md#createNewCustomer) | **POST** /v1/customer | Create a new customer
*CustomerApi* | [**getAllInvoicesForCustomer**](docs/CustomerApi.md#getAllInvoicesForCustomer) | **GET** /v1/customer/{customerId}/invoices | Returns a list of all the invoices for the given customer
*CustomerApi* | [**getById**](docs/CustomerApi.md#getById) | **GET** /v1/customer/{customerId} | Return a particular customer by id
*CustomerApi* | [**getCharthopSubscription**](docs/CustomerApi.md#getCharthopSubscription) | **GET** /v1/customer/{customerId}/subscription | Returns information about the Charthop subscription for the given customer
*CustomerApi* | [**listVisibleCustomers**](docs/CustomerApi.md#listVisibleCustomers) | **GET** /v1/customer | Return all visible customers, paginated by name
*CustomerApi* | [**updateExistingCustomer**](docs/CustomerApi.md#updateExistingCustomer) | **PATCH** /v1/customer/{customerId} | Update an existing customer
*CustomerApi* | [**updateSubscription**](docs/CustomerApi.md#updateSubscription) | **PATCH** /v1/customer/{customerId}/subscription | 
*DataViewApi* | [**createNewDataView**](docs/DataViewApi.md#createNewDataView) | **POST** /v1/org/{orgId}/data-view | Create a data view
*DataViewApi* | [**deleteDataView**](docs/DataViewApi.md#deleteDataView) | **DELETE** /v1/org/{orgId}/data-view/{dataViewId} | Delete a data  view
*DataViewApi* | [**getAllPaginated**](docs/DataViewApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/data-view | Return all data views in the organization paginated
*DataViewApi* | [**getById**](docs/DataViewApi.md#getById) | **GET** /v1/org/{orgId}/data-view/{dataViewId} | Return a particular data view by id
*DataViewApi* | [**updateExistingView**](docs/DataViewApi.md#updateExistingView) | **PATCH** /v1/org/{orgId}/data-view/{dataViewId} | Update an existing data view
*EmailTemplateApi* | [**createNewTemplate**](docs/EmailTemplateApi.md#createNewTemplate) | **POST** /v1/email-template | Create a new email template
*EmailTemplateApi* | [**getAllNonEssential**](docs/EmailTemplateApi.md#getAllNonEssential) | **GET** /v1/email-template/non-essential | Return all non-essential email templates
*EmailTemplateApi* | [**getByName**](docs/EmailTemplateApi.md#getByName) | **GET** /v1/email-template/name/{name} | Return the email template by name
*EmailTemplateApi* | [**listEssentialEmailTemplates**](docs/EmailTemplateApi.md#listEssentialEmailTemplates) | **GET** /v1/email-template/essential | Return all essential email templates
*EmailTemplateApi* | [**updateExistingTemplate**](docs/EmailTemplateApi.md#updateExistingTemplate) | **PATCH** /v1/email-template/{emailTemplateId} | Update an existing email template
*EventApi* | [**createInboundNotification**](docs/EventApi.md#createInboundNotification) | **POST** /v1/org/{orgId}/event/notify/inbound/{appId}/{inboundId} | Create an inbound event
*EventApi* | [**createOutboundEvent**](docs/EventApi.md#createOutboundEvent) | **POST** /v1/org/{orgId}/event/notify/outbound/app/{appId} | Create an outbound event
*EventApi* | [**getEventPayload**](docs/EventApi.md#getEventPayload) | **GET** /v1/org/{orgId}/event/{eventId} | Return individual event, including payload
*EventApi* | [**getPastEvents**](docs/EventApi.md#getPastEvents) | **GET** /v1/org/{orgId}/event | Return past events, paginated, without payloads present
*EventApi* | [**resendAssociatedNotifications**](docs/EventApi.md#resendAssociatedNotifications) | **POST** /v1/org/{orgId}/event/{eventId}/notify | Resend all associated notifications for a previous event (superusers only)
*ExchangeRateApi* | [**bulkUpdateCustomRates**](docs/ExchangeRateApi.md#bulkUpdateCustomRates) | **POST** /v1/org/{orgId}/exchange-rate/{date}/custom/bulkupdate | Bulk update custom currency rates in org custom exchange rates
*ExchangeRateApi* | [**deleteCustomRateOnDate**](docs/ExchangeRateApi.md#deleteCustomRateOnDate) | **DELETE** /v1/org/{orgId}/exchange-rate/{date} | Delete a custom exchange rate on a particular date
*ExchangeRateApi* | [**getCustomExchangeRates**](docs/ExchangeRateApi.md#getCustomExchangeRates) | **GET** /v1/org/{orgId}/exchange-rate/{date}/custom | Return org custom exchange rates
*ExchangeRateApi* | [**getGlobalByDate**](docs/ExchangeRateApi.md#getGlobalByDate) | **GET** /v1/org/{orgId}/exchange-rate/{date}/global | Return the global exchange rates based on USD for a particular date
*ExchangeRateApi* | [**getRatesOnDate**](docs/ExchangeRateApi.md#getRatesOnDate) | **GET** /v1/org/{orgId}/exchange-rate/{date} | Return the exchange rates on a particular date
*ExchangeRateApi* | [**orgCustomExchangeRatesHistory**](docs/ExchangeRateApi.md#orgCustomExchangeRatesHistory) | **GET** /v1/org/{orgId}/exchange-rate/{date}/history | Return org custom exchange rates
*ExchangeRateApi* | [**updateUsdExchangeRatesForDate**](docs/ExchangeRateApi.md#updateUsdExchangeRatesForDate) | **PATCH** /v1/org/{orgId}/exchange-rate/{date} | Update the USD-based exchange rates for a particular date. Must be the first of a month.
*ExportApi* | [**changelogToCsv**](docs/ExportApi.md#changelogToCsv) | **POST** /v1/org/{orgId}/export/csv/change | Export a changelog to CSV format
*ExportApi* | [**csvCustomFields**](docs/ExportApi.md#csvCustomFields) | **POST** /v1/org/{orgId}/export/csv/fields | Export a CSV of custom fields
*ExportApi* | [**csvScenarioComments**](docs/ExportApi.md#csvScenarioComments) | **POST** /v1/org/{orgId}/export/csv/scenario/{scenarioId}/comments | Export a csv log of a scenario comments
*ExportApi* | [**fileZipDownload**](docs/ExportApi.md#fileZipDownload) | **POST** /v1/org/{orgId}/export/zip/file | Export a zipfile of files downloaded from some field
*ExportApi* | [**orgChartToPowerpoint**](docs/ExportApi.md#orgChartToPowerpoint) | **POST** /v1/org/{orgId}/export/powerpoint/org | Export org chart to Powerpoint
*ExportApi* | [**pdfReview**](docs/ExportApi.md#pdfReview) | **POST** /v1/org/{orgId}/export/pdf/review/{assessmentId} | Export reviews in PDF format
*ExportApi* | [**reportToPowerpoint**](docs/ExportApi.md#reportToPowerpoint) | **POST** /v1/org/{orgId}/export/powerpoint/report/{reportId} | Export report to Powerpoint
*ExportApi* | [**rosterToCsvSnapshot**](docs/ExportApi.md#rosterToCsvSnapshot) | **POST** /v1/org/{orgId}/export/csv/snapshot | Export a snapshot of a current roster to CSV format
*ExportApi* | [**scenarioCsv**](docs/ExportApi.md#scenarioCsv) | **POST** /v1/org/{orgId}/export/csv/scenario/{scenarioId} | Export a CSV changelog of a scenario
*ExportApi* | [**taskToCsv**](docs/ExportApi.md#taskToCsv) | **POST** /v1/org/{orgId}/export/csv/task/{reviewId} | Export tasks for a review to CSV format
*ExportApi* | [**userReviewCsv**](docs/ExportApi.md#userReviewCsv) | **POST** /v1/org/{orgId}/export/csv/users | Export users for a review to CSV format
*ExpressionApi* | [**evaluateCarrotExpression**](docs/ExpressionApi.md#evaluateCarrotExpression) | **POST** /v1/org/{orgId}/cql/evaluate | Evaluate carrot expression
*ExpressionApi* | [**validateCarrotExpression**](docs/ExpressionApi.md#validateCarrotExpression) | **POST** /v1/org/{orgId}/cql/validate | Validate carrot expression(s)
*FieldApi* | [**createNewField**](docs/FieldApi.md#createNewField) | **POST** /v1/org/{orgId}/field | Create a field
*FieldApi* | [**getAllPaginated**](docs/FieldApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/field | Return all fields in the organization paginated
*FieldApi* | [**getBuiltInFields**](docs/FieldApi.md#getBuiltInFields) | **GET** /v1/org/{orgId}/field/built-in | Get built-in fields
*FieldApi* | [**getById**](docs/FieldApi.md#getById) | **GET** /v1/org/{orgId}/field/{fieldId} | Return a particular field by id
*FieldApi* | [**getFieldsInCategory**](docs/FieldApi.md#getFieldsInCategory) | **GET** /v1/org/{orgId}/field/category/{categoryId} | Return fields in a particular category
*FieldApi* | [**getUncategorizedFields**](docs/FieldApi.md#getUncategorizedFields) | **GET** /v1/org/{orgId}/field/category | Return uncategorized fields
*FieldApi* | [**remove**](docs/FieldApi.md#remove) | **DELETE** /v1/org/{orgId}/field/delete | Delete fields
*FieldApi* | [**removeById**](docs/FieldApi.md#removeById) | **DELETE** /v1/org/{orgId}/field/{fieldId} | Delete a field
*FieldApi* | [**removeFieldOverrides**](docs/FieldApi.md#removeFieldOverrides) | **POST** /v1/org/{orgId}/field/remove-overrides | Remove overrides from fields
*FieldApi* | [**removeFromCategories**](docs/FieldApi.md#removeFromCategories) | **POST** /v1/org/{orgId}/field/remove-category | Remove field from all associated categories
*FieldApi* | [**updateExistingField**](docs/FieldApi.md#updateExistingField) | **PATCH** /v1/org/{orgId}/field/{fieldId} | Update an existing field
*FieldApi* | [**updateFieldDryRun**](docs/FieldApi.md#updateFieldDryRun) | **PATCH** /v1/org/{orgId}/field/{fieldId}/dryrun | Perform a dry-run of an update to an existing field that will require migrations
*FieldApi* | [**updateStatusForExistingFields**](docs/FieldApi.md#updateStatusForExistingFields) | **POST** /v1/org/{orgId}/field/status | Update status for existing fields
*FileApi* | [**getMetadata**](docs/FileApi.md#getMetadata) | **GET** /v1/org/{orgId}/file | Returns metadata about a file
*FileApi* | [**getMetadataById**](docs/FileApi.md#getMetadataById) | **GET** /v1/org/{orgId}/file/{fileId}/download | Download a file
*FileApi* | [**getMetadata_0**](docs/FileApi.md#getMetadata_0) | **GET** /v1/org/{orgId}/file/{fileId} | Returns metadata about a file
*FileApi* | [**removeFileById**](docs/FileApi.md#removeFileById) | **DELETE** /v1/org/{orgId}/file/{fileId} | Delete a file
*FileApi* | [**uploadNewFile**](docs/FileApi.md#uploadNewFile) | **POST** /v1/org/{orgId}/file | Upload a new file
*FormApi* | [**createNewForm**](docs/FormApi.md#createNewForm) | **POST** /v1/org/{orgId}/form | Create a form
*FormApi* | [**deleteFormById**](docs/FormApi.md#deleteFormById) | **DELETE** /v1/org/{orgId}/form/{formId} | Delete a form
*FormApi* | [**deleteFormById_0**](docs/FormApi.md#deleteFormById_0) | **DELETE** /v1/org/{orgId}/form/delete | Delete forms
*FormApi* | [**deleteFormDraft**](docs/FormApi.md#deleteFormDraft) | **DELETE** /v1/org/{orgId}/form/draft/{draftId} | Delete the given form draft
*FormApi* | [**getApplicableFormsForPerson**](docs/FormApi.md#getApplicableFormsForPerson) | **GET** /v1/org/{orgId}/form/person/{personId} | Return all active forms applicable to a particular person
*FormApi* | [**getById**](docs/FormApi.md#getById) | **GET** /v1/org/{orgId}/form/{formId} | Return a particular form by id
*FormApi* | [**getCurrentStateOfDraftData**](docs/FormApi.md#getCurrentStateOfDraftData) | **GET** /v1/org/{orgId}/form/{formId}/draft | Get the current state of form draft data
*FormApi* | [**listAvailableForms**](docs/FormApi.md#listAvailableForms) | **GET** /v1/org/{orgId}/form/available | Return all active forms applicable to a particular entity
*FormApi* | [**listOrgForms**](docs/FormApi.md#listOrgForms) | **GET** /v1/org/{orgId}/form | Return all forms in the organization paginated
*FormApi* | [**renderForDisplay**](docs/FormApi.md#renderForDisplay) | **GET** /v1/org/{orgId}/form/{formId}/render | Render a form for display
*FormApi* | [**rerenderQuestionUpdate**](docs/FormApi.md#rerenderQuestionUpdate) | **POST** /v1/org/{orgId}/form/{formId}/rerender/question/{updateQuestionId} | Re-render form blocks based on changes to the form values
*FormApi* | [**sendEmailsAndChatNotifications**](docs/FormApi.md#sendEmailsAndChatNotifications) | **POST** /v1/org/{orgId}/form/{formId}/collect | Collect data for an existing form, sending emails and chat notifications to people being requested
*FormApi* | [**sendReminderNotification**](docs/FormApi.md#sendReminderNotification) | **POST** /v1/org/{orgId}/form/{formId}/remind | Sends reminder for a form with existing tasks, sending emails/chat notifications to people being requested
*FormApi* | [**submitDraftData**](docs/FormApi.md#submitDraftData) | **POST** /v1/org/{orgId}/form/{formId}/draft | Submit draft data from a form
*FormApi* | [**submitFormData**](docs/FormApi.md#submitFormData) | **POST** /v1/org/{orgId}/form/{formId}/submit | Submit data from a form
*FormApi* | [**submitFormDraft**](docs/FormApi.md#submitFormDraft) | **POST** /v1/org/{orgId}/form/{formId}/submit/draft | Submit data from a form draft
*FormApi* | [**submitFormResponse**](docs/FormApi.md#submitFormResponse) | **POST** /v1/org/{orgId}/form/{formId} | Submit data from a form
*FormApi* | [**updateExistingForm**](docs/FormApi.md#updateExistingForm) | **PATCH** /v1/org/{orgId}/form/{formId} | Update an existing form
*FormApi* | [**updateFormStatus**](docs/FormApi.md#updateFormStatus) | **POST** /v1/org/{orgId}/form/status | Update status for existing forms
*FormResponseApi* | [**getByForm**](docs/FormResponseApi.md#getByForm) | **GET** /v1/org/{orgId}/form-response | Return form responses by form
*FormResponseApi* | [**getById**](docs/FormResponseApi.md#getById) | **GET** /v1/org/{orgId}/form-response/{formResponseId} | Return a particular form response by id
*FormResponseApi* | [**getFormResponseCount**](docs/FormResponseApi.md#getFormResponseCount) | **GET** /v1/org/{orgId}/form-response/count | Return the total count of form responses by form
*FormResponseApi* | [**removeById**](docs/FormResponseApi.md#removeById) | **DELETE** /v1/org/{orgId}/form-response/{formResponseId} | Delete a form response
*FormResponseApi* | [**updateAnswersMetadata**](docs/FormResponseApi.md#updateAnswersMetadata) | **POST** /v1/org/{orgId}/form-response/{formResponseId} | Re-submit (update) an existing form response&#39;s answers
*FormResponseApi* | [**updateMetadata**](docs/FormResponseApi.md#updateMetadata) | **PATCH** /v1/org/{orgId}/form-response/{formResponseId} | Update an existing form response&#39;s metadata, such as shareAccess information
*GroupApi* | [**createNewGroup**](docs/GroupApi.md#createNewGroup) | **POST** /v2/org/{orgId}/group/{type} | Create a group
*GroupApi* | [**findInOrgOfType**](docs/GroupApi.md#findInOrgOfType) | **GET** /v2/org/{orgId}/group/graph | Find groups in the organization of a certain type
*GroupApi* | [**findOfType**](docs/GroupApi.md#findOfType) | **GET** /v2/org/{orgId}/group/{type} | Find groups in the organization of a certain type
*GroupApi* | [**findOrphanedGroups**](docs/GroupApi.md#findOrphanedGroups) | **GET** /v2/org/{orgId}/group/orphaned | Find groups in the organization that have no child groups
*GroupApi* | [**getById**](docs/GroupApi.md#getById) | **GET** /v2/org/{orgId}/group/{type}/{groupId} | Return a particular group by id
*GroupApi* | [**getOrganizedGroupCounts**](docs/GroupApi.md#getOrganizedGroupCounts) | **GET** /v2/org/{orgId}/group/count | Get organized group counts
*GroupApi* | [**importCsvData**](docs/GroupApi.md#importCsvData) | **POST** /v2/org/{orgId}/group/{type}/import | Import data from CSV file
*GroupApi* | [**markMultipleAsDeleted**](docs/GroupApi.md#markMultipleAsDeleted) | **POST** /v2/org/{orgId}/group/{type}/bulk-delete | Mark multiple groups as deleted
*GroupApi* | [**removeByGroupId**](docs/GroupApi.md#removeByGroupId) | **DELETE** /v2/org/{orgId}/group/{type}/{groupId} | Delete a group
*GroupApi* | [**updateGroupDetails**](docs/GroupApi.md#updateGroupDetails) | **PATCH** /v2/org/{orgId}/group/{type}/{groupId} | Update a group
*GuidelineApi* | [**allForCompReview**](docs/GuidelineApi.md#allForCompReview) | **GET** /v1/org/{orgId}/guideline | Get all guidelines for a given comp review
*GuidelineApi* | [**calculateMatrixValuesForSpecificGuideline**](docs/GuidelineApi.md#calculateMatrixValuesForSpecificGuideline) | **GET** /v1/org/{orgId}/guideline/{id}/calculate | Calculate the matrix values for a specific guideline (which may apply to multiple scenarios in the comp review)
*GuidelineApi* | [**createNewGuideline**](docs/GuidelineApi.md#createNewGuideline) | **POST** /v1/org/{orgId}/guideline | Create a new guideline
*GuidelineApi* | [**getSpecificGuideline**](docs/GuidelineApi.md#getSpecificGuideline) | **GET** /v1/org/{orgId}/guideline/{id} | Get a specific guideline
*GuidelineApi* | [**removeById**](docs/GuidelineApi.md#removeById) | **DELETE** /v1/org/{orgId}/guideline/{id} | Delete a guideline
*GuidelineApi* | [**updateGuideline**](docs/GuidelineApi.md#updateGuideline) | **PATCH** /v1/org/{orgId}/guideline/{id} | Update a guideline
*ImportApi* | [**csvData**](docs/ImportApi.md#csvData) | **POST** /v1/org/{orgId}/import/csv/data | Import data from CSV file
*ImportApi* | [**csvDataColumnMatch**](docs/ImportApi.md#csvDataColumnMatch) | **POST** /v1/org/{orgId}/import/csv/initialColumnMatch | Parse a CSV file in preparation for column matching as part of spreadsheet import process
*ImportApi* | [**csvDataWithColumnMatch**](docs/ImportApi.md#csvDataWithColumnMatch) | **POST** /v1/org/{orgId}/import/csv/columnMatch | Import data from CSV file
*ImportApi* | [**csvDataWithFilePath**](docs/ImportApi.md#csvDataWithFilePath) | **POST** /v1/org/{orgId}/import/csv/filepath | Import data from CSV file
*ImportApi* | [**spreadsheetValidation**](docs/ImportApi.md#spreadsheetValidation) | **POST** /v1/org/{orgId}/import/spreadsheet/validateFormat | Check if a spreadsheet file is valid to be imported
*JobApi* | [**createNewJob**](docs/JobApi.md#createNewJob) | **POST** /v2/org/{orgId}/job | Create a job
*JobApi* | [**findInOrganization**](docs/JobApi.md#findInOrganization) | **GET** /v2/org/{orgId}/job/{jobId} | Return a particular job by id
*JobApi* | [**findInOrganization_0**](docs/JobApi.md#findInOrganization_0) | **GET** /v2/org/{orgId}/job | Find jobs in the organization
*JobApi* | [**getOrganizationJobCount**](docs/JobApi.md#getOrganizationJobCount) | **GET** /v2/org/{orgId}/job/count | Count jobs or people in the organization
*JobApi* | [**getRegionJobsGraph**](docs/JobApi.md#getRegionJobsGraph) | **GET** /v2/org/{orgId}/job/graph | Retrieve jobs from a region of the job graph
*JobApi* | [**getSiblingsAndDirectsMap**](docs/JobApi.md#getSiblingsAndDirectsMap) | **GET** /v2/org/{orgId}/job/graph-counts | Returns a map of jobId to their sibling and direct counts and the corresponding ids
*JobApi* | [**listOccupiedPositionsByJobAndDate**](docs/JobApi.md#listOccupiedPositionsByJobAndDate) | **GET** /v2/org/{orgId}/job/{jobId}/position | Get a list of positions occupied by a job on specific date
*JobApi* | [**performBulkUpdate**](docs/JobApi.md#performBulkUpdate) | **POST** /v2/org/{orgId}/job/bulkupdate | Perform a bulk update on a number of jobs
*JobApi* | [**removeById**](docs/JobApi.md#removeById) | **DELETE** /v2/org/{orgId}/job/{jobId} | Delete a job
*JobApi* | [**updateJobDetails**](docs/JobApi.md#updateJobDetails) | **PATCH** /v2/org/{orgId}/job/{jobId} | Update a job
*JobLevelApi* | [**createNewJobLevel**](docs/JobLevelApi.md#createNewJobLevel) | **POST** /v1/org/{orgId}/job-level | Create a job level
*JobLevelApi* | [**deleteJobLevel**](docs/JobLevelApi.md#deleteJobLevel) | **DELETE** /v1/org/{orgId}/job-level/{jobLevelId} | Delete a job level
*JobLevelApi* | [**findInOrganization**](docs/JobLevelApi.md#findInOrganization) | **GET** /v1/org/{orgId}/job-level | Find job levels in the organization
*JobLevelApi* | [**getByEffectiveDate**](docs/JobLevelApi.md#getByEffectiveDate) | **GET** /v1/org/{orgId}/job-level/{jobLevelId} | Return a particular job level by id on an effective date
*JobLevelApi* | [**updateJobLevel**](docs/JobLevelApi.md#updateJobLevel) | **PATCH** /v1/org/{orgId}/job-level/{jobLevelId} | Update a job level
*LegalDocApi* | [**createDocument**](docs/LegalDocApi.md#createDocument) | **POST** /v1/legaldoc | Create a legal doc
*LegalDocApi* | [**getByName**](docs/LegalDocApi.md#getByName) | **GET** /v1/legaldoc/{name} | Retrieve the legal doc by name
*MediaApi* | [**getMetadata**](docs/MediaApi.md#getMetadata) | **GET** /v1/media/{mediaId} | Returns metadata about a piece of media
*MediaApi* | [**getMetadata_0**](docs/MediaApi.md#getMetadata_0) | **GET** /v1/org/{orgId}/media/{mediaId} | Returns metadata about a piece of media
*MediaApi* | [**uploadNewMedia**](docs/MediaApi.md#uploadNewMedia) | **POST** /v1/media | Upload a new piece of media
*MediaApi* | [**uploadNewPiece**](docs/MediaApi.md#uploadNewPiece) | **POST** /v1/org/{orgId}/media | Upload a new piece of media
*MessageApi* | [**createNewMessage**](docs/MessageApi.md#createNewMessage) | **POST** /v1/org/{orgId}/message | Create a new message
*MessageApi* | [**getAllForUser**](docs/MessageApi.md#getAllForUser) | **GET** /v1/org/{orgId}/message/me | Return all messages for a particular user
*MessageApi* | [**getMessageById**](docs/MessageApi.md#getMessageById) | **GET** /v1/org/{orgId}/message/{messageId} | Return a particular message by id
*MessageApi* | [**getMessageByKey**](docs/MessageApi.md#getMessageByKey) | **GET** /v1/org/{orgId}/message/me/{messageKey} | Return a particular message by key
*MessageApi* | [**markBulkAsSeen**](docs/MessageApi.md#markBulkAsSeen) | **POST** /v1/org/{orgId}/message/bulk/seen | Marks each message as &#x60;seen&#x60;
*MessageApi* | [**markMessagesAsRead**](docs/MessageApi.md#markMessagesAsRead) | **POST** /v1/org/{orgId}/message/bulk/read | Sets each of the designated message&#39;s &#x60;readAt&#x60; property
*MessageApi* | [**setReadStatus**](docs/MessageApi.md#setReadStatus) | **POST** /v1/org/{orgId}/message/{messageId}/read | Sets the designated message&#39;s &#x60;readAt&#x60; property
*MetricApi* | [**recordDailyMetric**](docs/MetricApi.md#recordDailyMetric) | **POST** /v1/org/{orgId}/metric | Record a daily metric
*MultiplierApi* | [**createNewMultiplier**](docs/MultiplierApi.md#createNewMultiplier) | **POST** /v1/org/{orgId}/multiplier | Create a multiplier
*MultiplierApi* | [**deleteMultiplierById**](docs/MultiplierApi.md#deleteMultiplierById) | **DELETE** /v1/org/{orgId}/multiplier/{multiplierId} | Delete a multiplier
*MultiplierApi* | [**findCompBandMultipliersInOrg**](docs/MultiplierApi.md#findCompBandMultipliersInOrg) | **GET** /v1/org/{orgId}/multiplier/{multiplierId} | Return a particular comp band multiplier by id on an effective date
*MultiplierApi* | [**findCompBandMultipliersInOrg_0**](docs/MultiplierApi.md#findCompBandMultipliersInOrg_0) | **GET** /v1/org/{orgId}/multiplier | Find comp band multipliers in the organization
*MultiplierApi* | [**updateMultiplerById**](docs/MultiplierApi.md#updateMultiplerById) | **PATCH** /v1/org/{orgId}/multiplier/{multiplierId} | Update a multiplier
*NotificationApi* | [**sendEmailOrInAppNotification**](docs/NotificationApi.md#sendEmailOrInAppNotification) | **POST** /v1/org/{orgId}/notification | Send a email or in-app notification
*OauthApi* | [**authorizeUserToken**](docs/OauthApi.md#authorizeUserToken) | **POST** /oauth/token | Return an Oauth2 Authorization bearer token, given a username and password
*OauthApi* | [**exchangeIdpAccessTokenResponse**](docs/OauthApi.md#exchangeIdpAccessTokenResponse) | **GET** /oauth/sso/{idp}/access-token | Exchange a one-time use Auth Code for the IDP access token response
*OauthApi* | [**generateBearerTokenFromSSO**](docs/OauthApi.md#generateBearerTokenFromSSO) | **POST** /oauth/token/sso/{type} | Return an Oauth2 Authorization bearer token, given a SSO id token
*OauthApi* | [**loginViaIdp**](docs/OauthApi.md#loginViaIdp) | **GET** /oauth/sso/{idp}/login | Login via the auth endpoint
*OauthApi* | [**processOauthRedirectRequest**](docs/OauthApi.md#processOauthRedirectRequest) | **GET** /oauth/app/{appName} | Process an Oauth2 redirect request from an access request for an app installation, storing the accessToken and refreshToken as secrets for the app
*OauthApi* | [**returnViewToken**](docs/OauthApi.md#returnViewToken) | **POST** /oauth/token/view | Return a view-as token
*OauthApi* | [**revokeBearerToken**](docs/OauthApi.md#revokeBearerToken) | **DELETE** /oauth/token | Delete the current Oauth2 bearer token (for signout)
*OnboardApi* | [**incompleteSteps**](docs/OnboardApi.md#incompleteSteps) | **GET** /v1/org/{orgId}/onboard | Returns all the onboarding steps the organization has not completed
*OnboardApi* | [**markStepSkipped**](docs/OnboardApi.md#markStepSkipped) | **POST** /v1/org/{orgId}/onboard/{stepName}/skip | Marks the given onboard step as &#39;skipped&#39; for the given customer
*OrgApi* | [**consentTermsOfService**](docs/OrgApi.md#consentTermsOfService) | **POST** /v1/org/{orgId}/agreement | Consent on Terms of Service agreement
*OrgApi* | [**createNewJobPlaceholder**](docs/OrgApi.md#createNewJobPlaceholder) | **POST** /v1/org/{orgId}/change-head | Create a new org head in the history, by creating an empty job placeholder above the current head
*OrgApi* | [**createNewOrg**](docs/OrgApi.md#createNewOrg) | **POST** /v1/org | Create a new org
*OrgApi* | [**getById**](docs/OrgApi.md#getById) | **GET** /v1/org/{orgId} | Return a particular org by id
*OrgApi* | [**getBySlug**](docs/OrgApi.md#getBySlug) | **GET** /v1/org/slug/{slug} | Return a particular org by slug
*OrgApi* | [**getDataUserPersonById**](docs/OrgApi.md#getDataUserPersonById) | **GET** /v1/org/{orgId}/data-user-person | Gets a user or person by id. If both are provided, userId takes precedence
*OrgApi* | [**getDataUserPersonCount**](docs/OrgApi.md#getDataUserPersonCount) | **GET** /v1/org/{orgId}/data-user-person-count | Gets the count of joined users, invited users, and org members who are not yet invited
*OrgApi* | [**getDataUsersPersons**](docs/OrgApi.md#getDataUsersPersons) | **GET** /v1/org/{orgId}/data-users-persons | Gets a list of org users (joined or invited) and org members (not yet invited)
*OrgApi* | [**getOauth2AuthorizationCode**](docs/OrgApi.md#getOauth2AuthorizationCode) | **POST** /v1/org/{org}/app-install-code | Retrieve an Oauth2 authorization code to install an app at this org
*OrgApi* | [**getUserAccess**](docs/OrgApi.md#getUserAccess) | **GET** /v1/org/{orgId}/access | Return information on current user&#39;s access
*OrgApi* | [**getValidationBySlug**](docs/OrgApi.md#getValidationBySlug) | **GET** /org/{slug} | Return validation for a org by slug
*OrgApi* | [**getWelcomeEmailSettings**](docs/OrgApi.md#getWelcomeEmailSettings) | **GET** /v1/org/{orgId}/welcome-email | Gets the custom setting or default for the welcome email&#39;s subject, body, cta button label
*OrgApi* | [**listVisibleOrgs**](docs/OrgApi.md#listVisibleOrgs) | **GET** /v1/org | Return all visible orgs, paginated by name
*OrgApi* | [**sendTestEmailToOneself**](docs/OrgApi.md#sendTestEmailToOneself) | **POST** /v1/org/{orgId}/test-email | Send a test welcome email to oneself
*OrgApi* | [**updateExistingOrg**](docs/OrgApi.md#updateExistingOrg) | **PATCH** /v1/org/{orgId} | Update an existing org
*OrgApi* | [**validateAppInstallAuthorizationCode**](docs/OrgApi.md#validateAppInstallAuthorizationCode) | **POST** /v1/org/app-install-code/validate | Validate authorization code
*OrgConfigApi* | [**createIfNotExists**](docs/OrgConfigApi.md#createIfNotExists) | **POST** /v1/org/{orgId}/config | Create an org config if it doesn&#39;t exist
*OrgConfigApi* | [**getByOrgId**](docs/OrgConfigApi.md#getByOrgId) | **GET** /v1/org/{orgId}/config | Return config for a given org
*OrgConfigApi* | [**patchExistingConfig**](docs/OrgConfigApi.md#patchExistingConfig) | **PATCH** /v1/org/{orgId}/config | Update an existing org config
*PersonApi* | [**createNewPerson**](docs/PersonApi.md#createNewPerson) | **POST** /v2/org/{orgId}/person | Create a person
*PersonApi* | [**findInOrganization**](docs/PersonApi.md#findInOrganization) | **GET** /v2/org/{orgId}/person | Find persons in the organization
*PersonApi* | [**getById**](docs/PersonApi.md#getById) | **GET** /v2/org/{orgId}/person/{personId} | Return a particular person by id
*PersonApi* | [**getGeocodesForOrg**](docs/PersonApi.md#getGeocodesForOrg) | **GET** /v2/org/{orgId}/person/geocodes | Return all geocodes for persons in the organization
*PersonApi* | [**removeById**](docs/PersonApi.md#removeById) | **DELETE** /v2/org/{orgId}/person/{personId} | Delete a person
*PersonApi* | [**updateById**](docs/PersonApi.md#updateById) | **PATCH** /v2/org/{orgId}/person/{personId} | Update a person
*PolicyApi* | [**checkValidityOf**](docs/PolicyApi.md#checkValidityOf) | **POST** /v1/org/{orgId}/policy/validate | Return if a policy is valid
*PolicyApi* | [**copyExistingPolicy**](docs/PolicyApi.md#copyExistingPolicy) | **POST** /v1/org/{orgId}/policy/{policyId}/copy | Copy an existing policy
*PolicyApi* | [**createNewPolicy**](docs/PolicyApi.md#createNewPolicy) | **POST** /v1/org/{orgId}/policy | Create a policy
*PolicyApi* | [**getAllEntityActionMaps**](docs/PolicyApi.md#getAllEntityActionMaps) | **GET** /v1/org/{orgId}/policy/action | Return all entity:action maps allowed on a policy rule
*PolicyApi* | [**getAllPolicies**](docs/PolicyApi.md#getAllPolicies) | **GET** /v1/org/{orgId}/policy | Return all or a set of policies in the organization
*PolicyApi* | [**getById**](docs/PolicyApi.md#getById) | **GET** /v1/org/{orgId}/policy/{policyId} | Return a particular policy by id
*PolicyApi* | [**removeById**](docs/PolicyApi.md#removeById) | **DELETE** /v1/org/{orgId}/policy/{policyId} | Delete a policy
*PolicyApi* | [**updateExistingPolicy**](docs/PolicyApi.md#updateExistingPolicy) | **PATCH** /v1/org/{orgId}/policy/{policyId} | Update an existing policy
*PositionApi* | [**assignJobToPosition**](docs/PositionApi.md#assignJobToPosition) | **POST** /v2/org/{orgId}/position/{positionId}/job/{jobId} | Assign a job to a position
*PositionApi* | [**createNewPosition**](docs/PositionApi.md#createNewPosition) | **POST** /v2/org/{orgId}/position | Create a position
*PositionApi* | [**deleteAndPurge**](docs/PositionApi.md#deleteAndPurge) | **DELETE** /v2/org/{orgId}/position/{positionId}/purge | Delete a position and purge it from all history
*PositionApi* | [**deletePosition**](docs/PositionApi.md#deletePosition) | **DELETE** /v2/org/{orgId}/position/{positionId} | Delete a position
*PositionApi* | [**getById**](docs/PositionApi.md#getById) | **GET** /v2/org/{orgId}/position/{positionId} | Return a particular position by id
*PositionApi* | [**getHistoryById**](docs/PositionApi.md#getHistoryById) | **GET** /v2/org/{orgId}/position/{positionId}/history | Return the history of a particular position by id
*PositionApi* | [**importCsvDataWithFilePath**](docs/PositionApi.md#importCsvDataWithFilePath) | **POST** /v2/org/{orgId}/position/import | Import positions as a CSV
*PositionApi* | [**list**](docs/PositionApi.md#list) | **GET** /v2/org/{orgId}/position | Return a list of positions
*PositionApi* | [**removeJobFromPosition**](docs/PositionApi.md#removeJobFromPosition) | **DELETE** /v2/org/{orgId}/position/{positionId}/job/{jobId} | Remove a job from a position
*PositionApi* | [**updateJobDatesOnPosition**](docs/PositionApi.md#updateJobDatesOnPosition) | **PATCH** /v2/org/{orgId}/position/{positionId}/job/{jobId} | Update assign or remove date of a job for a position
*PositionApi* | [**updatePositionDetails**](docs/PositionApi.md#updatePositionDetails) | **PATCH** /v2/org/{orgId}/position/{positionId} | Update a position
*PreloadApi* | [**preloadedDataRetrieval**](docs/PreloadApi.md#preloadedDataRetrieval) | **GET** /v1/org/{orgId}/preload | Return a set of pre-loaded data required by the web app
*ProcessApi* | [**checkProcessStatus**](docs/ProcessApi.md#checkProcessStatus) | **GET** /v1/org/{orgId}/process/{processId} | Check the status of a particular process
*ProcessApi* | [**createNewPendingProcess**](docs/ProcessApi.md#createNewPendingProcess) | **POST** /v1/org/{orgId}/process | Creates a new process in the pending state
*ProcessApi* | [**createPendingProcess**](docs/ProcessApi.md#createPendingProcess) | **POST** /v1/org/{orgId}/process/self-serve | Creates a new process in the pending state
*ProcessApi* | [**createPendingProcessWithUserId**](docs/ProcessApi.md#createPendingProcessWithUserId) | **POST** /v1/org/{orgId}/process/{createIdOverride} | Creates a new process with a specified createId in the pending state
*ProcessApi* | [**decrementStep**](docs/ProcessApi.md#decrementStep) | **PUT** /v1/org/{orgId}/process/{processId}/decrement | Decrement the step of an asynchronous process
*ProcessApi* | [**downloadFileById**](docs/ProcessApi.md#downloadFileById) | **GET** /v1/org/{orgId}/process/{processId}/file | Download the file associated with a particular process
*ProcessApi* | [**downloadLog**](docs/ProcessApi.md#downloadLog) | **GET** /v1/org/{orgId}/process/{processId}/log | Download the newline-delimited JSON log associated with a particular process
*ProcessApi* | [**getEventsByProcessId**](docs/ProcessApi.md#getEventsByProcessId) | **GET** /v1/org/{orgId}/process/{processId}/events | Get events associated to a particular process
*ProcessApi* | [**getLastSyncForAppUser**](docs/ProcessApi.md#getLastSyncForAppUser) | **GET** /v1/org/{orgId}/process/last-sync/{appUserId} | Get last success sync and last sync for given appUserId
*ProcessApi* | [**getPreviouslyRunProcesses**](docs/ProcessApi.md#getPreviouslyRunProcesses) | **GET** /v1/org/{orgId}/process | Retrieve a number of previously run processes
*ProcessApi* | [**incrementProcessStep**](docs/ProcessApi.md#incrementProcessStep) | **PUT** /v1/org/{orgId}/process/{processId}/increment | Increment the step of an asynchronous process
*ProcessApi* | [**resumeProcessWithUserId**](docs/ProcessApi.md#resumeProcessWithUserId) | **PUT** /v1/org/{orgId}/process/{processId}/resume | Resume an asynchronous process
*ProcessApi* | [**resumeWithFile**](docs/ProcessApi.md#resumeWithFile) | **PUT** /v1/org/{orgId}/process/{processId}/resumeWithFile | Resume an asynchronous process
*ProcessApi* | [**updateProcessState**](docs/ProcessApi.md#updateProcessState) | **PUT** /v1/org/{orgId}/process/{processId}/state | Update process state
*ProcessApi* | [**updateStatusOfProcess**](docs/ProcessApi.md#updateStatusOfProcess) | **PATCH** /v1/org/{orgId}/process/{processId} | Update the status of a process, marking its progress or setting status to DONE or ERROR
*ProcessApi* | [**uploadFileAndMarkComplete**](docs/ProcessApi.md#uploadFileAndMarkComplete) | **POST** /v1/org/{orgId}/process/{processId}/file | Upload a file to be attached to a process, and mark the process as complete
*ProductApi* | [**createNewProduct**](docs/ProductApi.md#createNewProduct) | **POST** /v1/product | Create a new product
*ProductApi* | [**getById**](docs/ProductApi.md#getById) | **GET** /v1/product/{productId} | Return a particular product by id
*ProductApi* | [**listAllProducts**](docs/ProductApi.md#listAllProducts) | **GET** /v1/product | Return all products
*ProductApi* | [**updateExistingProduct**](docs/ProductApi.md#updateExistingProduct) | **PATCH** /v1/product/{productId} | Update an existing product
*ProfileTabApi* | [**createNewTab**](docs/ProfileTabApi.md#createNewTab) | **POST** /v1/org/{orgId}/profile-tab | Create a profile tab
*ProfileTabApi* | [**deleteProfileTab**](docs/ProfileTabApi.md#deleteProfileTab) | **DELETE** /v1/org/{orgId}/profile-tab/{profileTabId} | Delete a profile tab
*ProfileTabApi* | [**findTabsForJob**](docs/ProfileTabApi.md#findTabsForJob) | **GET** /v1/org/{orgId}/profile-tab/job/{jobId} | Return all profile tabs applicable to a particular job
*ProfileTabApi* | [**getByOrgIdAndTabId**](docs/ProfileTabApi.md#getByOrgIdAndTabId) | **GET** /v1/org/{orgId}/profile-tab/{profileTabId} | Return a particular profile tab by id
*ProfileTabApi* | [**getEvaluateProfileTabContent**](docs/ProfileTabApi.md#getEvaluateProfileTabContent) | **GET** /v1/org/{orgId}/profile-tab/job/{jobId}/profile-tab/{tabId} | Fetch and evaluate the content of a particular profile tab id, relative to a particular job
*ProfileTabApi* | [**getProfileTabs**](docs/ProfileTabApi.md#getProfileTabs) | **GET** /v1/org/{orgId}/profile-tab/person/{personId} | Return all profile tabs applicable to a particular person
*ProfileTabApi* | [**listProfileTabs**](docs/ProfileTabApi.md#listProfileTabs) | **GET** /v1/org/{orgId}/profile-tab | Return all profile tabs in the organization paginated
*ProfileTabApi* | [**updateExistingTab**](docs/ProfileTabApi.md#updateExistingTab) | **PATCH** /v1/org/{orgId}/profile-tab/{profileTabId} | Update an existing profile tab
*QueryApi* | [**expireLiveQuery**](docs/QueryApi.md#expireLiveQuery) | **DELETE** /v1/org/{orgId}/query/{queryToken} | Expire a previously created live query immediately
*QueryApi* | [**liveQueryResult**](docs/QueryApi.md#liveQueryResult) | **GET** /v1/org/{orgId}/query/{queryToken} | Return the results of a previously created live query
*QueryApi* | [**liveQueryToken**](docs/QueryApi.md#liveQueryToken) | **POST** /v1/org/{orgId}/query | Create a live query token
*QueryApi* | [**queryTokens**](docs/QueryApi.md#queryTokens) | **GET** /v1/org/{orgId}/query | Get a list of query tokens
*QuestionApi* | [**create**](docs/QuestionApi.md#create) | **POST** /v1/org/{orgId}/question | Create a question
*QuestionApi* | [**getAllInOrg**](docs/QuestionApi.md#getAllInOrg) | **GET** /v1/org/{orgId}/question | Return all questions in the organization paginated
*QuestionApi* | [**getById**](docs/QuestionApi.md#getById) | **GET** /v1/org/{orgId}/question/{questionId} | Return a particular question by id
*QuestionApi* | [**remove**](docs/QuestionApi.md#remove) | **DELETE** /v1/org/{orgId}/question/{questionId} | Delete a question
*QuestionApi* | [**updateByOrgAndId**](docs/QuestionApi.md#updateByOrgAndId) | **PATCH** /v1/org/{orgId}/question/{questionId} | Update an existing question
*ReportApi* | [**bulkDelete**](docs/ReportApi.md#bulkDelete) | **POST** /v1/org/{orgId}/report/bulk-delete | Delete a set of reports
*ReportApi* | [**createExactCopy**](docs/ReportApi.md#createExactCopy) | **POST** /v1/org/{orgId}/report/{reportId}/clone | Create an exact copy of an existing report
*ReportApi* | [**createNewReport**](docs/ReportApi.md#createNewReport) | **POST** /v1/org/{orgId}/report | Create a report
*ReportApi* | [**duplicateReports**](docs/ReportApi.md#duplicateReports) | **POST** /v1/org/{orgId}/report/bulk-duplicate | Duplicate a set of reports
*ReportApi* | [**exportChartCsv**](docs/ReportApi.md#exportChartCsv) | **POST** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/export/csv | Export a particular chart in a report
*ReportApi* | [**findReportById**](docs/ReportApi.md#findReportById) | **GET** /v1/org/{orgId}/report/{reportId} | Return a particular report by id
*ReportApi* | [**getAllPaginated**](docs/ReportApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/report | Return all reports in the organization paginated
*ReportApi* | [**getAllReportCharts**](docs/ReportApi.md#getAllReportCharts) | **GET** /v1/org/{orgId}/report/{reportId}/query | Query all the charts in a report
*ReportApi* | [**getCountOfReportsInOrganization**](docs/ReportApi.md#getCountOfReportsInOrganization) | **GET** /v1/org/{orgId}/report/count | Return count of reports in an organization
*ReportApi* | [**removeById**](docs/ReportApi.md#removeById) | **DELETE** /v1/org/{orgId}/report/{reportId} | Delete a report
*ReportApi* | [**timeseriesDataArbitraryQueries**](docs/ReportApi.md#timeseriesDataArbitraryQueries) | **POST** /v1/org/{orgId}/report/query | Return timeseries data from arbitrary queries
*ReportApi* | [**updateExistingReport**](docs/ReportApi.md#updateExistingReport) | **PATCH** /v1/org/{orgId}/report/{reportId} | Update an existing report
*ReportChartApi* | [**cloneChart**](docs/ReportChartApi.md#cloneChart) | **POST** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/clone | Clone a chart in a report
*ReportChartApi* | [**createNewChart**](docs/ReportChartApi.md#createNewChart) | **POST** /v1/org/{orgId}/report/{reportId}/chart | Create a new chart in a report
*ReportChartApi* | [**exportData**](docs/ReportChartApi.md#exportData) | **GET** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/data | Export a particular chart&#39;s data
*ReportChartApi* | [**getAll**](docs/ReportChartApi.md#getAll) | **GET** /v1/org/{orgId}/report/{reportId}/chart | Return all of the charts for a particular report
*ReportChartApi* | [**getByChartId**](docs/ReportChartApi.md#getByChartId) | **GET** /v1/org/{orgId}/report/chart/{chartId} | Return a particular report chart by id
*ReportChartApi* | [**queryUnderlyingDataInChart**](docs/ReportChartApi.md#queryUnderlyingDataInChart) | **GET** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/query | Query for the underlying data in a chart
*ReportChartApi* | [**removeById**](docs/ReportChartApi.md#removeById) | **DELETE** /v1/org/{orgId}/report/chart/{chartId} | Delete a chart from a report
*ReportChartApi* | [**updateExistingChartData**](docs/ReportChartApi.md#updateExistingChartData) | **PATCH** /v1/org/{orgId}/report/chart/{chartId} | Update an existing report chart
*RoleApi* | [**copyExistingRole**](docs/RoleApi.md#copyExistingRole) | **POST** /v1/org/{orgId}/role/{roleId}/copy | Copy an existing role
*RoleApi* | [**createNewRole**](docs/RoleApi.md#createNewRole) | **POST** /v1/org/{orgId}/role | Create a role
*RoleApi* | [**getAllInOrg**](docs/RoleApi.md#getAllInOrg) | **GET** /v1/org/{orgId}/role | Return all or a set of roles in the organization
*RoleApi* | [**getRoleById**](docs/RoleApi.md#getRoleById) | **GET** /v1/org/{orgId}/role/{roleId} | Return a particular role by id
*RoleApi* | [**removeById**](docs/RoleApi.md#removeById) | **DELETE** /v1/org/{orgId}/role/{roleId} | Delete a role
*RoleApi* | [**updateExisting**](docs/RoleApi.md#updateExisting) | **PATCH** /v1/org/{orgId}/role/{roleId} | Update an existing role
*SamlApi* | [**performSsoAssertion**](docs/SamlApi.md#performSsoAssertion) | **POST** /saml/{org}/login | Return an redirect to the designated Idp, given an identity provider
*SamlApi* | [**performSsoAssertion_0**](docs/SamlApi.md#performSsoAssertion_0) | **POST** /saml/sso/{org} | Single sign on URL, where SAML assertion is perform
*SamlApi* | [**savePerOrgXmlCertFromIdp**](docs/SamlApi.md#savePerOrgXmlCertFromIdp) | **GET** /saml/org/{orgId}/xml-cert | Save per org Xml Cert from IDP
*SamlApi* | [**savePerOrgXmlCertFromIdp_0**](docs/SamlApi.md#savePerOrgXmlCertFromIdp_0) | **POST** /saml/org/{orgId}/xml-cert | Save per org Xml Cert from IDP
*ScenarioApi* | [**adjustDates**](docs/ScenarioApi.md#adjustDates) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/dates | Adjust the dates of the changes in a scenario
*ScenarioApi* | [**bulkArchiveScenarios**](docs/ScenarioApi.md#bulkArchiveScenarios) | **POST** /v1/org/{orgId}/scenario/bulk/archive | Archive a set of scenarios
*ScenarioApi* | [**combineScenarios**](docs/ScenarioApi.md#combineScenarios) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/combine | Combine multiple scenarios into another scenario
*ScenarioApi* | [**createNew**](docs/ScenarioApi.md#createNew) | **POST** /v1/org/{orgId}/scenario | Create a scenario
*ScenarioApi* | [**deleteBulkScenarios**](docs/ScenarioApi.md#deleteBulkScenarios) | **POST** /v1/org/{orgId}/scenario/bulk/delete | Delete a set of scenarios
*ScenarioApi* | [**getById**](docs/ScenarioApi.md#getById) | **GET** /v1/org/{orgId}/scenario/{scenarioId} | Return a particular scenario by id
*ScenarioApi* | [**listPaginatedScenarios**](docs/ScenarioApi.md#listPaginatedScenarios) | **GET** /v1/org/{orgId}/scenario | Return all scenarios in the organization paginated
*ScenarioApi* | [**manuallyRecalculateMetadata**](docs/ScenarioApi.md#manuallyRecalculateMetadata) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/recalculate-metadata | Manually recalculate a scenario&#39;s metadata
*ScenarioApi* | [**mergeIntoPrimaryTimeline**](docs/ScenarioApi.md#mergeIntoPrimaryTimeline) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/merge | Merge a scenario into the primary timeline
*ScenarioApi* | [**removeById**](docs/ScenarioApi.md#removeById) | **DELETE** /v1/org/{orgId}/scenario/{scenarioId} | Delete a scenario
*ScenarioApi* | [**unarchiveSetOfScenarios**](docs/ScenarioApi.md#unarchiveSetOfScenarios) | **POST** /v1/org/{orgId}/scenario/bulk/unarchive | Unarchive a set of scenarios
*ScenarioApi* | [**updateScenarioChange**](docs/ScenarioApi.md#updateScenarioChange) | **PATCH** /v1/org/{orgId}/scenario/{scenarioId} | Update an existing scenario
*ScenarioApi* | [**updateSharedViewConfig**](docs/ScenarioApi.md#updateSharedViewConfig) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/update-shared-view | Update a scenario view config
*SearchApi* | [**orgDataByOrgIdAndSearchString**](docs/SearchApi.md#orgDataByOrgIdAndSearchString) | **GET** /v1/org/{orgId}/search | Return people, job, group, and field data for a particular org that match a provided search string
*StatusApi* | [**apiIsUpAndAvailable**](docs/StatusApi.md#apiIsUpAndAvailable) | **GET** /v1/status | Returns true if the API is up and available
*StockApi* | [**getHistory**](docs/StockApi.md#getHistory) | **GET** /v1/stock | Return the history of stock prices
*StockApi* | [**getPriceByDateType**](docs/StockApi.md#getPriceByDateType) | **GET** /v1/stock/{symbol}/{date}/{type} | Get a stock price as of a particular date
*StockApi* | [**removePrice**](docs/StockApi.md#removePrice) | **DELETE** /v1/stock/{id} | Delete a stock price
*StockApi* | [**upsertPriceByDateType**](docs/StockApi.md#upsertPriceByDateType) | **PUT** /v1/stock/{symbol}/{date}/{type} | Upsert a stock price
*StripeApi* | [**createSetupIntentSecret**](docs/StripeApi.md#createSetupIntentSecret) | **POST** /v1/stripe/setup-intent | Creates a Stripe setupIntent object and returns the secret for that object
*StripeApi* | [**getAllPlans**](docs/StripeApi.md#getAllPlans) | **GET** /v1/stripe/plan | Return all billing plans directly from Stripe (staff only)
*StripeApi* | [**getAllProducts**](docs/StripeApi.md#getAllProducts) | **GET** /v1/stripe/product | Return all products directly from Stripe (staff only)
*StripeApi* | [**getProductById**](docs/StripeApi.md#getProductById) | **GET** /v1/stripe/product/{productId} | Return a particular product by its Stripe id
*StripeApi* | [**processWebhookEvents**](docs/StripeApi.md#processWebhookEvents) | **POST** /v1/stripe/webhook | Process webhook events from Stripe
*TableApi* | [**createNewTable**](docs/TableApi.md#createNewTable) | **POST** /v1/org/{orgId}/table | Create a table
*TableApi* | [**deleteRow**](docs/TableApi.md#deleteRow) | **DELETE** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue} | Delete an existing row
*TableApi* | [**deleteRowFromHistory**](docs/TableApi.md#deleteRowFromHistory) | **DELETE** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue}/purge | Delete an existing row, purging from history entirely
*TableApi* | [**exportDataToCsv**](docs/TableApi.md#exportDataToCsv) | **POST** /v1/org/{orgId}/table/{tableId}/export | Export table data to CSV file
*TableApi* | [**getAllRows**](docs/TableApi.md#getAllRows) | **GET** /v1/org/{orgId}/table/{tableId}/data | Retrieve all rows from the table
*TableApi* | [**getRowByColumn**](docs/TableApi.md#getRowByColumn) | **GET** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue} | Retrieve a particular row
*TableApi* | [**getTableByIdOrName**](docs/TableApi.md#getTableByIdOrName) | **GET** /v1/org/{orgId}/table/{tableId} | Return a particular table by id or name
*TableApi* | [**importDataFromCsvFile**](docs/TableApi.md#importDataFromCsvFile) | **POST** /v1/org/{orgId}/table/{tableId}/import | Import data from CSV file
*TableApi* | [**listInOrgPaginated**](docs/TableApi.md#listInOrgPaginated) | **GET** /v1/org/{orgId}/table | Return all tables in the organization paginated
*TableApi* | [**removeById**](docs/TableApi.md#removeById) | **DELETE** /v1/org/{orgId}/table/{tableId} | Delete a table
*TableApi* | [**updateExistingRowData**](docs/TableApi.md#updateExistingRowData) | **PATCH** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue} | Update an existing row
*TableApi* | [**updateExistingTable**](docs/TableApi.md#updateExistingTable) | **PATCH** /v1/org/{orgId}/table/{tableId} | Update an existing table
*TableApi* | [**upsertRowData**](docs/TableApi.md#upsertRowData) | **POST** /v1/org/{orgId}/table/{tableId}/data | Upsert row data
*TaskApi* | [**deleteBulkTasks**](docs/TaskApi.md#deleteBulkTasks) | **DELETE** /v1/org/{orgId}/task/bulk-delete | Bulk delete tasks
*TaskApi* | [**getAllTasks**](docs/TaskApi.md#getAllTasks) | **GET** /v1/org/{orgId}/task | Return all existing tasks
*TaskApi* | [**getAssessmentTasksSummary**](docs/TaskApi.md#getAssessmentTasksSummary) | **GET** /v1/org/{orgId}/task/summary/{assessmentId} | Return the tasks for a given assessment
*TaskApi* | [**getCurrentUserTasks**](docs/TaskApi.md#getCurrentUserTasks) | **GET** /v1/org/{orgId}/task/me | Return the tasks for the current user
*TaskApi* | [**markAsSkipped**](docs/TaskApi.md#markAsSkipped) | **PATCH** /v1/org/{orgId}/task/{taskId}/skip | Skip task
*TaskApi* | [**queryAssessmentTasks**](docs/TaskApi.md#queryAssessmentTasks) | **GET** /v1/org/{orgId}/task/task | Query tasks for assessments in the organization
*TaskApi* | [**removeById**](docs/TaskApi.md#removeById) | **DELETE** /v1/org/{orgId}/task/{taskId} | Delete task
*TaskApi* | [**removeFormFromAssessment**](docs/TaskApi.md#removeFormFromAssessment) | **DELETE** /v1/org/{orgId}/task/{assessmentId}/{formId} | Delete task
*TaskApi* | [**sendReminderNotification**](docs/TaskApi.md#sendReminderNotification) | **POST** /v1/org/{orgId}/task/remind | Send a reminder notification for a particular task
*TaskApi* | [**updateStatus**](docs/TaskApi.md#updateStatus) | **PATCH** /v1/org/{orgId}/task/{taskId}/mark-done | Mark task done
*TaskConfigApi* | [**createNewConfig**](docs/TaskConfigApi.md#createNewConfig) | **POST** /v1/org/{orgId}/task-config | Create a new task config
*TaskConfigApi* | [**getAllConfigs**](docs/TaskConfigApi.md#getAllConfigs) | **GET** /v1/org/{orgId}/task-config | Get all task configs for an org
*TaskConfigApi* | [**getSpecificConfig**](docs/TaskConfigApi.md#getSpecificConfig) | **GET** /v1/org/{orgId}/task-config/{id} | Get a specific task config
*TemplateApi* | [**bulkDelete**](docs/TemplateApi.md#bulkDelete) | **POST** /v1/org/{orgId}/template/bulk/delete | Delete a set of templates
*TemplateApi* | [**createBulkDuplicate**](docs/TemplateApi.md#createBulkDuplicate) | **POST** /v1/org/{orgId}/template/bulk/duplicate | Duplicate a set of templates
*TemplateApi* | [**createEmail**](docs/TemplateApi.md#createEmail) | **POST** /v1/org/{orgId}/template/email | Create a template
*TemplateApi* | [**createNewTemplate**](docs/TemplateApi.md#createNewTemplate) | **POST** /v1/org/{orgId}/template | Create a template
*TemplateApi* | [**evaluateAgainstJob**](docs/TemplateApi.md#evaluateAgainstJob) | **POST** /v1/org/{orgId}/template/{templateId}/render | Render a template by evaluating it against an existing job
*TemplateApi* | [**generatePdfsAndEmails**](docs/TemplateApi.md#generatePdfsAndEmails) | **POST** /v1/org/{orgId}/template/{templateId}/generate | Automatically generate PDFs of the templates, and distribute emails to managers and people to download
*TemplateApi* | [**generateTemplatePreview**](docs/TemplateApi.md#generateTemplatePreview) | **POST** /v1/org/{orgId}/template/{templateId}/preview | Preview template content without saving it
*TemplateApi* | [**getAllInOrgs**](docs/TemplateApi.md#getAllInOrgs) | **GET** /v1/org/{orgId}/template | Return all templates in the organization paginated
*TemplateApi* | [**getById**](docs/TemplateApi.md#getById) | **GET** /v1/org/{orgId}/template/{templateId} | Return a particular template by id
*TemplateApi* | [**getByName**](docs/TemplateApi.md#getByName) | **GET** /v1/org/{orgId}/template/email/{templateName} | Return a particular email template by name
*TemplateApi* | [**removeById**](docs/TemplateApi.md#removeById) | **DELETE** /v1/org/{orgId}/template/{templateId} | Delete a template
*TemplateApi* | [**removeEmail**](docs/TemplateApi.md#removeEmail) | **DELETE** /v1/org/{orgId}/template/email/{templateName} | Delete a template
*TemplateApi* | [**updateEmailTemplate**](docs/TemplateApi.md#updateEmailTemplate) | **PATCH** /v1/org/{orgId}/template/email/{templateName} | Update an existing template
*TemplateApi* | [**updateExisting**](docs/TemplateApi.md#updateExisting) | **PATCH** /v1/org/{orgId}/template/{templateId} | Update an existing template
*TimeoffApi* | [**approvePendingRequest**](docs/TimeoffApi.md#approvePendingRequest) | **POST** /v1/org/{orgId}/timeoff/{timeOffId}/approve | Approve a pending time off request
*TimeoffApi* | [**createEntry**](docs/TimeoffApi.md#createEntry) | **POST** /v1/org/{orgId}/timeoff | Create a timeOff
*TimeoffApi* | [**findTimeOffById**](docs/TimeoffApi.md#findTimeOffById) | **GET** /v1/org/{orgId}/timeoff/{timeOffId} | Return a particular timeOff by id
*TimeoffApi* | [**getTimeOff**](docs/TimeoffApi.md#getTimeOff) | **GET** /v1/org/{orgId}/timeoff | Retrieve time off
*TimeoffApi* | [**rejectTimeOffRequest**](docs/TimeoffApi.md#rejectTimeOffRequest) | **POST** /v1/org/{orgId}/timeoff/{timeOffId}/reject | Reject a pending time off request
*TimeoffApi* | [**removeEntry**](docs/TimeoffApi.md#removeEntry) | **DELETE** /v1/org/{orgId}/timeoff/{timeOffId} | Delete a timeOff
*TimeoffApi* | [**submitTimeOffRequest**](docs/TimeoffApi.md#submitTimeOffRequest) | **POST** /v1/org/{orgId}/timeoff/request | Request time off
*TimeoffApi* | [**updateTimeOffEntry**](docs/TimeoffApi.md#updateTimeOffEntry) | **PATCH** /v1/org/{orgId}/timeoff/{timeOffId} | Update an existing timeOff
*TimeoffApi* | [**validateTimeoffRequest**](docs/TimeoffApi.md#validateTimeoffRequest) | **POST** /v1/org/{orgId}/timeoff/request/validate | Validate a time off request
*UsageApi* | [**recordProductFeatureUsage**](docs/UsageApi.md#recordProductFeatureUsage) | **POST** /v1/org/{orgId}/usage/{type} | Record usage of a product feature
*UserApi* | [**assignRoleToMultiple**](docs/UserApi.md#assignRoleToMultiple) | **PATCH** /v1/user/assign | Assign or remove multiple users a role within an org
*UserApi* | [**changePassword**](docs/UserApi.md#changePassword) | **POST** /v1/user/{userId}/password | Change a user&#39;s password, or switch a user to SSO
*UserApi* | [**createNewUser**](docs/UserApi.md#createNewUser) | **POST** /v1/user | Create a new user
*UserApi* | [**getAllUsersWithinOrgs**](docs/UserApi.md#getAllUsersWithinOrgs) | **GET** /v1/user | Return all users within an org or across orgs
*UserApi* | [**getCurrentUser**](docs/UserApi.md#getCurrentUser) | **GET** /v1/user/me | Return the currently logged in user
*UserApi* | [**getUserByEmail**](docs/UserApi.md#getUserByEmail) | **GET** /v1/user/email/{email} | Return a particular user by email
*UserApi* | [**getUserById**](docs/UserApi.md#getUserById) | **GET** /v1/user/{userId} | Return a particular user by id
*UserApi* | [**inviteMultipleNewUsers**](docs/UserApi.md#inviteMultipleNewUsers) | **POST** /v1/user/invite | Create/invite multiple new users
*UserApi* | [**returnUserByPersonId**](docs/UserApi.md#returnUserByPersonId) | **GET** /v1/user/person/{personId} | Return a particular user by its corresponding person id
*UserApi* | [**revokeAccessToken**](docs/UserApi.md#revokeAccessToken) | **DELETE** /v1/user/{userId}/token | Revoke a user&#39;s access token
*UserApi* | [**revokeAccessTokens**](docs/UserApi.md#revokeAccessTokens) | **DELETE** /v1/user/token | Revoke multiple user&#39;s access tokens
*UserApi* | [**sendPasswordResetEmail**](docs/UserApi.md#sendPasswordResetEmail) | **POST** /v1/user/sendreset | Send a password reset email
*UserApi* | [**updateExistingUser**](docs/UserApi.md#updateExistingUser) | **PATCH** /v1/user/{userId} | Update an existing user
*UserApi* | [**viewedUserDetails**](docs/UserApi.md#viewedUserDetails) | **GET** /v1/user/me/view | Return the user the user is currently viewing as
*WebauthnApi* | [**checkExistingKey**](docs/WebauthnApi.md#checkExistingKey) | **GET** /v1/webauthn/verify | Check for an existing physical key for this user
*WebauthnApi* | [**removeRegisteredCredentialsByEmail**](docs/WebauthnApi.md#removeRegisteredCredentialsByEmail) | **DELETE** /v1/webauthn/register/{emailBase64} | Delete registered credentials by the given email
*WebauthnApi* | [**verifyPhysicalKeyForUser**](docs/WebauthnApi.md#verifyPhysicalKeyForUser) | **GET** /v1/webauthn/register | Check for an existing physical key for this user
*WebauthnApi* | [**verifyPhysicalKeyForUser_0**](docs/WebauthnApi.md#verifyPhysicalKeyForUser_0) | **POST** /v1/webauthn/register | Check for an existing WebAuthn key for this user
*WebauthnApi* | [**verifyPhysicalKeyForUser_1**](docs/WebauthnApi.md#verifyPhysicalKeyForUser_1) | **POST** /v1/webauthn/verify | Check for an existing physical key for this user


## Documentation for Models

 - [AccessAction](docs/AccessAction.md)
 - [AccessResponse](docs/AccessResponse.md)
 - [AccessTokenRequest](docs/AccessTokenRequest.md)
 - [AccessTokenResponse](docs/AccessTokenResponse.md)
 - [Action](docs/Action.md)
 - [ActionRunRequest](docs/ActionRunRequest.md)
 - [ActionStep](docs/ActionStep.md)
 - [Address](docs/Address.md)
 - [AdjustScenarioDateRequest](docs/AdjustScenarioDateRequest.md)
 - [Agreement](docs/Agreement.md)
 - [AgreementRequest](docs/AgreementRequest.md)
 - [AiModelConfig](docs/AiModelConfig.md)
 - [App](docs/App.md)
 - [AppConfig](docs/AppConfig.md)
 - [AppConfigField](docs/AppConfigField.md)
 - [AppInstallCodeValidateRequest](docs/AppInstallCodeValidateRequest.md)
 - [AppInstallCodeValidateResponse](docs/AppInstallCodeValidateResponse.md)
 - [AppProcessStatus](docs/AppProcessStatus.md)
 - [ApprovalChain](docs/ApprovalChain.md)
 - [ApprovalChainStage](docs/ApprovalChainStage.md)
 - [ApprovalChainStageOverride](docs/ApprovalChainStageOverride.md)
 - [ApprovalGroup](docs/ApprovalGroup.md)
 - [ApprovalGroupApprover](docs/ApprovalGroupApprover.md)
 - [ApprovalRequest](docs/ApprovalRequest.md)
 - [ApprovalRequestCompReviewResponse](docs/ApprovalRequestCompReviewResponse.md)
 - [ApprovalRequestCreateBody](docs/ApprovalRequestCreateBody.md)
 - [ApprovalRequestDeleteBody](docs/ApprovalRequestDeleteBody.md)
 - [ApprovalRequestPatchBody](docs/ApprovalRequestPatchBody.md)
 - [ApprovalRequestScenarioResponse](docs/ApprovalRequestScenarioResponse.md)
 - [ApproveChange](docs/ApproveChange.md)
 - [Assessment](docs/Assessment.md)
 - [BasisCondition](docs/BasisCondition.md)
 - [BasisFieldMatrix](docs/BasisFieldMatrix.md)
 - [Billing](docs/Billing.md)
 - [Block](docs/Block.md)
 - [Bucket](docs/Bucket.md)
 - [BudgetAllocation](docs/BudgetAllocation.md)
 - [BudgetCalculation](docs/BudgetCalculation.md)
 - [BudgetPool](docs/BudgetPool.md)
 - [BudgetTierRepresentationResponse](docs/BudgetTierRepresentationResponse.md)
 - [BudgetTiersResponse](docs/BudgetTiersResponse.md)
 - [BuiltInCategoryMap](docs/BuiltInCategoryMap.md)
 - [BuiltInFieldConfig](docs/BuiltInFieldConfig.md)
 - [BulkChangeAssessmentTypesBody](docs/BulkChangeAssessmentTypesBody.md)
 - [BulkChangeRequest](docs/BulkChangeRequest.md)
 - [BulkJobUpdateRequest](docs/BulkJobUpdateRequest.md)
 - [BulkUpdateRequest](docs/BulkUpdateRequest.md)
 - [Bundle](docs/Bundle.md)
 - [BundleInstall](docs/BundleInstall.md)
 - [BundleInstallEntity](docs/BundleInstallEntity.md)
 - [BundleInstallValidate](docs/BundleInstallValidate.md)
 - [BundleReport](docs/BundleReport.md)
 - [CancelSubscriptionSurveyAnswers](docs/CancelSubscriptionSurveyAnswers.md)
 - [Category](docs/Category.md)
 - [CategorySort](docs/CategorySort.md)
 - [Change](docs/Change.md)
 - [ChangeData](docs/ChangeData.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [ChangeStatusResponse](docs/ChangeStatusResponse.md)
 - [Checkout](docs/Checkout.md)
 - [CollaboratorMatrix](docs/CollaboratorMatrix.md)
 - [CollaboratorMatrixCondition](docs/CollaboratorMatrixCondition.md)
 - [CombineScenarioRequest](docs/CombineScenarioRequest.md)
 - [Comment](docs/Comment.md)
 - [Comp](docs/Comp.md)
 - [CompBand](docs/CompBand.md)
 - [CompReview](docs/CompReview.md)
 - [CompReviewBudgets](docs/CompReviewBudgets.md)
 - [CompReviewCollaborators](docs/CompReviewCollaborators.md)
 - [CompReviewConfig](docs/CompReviewConfig.md)
 - [CompReviewEligibleEmployees](docs/CompReviewEligibleEmployees.md)
 - [CompReviewKeyDates](docs/CompReviewKeyDates.md)
 - [CompReviewMetadata](docs/CompReviewMetadata.md)
 - [CompReviewNotifications](docs/CompReviewNotifications.md)
 - [CompReviewReviewerWorkbook](docs/CompReviewReviewerWorkbook.md)
 - [CompReviewReviewersApprovers](docs/CompReviewReviewersApprovers.md)
 - [CompReviewVisualizations](docs/CompReviewVisualizations.md)
 - [CompReviewWorkbookColumn](docs/CompReviewWorkbookColumn.md)
 - [CompensationBandsConfig](docs/CompensationBandsConfig.md)
 - [Contact](docs/Contact.md)
 - [Content](docs/Content.md)
 - [ContentBlock](docs/ContentBlock.md)
 - [ContentRender](docs/ContentRender.md)
 - [CostImpact](docs/CostImpact.md)
 - [CreateAction](docs/CreateAction.md)
 - [CreateActionBody](docs/CreateActionBody.md)
 - [CreateApp](docs/CreateApp.md)
 - [CreateAppConfig](docs/CreateAppConfig.md)
 - [CreateApprovalChain](docs/CreateApprovalChain.md)
 - [CreateApprovalChainStage](docs/CreateApprovalChainStage.md)
 - [CreateAssessment](docs/CreateAssessment.md)
 - [CreateBudgetPool](docs/CreateBudgetPool.md)
 - [CreateCategory](docs/CreateCategory.md)
 - [CreateCategorySort](docs/CreateCategorySort.md)
 - [CreateChange](docs/CreateChange.md)
 - [CreateComment](docs/CreateComment.md)
 - [CreateCompBand](docs/CreateCompBand.md)
 - [CreateCompReview](docs/CreateCompReview.md)
 - [CreateContent](docs/CreateContent.md)
 - [CreateCustomer](docs/CreateCustomer.md)
 - [CreateDataView](docs/CreateDataView.md)
 - [CreateEmailTemplate](docs/CreateEmailTemplate.md)
 - [CreateField](docs/CreateField.md)
 - [CreateForm](docs/CreateForm.md)
 - [CreateGuideline](docs/CreateGuideline.md)
 - [CreateJobLevel](docs/CreateJobLevel.md)
 - [CreateLegalDoc](docs/CreateLegalDoc.md)
 - [CreateMultiplier](docs/CreateMultiplier.md)
 - [CreateOrg](docs/CreateOrg.md)
 - [CreateOrgConfig](docs/CreateOrgConfig.md)
 - [CreatePolicy](docs/CreatePolicy.md)
 - [CreateProcess](docs/CreateProcess.md)
 - [CreateProduct](docs/CreateProduct.md)
 - [CreateProfileTab](docs/CreateProfileTab.md)
 - [CreateQueryToken](docs/CreateQueryToken.md)
 - [CreateQuestion](docs/CreateQuestion.md)
 - [CreateReport](docs/CreateReport.md)
 - [CreateReportChart](docs/CreateReportChart.md)
 - [CreateRole](docs/CreateRole.md)
 - [CreateScenario](docs/CreateScenario.md)
 - [CreateTable](docs/CreateTable.md)
 - [CreateTaskConfig](docs/CreateTaskConfig.md)
 - [CreateTemplate](docs/CreateTemplate.md)
 - [CreateTimeOffEntity](docs/CreateTimeOffEntity.md)
 - [CreateUser](docs/CreateUser.md)
 - [Customer](docs/Customer.md)
 - [CustomerDetails](docs/CustomerDetails.md)
 - [DataView](docs/DataView.md)
 - [DefaultChainCreateBody](docs/DefaultChainCreateBody.md)
 - [Deviation](docs/Deviation.md)
 - [DtValue](docs/DtValue.md)
 - [DueDate](docs/DueDate.md)
 - [EmailRequest](docs/EmailRequest.md)
 - [EmailTemplate](docs/EmailTemplate.md)
 - [EntityAction](docs/EntityAction.md)
 - [EnumValue](docs/EnumValue.md)
 - [EvaluateExpressionRequest](docs/EvaluateExpressionRequest.md)
 - [EvaluateExpressionResponse](docs/EvaluateExpressionResponse.md)
 - [Event](docs/Event.md)
 - [ExchangeRate](docs/ExchangeRate.md)
 - [ExportField](docs/ExportField.md)
 - [FeatureAccessOption](docs/FeatureAccessOption.md)
 - [Field](docs/Field.md)
 - [FieldMapper](docs/FieldMapper.md)
 - [FieldRemoveCategoryRequest](docs/FieldRemoveCategoryRequest.md)
 - [FieldRemoveOverrideRequest](docs/FieldRemoveOverrideRequest.md)
 - [FieldStatusUpdateRequest](docs/FieldStatusUpdateRequest.md)
 - [FileEntity](docs/FileEntity.md)
 - [FileUploadNewFileRequest](docs/FileUploadNewFileRequest.md)
 - [Form](docs/Form.md)
 - [FormBlock](docs/FormBlock.md)
 - [FormCollectRequest](docs/FormCollectRequest.md)
 - [FormDraft](docs/FormDraft.md)
 - [FormField](docs/FormField.md)
 - [FormRender](docs/FormRender.md)
 - [FormRenderBlock](docs/FormRenderBlock.md)
 - [FormRerender](docs/FormRerender.md)
 - [FormResponse](docs/FormResponse.md)
 - [FormResponseAnswer](docs/FormResponseAnswer.md)
 - [FormResponseCount](docs/FormResponseCount.md)
 - [FormStatusUpdateRequest](docs/FormStatusUpdateRequest.md)
 - [FormSubmitRequest](docs/FormSubmitRequest.md)
 - [FormSummary](docs/FormSummary.md)
 - [FormVersion](docs/FormVersion.md)
 - [GenerateCompReviewOptions](docs/GenerateCompReviewOptions.md)
 - [GenerateTemplateRequest](docs/GenerateTemplateRequest.md)
 - [Geocode](docs/Geocode.md)
 - [Geopoint](docs/Geopoint.md)
 - [GetVisualizationsOptions](docs/GetVisualizationsOptions.md)
 - [GrantAlias](docs/GrantAlias.md)
 - [GraphCount](docs/GraphCount.md)
 - [GraphCountsResponse](docs/GraphCountsResponse.md)
 - [Group](docs/Group.md)
 - [GroupAssignment](docs/GroupAssignment.md)
 - [GroupByConfig](docs/GroupByConfig.md)
 - [GroupCount](docs/GroupCount.md)
 - [GroupGraphCount](docs/GroupGraphCount.md)
 - [GroupGraphResult](docs/GroupGraphResult.md)
 - [GroupGraphResults](docs/GroupGraphResults.md)
 - [GroupParent](docs/GroupParent.md)
 - [GroupType](docs/GroupType.md)
 - [Guideline](docs/Guideline.md)
 - [GuidelineCalculation](docs/GuidelineCalculation.md)
 - [HomepageContentRender](docs/HomepageContentRender.md)
 - [IdpAccessTokenResponse](docs/IdpAccessTokenResponse.md)
 - [ImportCsvDataWithColumnMatchRequest](docs/ImportCsvDataWithColumnMatchRequest.md)
 - [InCycleChange](docs/InCycleChange.md)
 - [InCycleViewChanges](docs/InCycleViewChanges.md)
 - [InCycleViewFeatures](docs/InCycleViewFeatures.md)
 - [InCycleViewResponse](docs/InCycleViewResponse.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceResponse](docs/InvoiceResponse.md)
 - [Job](docs/Job.md)
 - [JobLevel](docs/JobLevel.md)
 - [JobRelationship](docs/JobRelationship.md)
 - [JobTierField](docs/JobTierField.md)
 - [JobUpdate](docs/JobUpdate.md)
 - [LabelColor](docs/LabelColor.md)
 - [LabelOverride](docs/LabelOverride.md)
 - [LegalDoc](docs/LegalDoc.md)
 - [LogData](docs/LogData.md)
 - [Markup](docs/Markup.md)
 - [Media](docs/Media.md)
 - [Message](docs/Message.md)
 - [Money](docs/Money.md)
 - [MoneyRange](docs/MoneyRange.md)
 - [Multiplier](docs/Multiplier.md)
 - [Name](docs/Name.md)
 - [NotificationJobData](docs/NotificationJobData.md)
 - [NotificationRequest](docs/NotificationRequest.md)
 - [NotifyRequest](docs/NotifyRequest.md)
 - [OauthAuthorizeUserTokenRequest](docs/OauthAuthorizeUserTokenRequest.md)
 - [OkResponse](docs/OkResponse.md)
 - [OnboardStep](docs/OnboardStep.md)
 - [OnboardStepResult](docs/OnboardStepResult.md)
 - [Org](docs/Org.md)
 - [OrgAccess](docs/OrgAccess.md)
 - [OrgConfig](docs/OrgConfig.md)
 - [OrgCount](docs/OrgCount.md)
 - [OrgDomain](docs/OrgDomain.md)
 - [OrgStockData](docs/OrgStockData.md)
 - [OrgUsersPersonsCountResponse](docs/OrgUsersPersonsCountResponse.md)
 - [OrgUsersPersonsResponse](docs/OrgUsersPersonsResponse.md)
 - [OutboundFieldMapper](docs/OutboundFieldMapper.md)
 - [OutboundValueMapper](docs/OutboundValueMapper.md)
 - [Pair](docs/Pair.md)
 - [PairLocalDateLocalDate](docs/PairLocalDateLocalDate.md)
 - [PairStringObject](docs/PairStringObject.md)
 - [PartialAction](docs/PartialAction.md)
 - [PartialAppEntities](docs/PartialAppEntities.md)
 - [PartialField](docs/PartialField.md)
 - [PartialForm](docs/PartialForm.md)
 - [PartialGroup](docs/PartialGroup.md)
 - [PartialJob](docs/PartialJob.md)
 - [PartialMessage](docs/PartialMessage.md)
 - [PartialPolicy](docs/PartialPolicy.md)
 - [PartialProfileTab](docs/PartialProfileTab.md)
 - [PartialReport](docs/PartialReport.md)
 - [PartialReportChart](docs/PartialReportChart.md)
 - [PartialTaskConfig](docs/PartialTaskConfig.md)
 - [PatchActionBody](docs/PatchActionBody.md)
 - [PayInterval](docs/PayInterval.md)
 - [PaymentInfo](docs/PaymentInfo.md)
 - [Person](docs/Person.md)
 - [Plan](docs/Plan.md)
 - [PlanTier](docs/PlanTier.md)
 - [Policy](docs/Policy.md)
 - [PolicyRule](docs/PolicyRule.md)
 - [PoolCalculation](docs/PoolCalculation.md)
 - [PositionImportCsvDataWithFilePathRequest](docs/PositionImportCsvDataWithFilePathRequest.md)
 - [Postal](docs/Postal.md)
 - [PreloadResponse](docs/PreloadResponse.md)
 - [Process](docs/Process.md)
 - [ProcessCreatePendingProcessRequest](docs/ProcessCreatePendingProcessRequest.md)
 - [ProcessEvent](docs/ProcessEvent.md)
 - [ProcessEventResponse](docs/ProcessEventResponse.md)
 - [ProcessEventUpdate](docs/ProcessEventUpdate.md)
 - [ProcessEventUpdatePayload](docs/ProcessEventUpdatePayload.md)
 - [Product](docs/Product.md)
 - [ProductItem](docs/ProductItem.md)
 - [ProfileTab](docs/ProfileTab.md)
 - [ProfileTabSummary](docs/ProfileTabSummary.md)
 - [QueryToken](docs/QueryToken.md)
 - [Question](docs/Question.md)
 - [RaisePercentageHistogram](docs/RaisePercentageHistogram.md)
 - [ReassignApproverPatchBody](docs/ReassignApproverPatchBody.md)
 - [RecordMetricRequest](docs/RecordMetricRequest.md)
 - [Report](docs/Report.md)
 - [ReportChart](docs/ReportChart.md)
 - [ReportCount](docs/ReportCount.md)
 - [ReportDataStreamResults](docs/ReportDataStreamResults.md)
 - [ReportDateInterval](docs/ReportDateInterval.md)
 - [ReportFilter](docs/ReportFilter.md)
 - [ReportGroupByDimension](docs/ReportGroupByDimension.md)
 - [ReportGroupByKey](docs/ReportGroupByKey.md)
 - [ReportMetricCollection](docs/ReportMetricCollection.md)
 - [ReportMetricCollectionItem](docs/ReportMetricCollectionItem.md)
 - [ReportMetricsReturnType](docs/ReportMetricsReturnType.md)
 - [ReportQuery](docs/ReportQuery.md)
 - [ReportQueryResult](docs/ReportQueryResult.md)
 - [ReportResult](docs/ReportResult.md)
 - [ReportSeriesQuery](docs/ReportSeriesQuery.md)
 - [ReportSeriesResult](docs/ReportSeriesResult.md)
 - [ResultsAccess](docs/ResultsAccess.md)
 - [ResultsAction](docs/ResultsAction.md)
 - [ResultsApp](docs/ResultsApp.md)
 - [ResultsApprovalChain](docs/ResultsApprovalChain.md)
 - [ResultsApprovalChainStage](docs/ResultsApprovalChainStage.md)
 - [ResultsApprovalRequest](docs/ResultsApprovalRequest.md)
 - [ResultsApprovalRequestCompReviewResponse](docs/ResultsApprovalRequestCompReviewResponse.md)
 - [ResultsApprovalRequestScenarioResponse](docs/ResultsApprovalRequestScenarioResponse.md)
 - [ResultsAssessment](docs/ResultsAssessment.md)
 - [ResultsCategory](docs/ResultsCategory.md)
 - [ResultsChange](docs/ResultsChange.md)
 - [ResultsChangeData](docs/ResultsChangeData.md)
 - [ResultsComment](docs/ResultsComment.md)
 - [ResultsCompReview](docs/ResultsCompReview.md)
 - [ResultsContent](docs/ResultsContent.md)
 - [ResultsCustomer](docs/ResultsCustomer.md)
 - [ResultsData](docs/ResultsData.md)
 - [ResultsDataView](docs/ResultsDataView.md)
 - [ResultsEmailTemplate](docs/ResultsEmailTemplate.md)
 - [ResultsEvent](docs/ResultsEvent.md)
 - [ResultsField](docs/ResultsField.md)
 - [ResultsFileEntity](docs/ResultsFileEntity.md)
 - [ResultsForm](docs/ResultsForm.md)
 - [ResultsFormSummary](docs/ResultsFormSummary.md)
 - [ResultsGuideline](docs/ResultsGuideline.md)
 - [ResultsGuidelineCalculation](docs/ResultsGuidelineCalculation.md)
 - [ResultsMessage](docs/ResultsMessage.md)
 - [ResultsOnboardStep](docs/ResultsOnboardStep.md)
 - [ResultsOrg](docs/ResultsOrg.md)
 - [ResultsPartialField](docs/ResultsPartialField.md)
 - [ResultsPlan](docs/ResultsPlan.md)
 - [ResultsPolicy](docs/ResultsPolicy.md)
 - [ResultsProcess](docs/ResultsProcess.md)
 - [ResultsProduct](docs/ResultsProduct.md)
 - [ResultsProfileTab](docs/ResultsProfileTab.md)
 - [ResultsProfileTabSummary](docs/ResultsProfileTabSummary.md)
 - [ResultsQuestion](docs/ResultsQuestion.md)
 - [ResultsReportChart](docs/ResultsReportChart.md)
 - [ResultsRole](docs/ResultsRole.md)
 - [ResultsScenario](docs/ResultsScenario.md)
 - [ResultsStockPrice](docs/ResultsStockPrice.md)
 - [ResultsStripeProduct](docs/ResultsStripeProduct.md)
 - [ResultsTable](docs/ResultsTable.md)
 - [ResultsTask](docs/ResultsTask.md)
 - [ResultsTemplate](docs/ResultsTemplate.md)
 - [ResultsTimeOffEntity](docs/ResultsTimeOffEntity.md)
 - [ResultsUser](docs/ResultsUser.md)
 - [Role](docs/Role.md)
 - [SamlPerformSsoAssertionRequest](docs/SamlPerformSsoAssertionRequest.md)
 - [Scenario](docs/Scenario.md)
 - [ScenarioCalculation](docs/ScenarioCalculation.md)
 - [ScenarioChangesWithBudgetRollup](docs/ScenarioChangesWithBudgetRollup.md)
 - [ScenarioMetadata](docs/ScenarioMetadata.md)
 - [ScenarioSharedViewConfig](docs/ScenarioSharedViewConfig.md)
 - [ScopeRequest](docs/ScopeRequest.md)
 - [SearchResult](docs/SearchResult.md)
 - [SearchResultResponse](docs/SearchResultResponse.md)
 - [SendReminderBody](docs/SendReminderBody.md)
 - [SendReminderEmailOptions](docs/SendReminderEmailOptions.md)
 - [SetupIntent](docs/SetupIntent.md)
 - [ShareAccess](docs/ShareAccess.md)
 - [SmartCurrencyOption](docs/SmartCurrencyOption.md)
 - [StockGrant](docs/StockGrant.md)
 - [StockPrice](docs/StockPrice.md)
 - [StripeProduct](docs/StripeProduct.md)
 - [Subscription](docs/Subscription.md)
 - [SummarizeFormResponsesRequest](docs/SummarizeFormResponsesRequest.md)
 - [SummarizeResponse](docs/SummarizeResponse.md)
 - [Table](docs/Table.md)
 - [TableRef](docs/TableRef.md)
 - [TableRowRef](docs/TableRowRef.md)
 - [Task](docs/Task.md)
 - [TaskConfig](docs/TaskConfig.md)
 - [TaskFormSummary](docs/TaskFormSummary.md)
 - [TaskRemindRequest](docs/TaskRemindRequest.md)
 - [Template](docs/Template.md)
 - [TemplatePreviewRequest](docs/TemplatePreviewRequest.md)
 - [TemplateRenderResponse](docs/TemplateRenderResponse.md)
 - [TestEmailRequest](docs/TestEmailRequest.md)
 - [TierRepresentationResponse](docs/TierRepresentationResponse.md)
 - [TiersResponse](docs/TiersResponse.md)
 - [TimeOff](docs/TimeOff.md)
 - [TimeOffApproval](docs/TimeOffApproval.md)
 - [TimeOffEntity](docs/TimeOffEntity.md)
 - [TimeOffRequest](docs/TimeOffRequest.md)
 - [TrackedGroupRef](docs/TrackedGroupRef.md)
 - [UpcomingChange](docs/UpcomingChange.md)
 - [UpdateAction](docs/UpdateAction.md)
 - [UpdateAiConfig](docs/UpdateAiConfig.md)
 - [UpdateApp](docs/UpdateApp.md)
 - [UpdateAppConfig](docs/UpdateAppConfig.md)
 - [UpdateApprovalChain](docs/UpdateApprovalChain.md)
 - [UpdateApprovalChainStage](docs/UpdateApprovalChainStage.md)
 - [UpdateApprovalRequest](docs/UpdateApprovalRequest.md)
 - [UpdateAssessment](docs/UpdateAssessment.md)
 - [UpdateBudgetPool](docs/UpdateBudgetPool.md)
 - [UpdateCategory](docs/UpdateCategory.md)
 - [UpdateCategorySort](docs/UpdateCategorySort.md)
 - [UpdateChange](docs/UpdateChange.md)
 - [UpdateCompBand](docs/UpdateCompBand.md)
 - [UpdateCompReview](docs/UpdateCompReview.md)
 - [UpdateContent](docs/UpdateContent.md)
 - [UpdateCustomer](docs/UpdateCustomer.md)
 - [UpdateDataView](docs/UpdateDataView.md)
 - [UpdateEmailTemplate](docs/UpdateEmailTemplate.md)
 - [UpdateExchangeRate](docs/UpdateExchangeRate.md)
 - [UpdateField](docs/UpdateField.md)
 - [UpdateForm](docs/UpdateForm.md)
 - [UpdateFormResponse](docs/UpdateFormResponse.md)
 - [UpdateGroup](docs/UpdateGroup.md)
 - [UpdateGroupType](docs/UpdateGroupType.md)
 - [UpdateGroupTypeConfig](docs/UpdateGroupTypeConfig.md)
 - [UpdateGuideline](docs/UpdateGuideline.md)
 - [UpdateJobLevel](docs/UpdateJobLevel.md)
 - [UpdateLegalDoc](docs/UpdateLegalDoc.md)
 - [UpdateMessage](docs/UpdateMessage.md)
 - [UpdateMultiplier](docs/UpdateMultiplier.md)
 - [UpdateOperation](docs/UpdateOperation.md)
 - [UpdateOrg](docs/UpdateOrg.md)
 - [UpdateOrgConfig](docs/UpdateOrgConfig.md)
 - [UpdatePerson](docs/UpdatePerson.md)
 - [UpdatePolicy](docs/UpdatePolicy.md)
 - [UpdateProcess](docs/UpdateProcess.md)
 - [UpdateProduct](docs/UpdateProduct.md)
 - [UpdateProfileTab](docs/UpdateProfileTab.md)
 - [UpdateQuestion](docs/UpdateQuestion.md)
 - [UpdateReport](docs/UpdateReport.md)
 - [UpdateReportChart](docs/UpdateReportChart.md)
 - [UpdateRole](docs/UpdateRole.md)
 - [UpdateScenario](docs/UpdateScenario.md)
 - [UpdateScenarioChangeResponse](docs/UpdateScenarioChangeResponse.md)
 - [UpdateStockPrice](docs/UpdateStockPrice.md)
 - [UpdateSubscription](docs/UpdateSubscription.md)
 - [UpdateTable](docs/UpdateTable.md)
 - [UpdateTask](docs/UpdateTask.md)
 - [UpdateTaskConfig](docs/UpdateTaskConfig.md)
 - [UpdateTemplate](docs/UpdateTemplate.md)
 - [UpdateTimeOffEntity](docs/UpdateTimeOffEntity.md)
 - [UpdateUser](docs/UpdateUser.md)
 - [User](docs/User.md)
 - [UserEmailSetting](docs/UserEmailSetting.md)
 - [UserListRow](docs/UserListRow.md)
 - [ValidateExpressionRequest](docs/ValidateExpressionRequest.md)
 - [ValidateExpressionResponse](docs/ValidateExpressionResponse.md)
 - [ValidateExpressionResult](docs/ValidateExpressionResult.md)
 - [ValueRange](docs/ValueRange.md)
 - [VariableComp](docs/VariableComp.md)
 - [VariableCompAmount](docs/VariableCompAmount.md)
 - [VariableCompAmountAllOf](docs/VariableCompAmountAllOf.md)
 - [VariableCompPercent](docs/VariableCompPercent.md)
 - [VariableCompPercentAllOf](docs/VariableCompPercentAllOf.md)
 - [ViewAsRequest](docs/ViewAsRequest.md)
 - [WebAuthnRequest](docs/WebAuthnRequest.md)
 - [WebRegisteredCredential](docs/WebRegisteredCredential.md)
 - [WelcomeEmailSettings](docs/WelcomeEmailSettings.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
