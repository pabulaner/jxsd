package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PrintSettingsModel;
import org.docx4j.dml.chart.CTPrintSettings;

public class CT_PrintSettingsConverter {
  private CT_PrintSettingsConverter() {
  }

  public static CT_PrintSettingsModel fromDocx4j(CTPrintSettings value) {
    if (value == null) return null;
    return new CT_PrintSettingsModel(CT_HeaderFooterConverter.fromDocx4j(value.getHeaderFooter()), CT_PageMarginsConverter.fromDocx4j(value.getPageMargins()), CT_PageSetupConverter.fromDocx4j(value.getPageSetup()), CT_RelIdConverter.fromDocx4j(value.getLegacyDrawingHF()));
  }

  public static CTPrintSettings toDocx4j(CT_PrintSettingsModel value) {
    return null;
  }
}
