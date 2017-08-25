/**
 * API dos Correios
 * API de rastreios de Objetos Postais
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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiDosCorreios) {
      root.ApiDosCorreios = {};
    }
    root.ApiDosCorreios.Erro = factory(root.ApiDosCorreios.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Erro model module.
   * @module model/Erro
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Erro</code>.
   * @alias module:model/Erro
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Erro</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Erro} obj Optional instance to populate.
   * @return {module:model/Erro} The populated <code>Erro</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('resultado')) {
        obj['resultado'] = ApiClient.convertToType(data['resultado'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('detalhes')) {
        obj['detalhes'] = ApiClient.convertToType(data['detalhes'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} resultado
   */
  exports.prototype['resultado'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {String} detalhes
   */
  exports.prototype['detalhes'] = undefined;



  return exports;
}));

