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
import java.io.File;
import com.konfigthis.client.model.FileUploadNewFileRequest;
import com.konfigthis.client.model.ImportCsvDataWithColumnMatchRequest;
import java.time.LocalDate;
import com.konfigthis.client.model.Process;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportApi
 */
@Disabled
public class ImportApiTest {

    private static ImportApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ImportApi(apiClient);
    }

    /**
     * Import data from CSV file
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void csvDataTest() throws ApiException {
        String orgId = null;
        File _file = null;
        String scenarioId = null;
        Boolean skipErrors = null;
        Boolean upsert = null;
        Boolean createGroups = null;
        Boolean disableSyncHireDate = null;
        String updateTypes = null;
        String notifyUserIds = null;
        String notifyAppName = null;
        LocalDate defaultChangeDate = null;
        Boolean disableOverwritePerson = null;
        Boolean importDryRun = null;
        Boolean importAfterDryRun = null;
        String parentProcessId = null;
        String importSource = null;
        Process response = api.csvData(orgId)
                ._file(_file)
                .scenarioId(scenarioId)
                .skipErrors(skipErrors)
                .upsert(upsert)
                .createGroups(createGroups)
                .disableSyncHireDate(disableSyncHireDate)
                .updateTypes(updateTypes)
                .notifyUserIds(notifyUserIds)
                .notifyAppName(notifyAppName)
                .defaultChangeDate(defaultChangeDate)
                .disableOverwritePerson(disableOverwritePerson)
                .importDryRun(importDryRun)
                .importAfterDryRun(importAfterDryRun)
                .parentProcessId(parentProcessId)
                .importSource(importSource)
                .execute();
        // TODO: test validations
    }

    /**
     * Parse a CSV file in preparation for column matching as part of spreadsheet import process
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void csvDataColumnMatchTest() throws ApiException {
        String orgId = null;
        File _file = null;
        api.csvDataColumnMatch(orgId)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Import data from CSV file
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void csvDataWithColumnMatchTest() throws ApiException {
        String orgId = null;
        String scenarioId = null;
        Boolean skipErrors = null;
        Boolean upsert = null;
        Boolean createGroups = null;
        Boolean disableSyncHireDate = null;
        String updateTypes = null;
        String notifyUserIds = null;
        String notifyAppName = null;
        LocalDate defaultChangeDate = null;
        Boolean disableOverwritePerson = null;
        Boolean importDryRun = null;
        Boolean importAfterDryRun = null;
        String parentProcessId = null;
        String importSource = null;
        Boolean syncImages = null;
        File _file = null;
        Object userDefinedFieldAliases = null;
        Process response = api.csvDataWithColumnMatch(orgId)
                .scenarioId(scenarioId)
                .skipErrors(skipErrors)
                .upsert(upsert)
                .createGroups(createGroups)
                .disableSyncHireDate(disableSyncHireDate)
                .updateTypes(updateTypes)
                .notifyUserIds(notifyUserIds)
                .notifyAppName(notifyAppName)
                .defaultChangeDate(defaultChangeDate)
                .disableOverwritePerson(disableOverwritePerson)
                .importDryRun(importDryRun)
                .importAfterDryRun(importAfterDryRun)
                .parentProcessId(parentProcessId)
                .importSource(importSource)
                .syncImages(syncImages)
                ._file(_file)
                .userDefinedFieldAliases(userDefinedFieldAliases)
                .execute();
        // TODO: test validations
    }

    /**
     * Import data from CSV file
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void csvDataWithFilePathTest() throws ApiException {
        String orgId = null;
        String filePath = null;
        String scenarioId = null;
        Boolean skipErrors = null;
        Boolean upsert = null;
        Boolean createGroups = null;
        Boolean disableSyncHireDate = null;
        String updateTypes = null;
        String notifyUserIds = null;
        String notifyAppName = null;
        LocalDate defaultChangeDate = null;
        Boolean disableOverwritePerson = null;
        Boolean importDryRun = null;
        Boolean importAfterDryRun = null;
        String parentProcessId = null;
        String importSource = null;
        Process response = api.csvDataWithFilePath(orgId)
                .filePath(filePath)
                .scenarioId(scenarioId)
                .skipErrors(skipErrors)
                .upsert(upsert)
                .createGroups(createGroups)
                .disableSyncHireDate(disableSyncHireDate)
                .updateTypes(updateTypes)
                .notifyUserIds(notifyUserIds)
                .notifyAppName(notifyAppName)
                .defaultChangeDate(defaultChangeDate)
                .disableOverwritePerson(disableOverwritePerson)
                .importDryRun(importDryRun)
                .importAfterDryRun(importAfterDryRun)
                .parentProcessId(parentProcessId)
                .importSource(importSource)
                .execute();
        // TODO: test validations
    }

    /**
     * Check if a spreadsheet file is valid to be imported
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void spreadsheetValidationTest() throws ApiException {
        String orgId = null;
        File _file = null;
        Integer maxRows = null;
        api.spreadsheetValidation(orgId)
                ._file(_file)
                .maxRows(maxRows)
                .execute();
        // TODO: test validations
    }

}
