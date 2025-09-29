package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PageMarginsModel;

/**
 * This is a generated sequence class.
 */
public class PageMarginsBuilder {
  private double footer;

  private double l;

  private double t;

  private double header;

  private double r;

  private double b;

  public PageMarginsBuilder() {
  }

  public PageMarginsBuilder setFooter(double footer) {
    this.footer = footer;
    return this;
  }

  public PageMarginsBuilder setL(double l) {
    this.l = l;
    return this;
  }

  public PageMarginsBuilder setT(double t) {
    this.t = t;
    return this;
  }

  public PageMarginsBuilder setHeader(double header) {
    this.header = header;
    return this;
  }

  public PageMarginsBuilder setR(double r) {
    this.r = r;
    return this;
  }

  public PageMarginsBuilder setB(double b) {
    this.b = b;
    return this;
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

  public PageMarginsModel build() {
    return new PageMarginsModel(this.footer, this.l, this.t, this.header, this.r, this.b);
  }
}
