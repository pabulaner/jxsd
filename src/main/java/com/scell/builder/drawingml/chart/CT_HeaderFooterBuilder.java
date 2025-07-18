package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.chart.CT_HeaderFooterModel;
import com.scell.model.drawingml.chart.ST_XstringModel;

public class CT_HeaderFooterBuilder {
  private BooleanModel differentOddEven;

  private BooleanModel differentFirst;

  private BooleanModel alignWithMargins;

  private ST_XstringModel oddHeader;

  private ST_XstringModel oddFooter;

  private ST_XstringModel evenHeader;

  private ST_XstringModel evenFooter;

  private ST_XstringModel firstHeader;

  private ST_XstringModel firstFooter;

  public CT_HeaderFooterBuilder() {
  }

  public CT_HeaderFooterBuilder setDifferentOddEven(BooleanModel differentOddEven) {
    this.differentOddEven = differentOddEven;
    return this;
  }

  public CT_HeaderFooterBuilder setDifferentFirst(BooleanModel differentFirst) {
    this.differentFirst = differentFirst;
    return this;
  }

  public CT_HeaderFooterBuilder setAlignWithMargins(BooleanModel alignWithMargins) {
    this.alignWithMargins = alignWithMargins;
    return this;
  }

  public CT_HeaderFooterBuilder setOddHeader(ST_XstringModel oddHeader) {
    this.oddHeader = oddHeader;
    return this;
  }

  public CT_HeaderFooterBuilder setOddFooter(ST_XstringModel oddFooter) {
    this.oddFooter = oddFooter;
    return this;
  }

  public CT_HeaderFooterBuilder setEvenHeader(ST_XstringModel evenHeader) {
    this.evenHeader = evenHeader;
    return this;
  }

  public CT_HeaderFooterBuilder setEvenFooter(ST_XstringModel evenFooter) {
    this.evenFooter = evenFooter;
    return this;
  }

  public CT_HeaderFooterBuilder setFirstHeader(ST_XstringModel firstHeader) {
    this.firstHeader = firstHeader;
    return this;
  }

  public CT_HeaderFooterBuilder setFirstFooter(ST_XstringModel firstFooter) {
    this.firstFooter = firstFooter;
    return this;
  }

  public CT_HeaderFooterModel build() {
    return new CT_HeaderFooterModel(this.differentOddEven, this.differentFirst, this.alignWithMargins, this.oddHeader, this.oddFooter, this.evenHeader, this.evenFooter, this.firstHeader, this.firstFooter);
  }

  public CT_HeaderFooterBuilder from(CT_HeaderFooterModel value) {
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
