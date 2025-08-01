package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontScalePercentValueModel;
import com.scell.model.drawingml.main.TextNormalAutofitModel;
import com.scell.model.drawingml.main.TextSpacingPercentValueModel;

public class TextNormalAutofitBuilder {
  private TextFontScalePercentValueModel fontScale;

  private TextSpacingPercentValueModel lnSpcReduction;

  public TextNormalAutofitBuilder() {
  }

  public TextNormalAutofitBuilder setFontScale(TextFontScalePercentValueModel fontScale) {
    this.fontScale = fontScale;
    return this;
  }

  public TextNormalAutofitBuilder setLnSpcReduction(TextSpacingPercentValueModel lnSpcReduction) {
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
