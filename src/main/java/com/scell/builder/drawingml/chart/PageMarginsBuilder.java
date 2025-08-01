package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.DoubleValueModel;
import com.scell.model.drawingml.chart.PageMarginsModel;

public class PageMarginsBuilder {
  private DoubleValueModel footer;

  private DoubleValueModel l;

  private DoubleValueModel t;

  private DoubleValueModel header;

  private DoubleValueModel r;

  private DoubleValueModel b;

  public PageMarginsBuilder() {
  }

  public PageMarginsBuilder setFooter(DoubleValueModel footer) {
    this.footer = footer;
    return this;
  }

  public PageMarginsBuilder setL(DoubleValueModel l) {
    this.l = l;
    return this;
  }

  public PageMarginsBuilder setT(DoubleValueModel t) {
    this.t = t;
    return this;
  }

  public PageMarginsBuilder setHeader(DoubleValueModel header) {
    this.header = header;
    return this;
  }

  public PageMarginsBuilder setR(DoubleValueModel r) {
    this.r = r;
    return this;
  }

  public PageMarginsBuilder setB(DoubleValueModel b) {
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
