package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.DoubleValueModel;

public class PageMarginsModel {
  private final DoubleValueModel footer;

  private final DoubleValueModel l;

  private final DoubleValueModel t;

  private final DoubleValueModel header;

  private final DoubleValueModel r;

  private final DoubleValueModel b;

  public PageMarginsModel(DoubleValueModel footer, DoubleValueModel l, DoubleValueModel t,
      DoubleValueModel header, DoubleValueModel r, DoubleValueModel b) {
    this.footer = footer;
    this.l = l;
    this.t = t;
    this.header = header;
    this.r = r;
    this.b = b;
  }

  public DoubleValueModel getFooter() {
    return this.footer;
  }

  public DoubleValueModel getL() {
    return this.l;
  }

  public DoubleValueModel getT() {
    return this.t;
  }

  public DoubleValueModel getHeader() {
    return this.header;
  }

  public DoubleValueModel getR() {
    return this.r;
  }

  public DoubleValueModel getB() {
    return this.b;
  }
}
