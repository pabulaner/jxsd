package com.scell.model.drawingml.main;

public class TextNormalAutofitModel {
  private final TextFontScalePercentModel fontScale;

  private final TextSpacingPercentModel lnSpcReduction;

  public TextNormalAutofitModel(TextFontScalePercentModel fontScale,
      TextSpacingPercentModel lnSpcReduction) {
    this.fontScale = fontScale;
    this.lnSpcReduction = lnSpcReduction;
  }

  public TextFontScalePercentModel getFontScale() {
    return this.fontScale;
  }

  public TextSpacingPercentModel getLnSpcReduction() {
    return this.lnSpcReduction;
  }
}
