# api_agillitas_cartes_pr_pagos

ApiAgillitasCartesPrPagos - JavaScript client for api_agillitas_cartes_pr_pagos
API para manipular recursos relacionadas aos  cartões pré-pagos Agillitas.
This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install api_agillitas_cartes_pr_pagos --save
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your api_agillitas_cartes_pr_pagos from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('api_agillitas_cartes_pr_pagos')` in javascript files from the directory you ran the last 
command above from.

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/YOUR_USERNAME/api_agillitas_cartes_pr_pagos
then install it via:

```shell
    npm install YOUR_USERNAME/api_agillitas_cartes_pr_pagos --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file, that's to say your javascript file where you actually 
use this library):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var ApiAgillitasCartesPrPagos = require('api_agillitas_cartes_pr_pagos');

var api = new ApiAgillitasCartesPrPagos.CartoesApi()

var clientId = "clientId_example"; // {String} Identificador do cliente utilizado na autenticação.

var accessToken = "accessToken_example"; // {String} Token de acesso utilizado na autenticação.

var idCartao = "idCartao_example"; // {String} Número identificador referente ao proxy localizado no verso do cartão.

var dataInicial = new Date("2013-10-20"); // {Date} Data inicial para a consulta (YYYY-MM-DD).

var dataFinal = new Date("2013-10-20"); // {Date} Data final para a consulta (YYYY-MM-DD)..


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.cartoesIdCartaoExtratoGet(clientId, accessToken, idCartao, dataInicial, dataFinal, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesIdCartaoExtratoGet**](docs/CartoesApi.md#cartoesIdCartaoExtratoGet) | **GET** /cartoes/{idCartao}/extrato | Consulta o extrato do cartão
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesIdCartaoPortadorGet**](docs/CartoesApi.md#cartoesIdCartaoPortadorGet) | **GET** /cartoes/{idCartao}/portador | Consuta informações do portador do cartão
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesIdCartaoSaldoGet**](docs/CartoesApi.md#cartoesIdCartaoSaldoGet) | **GET** /cartoes/{idCartao}/saldo | Consulta o saldo do cartão
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesIdCartaoSaldoPut**](docs/CartoesApi.md#cartoesIdCartaoSaldoPut) | **PUT** /cartoes/{idCartao}/saldo | Credita ou debita valor da conta de um cartão.
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesIdCartaoStatusGet**](docs/CartoesApi.md#cartoesIdCartaoStatusGet) | **GET** /cartoes/{idCartao}/status | Consulta o status do cartão
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesIdCartaoStatusPut**](docs/CartoesApi.md#cartoesIdCartaoStatusPut) | **PUT** /cartoes/{idCartao}/status | Altera status do cartão
*ApiAgillitasCartesPrPagos.CartoesApi* | [**cartoesPost**](docs/CartoesApi.md#cartoesPost) | **POST** /cartoes | Associa um número de proxy de cartão a um portador.
*ApiAgillitasCartesPrPagos.PagamentosApi* | [**pagamentosPost**](docs/PagamentosApi.md#pagamentosPost) | **POST** /pagamentos | Pagamento de boletos.
*ApiAgillitasCartesPrPagos.TransferenciasApi* | [**transferenciasCadastrosPost**](docs/TransferenciasApi.md#transferenciasCadastrosPost) | **POST** /transferencias/cadastros | Cadastro de beneficiário para Transferencia
*ApiAgillitasCartesPrPagos.TransferenciasApi* | [**transferenciasPost**](docs/TransferenciasApi.md#transferenciasPost) | **POST** /transferencias | Transferência de valores entre contas


## Documentation for Models

 - [ApiAgillitasCartesPrPagos.CadastroBenificiario](docs/CadastroBenificiario.md)
 - [ApiAgillitasCartesPrPagos.DetalhamentoExtrato](docs/DetalhamentoExtrato.md)
 - [ApiAgillitasCartesPrPagos.EnderecoPortador](docs/EnderecoPortador.md)
 - [ApiAgillitasCartesPrPagos.ExtratoResponse](docs/ExtratoResponse.md)
 - [ApiAgillitasCartesPrPagos.MsgErro](docs/MsgErro.md)
 - [ApiAgillitasCartesPrPagos.NovoCartao](docs/NovoCartao.md)
 - [ApiAgillitasCartesPrPagos.NovoCartaoPortador](docs/NovoCartaoPortador.md)
 - [ApiAgillitasCartesPrPagos.NovoCartaoPortadorContato](docs/NovoCartaoPortadorContato.md)
 - [ApiAgillitasCartesPrPagos.NovoCartaoPortadorEndereco](docs/NovoCartaoPortadorEndereco.md)
 - [ApiAgillitasCartesPrPagos.Pagamento](docs/Pagamento.md)
 - [ApiAgillitasCartesPrPagos.Portador](docs/Portador.md)
 - [ApiAgillitasCartesPrPagos.PortadorResponse](docs/PortadorResponse.md)
 - [ApiAgillitasCartesPrPagos.Saldo](docs/Saldo.md)
 - [ApiAgillitasCartesPrPagos.SetCardStatus](docs/SetCardStatus.md)
 - [ApiAgillitasCartesPrPagos.SetNovoCartao](docs/SetNovoCartao.md)
 - [ApiAgillitasCartesPrPagos.SetPagamento](docs/SetPagamento.md)
 - [ApiAgillitasCartesPrPagos.SetSaldo](docs/SetSaldo.md)
 - [ApiAgillitasCartesPrPagos.SetSaldoValor](docs/SetSaldoValor.md)
 - [ApiAgillitasCartesPrPagos.SetTransferencia](docs/SetTransferencia.md)
 - [ApiAgillitasCartesPrPagos.StatusCartaoResponse](docs/StatusCartaoResponse.md)
 - [ApiAgillitasCartesPrPagos.Transferencia](docs/Transferencia.md)
 - [ApiAgillitasCartesPrPagos.TransferenciaCadastroBenificiario](docs/TransferenciaCadastroBenificiario.md)
 - [ApiAgillitasCartesPrPagos.Valor](docs/Valor.md)


## Documentation for Authorization

 All endpoints do not require authorization.
