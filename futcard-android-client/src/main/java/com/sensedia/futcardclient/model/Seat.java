/**
 * API do Futebolcard
 * Futebolcard manipulation API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sensedia.futcardclient.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Seat {
  
  @SerializedName("ticketId")
  private String ticketId = null;
  @SerializedName("ticketStatus")
  private String ticketStatus = null;
  @SerializedName("ownerId")
  private String ownerId = null;
  @SerializedName("seatNumber")
  private String seatNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTicketId() {
    return ticketId;
  }
  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTicketStatus() {
    return ticketStatus;
  }
  public void setTicketStatus(String ticketStatus) {
    this.ticketStatus = ticketStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSeatNumber() {
    return seatNumber;
  }
  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seat seat = (Seat) o;
    return (this.ticketId == null ? seat.ticketId == null : this.ticketId.equals(seat.ticketId)) &&
        (this.ticketStatus == null ? seat.ticketStatus == null : this.ticketStatus.equals(seat.ticketStatus)) &&
        (this.ownerId == null ? seat.ownerId == null : this.ownerId.equals(seat.ownerId)) &&
        (this.seatNumber == null ? seat.seatNumber == null : this.seatNumber.equals(seat.seatNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.ticketId == null ? 0: this.ticketId.hashCode());
    result = 31 * result + (this.ticketStatus == null ? 0: this.ticketStatus.hashCode());
    result = 31 * result + (this.ownerId == null ? 0: this.ownerId.hashCode());
    result = 31 * result + (this.seatNumber == null ? 0: this.seatNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seat {\n");
    
    sb.append("  ticketId: ").append(ticketId).append("\n");
    sb.append("  ticketStatus: ").append(ticketStatus).append("\n");
    sb.append("  ownerId: ").append(ownerId).append("\n");
    sb.append("  seatNumber: ").append(seatNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}