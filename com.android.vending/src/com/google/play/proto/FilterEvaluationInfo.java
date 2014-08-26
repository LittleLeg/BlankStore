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
// Source file: proto/Offers.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class FilterEvaluationInfo extends Message {

  public static final List<RuleEvaluation> DEFAULT_RULEEVALUATION = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public final List<RuleEvaluation> ruleEvaluation;

  public FilterEvaluationInfo(List<RuleEvaluation> ruleEvaluation) {
    this.ruleEvaluation = immutableCopyOf(ruleEvaluation);
  }

  private FilterEvaluationInfo(Builder builder) {
    this(builder.ruleEvaluation);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FilterEvaluationInfo)) return false;
    return equals(ruleEvaluation, ((FilterEvaluationInfo) other).ruleEvaluation);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = ruleEvaluation != null ? ruleEvaluation.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<FilterEvaluationInfo> {

    public List<RuleEvaluation> ruleEvaluation;

    public Builder() {
    }

    public Builder(FilterEvaluationInfo message) {
      super(message);
      if (message == null) return;
      this.ruleEvaluation = copyOf(message.ruleEvaluation);
    }

    public Builder ruleEvaluation(List<RuleEvaluation> ruleEvaluation) {
      this.ruleEvaluation = checkForNulls(ruleEvaluation);
      return this;
    }

    @Override
    public FilterEvaluationInfo build() {
      return new FilterEvaluationInfo(this);
    }
  }
}
