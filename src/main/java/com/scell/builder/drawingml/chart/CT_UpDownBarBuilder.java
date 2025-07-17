package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_UpDownBarModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_UpDownBarBuilder {
  private CT_ShapePropertiesModel spPr;

  public CT_UpDownBarBuilder() {
  }

  public CT_UpDownBarBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_UpDownBarModel build() {
    return new CT_UpDownBarModel(this.spPr);
  }

  public CT_UpDownBarBuilder from(CT_UpDownBarModel value) {
    this.spPr = value.getSpPr();
    return this;
  }
}
