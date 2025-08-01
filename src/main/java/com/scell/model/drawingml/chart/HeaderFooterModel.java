package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;

public class HeaderFooterModel {
  private final BooleanValueModel differentOddEven;

  private final BooleanValueModel differentFirst;

  private final BooleanValueModel alignWithMargins;

  private final XstringValueModel oddHeader;

  private final XstringValueModel oddFooter;

  private final XstringValueModel evenHeader;

  private final XstringValueModel evenFooter;

  private final XstringValueModel firstHeader;

  private final XstringValueModel firstFooter;

  public HeaderFooterModel(BooleanValueModel differentOddEven, BooleanValueModel differentFirst,
      BooleanValueModel alignWithMargins, XstringValueModel oddHeader, XstringValueModel oddFooter,
      XstringValueModel evenHeader, XstringValueModel evenFooter, XstringValueModel firstHeader,
      XstringValueModel firstFooter) {
    this.differentOddEven = differentOddEven;
    this.differentFirst = differentFirst;
    this.alignWithMargins = alignWithMargins;
    this.oddHeader = oddHeader;
    this.oddFooter = oddFooter;
    this.evenHeader = evenHeader;
    this.evenFooter = evenFooter;
    this.firstHeader = firstHeader;
    this.firstFooter = firstFooter;
  }

  public BooleanValueModel getDifferentOddEven() {
    return this.differentOddEven;
  }

  public BooleanValueModel getDifferentFirst() {
    return this.differentFirst;
  }

  public BooleanValueModel getAlignWithMargins() {
    return this.alignWithMargins;
  }

  public XstringValueModel getOddHeader() {
    return this.oddHeader;
  }

  public XstringValueModel getOddFooter() {
    return this.oddFooter;
  }

  public XstringValueModel getEvenHeader() {
    return this.evenHeader;
  }

  public XstringValueModel getEvenFooter() {
    return this.evenFooter;
  }

  public XstringValueModel getFirstHeader() {
    return this.firstHeader;
  }

  public XstringValueModel getFirstFooter() {
    return this.firstFooter;
  }
}
