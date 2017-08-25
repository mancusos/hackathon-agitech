/*
 * API do Futebolcard
 * Futebolcard manipulation API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EventseventIdsectorssectorIdsubsectorssubsectorIdSeats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T10:50:44.652Z")
public class EventseventIdsectorssectorIdsubsectorssubsectorIdSeats {
  @SerializedName("ticketId")
  private String ticketId = null;

  @SerializedName("ticketStatus")
  private String ticketStatus = null;

  @SerializedName("ownerId")
  private String ownerId = null;

  @SerializedName("seatNumber")
  private String seatNumber = null;

  public EventseventIdsectorssectorIdsubsectorssubsectorIdSeats ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Get ticketId
   * @return ticketId
  **/
  @ApiModelProperty(example = "29334029", value = "")
  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public EventseventIdsectorssectorIdsubsectorssubsectorIdSeats ticketStatus(String ticketStatus) {
    this.ticketStatus = ticketStatus;
    return this;
  }

   /**
   * Get ticketStatus
   * @return ticketStatus
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getTicketStatus() {
    return ticketStatus;
  }

  public void setTicketStatus(String ticketStatus) {
    this.ticketStatus = ticketStatus;
  }

  public EventseventIdsectorssectorIdsubsectorssubsectorIdSeats ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public EventseventIdsectorssectorIdsubsectorssubsectorIdSeats seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

   /**
   * Get seatNumber
   * @return seatNumber
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventseventIdsectorssectorIdsubsectorssubsectorIdSeats eventseventIdsectorssectorIdsubsectorssubsectorIdSeats = (EventseventIdsectorssectorIdsubsectorssubsectorIdSeats) o;
    return Objects.equals(this.ticketId, eventseventIdsectorssectorIdsubsectorssubsectorIdSeats.ticketId) &&
        Objects.equals(this.ticketStatus, eventseventIdsectorssectorIdsubsectorssubsectorIdSeats.ticketStatus) &&
        Objects.equals(this.ownerId, eventseventIdsectorssectorIdsubsectorssubsectorIdSeats.ownerId) &&
        Objects.equals(this.seatNumber, eventseventIdsectorssectorIdsubsectorssubsectorIdSeats.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, ticketStatus, ownerId, seatNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventseventIdsectorssectorIdsubsectorssubsectorIdSeats {\n");
    
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    ticketStatus: ").append(toIndentedString(ticketStatus)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

