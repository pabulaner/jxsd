package model.drawingml.chart;

import model.XMLSchema.doubleModel;

public class CT_PageMarginsModel {
  private final doubleModel footer;

  private final doubleModel l;

  private final doubleModel t;

  private final doubleModel header;

  private final doubleModel r;

  private final doubleModel b;

  public CT_PageMarginsModel(doubleModel footer, doubleModel l, doubleModel t, doubleModel header,
      doubleModel r, doubleModel b) {
    this.footer = footer;
    this.l = l;
    this.t = t;
    this.header = header;
    this.r = r;
    this.b = b;
  }

  public doubleModel getFooter() {
    return this.footer;
  }

  public doubleModel getL() {
    return this.l;
  }

  public doubleModel getT() {
    return this.t;
  }

  public doubleModel getHeader() {
    return this.header;
  }

  public doubleModel getR() {
    return this.r;
  }

  public doubleModel getB() {
    return this.b;
  }
}
