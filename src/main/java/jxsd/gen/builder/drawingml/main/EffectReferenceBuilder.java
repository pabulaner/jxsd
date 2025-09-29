package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.EffectReferenceModel;

/**
 * This is a generated sequence class.
 */
public class EffectReferenceBuilder {
  private String ref;

  public EffectReferenceBuilder() {
  }

  public EffectReferenceBuilder setRef(String ref) {
    this.ref = ref;
    return this;
  }

  public EffectReferenceBuilder from(EffectReferenceModel value) {
    this.ref = value.getRef();
    return this;
  }

  public EffectReferenceModel build() {
    return new EffectReferenceModel(this.ref);
  }
}
