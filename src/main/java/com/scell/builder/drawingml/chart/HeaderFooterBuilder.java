package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.chart.HeaderFooterModel;
import com.scell.model.drawingml.chart.XstringValueModel;

public class HeaderFooterBuilder {
  private BooleanValueModel differentOddEven;

  private BooleanValueModel differentFirst;

  private BooleanValueModel alignWithMargins;

  private XstringValueModel oddHeader;

  private XstringValueModel oddFooter;

  private XstringValueModel evenHeader;

  private XstringValueModel evenFooter;

  private XstringValueModel firstHeader;

  private XstringValueModel firstFooter;

  public HeaderFooterBuilder() {
  }

  public HeaderFooterBuilder setDifferentOddEven(BooleanValueModel differentOddEven) {
    this.differentOddEven = differentOddEven;
    return this;
  }

  public HeaderFooterBuilder setDifferentFirst(BooleanValueModel differentFirst) {
    this.differentFirst = differentFirst;
    return this;
  }

  public HeaderFooterBuilder setAlignWithMargins(BooleanValueModel alignWithMargins) {
    this.alignWithMargins = alignWithMargins;
    return this;
  }

  public HeaderFooterBuilder setOddHeader(XstringValueModel oddHeader) {
    this.oddHeader = oddHeader;
    return this;
  }

  public HeaderFooterBuilder setOddFooter(XstringValueModel oddFooter) {
    this.oddFooter = oddFooter;
    return this;
  }

  public HeaderFooterBuilder setEvenHeader(XstringValueModel evenHeader) {
    this.evenHeader = evenHeader;
    return this;
  }

  public HeaderFooterBuilder setEvenFooter(XstringValueModel evenFooter) {
    this.evenFooter = evenFooter;
    return this;
  }

  public HeaderFooterBuilder setFirstHeader(XstringValueModel firstHeader) {
    this.firstHeader = firstHeader;
    return this;
  }

  public HeaderFooterBuilder setFirstFooter(XstringValueModel firstFooter) {
    this.firstFooter = firstFooter;
    return this;
  }

  public HeaderFooterModel build() {
    return new HeaderFooterModel(this.differentOddEven, this.differentFirst, this.alignWithMargins, this.oddHeader, this.oddFooter, this.evenHeader, this.evenFooter, this.firstHeader, this.firstFooter);
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
}
