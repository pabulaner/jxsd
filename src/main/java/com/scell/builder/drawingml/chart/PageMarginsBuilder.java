package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.DoubleModel;
import com.scell.model.drawingml.chart.PageMarginsModel;

public class PageMarginsBuilder {
  private DoubleModel footer;

  private DoubleModel l;

  private DoubleModel t;

  private DoubleModel header;

  private DoubleModel r;

  private DoubleModel b;

  public PageMarginsBuilder() {
  }

  public PageMarginsBuilder setFooter(DoubleModel footer) {
    this.footer = footer;
    return this;
  }

  public PageMarginsBuilder setL(DoubleModel l) {
    this.l = l;
    return this;
  }

  public PageMarginsBuilder setT(DoubleModel t) {
    this.t = t;
    return this;
  }

  public PageMarginsBuilder setHeader(DoubleModel header) {
    this.header = header;
    return this;
  }

  public PageMarginsBuilder setR(DoubleModel r) {
    this.r = r;
    return this;
  }

  public PageMarginsBuilder setB(DoubleModel b) {
    this.b = b;
    return this;
  }

  public PageMarginsModel build() {
    return new PageMarginsModel(this.footer, this.l, this.t, this.header, this.r, this.b);
  }

  public PageMarginsBuilder from(PageMarginsModel value) {
    this.footer = value.getFooter();
    this.l = value.getL();
    this.t = value.getT();
    this.header = value.getHeader();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }
}
