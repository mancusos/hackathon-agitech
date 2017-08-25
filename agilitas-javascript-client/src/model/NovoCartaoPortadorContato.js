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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiAgillitasCartesPrPagos) {
      root.ApiAgillitasCartesPrPagos = {};
    }
    root.ApiAgillitasCartesPrPagos.NovoCartaoPortadorContato = factory(root.ApiAgillitasCartesPrPagos.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NovoCartaoPortadorContato model module.
   * @module model/NovoCartaoPortadorContato
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>NovoCartaoPortadorContato</code>.
   * @alias module:model/NovoCartaoPortadorContato
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>NovoCartaoPortadorContato</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NovoCartaoPortadorContato} obj Optional instance to populate.
   * @return {module:model/NovoCartaoPortadorContato} The populated <code>NovoCartaoPortadorContato</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }
      if (data.hasOwnProperty('telResidencial')) {
        obj['telResidencial'] = ApiClient.convertToType(data['telResidencial'], 'String');
      }
      if (data.hasOwnProperty('telCelular')) {
        obj['telCelular'] = ApiClient.convertToType(data['telCelular'], 'String');
      }
    }
    return obj;
  }

  /**
   * Endereço  de email do portador do cartão.
   * @member {String} email
   */
  exports.prototype['email'] = undefined;
  /**
   * Telefone Residencial no formato: 01199999999. Não deve conter números sequenciais ou repetidos
   * @member {String} telResidencial
   */
  exports.prototype['telResidencial'] = undefined;
  /**
   * Telefone Celular no formato: 011999999999. Não deve conter números sequenciais ou repetidos
   * @member {String} telCelular
   */
  exports.prototype['telCelular'] = undefined;



  return exports;
}));


