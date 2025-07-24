package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HeaderFooterModel;
import com.scell.model.drawingml.chart.PageMarginsModel;
import com.scell.model.drawingml.chart.PageSetupModel;
import com.scell.model.drawingml.chart.PrintSettingsModel;
import com.scell.model.drawingml.chart.RelIdModel;

public class PrintSettingsBuilder {
  private HeaderFooterModel headerFooter;

  private PageMarginsModel pageMargins;

  private PageSetupModel pageSetup;

  private RelIdModel legacyDrawingHF;

  public PrintSettingsBuilder() {
  }

  public PrintSettingsBuilder setHeaderFooter(HeaderFooterModel headerFooter) {
    this.headerFooter = headerFooter;
    return this;
  }

  public PrintSettingsBuilder setPageMargins(PageMarginsModel pageMargins) {
    this.pageMargins = pageMargins;
    return this;
  }

  public PrintSettingsBuilder setPageSetup(PageSetupModel pageSetup) {
    this.pageSetup = pageSetup;
    return this;
  }

  public PrintSettingsBuilder setLegacyDrawingHF(RelIdModel legacyDrawingHF) {
    this.legacyDrawingHF = legacyDrawingHF;
    return this;
  }

  public PrintSettingsModel build() {
    return new PrintSettingsModel(this.headerFooter, this.pageMargins, this.pageSetup, this.legacyDrawingHF);
  }

  public PrintSettingsBuilder from(PrintSettingsModel value) {
    this.headerFooter = value.getHeaderFooter();
    this.pageMargins = value.getPageMargins();
    this.pageSetup = value.getPageSetup();
    this.legacyDrawingHF = value.getLegacyDrawingHF();
    return this;
  }
}
