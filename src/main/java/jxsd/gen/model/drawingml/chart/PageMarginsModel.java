package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PageMarginsBuilder;

/**
 * This is a generated sequence class.
 */
public class PageMarginsModel {
  private final double footer;

  private final double l;

  private final double t;

  private final double header;

  private final double r;

  private final double b;

  public PageMarginsModel(double footer, double l, double t, double header, double r, double b) {
    this.footer = footer;
    this.l = l;
    this.t = t;
    this.header = header;
    this.r = r;
    this.b = b;
  }

  public PageMarginsBuilder builder() {
    return new PageMarginsBuilder().from(this);
  }

  public double getFooter() {
    return this.footer;
  }

  public double getL() {
    return this.l;
  }

  public double getT() {
    return this.t;
  }

  public double getHeader() {
    return this.header;
  }

  public double getR() {
    return this.r;
  }

  public double getB() {
    return this.b;
  }
}
