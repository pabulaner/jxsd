package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextNormalAutofitModel;
import com.scell.model.drawingml.main.ST_TextFontScalePercentModel;
import com.scell.model.drawingml.main.ST_TextSpacingPercentModel;

public class CT_TextNormalAutofitBuilder {
  private ST_TextFontScalePercentModel fontScale;

  private ST_TextSpacingPercentModel lnSpcReduction;

  public CT_TextNormalAutofitBuilder() {
  }

  public CT_TextNormalAutofitBuilder setFontScale(ST_TextFontScalePercentModel fontScale) {
    this.fontScale = fontScale;
    return this;
  }

  public CT_TextNormalAutofitBuilder setLnSpcReduction(ST_TextSpacingPercentModel lnSpcReduction) {
    this.lnSpcReduction = lnSpcReduction;
    return this;
  }

  public CT_TextNormalAutofitModel build() {
    return new CT_TextNormalAutofitModel(this.fontScale, this.lnSpcReduction);
  }

  public CT_TextNormalAutofitBuilder from(CT_TextNormalAutofitModel value) {
    this.fontScale = value.getFontScale();
    this.lnSpcReduction = value.getLnSpcReduction();
    return this;
  }
}
