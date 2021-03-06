// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Reference Request.
 */
public class TeamsAppDefinitionReferenceRequest extends BaseRequest implements ITeamsAppDefinitionReferenceRequest {

    /**
     * The request for the TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinition.class);
    }

    public void delete(final ICallback<TeamsAppDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public TeamsAppDefinition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppDefinitionReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (TeamsAppDefinitionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppDefinitionReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (TeamsAppDefinitionReferenceRequest)this;
    }
    /**
     * Puts the TeamsAppDefinition
     *
     * @param srcTeamsAppDefinition the TeamsAppDefinition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(TeamsAppDefinition srcTeamsAppDefinition, final ICallback<TeamsAppDefinition> callback) {
        send(HttpMethod.PUT, callback, srcTeamsAppDefinition);
    }

    /**
     * Puts the TeamsAppDefinition
     *
     * @param srcTeamsAppDefinition the TeamsAppDefinition reference to PUT
     * @return the TeamsAppDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TeamsAppDefinition put(TeamsAppDefinition srcTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.PUT, srcTeamsAppDefinition);
    }
}
