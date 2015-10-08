/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in ByteOperations.
 */
public interface ByteOperations {
    /**
     * The interface defining all the services for ByteOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ByteService {
        @GET("/byte/null")
        Response getNull() throws ServiceException;

        @GET("/byte/null")
        void getNullAsync(ServiceResponseCallback cb);

        @GET("/byte/empty")
        Response getEmpty() throws ServiceException;

        @GET("/byte/empty")
        void getEmptyAsync(ServiceResponseCallback cb);

        @GET("/byte/nonAscii")
        Response getNonAscii() throws ServiceException;

        @GET("/byte/nonAscii")
        void getNonAsciiAsync(ServiceResponseCallback cb);

        @PUT("/byte/nonAscii")
        Response putNonAscii(@Body byte[] byteBody) throws ServiceException;

        @PUT("/byte/nonAscii")
        void putNonAsciiAsync(@Body byte[] byteBody, ServiceResponseCallback cb);

        @GET("/byte/invalid")
        Response getInvalid() throws ServiceException;

        @GET("/byte/invalid")
        void getInvalidAsync(ServiceResponseCallback cb);

    }
    /**
     * Get null byte value
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getNull() throws ServiceException;

    /**
     * Get null byte value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get empty byte value ''
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getEmpty() throws ServiceException;

    /**
     * Get empty byte value ''
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getEmptyAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getNonAscii() throws ServiceException;

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNonAsciiAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putNonAscii(byte[] byteBody) throws ServiceException;

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putNonAsciiAsync(byte[] byteBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get invalid byte value ':::SWAGGER::::'
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getInvalid() throws ServiceException;

    /**
     * Get invalid byte value ':::SWAGGER::::'
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getInvalidAsync(final ServiceCallback<byte[]> serviceCallback);

}