package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextNormalAutofitModel;

/**
 * This is a generated sequence class.
 */
public class TextNormalAutofitBuilder {
  private int fontScale;

  private int lnSpcReduction;

  public TextNormalAutofitBuilder() {
  }

  public TextNormalAutofitBuilder setFontScale(int fontScale) {
    this.fontScale = fontScale;
    return this;
  }

  public TextNormalAutofitBuilder setLnSpcReduction(int lnSpcReduction) {
    this.lnSpcReduction = lnSpcReduction;
    return this;
  }

  public TextNormalAutofitBuilder from(TextNormalAutofitModel value) {
    this.fontScale = value.getFontScale();
    this.lnSpcReduction = value.getLnSpcReduction();
    return this;
  }

  public TextNormalAutofitModel build() {
    return new TextNormalAutofitModel(this.fontScale, this.lnSpcReduction);
  }
}
