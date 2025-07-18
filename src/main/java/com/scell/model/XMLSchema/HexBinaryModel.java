package com.scell.model.XMLSchema;

public class HexBinaryModel {
  private final byte[] value;

  public HexBinaryModel(byte[] value) {
    this.value = value;
  }

  public byte[] getValue() {
    return this.value;
  }
}
