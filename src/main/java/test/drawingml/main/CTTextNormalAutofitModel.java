package test.drawingml.main;

public class CTTextNormalAutofitModel {
  private final STTextFontScalePercentModel fontScale;

  private final STTextSpacingPercentModel lnSpcReduction;

  public CTTextNormalAutofitModel(STTextFontScalePercentModel fontScale,
      STTextSpacingPercentModel lnSpcReduction) {
    this.fontScale = fontScale;
    this.lnSpcReduction = lnSpcReduction;
  }

  public STTextFontScalePercentModel getFontScale() {
    return this.fontScale;
  }

  public STTextSpacingPercentModel getLnSpcReduction() {
    return this.lnSpcReduction;
  }
}
