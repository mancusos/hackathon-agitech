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
public class SetTransferencia {
  
  @SerializedName("idCartao")
  private String idCartao = null;
  @SerializedName("idCartaoDestino")
  private String idCartaoDestino = null;
  @SerializedName("valor")
  private Double valor = null;
  @SerializedName("senha")
  private String senha = null;

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
   * Valor monetário  a ser transferido.
   **/
  @ApiModelProperty(value = "Valor monetário  a ser transferido.")
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }

  /**
   * Senha do cartão.
   **/
  @ApiModelProperty(value = "Senha do cartão.")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetTransferencia setTransferencia = (SetTransferencia) o;
    return (this.idCartao == null ? setTransferencia.idCartao == null : this.idCartao.equals(setTransferencia.idCartao)) &&
        (this.idCartaoDestino == null ? setTransferencia.idCartaoDestino == null : this.idCartaoDestino.equals(setTransferencia.idCartaoDestino)) &&
        (this.valor == null ? setTransferencia.valor == null : this.valor.equals(setTransferencia.valor)) &&
        (this.senha == null ? setTransferencia.senha == null : this.senha.equals(setTransferencia.senha));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.idCartao == null ? 0: this.idCartao.hashCode());
    result = 31 * result + (this.idCartaoDestino == null ? 0: this.idCartaoDestino.hashCode());
    result = 31 * result + (this.valor == null ? 0: this.valor.hashCode());
    result = 31 * result + (this.senha == null ? 0: this.senha.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetTransferencia {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idCartaoDestino: ").append(idCartaoDestino).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
