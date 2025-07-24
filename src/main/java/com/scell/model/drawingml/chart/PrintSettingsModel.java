package com.scell.model.drawingml.chart;

public class PrintSettingsModel {
  private final HeaderFooterModel headerFooter;

  private final PageMarginsModel pageMargins;

  private final PageSetupModel pageSetup;

  private final RelIdModel legacyDrawingHF;

  public PrintSettingsModel(HeaderFooterModel headerFooter, PageMarginsModel pageMargins,
      PageSetupModel pageSetup, RelIdModel legacyDrawingHF) {
    this.headerFooter = headerFooter;
    this.pageMargins = pageMargins;
    this.pageSetup = pageSetup;
    this.legacyDrawingHF = legacyDrawingHF;
  }

  public HeaderFooterModel getHeaderFooter() {
    return this.headerFooter;
  }

  public PageMarginsModel getPageMargins() {
    return this.pageMargins;
  }

  public PageSetupModel getPageSetup() {
    return this.pageSetup;
  }

  public RelIdModel getLegacyDrawingHF() {
    return this.legacyDrawingHF;
  }
}
