package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_HexBinary3Model;

public class ST_HexBinary3Builder {
  private byte[] value;

  public ST_HexBinary3Builder() {
    this.value = null;
  }

  public ST_HexBinary3Builder setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public ST_HexBinary3Builder from(ST_HexBinary3Model value) {
    this.value = value.getValue();
    return this;
  }

  public ST_HexBinary3Model build() {
    return new ST_HexBinary3Model(this.value);
  }
}
