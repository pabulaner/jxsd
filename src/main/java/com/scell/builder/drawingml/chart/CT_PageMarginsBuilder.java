package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.DoubleModel;
import com.scell.model.drawingml.chart.CT_PageMarginsModel;

public class CT_PageMarginsBuilder {
  private DoubleModel footer;

  private DoubleModel l;

  private DoubleModel t;

  private DoubleModel header;

  private DoubleModel r;

  private DoubleModel b;

  public CT_PageMarginsBuilder() {
  }

  public CT_PageMarginsBuilder setFooter(DoubleModel footer) {
    this.footer = footer;
    return this;
  }

  public CT_PageMarginsBuilder setL(DoubleModel l) {
    this.l = l;
    return this;
  }

  public CT_PageMarginsBuilder setT(DoubleModel t) {
    this.t = t;
    return this;
  }

  public CT_PageMarginsBuilder setHeader(DoubleModel header) {
    this.header = header;
    return this;
  }

  public CT_PageMarginsBuilder setR(DoubleModel r) {
    this.r = r;
    return this;
  }

  public CT_PageMarginsBuilder setB(DoubleModel b) {
    this.b = b;
    return this;
  }

  public CT_PageMarginsModel build() {
    return new CT_PageMarginsModel(this.footer, this.l, this.t, this.header, this.r, this.b);
  }

  public CT_PageMarginsBuilder from(CT_PageMarginsModel value) {
    this.footer = value.getFooter();
    this.l = value.getL();
    this.t = value.getT();
    this.header = value.getHeader();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }
}
