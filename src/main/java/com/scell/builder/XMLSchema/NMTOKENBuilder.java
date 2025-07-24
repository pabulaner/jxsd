package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NMTOKENModel;

public class NMTOKENBuilder {
  private String value;

  public NMTOKENBuilder() {
  }

  public NMTOKENBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NMTOKENBuilder from(NMTOKENModel value) {
    this.value = value.getValue();
    return this;
  }

  public NMTOKENModel build() {
    return new NMTOKENModel(this.value);
  }
}
