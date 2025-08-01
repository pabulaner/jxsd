package com.scell.model.drawingml.main;

public class TextNormalAutofitModel {
  private final TextFontScalePercentValueModel fontScale;

  private final TextSpacingPercentValueModel lnSpcReduction;

  public TextNormalAutofitModel(TextFontScalePercentValueModel fontScale,
      TextSpacingPercentValueModel lnSpcReduction) {
    this.fontScale = fontScale;
    this.lnSpcReduction = lnSpcReduction;
  }

  public TextFontScalePercentValueModel getFontScale() {
    return this.fontScale;
  }

  public TextSpacingPercentValueModel getLnSpcReduction() {
    return this.lnSpcReduction;
  }
}
