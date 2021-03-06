/**
 * API Agillitas Cartões Pré-pagos
 * API para manipular recursos relacionadas aos  cartões pré-pagos Agillitas.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.sensedia.agillitas.api.v1.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CadastroBenificiario {
  
  @SerializedName("idCartao")
  private String idCartao = null;
  @SerializedName("idCartaoDestino")
  private String idCartaoDestino = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("cpf")
  private String cpf = null;

  /**
   * número identificador referente ao proxy do cartão origem de transferência.
   **/
  @ApiModelProperty(value = "número identificador referente ao proxy do cartão origem de transferência.")
  public String getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(String idCartao) {
    this.idCartao = idCartao;
  }

  /**
   * número identificador referente ao proxy do cartão destino de transferência.
   **/
  @ApiModelProperty(value = "número identificador referente ao proxy do cartão destino de transferência.")
  public String getIdCartaoDestino() {
    return idCartaoDestino;
  }
  public void setIdCartaoDestino(String idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
  }

  /**
   * Nome completo do beneficiário da transferência.
   **/
  @ApiModelProperty(value = "Nome completo do beneficiário da transferência.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Numero do cadastro de pessoas física do beneficiário da transferência.  Não deve conter pontos ou hífen.
   **/
  @ApiModelProperty(value = "Numero do cadastro de pessoas física do beneficiário da transferência.  Não deve conter pontos ou hífen.")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadastroBenificiario cadastroBenificiario = (CadastroBenificiario) o;
    return (this.idCartao == null ? cadastroBenificiario.idCartao == null : this.idCartao.equals(cadastroBenificiario.idCartao)) &&
        (this.idCartaoDestino == null ? cadastroBenificiario.idCartaoDestino == null : this.idCartaoDestino.equals(cadastroBenificiario.idCartaoDestino)) &&
        (this.nome == null ? cadastroBenificiario.nome == null : this.nome.equals(cadastroBenificiario.nome)) &&
        (this.cpf == null ? cadastroBenificiario.cpf == null : this.cpf.equals(cadastroBenificiario.cpf));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.idCartao == null ? 0: this.idCartao.hashCode());
    result = 31 * result + (this.idCartaoDestino == null ? 0: this.idCartaoDestino.hashCode());
    result = 31 * result + (this.nome == null ? 0: this.nome.hashCode());
    result = 31 * result + (this.cpf == null ? 0: this.cpf.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadastroBenificiario {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idCartaoDestino: ").append(idCartaoDestino).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
