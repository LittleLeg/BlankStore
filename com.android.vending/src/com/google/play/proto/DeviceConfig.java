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

public final class DeviceConfig extends Message {

  public static final Integer DEFAULT_TOUCHSCREEN = 0;
  public static final Integer DEFAULT_KEYBOARDTYPE = 0;
  public static final Integer DEFAULT_NAVIGATION = 0;
  public static final Integer DEFAULT_SCREENLAYOUT = 0;
  public static final Boolean DEFAULT_HASHARDKEYBOARD = false;
  public static final Boolean DEFAULT_HASFIVEWAYNAVIGATION = false;
  public static final Integer DEFAULT_DENSITYDPI = 0;
  public static final Integer DEFAULT_GLESVERSION = 0;
  public static final List<String> DEFAULT_SHAREDLIBRARY = Collections.emptyList();
  public static final List<String> DEFAULT_AVAILABLEFEATURE = Collections.emptyList();
  public static final List<String> DEFAULT_NATIVEPLATFORM = Collections.emptyList();
  public static final Integer DEFAULT_WIDTHPIXELS = 0;
  public static final Integer DEFAULT_HEIGHTPIXELS = 0;
  public static final List<String> DEFAULT_LOCALE = Collections.emptyList();
  public static final List<String> DEFAULT_GLEXTENSION = Collections.emptyList();
  public static final Integer DEFAULT_DEVICECLASS = 0;
  public static final Integer DEFAULT_MAXAPKDOWNLOADSIZEMB = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer touchScreen;

  @ProtoField(tag = 2, type = INT32)
  public final Integer keyboardType;

  @ProtoField(tag = 3, type = INT32)
  public final Integer navigation;

  @ProtoField(tag = 4, type = INT32)
  public final Integer screenLayout;

  @ProtoField(tag = 5, type = BOOL)
  public final Boolean hasHardKeyboard;

  @ProtoField(tag = 6, type = BOOL)
  public final Boolean hasFiveWayNavigation;

  @ProtoField(tag = 7, type = INT32)
  public final Integer densityDpi;

  @ProtoField(tag = 8, type = INT32)
  public final Integer glEsVersion;

  @ProtoField(tag = 9, type = STRING, label = REPEATED)
  public final List<String> sharedLibrary;

  @ProtoField(tag = 10, type = STRING, label = REPEATED)
  public final List<String> availableFeature;

  @ProtoField(tag = 11, type = STRING, label = REPEATED)
  public final List<String> nativePlatform;

  @ProtoField(tag = 12, type = INT32)
  public final Integer widthPixels;

  @ProtoField(tag = 13, type = INT32)
  public final Integer heightPixels;

  @ProtoField(tag = 14, type = STRING, label = REPEATED)
  public final List<String> locale;

  @ProtoField(tag = 15, type = STRING, label = REPEATED)
  public final List<String> glExtension;

  @ProtoField(tag = 16, type = INT32)
  public final Integer deviceClass;

  @ProtoField(tag = 17, type = INT32)
  public final Integer maxApkDownloadSizeMb;

  public DeviceConfig(Integer touchScreen, Integer keyboardType, Integer navigation, Integer screenLayout, Boolean hasHardKeyboard, Boolean hasFiveWayNavigation, Integer densityDpi, Integer glEsVersion, List<String> sharedLibrary, List<String> availableFeature, List<String> nativePlatform, Integer widthPixels, Integer heightPixels, List<String> locale, List<String> glExtension, Integer deviceClass, Integer maxApkDownloadSizeMb) {
    this.touchScreen = touchScreen;
    this.keyboardType = keyboardType;
    this.navigation = navigation;
    this.screenLayout = screenLayout;
    this.hasHardKeyboard = hasHardKeyboard;
    this.hasFiveWayNavigation = hasFiveWayNavigation;
    this.densityDpi = densityDpi;
    this.glEsVersion = glEsVersion;
    this.sharedLibrary = immutableCopyOf(sharedLibrary);
    this.availableFeature = immutableCopyOf(availableFeature);
    this.nativePlatform = immutableCopyOf(nativePlatform);
    this.widthPixels = widthPixels;
    this.heightPixels = heightPixels;
    this.locale = immutableCopyOf(locale);
    this.glExtension = immutableCopyOf(glExtension);
    this.deviceClass = deviceClass;
    this.maxApkDownloadSizeMb = maxApkDownloadSizeMb;
  }

