/*
 * ChartHop API
 * REST API for ChartHop
 *
 * The version of the OpenAPI document: V1.0.0
 * Contact: support@charthop.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateTemplate;
import com.konfigthis.client.model.GenerateTemplateRequest;
import java.time.LocalDate;
import com.konfigthis.client.model.Process;
import com.konfigthis.client.model.ResultsTemplate;
import com.konfigthis.client.model.Template;
import com.konfigthis.client.model.TemplatePreviewRequest;
import com.konfigthis.client.model.TemplateRenderResponse;
import com.konfigthis.client.model.UpdateTemplate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateApi
 */
@Disabled
public class TemplateApiTest {

    private static TemplateApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TemplateApi(apiClient);
    }

    /**
     * Delete a set of templates
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkDeleteTest() throws ApiException {
        String orgId = null;
        Process response = api.bulkDelete(orgId)
                .execute();
        // TODO: test validations
    }

    /**
     * Duplicate a set of templates
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBulkDuplicateTest() throws ApiException {
        String orgId = null;
        Process response = api.createBulkDuplicate(orgId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a template
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmailTest() throws ApiException {
        String name = null;
        String content = null;
        List<String> tags = null;
        String description = null;
        String stylesheet = null;
        String type = null;
        String filename = null;
        Template response = api.createEmail(name, content)
                .tags(tags)
                .description(description)
                .stylesheet(stylesheet)
                .type(type)
                .filename(filename)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a template
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTemplateTest() throws ApiException {
        String name = null;
        String content = null;
        String orgId = null;
        List<String> tags = null;
        String description = null;
        String stylesheet = null;
        String type = null;
        String filename = null;
        Template response = api.createNewTemplate(name, content, orgId)
                .tags(tags)
                .description(description)
                .stylesheet(stylesheet)
                .type(type)
                .filename(filename)
                .execute();
        // TODO: test validations
    }

    /**
     * Render a template by evaluating it against an existing job
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evaluateAgainstJobTest() throws ApiException {
        String orgId = null;
        String templateId = null;
        String jobId = null;
        String scenarioId = null;
        LocalDate date = null;
        String format = null;
        String changeGroupingType = null;
        String changeGroupingId = null;
        Boolean useScenarioChanges = null;
        TemplateRenderResponse response = api.evaluateAgainstJob(orgId, templateId)
                .jobId(jobId)
                .scenarioId(scenarioId)
                .date(date)
                .format(format)
                .changeGroupingType(changeGroupingType)
                .changeGroupingId(changeGroupingId)
                .useScenarioChanges(useScenarioChanges)
                .execute();
        // TODO: test validations
    }

    /**
     * Automatically generate PDFs of the templates, and distribute emails to managers and people to download
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generatePdfsAndEmailsTest() throws ApiException {
        Boolean saveToFiles = null;
        Boolean sendToManagers = null;
        Boolean sendToPersons = null;
        Boolean useScenarioChanges = null;
        String orgId = null;
        String templateId = null;
        String filter = null;
        String emailSubject = null;
        String emailMessage = null;
        String fileSensitive = null;
        String fileField = null;
        String scenarioId = null;
        LocalDate date = null;
        String changeGroupingType = null;
        String changeGroupingId = null;
        Process response = api.generatePdfsAndEmails(saveToFiles, sendToManagers, sendToPersons, useScenarioChanges, orgId, templateId)
                .filter(filter)
                .emailSubject(emailSubject)
                .emailMessage(emailMessage)
                .fileSensitive(fileSensitive)
                .fileField(fileField)
                .scenarioId(scenarioId)
                .date(date)
                .changeGroupingType(changeGroupingType)
                .changeGroupingId(changeGroupingId)
                .execute();
        // TODO: test validations
    }

    /**
     * Preview template content without saving it
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTemplatePreviewTest() throws ApiException {
        String content = null;
        String orgId = null;
        String stylesheet = null;
        String jobId = null;
        String scenarioId = null;
        LocalDate date = null;
        String format = null;
        String changeGroupingType = null;
        String changeGroupingId = null;
        Boolean useScenarioChanges = null;
        TemplateRenderResponse response = api.generateTemplatePreview(content, orgId)
                .stylesheet(stylesheet)
                .jobId(jobId)
                .scenarioId(scenarioId)
                .date(date)
                .format(format)
                .changeGroupingType(changeGroupingType)
                .changeGroupingId(changeGroupingId)
                .useScenarioChanges(useScenarioChanges)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all templates in the organization paginated
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllInOrgsTest() throws ApiException {
        String orgId = null;
        String type = null;
        String from = null;
        Integer limit = null;
        ResultsTemplate response = api.getAllInOrgs(orgId)
                .type(type)
                .from(from)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular template by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String orgId = null;
        String templateId = null;
        Template response = api.getById(orgId, templateId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular email template by name
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByNameTest() throws ApiException {
        String templateName = null;
        Template response = api.getByName(templateName)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a template
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String orgId = null;
        String templateId = null;
        api.removeById(orgId, templateId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a template
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeEmailTest() throws ApiException {
        String templateName = null;
        api.removeEmail(templateName)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing template
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmailTemplateTest() throws ApiException {
        String templateName = null;
        List<String> tags = null;
        String description = null;
        String name = null;
        String content = null;
        String stylesheet = null;
        String type = null;
        String filename = null;
        api.updateEmailTemplate(templateName)
                .tags(tags)
                .description(description)
                .name(name)
                .content(content)
                .stylesheet(stylesheet)
                .type(type)
                .filename(filename)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing template
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExistingTest() throws ApiException {
        String orgId = null;
        String templateId = null;
        List<String> tags = null;
        String description = null;
        String name = null;
        String content = null;
        String stylesheet = null;
        String type = null;
        String filename = null;
        api.updateExisting(orgId, templateId)
                .tags(tags)
                .description(description)
                .name(name)
                .content(content)
                .stylesheet(stylesheet)
                .type(type)
                .filename(filename)
                .execute();
        // TODO: test validations
    }

}
