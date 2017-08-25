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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/CadastroBenificiario', 'model/DetalhamentoExtrato', 'model/EnderecoPortador', 'model/ExtratoResponse', 'model/MsgErro', 'model/NovoCartao', 'model/NovoCartaoPortador', 'model/NovoCartaoPortadorContato', 'model/NovoCartaoPortadorEndereco', 'model/Pagamento', 'model/Portador', 'model/PortadorResponse', 'model/Saldo', 'model/SetCardStatus', 'model/SetNovoCartao', 'model/SetPagamento', 'model/SetSaldo', 'model/SetSaldoValor', 'model/SetTransferencia', 'model/StatusCartaoResponse', 'model/Transferencia', 'model/TransferenciaCadastroBenificiario', 'model/Valor', 'api/CartoesApi', 'api/PagamentosApi', 'api/TransferenciasApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/CadastroBenificiario'), require('./model/DetalhamentoExtrato'), require('./model/EnderecoPortador'), require('./model/ExtratoResponse'), require('./model/MsgErro'), require('./model/NovoCartao'), require('./model/NovoCartaoPortador'), require('./model/NovoCartaoPortadorContato'), require('./model/NovoCartaoPortadorEndereco'), require('./model/Pagamento'), require('./model/Portador'), require('./model/PortadorResponse'), require('./model/Saldo'), require('./model/SetCardStatus'), require('./model/SetNovoCartao'), require('./model/SetPagamento'), require('./model/SetSaldo'), require('./model/SetSaldoValor'), require('./model/SetTransferencia'), require('./model/StatusCartaoResponse'), require('./model/Transferencia'), require('./model/TransferenciaCadastroBenificiario'), require('./model/Valor'), require('./api/CartoesApi'), require('./api/PagamentosApi'), require('./api/TransferenciasApi'));
  }
}(function(ApiClient, CadastroBenificiario, DetalhamentoExtrato, EnderecoPortador, ExtratoResponse, MsgErro, NovoCartao, NovoCartaoPortador, NovoCartaoPortadorContato, NovoCartaoPortadorEndereco, Pagamento, Portador, PortadorResponse, Saldo, SetCardStatus, SetNovoCartao, SetPagamento, SetSaldo, SetSaldoValor, SetTransferencia, StatusCartaoResponse, Transferencia, TransferenciaCadastroBenificiario, Valor, CartoesApi, PagamentosApi, TransferenciasApi) {
  'use strict';

  /**
   * API_para_manipular_recursos_relacionadas_aos__cartes_pr_pagos_Agillitas_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var ApiAgillitasCartesPrPagos = require('index'); // See note below*.
   * var xxxSvc = new ApiAgillitasCartesPrPagos.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new ApiAgillitasCartesPrPagos.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new ApiAgillitasCartesPrPagos.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new ApiAgillitasCartesPrPagos.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.0.0
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The CadastroBenificiario model constructor.
     * @property {module:model/CadastroBenificiario}
     */
    CadastroBenificiario: CadastroBenificiario,
    /**
     * The DetalhamentoExtrato model constructor.
     * @property {module:model/DetalhamentoExtrato}
     */
    DetalhamentoExtrato: DetalhamentoExtrato,
    /**
     * The EnderecoPortador model constructor.
     * @property {module:model/EnderecoPortador}
     */
    EnderecoPortador: EnderecoPortador,
    /**
     * The ExtratoResponse model constructor.
     * @property {module:model/ExtratoResponse}
     */
    ExtratoResponse: ExtratoResponse,
    /**
     * The MsgErro model constructor.
     * @property {module:model/MsgErro}
     */
    MsgErro: MsgErro,
    /**
     * The NovoCartao model constructor.
     * @property {module:model/NovoCartao}
     */
    NovoCartao: NovoCartao,
    /**
     * The NovoCartaoPortador model constructor.
     * @property {module:model/NovoCartaoPortador}
     */
    NovoCartaoPortador: NovoCartaoPortador,
    /**
     * The NovoCartaoPortadorContato model constructor.
     * @property {module:model/NovoCartaoPortadorContato}
     */
    NovoCartaoPortadorContato: NovoCartaoPortadorContato,
    /**
     * The NovoCartaoPortadorEndereco model constructor.
     * @property {module:model/NovoCartaoPortadorEndereco}
     */
    NovoCartaoPortadorEndereco: NovoCartaoPortadorEndereco,
    /**
     * The Pagamento model constructor.
     * @property {module:model/Pagamento}
     */
    Pagamento: Pagamento,
    /**
     * The Portador model constructor.
     * @property {module:model/Portador}
     */
    Portador: Portador,
    /**
     * The PortadorResponse model constructor.
     * @property {module:model/PortadorResponse}
     */
    PortadorResponse: PortadorResponse,
    /**
     * The Saldo model constructor.
     * @property {module:model/Saldo}
     */
    Saldo: Saldo,
    /**
     * The SetCardStatus model constructor.
     * @property {module:model/SetCardStatus}
     */
    SetCardStatus: SetCardStatus,
    /**
     * The SetNovoCartao model constructor.
     * @property {module:model/SetNovoCartao}
     */
    SetNovoCartao: SetNovoCartao,
    /**
     * The SetPagamento model constructor.
     * @property {module:model/SetPagamento}
     */
    SetPagamento: SetPagamento,
    /**
     * The SetSaldo model constructor.
     * @property {module:model/SetSaldo}
     */
    SetSaldo: SetSaldo,
    /**
     * The SetSaldoValor model constructor.
     * @property {module:model/SetSaldoValor}
     */
    SetSaldoValor: SetSaldoValor,
    /**
     * The SetTransferencia model constructor.
     * @property {module:model/SetTransferencia}
     */
    SetTransferencia: SetTransferencia,
    /**
     * The StatusCartaoResponse model constructor.
     * @property {module:model/StatusCartaoResponse}
     */
    StatusCartaoResponse: StatusCartaoResponse,
    /**
     * The Transferencia model constructor.
     * @property {module:model/Transferencia}
     */
    Transferencia: Transferencia,
    /**
     * The TransferenciaCadastroBenificiario model constructor.
     * @property {module:model/TransferenciaCadastroBenificiario}
     */
    TransferenciaCadastroBenificiario: TransferenciaCadastroBenificiario,
    /**
     * The Valor model constructor.
     * @property {module:model/Valor}
     */
    Valor: Valor,
    /**
     * The CartoesApi service constructor.
     * @property {module:api/CartoesApi}
     */
    CartoesApi: CartoesApi,
    /**
     * The PagamentosApi service constructor.
     * @property {module:api/PagamentosApi}
     */
    PagamentosApi: PagamentosApi,
    /**
     * The TransferenciasApi service constructor.
     * @property {module:api/TransferenciasApi}
     */
    TransferenciasApi: TransferenciasApi
  };

  return exports;
}));