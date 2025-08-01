package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.HexBinary3ValueModel;

public class HexBinary3ValueBuilder {
  private String value;

  public HexBinary3ValueBuilder() {
  }

  public HexBinary3ValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public HexBinary3ValueBuilder from(HexBinary3ValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public HexBinary3ValueModel build() {
    return new HexBinary3ValueModel(this.value);
  }
}
