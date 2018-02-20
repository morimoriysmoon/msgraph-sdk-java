// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contract Request.
 */
public class BaseContractRequest extends BaseRequest implements IBaseContractRequest {

    /**
     * The request for the Contract
     *
     * @param requestUrl The request URL
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the response
     */
    public BaseContractRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Contract> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Contract from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Contract> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Contract from the service
     * @return The Contract from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Contract get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Contract with a source
     * @param sourceContract The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Contract sourceContract, final ICallback<Contract> callback) {
        send(HttpMethod.PATCH, callback, sourceContract);
    }

    /**
     * Patches this Contract with a source
     * @param sourceContract The source object with updates
     * @return The updated Contract
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Contract patch(final Contract sourceContract) throws ClientException {
        return send(HttpMethod.PATCH, sourceContract);
    }

    /**
     * Creates a Contract with a new object
     * @param newContract The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Contract newContract, final ICallback<Contract> callback) {
        send(HttpMethod.POST, callback, newContract);
    }

    /**
     * Creates a Contract with a new object
     * @param newContract The new object to create
     * @return The created Contract
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Contract post(final Contract newContract) throws ClientException {
        return send(HttpMethod.POST, newContract);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IContractRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ContractRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IContractRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ContractRequest)this;
     }

}

