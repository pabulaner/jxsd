package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinMiterPropertiesModel;
import com.scell.model.drawingml.main.ST_PositivePercentageModel;

public class CT_LineJoinMiterPropertiesBuilder {
  private ST_PositivePercentageModel lim;

  public CT_LineJoinMiterPropertiesBuilder() {
  }

  public CT_LineJoinMiterPropertiesBuilder setLim(ST_PositivePercentageModel lim) {
    this.lim = lim;
    return this;
  }

  public CT_LineJoinMiterPropertiesModel build() {
    return new CT_LineJoinMiterPropertiesModel(this.lim);
  }

  public CT_LineJoinMiterPropertiesBuilder from(CT_LineJoinMiterPropertiesModel value) {
    this.lim = value.getLim();
    return this;
  }
}
