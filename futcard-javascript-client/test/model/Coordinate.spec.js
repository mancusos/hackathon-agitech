/**
 * API do Futebolcard
 * Futebolcard manipulation API
 *
 * OpenAPI spec version: 1.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ApiDoFutebolcard);
  }
}(this, function(expect, ApiDoFutebolcard) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ApiDoFutebolcard.Coordinate();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Coordinate', function() {
    it('should create an instance of Coordinate', function() {
      // uncomment below and update the code to test Coordinate
      //var instane = new ApiDoFutebolcard.Coordinate();
      //expect(instance).to.be.a(ApiDoFutebolcard.Coordinate);
    });

    it('should have the property sectorId (base name: "sectorId")', function() {
      // uncomment below and update the code to test the property sectorId
      //var instane = new ApiDoFutebolcard.Coordinate();
      //expect(instance).to.be();
    });

    it('should have the property coordinate (base name: "coordinate")', function() {
      // uncomment below and update the code to test the property coordinate
      //var instane = new ApiDoFutebolcard.Coordinate();
      //expect(instance).to.be();
    });

    it('should have the property shape (base name: "shape")', function() {
      // uncomment below and update the code to test the property shape
      //var instane = new ApiDoFutebolcard.Coordinate();
      //expect(instance).to.be();
    });

  });

}));
