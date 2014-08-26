/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Unsorted.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.*;
import static com.squareup.wire.Message.Label.REPEATED;

public final class GetMarketMetadataRequestProto extends Message {

  public static final Long DEFAULT_LASTREQUESTTIME = 0L;
  public static final Boolean DEFAULT_DEVICEROAMING = false;
  public static final List<String> DEFAULT_MARKETSIGNATUREHASH = Collections.emptyList();
  public static final Integer DEFAULT_CONTENTRATING = 0;
  public static final String DEFAULT_DEVICEMODELNAME = "";
  public static final String DEFAULT_DEVICEMANUFACTURERNAME = "";

  @ProtoField(tag = 1, type = INT64)
  public final Long lastRequestTime;

  @ProtoField(tag = 2)
  public final DeviceConfig deviceConfiguration;

  @ProtoField(tag = 3, type = BOOL)
  public final Boolean deviceRoaming;

  @ProtoField(tag = 4, type = STRING, label = REPEATED)
  public final List<String> marketSignatureHash;

  @ProtoField(tag = 5, type = INT32)
  public final Integer contentRating;

  @ProtoField(tag = 6, type = STRING)
  public final String deviceModelName;

  @ProtoField(tag = 7, type = STRING)
  public final String deviceManufacturerName;

  public GetMarketMetadataRequestProto(Long lastRequestTime, DeviceConfig deviceConfiguration, Boolean deviceRoaming, List<String> marketSignatureHash, Integer contentRating, String deviceModelName, String deviceManufacturerName) {
    this.lastRequestTime = lastRequestTime;
    this.deviceConfiguration = deviceConfiguration;
    this.deviceRoaming = deviceRoaming;
    this.marketSignatureHash = immutableCopyOf(marketSignatureHash);
    this.contentRating = contentRating;
    this.deviceModelName = deviceModelName;
    this.deviceManufacturerName = deviceManufacturerName;
  }

  private GetMarketMetadataRequestProto(Builder builder) {
    this(builder.lastRequestTime, builder.deviceConfiguration, builder.deviceRoaming, builder.marketSignatureHash, builder.contentRating, builder.deviceModelName, builder.deviceManufacturerName);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetMarketMetadataRequestProto)) return false;
    GetMarketMetadataRequestProto o = (GetMarketMetadataRequestProto) other;
    return equals(lastRequestTime, o.lastRequestTime)
        && equals(deviceConfiguration, o.deviceConfiguration)
        && equals(deviceRoaming, o.deviceRoaming)
        && equals(marketSignatureHash, o.marketSignatureHash)
        && equals(contentRating, o.contentRating)
        && equals(deviceModelName, o.deviceModelName)
        && equals(deviceManufacturerName, o.deviceManufacturerName);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = lastRequestTime != null ? lastRequestTime.hashCode() : 0;
      result = result * 37 + (deviceConfiguration != null ? deviceConfiguration.hashCode() : 0);
      result = result * 37 + (deviceRoaming != null ? deviceRoaming.hashCode() : 0);
      result = result * 37 + (marketSignatureHash != null ? marketSignatureHash.hashCode() : 1);
      result = result * 37 + (contentRating != null ? contentRating.hashCode() : 0);
      result = result * 37 + (deviceModelName != null ? deviceModelName.hashCode() : 0);
      result = result * 37 + (deviceManufacturerName != null ? deviceManufacturerName.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetMarketMetadataRequestProto> {

    public Long lastRequestTime;
    public DeviceConfig deviceConfiguration;
    public Boolean deviceRoaming;
    public List<String> marketSignatureHash;
    public Integer contentRating;
    public String deviceModelName;
    public String deviceManufacturerName;

    public Builder() {
    }

    public Builder(GetMarketMetadataRequestProto message) {
      super(message);
      if (message == null) return;
      this.lastRequestTime = message.lastRequestTime;
      this.deviceConfiguration = message.deviceConfiguration;
      this.deviceRoaming = message.deviceRoaming;
      this.marketSignatureHash = copyOf(message.marketSignatureHash);
      this.contentRating = message.contentRating;
      this.deviceModelName = message.deviceModelName;
      this.deviceManufacturerName = message.deviceManufacturerName;
    }

    public Builder lastRequestTime(Long lastRequestTime) {
      this.lastRequestTime = lastRequestTime;
      return this;
    }

    public Builder deviceConfiguration(DeviceConfig deviceConfiguration) {
      this.deviceConfiguration = deviceConfiguration;
      return this;
    }

    public Builder deviceRoaming(Boolean deviceRoaming) {
      this.deviceRoaming = deviceRoaming;
      return this;
    }

    public Builder marketSignatureHash(List<String> marketSignatureHash) {
      this.marketSignatureHash = checkForNulls(marketSignatureHash);
      return this;
    }

    public Builder contentRating(Integer contentRating) {
      this.contentRating = contentRating;
      return this;
    }

    public Builder deviceModelName(String deviceModelName) {
      this.deviceModelName = deviceModelName;
      return this;
    }

    public Builder deviceManufacturerName(String deviceManufacturerName) {
      this.deviceManufacturerName = deviceManufacturerName;
      return this;
    }

    @Override
    public GetMarketMetadataRequestProto build() {
      return new GetMarketMetadataRequestProto(this);
    }
  }
}
