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
public class NovoCartaoPortadorContato {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("telResidencial")
  private String telResidencial = null;
  @SerializedName("telCelular")
  private String telCelular = null;

  /**
   * Endereço  de email do portador do cartão.
   **/
  @ApiModelProperty(value = "Endereço  de email do portador do cartão.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Telefone Residencial no formato: 01199999999. Não deve conter números sequenciais ou repetidos
   **/
  @ApiModelProperty(value = "Telefone Residencial no formato: 01199999999. Não deve conter números sequenciais ou repetidos")
  public String getTelResidencial() {
    return telResidencial;
  }
  public void setTelResidencial(String telResidencial) {
    this.telResidencial = telResidencial;
  }

  /**
   * Telefone Celular no formato: 011999999999. Não deve conter números sequenciais ou repetidos
   **/
  @ApiModelProperty(value = "Telefone Celular no formato: 011999999999. Não deve conter números sequenciais ou repetidos")
  public String getTelCelular() {
    return telCelular;
  }
  public void setTelCelular(String telCelular) {
    this.telCelular = telCelular;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartaoPortadorContato novoCartaoPortadorContato = (NovoCartaoPortadorContato) o;
    return (this.email == null ? novoCartaoPortadorContato.email == null : this.email.equals(novoCartaoPortadorContato.email)) &&
        (this.telResidencial == null ? novoCartaoPortadorContato.telResidencial == null : this.telResidencial.equals(novoCartaoPortadorContato.telResidencial)) &&
        (this.telCelular == null ? novoCartaoPortadorContato.telCelular == null : this.telCelular.equals(novoCartaoPortadorContato.telCelular));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.telResidencial == null ? 0: this.telResidencial.hashCode());
    result = 31 * result + (this.telCelular == null ? 0: this.telCelular.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartaoPortadorContato {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  telResidencial: ").append(telResidencial).append("\n");
    sb.append("  telCelular: ").append(telCelular).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}