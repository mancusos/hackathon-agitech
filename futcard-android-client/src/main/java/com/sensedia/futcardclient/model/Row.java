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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Row {
  
  @SerializedName("rowId")
  private String rowId = null;
  @SerializedName("rowAlias")
  private String rowAlias = null;
  @SerializedName("rowName")
  private String rowName = null;
  @SerializedName("seats")
  private List<Seat> seats = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRowId() {
    return rowId;
  }
  public void setRowId(String rowId) {
    this.rowId = rowId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRowAlias() {
    return rowAlias;
  }
  public void setRowAlias(String rowAlias) {
    this.rowAlias = rowAlias;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRowName() {
    return rowName;
  }
  public void setRowName(String rowName) {
    this.rowName = rowName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Seat> getSeats() {
    return seats;
  }
  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return (this.rowId == null ? row.rowId == null : this.rowId.equals(row.rowId)) &&
        (this.rowAlias == null ? row.rowAlias == null : this.rowAlias.equals(row.rowAlias)) &&
        (this.rowName == null ? row.rowName == null : this.rowName.equals(row.rowName)) &&
        (this.seats == null ? row.seats == null : this.seats.equals(row.seats));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.rowId == null ? 0: this.rowId.hashCode());
    result = 31 * result + (this.rowAlias == null ? 0: this.rowAlias.hashCode());
    result = 31 * result + (this.rowName == null ? 0: this.rowName.hashCode());
    result = 31 * result + (this.seats == null ? 0: this.seats.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("  rowId: ").append(rowId).append("\n");
    sb.append("  rowAlias: ").append(rowAlias).append("\n");
    sb.append("  rowName: ").append(rowName).append("\n");
    sb.append("  seats: ").append(seats).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
