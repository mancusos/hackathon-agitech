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

import com.sensedia.agillitas.api.v1.model.NovoCartao;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SetNovoCartao {
  
  @SerializedName("cartao")
  private NovoCartao cartao = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public NovoCartao getCartao() {
    return cartao;
  }
  public void setCartao(NovoCartao cartao) {
    this.cartao = cartao;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetNovoCartao setNovoCartao = (SetNovoCartao) o;
    return (this.cartao == null ? setNovoCartao.cartao == null : this.cartao.equals(setNovoCartao.cartao));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cartao == null ? 0: this.cartao.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetNovoCartao {\n");
    
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
