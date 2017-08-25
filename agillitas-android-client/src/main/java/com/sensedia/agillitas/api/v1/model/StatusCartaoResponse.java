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
public class StatusCartaoResponse {
  
  @SerializedName("status")
  private String status = null;

  /**
   * Status relacionado a um cartão (bloqueado, desbloqueadoReativo ou cancelado)
   **/
  @ApiModelProperty(value = "Status relacionado a um cartão (bloqueado, desbloqueadoReativo ou cancelado)")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCartaoResponse statusCartaoResponse = (StatusCartaoResponse) o;
    return (this.status == null ? statusCartaoResponse.status == null : this.status.equals(statusCartaoResponse.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCartaoResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
