package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontScalePercentModel;
import com.scell.model.drawingml.main.TextNormalAutofitModel;
import com.scell.model.drawingml.main.TextSpacingPercentModel;

public class TextNormalAutofitBuilder {
  private TextFontScalePercentModel fontScale;

  private TextSpacingPercentModel lnSpcReduction;

  public TextNormalAutofitBuilder() {
  }

  public TextNormalAutofitBuilder setFontScale(TextFontScalePercentModel fontScale) {
    this.fontScale = fontScale;
    return this;
  }

  public TextNormalAutofitBuilder setLnSpcReduction(TextSpacingPercentModel lnSpcReduction) {
    this.lnSpcReduction = lnSpcReduction;
    return this;
  }

  public TextNormalAutofitModel build() {
    return new TextNormalAutofitModel(this.fontScale, this.lnSpcReduction);
  }

  public TextNormalAutofitBuilder from(TextNormalAutofitModel value) {
    this.fontScale = value.getFontScale();
    this.lnSpcReduction = value.getLnSpcReduction();
    return this;
  }
}
