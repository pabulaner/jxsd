package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NMTOKENValueModel;

public class NMTOKENValueBuilder {
  private String value;

  public NMTOKENValueBuilder() {
  }

  public NMTOKENValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NMTOKENValueBuilder from(NMTOKENValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NMTOKENValueModel build() {
    return new NMTOKENValueModel(this.value);
  }
}
