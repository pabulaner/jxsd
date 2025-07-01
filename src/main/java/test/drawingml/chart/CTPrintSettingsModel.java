package test.drawingml.chart;

public class CTPrintSettingsModel {
  private final CTHeaderFooterModel headerFooter;

  private final CTPageMarginsModel pageMargins;

  private final CTPageSetupModel pageSetup;

  private final CTRelIdModel legacyDrawingHF;

  public CTPrintSettingsModel(CTHeaderFooterModel headerFooter, CTPageMarginsModel pageMargins,
      CTPageSetupModel pageSetup, CTRelIdModel legacyDrawingHF) {
    this.headerFooter = headerFooter;
    this.pageMargins = pageMargins;
    this.pageSetup = pageSetup;
    this.legacyDrawingHF = legacyDrawingHF;
  }

  public CTHeaderFooterModel getHeaderFooter() {
    return this.headerFooter;
  }

  public CTPageMarginsModel getPageMargins() {
    return this.pageMargins;
  }

  public CTPageSetupModel getPageSetup() {
    return this.pageSetup;
  }

  public CTRelIdModel getLegacyDrawingHF() {
    return this.legacyDrawingHF;
  }
}
