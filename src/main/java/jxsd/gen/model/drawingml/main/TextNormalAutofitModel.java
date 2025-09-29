package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextNormalAutofitBuilder;

/**
 * This is a generated sequence class.
 */
public class TextNormalAutofitModel {
  private final int fontScale;

  private final int lnSpcReduction;

  public TextNormalAutofitModel(int fontScale, int lnSpcReduction) {
    this.fontScale = fontScale;
    this.lnSpcReduction = lnSpcReduction;
  }

  public TextNormalAutofitBuilder builder() {
    return new TextNormalAutofitBuilder().from(this);
  }

  public int getFontScale() {
    return this.fontScale;
  }

  public int getLnSpcReduction() {
    return this.lnSpcReduction;
  }
}
