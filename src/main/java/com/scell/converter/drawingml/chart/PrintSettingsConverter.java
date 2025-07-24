package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PrintSettingsModel;
import org.docx4j.dml.chart.CTPrintSettings;

public class PrintSettingsConverter {
  private PrintSettingsConverter() {
  }

  public static PrintSettingsModel fromDocx4J(CTPrintSettings value) {
    if (value == null) return null;
    return new PrintSettingsModel(HeaderFooterConverter.fromDocx4J(value.getHeaderFooter()), PageMarginsConverter.fromDocx4J(value.getPageMargins()), PageSetupConverter.fromDocx4J(value.getPageSetup()), RelIdConverter.fromDocx4J(value.getLegacyDrawingHF()));
  }
}
