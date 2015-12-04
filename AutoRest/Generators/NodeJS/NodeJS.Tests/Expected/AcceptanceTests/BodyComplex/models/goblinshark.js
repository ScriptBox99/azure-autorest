/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the Goblinshark class.
 * @constructor
 * @member {number} [jawsize]
 * 
 */
function Goblinshark(parameters) {
  Goblinshark['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.jawsize !== undefined) {
      this.jawsize = parameters.jawsize;
    }
  }    
}

util.inherits(Goblinshark, models['Shark']);

/**
 * Validate the payload against the Goblinshark schema
 *
 * @param {JSON} payload
 *
 */
Goblinshark.prototype.serialize = function () {
  var payload = Goblinshark['super_'].prototype.serialize.call(this);
  if (this['jawsize'] !== null && this['jawsize'] !== undefined) {
    if (typeof this['jawsize'] !== 'number') {
      throw new Error('this[\'jawsize\'] must be of type number.');
    }
    payload['jawsize'] = this['jawsize'];
  }

  return payload;
};

/**
 * Deserialize the instance to Goblinshark schema
 *
 * @param {JSON} instance
 *
 */
Goblinshark.prototype.deserialize = function (instance) {
  Goblinshark['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['jawsize'] !== undefined) {
      this['jawsize'] = instance['jawsize'];
    }
  }

  return this;
};

module.exports = Goblinshark;