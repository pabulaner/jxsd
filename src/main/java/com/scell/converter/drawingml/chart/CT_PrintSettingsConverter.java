package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PrintSettingsModel;
import org.docx4j.dml.chart.CTPrintSettings;

public class CT_PrintSettingsConverter {
  private CT_PrintSettingsConverter() {
  }

  public static CT_PrintSettingsModel fromDocx4J(CTPrintSettings value) {
    if (value == null) return null;
    return new CT_PrintSettingsModel(CT_HeaderFooterConverter.fromDocx4J(value.getHeaderFooter()), CT_PageMarginsConverter.fromDocx4J(value.getPageMargins()), CT_PageSetupConverter.fromDocx4J(value.getPageSetup()), CT_RelIdConverter.fromDocx4J(value.getLegacyDrawingHF()));
  }

  public static CTPrintSettings toDocx4J(CT_PrintSettingsModel value) {
    return null;
  }
}
