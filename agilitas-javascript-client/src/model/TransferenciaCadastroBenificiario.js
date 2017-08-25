/**
 * API Agillitas Cartões Pré-pagos
 * API para manipular recursos relacionadas aos  cartões pré-pagos Agillitas.
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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/CadastroBenificiario'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CadastroBenificiario'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiAgillitasCartesPrPagos) {
      root.ApiAgillitasCartesPrPagos = {};
    }
    root.ApiAgillitasCartesPrPagos.TransferenciaCadastroBenificiario = factory(root.ApiAgillitasCartesPrPagos.ApiClient, root.ApiAgillitasCartesPrPagos.CadastroBenificiario);
  }
}(this, function(ApiClient, CadastroBenificiario) {
  'use strict';




  /**
   * The TransferenciaCadastroBenificiario model module.
   * @module model/TransferenciaCadastroBenificiario
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>TransferenciaCadastroBenificiario</code>.
   * @alias module:model/TransferenciaCadastroBenificiario
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>TransferenciaCadastroBenificiario</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TransferenciaCadastroBenificiario} obj Optional instance to populate.
   * @return {module:model/TransferenciaCadastroBenificiario} The populated <code>TransferenciaCadastroBenificiario</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('beneficiario')) {
        obj['beneficiario'] = CadastroBenificiario.constructFromObject(data['beneficiario']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/CadastroBenificiario} beneficiario
   */
  exports.prototype['beneficiario'] = undefined;



  return exports;
}));


