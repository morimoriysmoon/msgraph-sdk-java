// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequest;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Request.
 */
public class TokenIssuancePolicyRequest extends BaseRequest implements ITokenIssuancePolicyRequest {
	
    /**
     * The request for the TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicy.class);
    }

    /**
     * Gets the TokenIssuancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<TokenIssuancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TokenIssuancePolicy from the service
     *
     * @return the TokenIssuancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenIssuancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<TokenIssuancePolicy> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TokenIssuancePolicy with a source
     *
     * @param sourceTokenIssuancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TokenIssuancePolicy sourceTokenIssuancePolicy, final ICallback<TokenIssuancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceTokenIssuancePolicy);
    }

    /**
     * Patches this TokenIssuancePolicy with a source
     *
     * @param sourceTokenIssuancePolicy the source object with updates
     * @return the updated TokenIssuancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenIssuancePolicy patch(final TokenIssuancePolicy sourceTokenIssuancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceTokenIssuancePolicy);
    }

    /**
     * Creates a TokenIssuancePolicy with a new object
     *
     * @param newTokenIssuancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TokenIssuancePolicy newTokenIssuancePolicy, final ICallback<TokenIssuancePolicy> callback) {
        send(HttpMethod.POST, callback, newTokenIssuancePolicy);
    }

    /**
     * Creates a TokenIssuancePolicy with a new object
     *
     * @param newTokenIssuancePolicy the new object to create
     * @return the created TokenIssuancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenIssuancePolicy post(final TokenIssuancePolicy newTokenIssuancePolicy) throws ClientException {
        return send(HttpMethod.POST, newTokenIssuancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITokenIssuancePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (TokenIssuancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITokenIssuancePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (TokenIssuancePolicyRequest)this;
     }

}

