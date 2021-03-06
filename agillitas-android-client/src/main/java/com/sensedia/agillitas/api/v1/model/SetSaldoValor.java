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
public class SetSaldoValor {
  
  @SerializedName("valor")
  private Double valor = null;

  /**
   * Valor monetário  a ser creditado (valor positivo) ou debitado (valor negativo) na conta do cartão.
   **/
  @ApiModelProperty(value = "Valor monetário  a ser creditado (valor positivo) ou debitado (valor negativo) na conta do cartão.")
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSaldoValor setSaldoValor = (SetSaldoValor) o;
    return (this.valor == null ? setSaldoValor.valor == null : this.valor.equals(setSaldoValor.valor));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.valor == null ? 0: this.valor.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSaldoValor {\n");
    
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