  private DeviceConfig(Builder builder) {
    this(builder.touchScreen, builder.keyboardType, builder.navigation, builder.screenLayout, builder.hasHardKeyboard, builder.hasFiveWayNavigation, builder.densityDpi, builder.glEsVersion, builder.sharedLibrary, builder.availableFeature, builder.nativePlatform, builder.widthPixels, builder.heightPixels, builder.locale, builder.glExtension, builder.deviceClass, builder.maxApkDownloadSizeMb);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DeviceConfig)) return false;
    DeviceConfig o = (DeviceConfig) other;
    return equals(touchScreen, o.touchScreen)
        && equals(keyboardType, o.keyboardType)
        && equals(navigation, o.navigation)
        && equals(screenLayout, o.screenLayout)
        && equals(hasHardKeyboard, o.hasHardKeyboard)
        && equals(hasFiveWayNavigation, o.hasFiveWayNavigation)
        && equals(densityDpi, o.densityDpi)
        && equals(glEsVersion, o.glEsVersion)
        && equals(sharedLibrary, o.sharedLibrary)
        && equals(availableFeature, o.availableFeature)
        && equals(nativePlatform, o.nativePlatform)
        && equals(widthPixels, o.widthPixels)
        && equals(heightPixels, o.heightPixels)
        && equals(locale, o.locale)
        && equals(glExtension, o.glExtension)
        && equals(deviceClass, o.deviceClass)
        && equals(maxApkDownloadSizeMb, o.maxApkDownloadSizeMb);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = touchScreen != null ? touchScreen.hashCode() : 0;
      result = result * 37 + (keyboardType != null ? keyboardType.hashCode() : 0);
      result = result * 37 + (navigation != null ? navigation.hashCode() : 0);
      result = result * 37 + (screenLayout != null ? screenLayout.hashCode() : 0);
      result = result * 37 + (hasHardKeyboard != null ? hasHardKeyboard.hashCode() : 0);
      result = result * 37 + (hasFiveWayNavigation != null ? hasFiveWayNavigation.hashCode() : 0);
      result = result * 37 + (densityDpi != null ? densityDpi.hashCode() : 0);
      result = result * 37 + (glEsVersion != null ? glEsVersion.hashCode() : 0);
      result = result * 37 + (sharedLibrary != null ? sharedLibrary.hashCode() : 1);
      result = result * 37 + (availableFeature != null ? availableFeature.hashCode() : 1);
      result = result * 37 + (nativePlatform != null ? nativePlatform.hashCode() : 1);
      result = result * 37 + (widthPixels != null ? widthPixels.hashCode() : 0);
      result = result * 37 + (heightPixels != null ? heightPixels.hashCode() : 0);
      result = result * 37 + (locale != null ? locale.hashCode() : 1);
      result = result * 37 + (glExtension != null ? glExtension.hashCode() : 1);
      result = result * 37 + (deviceClass != null ? deviceClass.hashCode() : 0);
      result = result * 37 + (maxApkDownloadSizeMb != null ? maxApkDownloadSizeMb.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<DeviceConfig> {

    public Integer touchScreen;
    public Integer keyboardType;
    public Integer navigation;
    public Integer screenLayout;
    public Boolean hasHardKeyboard;
    public Boolean hasFiveWayNavigation;
    public Integer densityDpi;
    public Integer glEsVersion;
    public List<String> sharedLibrary;
    public List<String> availableFeature;
    public List<String> nativePlatform;
    public Integer widthPixels;
    public Integer heightPixels;
    public List<String> locale;
    public List<String> glExtension;
    public Integer deviceClass;
    public Integer maxApkDownloadSizeMb;

    public Builder() {
    }

    public Builder(DeviceConfig message) {
      super(message);
      if (message == null) return;
      this.touchScreen = message.touchScreen;
      this.keyboardType = message.keyboardType;
      this.navigation = message.navigation;
      this.screenLayout = message.screenLayout;
      this.hasHardKeyboard = message.hasHardKeyboard;
      this.hasFiveWayNavigation = message.hasFiveWayNavigation;
      this.densityDpi = message.densityDpi;
      this.glEsVersion = message.glEsVersion;
      this.sharedLibrary = copyOf(message.sharedLibrary);
      this.availableFeature = copyOf(message.availableFeature);
      this.nativePlatform = copyOf(message.nativePlatform);
      this.widthPixels = message.widthPixels;
      this.heightPixels = message.heightPixels;
      this.locale = copyOf(message.locale);
      this.glExtension = copyOf(message.glExtension);
      this.deviceClass = message.deviceClass;
      this.maxApkDownloadSizeMb = message.maxApkDownloadSizeMb;
    }

    public Builder touchScreen(Integer touchScreen) {
      this.touchScreen = touchScreen;
      return this;
    }

    public Builder keyboardType(Integer keyboardType) {
      this.keyboardType = keyboardType;
      return this;
    }

    public Builder navigation(Integer navigation) {
      this.navigation = navigation;
      return this;
    }

    public Builder screenLayout(Integer screenLayout) {
      this.screenLayout = screenLayout;
      return this;
    }

    public Builder hasHardKeyboard(Boolean hasHardKeyboard) {
      this.hasHardKeyboard = hasHardKeyboard;
      return this;
    }

    public Builder hasFiveWayNavigation(Boolean hasFiveWayNavigation) {
      this.hasFiveWayNavigation = hasFiveWayNavigation;
      return this;
    }

    public Builder densityDpi(Integer densityDpi) {
      this.densityDpi = densityDpi;
      return this;
    }

    public Builder glEsVersion(Integer glEsVersion) {
      this.glEsVersion = glEsVersion;
      return this;
    }

    public Builder sharedLibrary(List<String> sharedLibrary) {
      this.sharedLibrary = checkForNulls(sharedLibrary);
      return this;
    }

    public Builder availableFeature(List<String> availableFeature) {
      this.availableFeature = checkForNulls(availableFeature);
      return this;
    }

    public Builder nativePlatform(List<String> nativePlatform) {
      this.nativePlatform = checkForNulls(nativePlatform);
      return this;
    }

    public Builder widthPixels(Integer widthPixels) {
      this.widthPixels = widthPixels;
      return this;
    }

    public Builder heightPixels(Integer heightPixels) {
      this.heightPixels = heightPixels;
      return this;
    }

    public Builder locale(List<String> locale) {
      this.locale = checkForNulls(locale);
      return this;
    }

    public Builder glExtension(List<String> glExtension) {
      this.glExtension = checkForNulls(glExtension);
      return this;
    }

    public Builder deviceClass(Integer deviceClass) {
      this.deviceClass = deviceClass;
      return this;
    }

    public Builder maxApkDownloadSizeMb(Integer maxApkDownloadSizeMb) {
      this.maxApkDownloadSizeMb = maxApkDownloadSizeMb;
      return this;
    }

    @Override
    public DeviceConfig build() {
      return new DeviceConfig(this);
    }
  }
}
