package model.XMLSchema;

public class hexBinaryModel {
  private final byte[] value;

  public hexBinaryModel(byte[] value) {
    this.value = value;
  }

  public byte[] getValue() {
    return this.value;
  }
}
