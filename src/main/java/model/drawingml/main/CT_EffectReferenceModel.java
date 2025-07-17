package model.drawingml.main;

import model.XMLSchema.tokenModel;

public class CT_EffectReferenceModel {
  private final tokenModel ref;

  public CT_EffectReferenceModel(tokenModel ref) {
    this.ref = ref;
  }

  public tokenModel getRef() {
    return this.ref;
  }
}
