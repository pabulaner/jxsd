package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.chart.HeaderFooterModel;
import com.scell.model.drawingml.chart.XstringModel;

public class HeaderFooterBuilder {
  private BooleanModel differentOddEven;

  private BooleanModel differentFirst;

  private BooleanModel alignWithMargins;

  private XstringModel oddHeader;

  private XstringModel oddFooter;

  private XstringModel evenHeader;

  private XstringModel evenFooter;

  private XstringModel firstHeader;

  private XstringModel firstFooter;

  public HeaderFooterBuilder() {
  }

  public HeaderFooterBuilder setDifferentOddEven(BooleanModel differentOddEven) {
    this.differentOddEven = differentOddEven;
    return this;
  }

  public HeaderFooterBuilder setDifferentFirst(BooleanModel differentFirst) {
    this.differentFirst = differentFirst;
    return this;
  }

  public HeaderFooterBuilder setAlignWithMargins(BooleanModel alignWithMargins) {
    this.alignWithMargins = alignWithMargins;
    return this;
  }

  public HeaderFooterBuilder setOddHeader(XstringModel oddHeader) {
    this.oddHeader = oddHeader;
    return this;
  }

  public HeaderFooterBuilder setOddFooter(XstringModel oddFooter) {
    this.oddFooter = oddFooter;
    return this;
  }

  public HeaderFooterBuilder setEvenHeader(XstringModel evenHeader) {
    this.evenHeader = evenHeader;
    return this;
  }

  public HeaderFooterBuilder setEvenFooter(XstringModel evenFooter) {
    this.evenFooter = evenFooter;
    return this;
  }

  public HeaderFooterBuilder setFirstHeader(XstringModel firstHeader) {
    this.firstHeader = firstHeader;
    return this;
  }

  public HeaderFooterBuilder setFirstFooter(XstringModel firstFooter) {
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
