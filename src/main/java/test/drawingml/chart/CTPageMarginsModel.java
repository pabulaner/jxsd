package test.drawingml.chart;

import test.XMLSchema.DoubleModel;

public class CTPageMarginsModel {
  private final DoubleModel footer;

  private final DoubleModel l;

  private final DoubleModel t;

  private final DoubleModel header;

  private final DoubleModel r;

  private final DoubleModel b;

  public CTPageMarginsModel(DoubleModel footer, DoubleModel l, DoubleModel t, DoubleModel header,
      DoubleModel r, DoubleModel b) {
    this.footer = footer;
    this.l = l;
    this.t = t;
    this.header = header;
    this.r = r;
    this.b = b;
  }

  public DoubleModel getFooter() {
    return this.footer;
  }

  public DoubleModel getL() {
    return this.l;
  }

  public DoubleModel getT() {
    return this.t;
  }

  public DoubleModel getHeader() {
    return this.header;
  }

  public DoubleModel getR() {
    return this.r;
  }

  public DoubleModel getB() {
    return this.b;
  }
}
