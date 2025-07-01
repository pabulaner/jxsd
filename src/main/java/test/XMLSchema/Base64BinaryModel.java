package test.XMLSchema;

public class Base64BinaryModel {
  private final byte[] value;

  public Base64BinaryModel(byte[] value) {
    this.value = value;
  }

  public byte[] getValue() {
    return this.value;
  }
}
