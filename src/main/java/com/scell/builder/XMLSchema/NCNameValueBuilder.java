package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NCNameValueModel;

public class NCNameValueBuilder {
  private String value;

  public NCNameValueBuilder() {
  }

  public NCNameValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NCNameValueBuilder from(NCNameValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NCNameValueModel build() {
    return new NCNameValueModel(this.value);
  }
}
