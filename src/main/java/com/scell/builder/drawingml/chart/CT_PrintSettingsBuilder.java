package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_HeaderFooterModel;
import com.scell.model.drawingml.chart.CT_PageMarginsModel;
import com.scell.model.drawingml.chart.CT_PageSetupModel;
import com.scell.model.drawingml.chart.CT_PrintSettingsModel;
import com.scell.model.drawingml.chart.CT_RelIdModel;

public class CT_PrintSettingsBuilder {
  private CT_HeaderFooterModel headerFooter;

  private CT_PageMarginsModel pageMargins;

  private CT_PageSetupModel pageSetup;

  private CT_RelIdModel legacyDrawingHF;

  public CT_PrintSettingsBuilder() {
  }

  public CT_PrintSettingsBuilder setHeaderFooter(CT_HeaderFooterModel headerFooter) {
    this.headerFooter = headerFooter;
    return this;
  }

  public CT_PrintSettingsBuilder setPageMargins(CT_PageMarginsModel pageMargins) {
    this.pageMargins = pageMargins;
    return this;
  }

  public CT_PrintSettingsBuilder setPageSetup(CT_PageSetupModel pageSetup) {
    this.pageSetup = pageSetup;
    return this;
  }

  public CT_PrintSettingsBuilder setLegacyDrawingHF(CT_RelIdModel legacyDrawingHF) {
    this.legacyDrawingHF = legacyDrawingHF;
    return this;
  }

  public CT_PrintSettingsModel build() {
    return new CT_PrintSettingsModel(this.headerFooter, this.pageMargins, this.pageSetup, this.legacyDrawingHF);
  }

  public CT_PrintSettingsBuilder from(CT_PrintSettingsModel value) {
    this.headerFooter = value.getHeaderFooter();
    this.pageMargins = value.getPageMargins();
    this.pageSetup = value.getPageSetup();
    this.legacyDrawingHF = value.getLegacyDrawingHF();
    return this;
  }
}
