package test.drawingml.main;

import test.XMLSchema.TokenModel;

public class CTEffectReferenceModel {
  private final TokenModel ref;

  public CTEffectReferenceModel(TokenModel ref) {
    this.ref = ref;
  }

  public TokenModel getRef() {
    return this.ref;
  }
}
