package com.scell.model.drawingml.main;

public class CT_TextNormalAutofitModel {
  private final ST_TextFontScalePercentModel fontScale;

  private final ST_TextSpacingPercentModel lnSpcReduction;

  public CT_TextNormalAutofitModel(ST_TextFontScalePercentModel fontScale,
      ST_TextSpacingPercentModel lnSpcReduction) {
    this.fontScale = fontScale;
    this.lnSpcReduction = lnSpcReduction;
  }

  public ST_TextFontScalePercentModel getFontScale() {
    return this.fontScale;
  }

  public ST_TextSpacingPercentModel getLnSpcReduction() {
    return this.lnSpcReduction;
  }
}
