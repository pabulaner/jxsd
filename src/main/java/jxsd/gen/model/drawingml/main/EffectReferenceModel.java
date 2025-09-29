package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.EffectReferenceBuilder;

/**
 * This is a generated sequence class.
 */
public class EffectReferenceModel {
  private final String ref;

  public EffectReferenceModel(String ref) {
    this.ref = ref;
  }

  public EffectReferenceBuilder builder() {
    return new EffectReferenceBuilder().from(this);
  }

  public String getRef() {
    return this.ref;
  }
}
