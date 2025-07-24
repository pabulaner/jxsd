package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.UpDownBarModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class UpDownBarBuilder {
  private ShapePropertiesModel spPr;

  public UpDownBarBuilder() {
  }

  public UpDownBarBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public UpDownBarModel build() {
    return new UpDownBarModel(this.spPr);
  }

  public UpDownBarBuilder from(UpDownBarModel value) {
    this.spPr = value.getSpPr();
    return this;
  }
}
