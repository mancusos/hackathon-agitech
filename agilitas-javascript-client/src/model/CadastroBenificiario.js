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
    root.ApiAgillitasCartesPrPagos.CadastroBenificiario = factory(root.ApiAgillitasCartesPrPagos.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CadastroBenificiario model module.
   * @module model/CadastroBenificiario
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>CadastroBenificiario</code>.
   * @alias module:model/CadastroBenificiario
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>CadastroBenificiario</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CadastroBenificiario} obj Optional instance to populate.
   * @return {module:model/CadastroBenificiario} The populated <code>CadastroBenificiario</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('idCartao')) {
        obj['idCartao'] = ApiClient.convertToType(data['idCartao'], 'String');
      }
      if (data.hasOwnProperty('idCartaoDestino')) {
        obj['idCartaoDestino'] = ApiClient.convertToType(data['idCartaoDestino'], 'String');
      }
      if (data.hasOwnProperty('nome')) {
        obj['nome'] = ApiClient.convertToType(data['nome'], 'String');
      }
      if (data.hasOwnProperty('cpf')) {
        obj['cpf'] = ApiClient.convertToType(data['cpf'], 'String');
      }
    }
    return obj;
  }

  /**
   * número identificador referente ao proxy do cartão origem de transferência.
   * @member {String} idCartao
   */
  exports.prototype['idCartao'] = undefined;
  /**
   * número identificador referente ao proxy do cartão destino de transferência.
   * @member {String} idCartaoDestino
   */
  exports.prototype['idCartaoDestino'] = undefined;
  /**
   * Nome completo do beneficiário da transferência.
   * @member {String} nome
   */
  exports.prototype['nome'] = undefined;
  /**
   * Numero do cadastro de pessoas física do beneficiário da transferência.  Não deve conter pontos ou hífen.
   * @member {String} cpf
   */
  exports.prototype['cpf'] = undefined;



  return exports;
}));


