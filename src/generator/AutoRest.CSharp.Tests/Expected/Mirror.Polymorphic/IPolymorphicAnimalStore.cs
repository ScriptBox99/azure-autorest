// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.MirrorPolymorphic
{
    using Models;

    /// <summary>
    /// Some cool documentation.
    /// </summary>
    public partial interface IPolymorphicAnimalStore : System.IDisposable
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        System.Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        Newtonsoft.Json.JsonSerializerSettings SerializationSettings { get; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        Newtonsoft.Json.JsonSerializerSettings DeserializationSettings { get; }


        /// <summary>
        /// Product Types
        /// </summary>
        /// <remarks>
        /// The Products endpoint returns information about the Uber products
        /// offered at a given location. The response includes the display name
        /// and other details about each product, and lists the products in the
        /// proper display order.
        /// </remarks>
        /// <param name='animalCreateOrUpdateParameter'>
        /// An Animal
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<Animal>> CreateOrUpdatePolymorphicAnimalsWithHttpMessagesAsync(Animal animalCreateOrUpdateParameter = default(Animal), System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

    }
}