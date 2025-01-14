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
import com.konfigthis.client.model.Geocode;
import java.time.LocalDate;
import com.konfigthis.client.model.ResultsData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonApi
 */
@Disabled
public class PersonApiTest {

    private static PersonApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PersonApi(apiClient);
    }

    /**
     * Create a person
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewPersonTest() throws ApiException {
        String orgId = null;
        String scenarioId = null;
        LocalDate date = null;
        Object response = api.createNewPerson(orgId)
                .scenarioId(scenarioId)
                .date(date)
                .execute();
        // TODO: test validations
    }

    /**
     * Find persons in the organization
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findInOrganizationTest() throws ApiException {
        String orgId = null;
        String scenarioId = null;
        LocalDate date = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String q = null;
        String from = null;
        Integer limit = null;
        String fields = null;
        List<String> fieldsList = null;
        Boolean includeAll = null;
        String format = null;
        String returnAccess = null;
        ResultsData response = api.findInOrganization(orgId)
                .scenarioId(scenarioId)
                .date(date)
                .startDate(startDate)
                .endDate(endDate)
                .q(q)
                .from(from)
                .limit(limit)
                .fields(fields)
                .fieldsList(fieldsList)
                .includeAll(includeAll)
                .format(format)
                .returnAccess(returnAccess)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular person by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String orgId = null;
        String personId = null;
        String scenarioId = null;
        LocalDate date = null;
        String fields = null;
        String format = null;
        Object response = api.getById(orgId, personId)
                .scenarioId(scenarioId)
                .date(date)
                .fields(fields)
                .format(format)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all geocodes for persons in the organization
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeocodesForOrgTest() throws ApiException {
        String orgId = null;
        String fields = null;
        List<Geocode> response = api.getGeocodesForOrg(orgId)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a person
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String orgId = null;
        String personId = null;
        api.removeById(orgId, personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a person
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String orgId = null;
        String personId = null;
        String scenarioId = null;
        LocalDate date = null;
        api.updateById(orgId, personId)
                .scenarioId(scenarioId)
                .date(date)
                .execute();
        // TODO: test validations
    }

}
