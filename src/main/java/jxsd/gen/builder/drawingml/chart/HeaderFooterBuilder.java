package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.HeaderFooterModel;

/**
 * This is a generated sequence class.
 */
public class HeaderFooterBuilder {
  private boolean differentOddEven;

  private boolean differentFirst;

  private boolean alignWithMargins;

  private String oddHeader;

  private String oddFooter;

  private String evenHeader;

  private String evenFooter;

  private String firstHeader;

  private String firstFooter;

  public HeaderFooterBuilder() {
  }

  public HeaderFooterBuilder setDifferentOddEven(boolean differentOddEven) {
    this.differentOddEven = differentOddEven;
    return this;
  }

  public HeaderFooterBuilder setDifferentFirst(boolean differentFirst) {
    this.differentFirst = differentFirst;
    return this;
  }

  public HeaderFooterBuilder setAlignWithMargins(boolean alignWithMargins) {
    this.alignWithMargins = alignWithMargins;
    return this;
  }

  public HeaderFooterBuilder setOddHeader(String oddHeader) {
    this.oddHeader = oddHeader;
    return this;
  }

  public HeaderFooterBuilder setOddFooter(String oddFooter) {
    this.oddFooter = oddFooter;
    return this;
  }

  public HeaderFooterBuilder setEvenHeader(String evenHeader) {
    this.evenHeader = evenHeader;
    return this;
  }

  public HeaderFooterBuilder setEvenFooter(String evenFooter) {
    this.evenFooter = evenFooter;
    return this;
  }

  public HeaderFooterBuilder setFirstHeader(String firstHeader) {
    this.firstHeader = firstHeader;
    return this;
  }

  public HeaderFooterBuilder setFirstFooter(String firstFooter) {
    this.firstFooter = firstFooter;
    return this;
  }

  public HeaderFooterBuilder from(HeaderFooterModel value) {
    this.differentOddEven = value.getDifferentOddEven();
    this.differentFirst = value.getDifferentFirst();
    this.alignWithMargins = value.getAlignWithMargins();
    this.oddHeader = value.getOddHeader();
    this.oddFooter = value.getOddFooter();
    this.evenHeader = value.getEvenHeader();
    this.evenFooter = value.getEvenFooter();
    this.firstHeader = value.getFirstHeader();
    this.firstFooter = value.getFirstFooter();
    return this;
  }

  public HeaderFooterModel build() {
    return new HeaderFooterModel(this.differentOddEven, this.differentFirst, this.alignWithMargins, this.oddHeader, this.oddFooter, this.evenHeader, this.evenFooter, this.firstHeader, this.firstFooter);
  }
}
