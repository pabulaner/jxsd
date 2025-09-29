package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.HeaderFooterBuilder;

/**
 * This is a generated sequence class.
 */
public class HeaderFooterModel {
  private final boolean differentOddEven;

  private final boolean differentFirst;

  private final boolean alignWithMargins;

  private final String oddHeader;

  private final String oddFooter;

  private final String evenHeader;

  private final String evenFooter;

  private final String firstHeader;

  private final String firstFooter;

  public HeaderFooterModel(boolean differentOddEven, boolean differentFirst,
      boolean alignWithMargins, String oddHeader, String oddFooter, String evenHeader,
      String evenFooter, String firstHeader, String firstFooter) {
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

  public HeaderFooterBuilder builder() {
    return new HeaderFooterBuilder().from(this);
  }

  public boolean getDifferentOddEven() {
    return this.differentOddEven;
  }

  public boolean getDifferentFirst() {
    return this.differentFirst;
  }

  public boolean getAlignWithMargins() {
    return this.alignWithMargins;
  }

  public String getOddHeader() {
    return this.oddHeader;
  }

  public String getOddFooter() {
    return this.oddFooter;
  }

  public String getEvenHeader() {
    return this.evenHeader;
  }

  public String getEvenFooter() {
    return this.evenFooter;
  }

  public String getFirstHeader() {
    return this.firstHeader;
  }

  public String getFirstFooter() {
    return this.firstFooter;
  }
}
