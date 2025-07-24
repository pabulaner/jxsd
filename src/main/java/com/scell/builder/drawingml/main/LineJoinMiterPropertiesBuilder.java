package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineJoinMiterPropertiesModel;
import com.scell.model.drawingml.main.PositivePercentageModel;

public class LineJoinMiterPropertiesBuilder {
  private PositivePercentageModel lim;

  public LineJoinMiterPropertiesBuilder() {
  }

  public LineJoinMiterPropertiesBuilder setLim(PositivePercentageModel lim) {
    this.lim = lim;
    return this;
  }

  public LineJoinMiterPropertiesModel build() {
    return new LineJoinMiterPropertiesModel(this.lim);
  }

  public LineJoinMiterPropertiesBuilder from(LineJoinMiterPropertiesModel value) {
    this.lim = value.getLim();
    return this;
  }
}
