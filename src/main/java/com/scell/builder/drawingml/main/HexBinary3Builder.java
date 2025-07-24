package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.HexBinary3Model;

public class HexBinary3Builder {
  private String value;

  public HexBinary3Builder() {
  }

  public HexBinary3Builder setValue(String value) {
    this.value = value;
    return this;
  }

  public HexBinary3Builder from(HexBinary3Model value) {
    this.value = value.getValue();
    return this;
  }

  public HexBinary3Model build() {
    return new HexBinary3Model(this.value);
  }
}
