package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;

public class HeaderFooterModel {
  private final BooleanModel differentOddEven;

  private final BooleanModel differentFirst;

  private final BooleanModel alignWithMargins;

  private final XstringModel oddHeader;

  private final XstringModel oddFooter;

  private final XstringModel evenHeader;

  private final XstringModel evenFooter;

  private final XstringModel firstHeader;

  private final XstringModel firstFooter;

  public HeaderFooterModel(BooleanModel differentOddEven, BooleanModel differentFirst,
      BooleanModel alignWithMargins, XstringModel oddHeader, XstringModel oddFooter,
      XstringModel evenHeader, XstringModel evenFooter, XstringModel firstHeader,
      XstringModel firstFooter) {
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

  public BooleanModel getDifferentOddEven() {
    return this.differentOddEven;
  }

  public BooleanModel getDifferentFirst() {
    return this.differentFirst;
  }

  public BooleanModel getAlignWithMargins() {
    return this.alignWithMargins;
  }

  public XstringModel getOddHeader() {
    return this.oddHeader;
  }

  public XstringModel getOddFooter() {
    return this.oddFooter;
  }

  public XstringModel getEvenHeader() {
    return this.evenHeader;
  }

  public XstringModel getEvenFooter() {
    return this.evenFooter;
  }

  public XstringModel getFirstHeader() {
    return this.firstHeader;
  }

  public XstringModel getFirstFooter() {
    return this.firstFooter;
  }
}
