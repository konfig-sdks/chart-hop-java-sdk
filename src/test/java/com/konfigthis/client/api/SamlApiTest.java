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
import com.konfigthis.client.model.SamlPerformSsoAssertionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SamlApi
 */
@Disabled
public class SamlApiTest {

    private static SamlApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SamlApi(apiClient);
    }

    /**
     * Return an redirect to the designated Idp, given an identity provider
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void performSsoAssertionTest() throws ApiException {
        String org = null;
        String idp = null;
        api.performSsoAssertion(org)
                .idp(idp)
                .execute();
        // TODO: test validations
    }

    /**
     * Single sign on URL, where SAML assertion is perform
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void performSsoAssertion_0Test() throws ApiException {
        String org = null;
        String token = null;
        String saMLResponse = null;
        String relayState = null;
        api.performSsoAssertion_0(org)
                .token(token)
                .saMLResponse(saMLResponse)
                .relayState(relayState)
                .execute();
        // TODO: test validations
    }

    /**
     * Save per org Xml Cert from IDP
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void savePerOrgXmlCertFromIdpTest() throws ApiException {
        String orgId = null;
        String idp = null;
        api.savePerOrgXmlCertFromIdp(orgId)
                .idp(idp)
                .execute();
        // TODO: test validations
    }

    /**
     * Save per org Xml Cert from IDP
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void savePerOrgXmlCertFromIdp_0Test() throws ApiException {
        String orgId = null;
        File _file = null;
        String idp = null;
        api.savePerOrgXmlCertFromIdp_0(orgId)
                ._file(_file)
                .idp(idp)
                .execute();
        // TODO: test validations
    }

}