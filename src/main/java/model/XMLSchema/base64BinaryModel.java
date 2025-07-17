package model.XMLSchema;

public class base64BinaryModel {
  private final byte[] value;

  public base64BinaryModel(byte[] value) {
    this.value = value;
  }

  public byte[] getValue() {
    return this.value;
  }
}
