package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PrintSettingsModel;
import org.docx4j.dml.chart.CTPrintSettings;

/**
 * This is a generated sequence class.
 */
public class PrintSettingsConverter {
  private PrintSettingsConverter() {
  }

  public static PrintSettingsModel fromDocx4j(CTPrintSettings value) {
    if (value == null) return null;
    return new PrintSettingsModel(HeaderFooterConverter.fromDocx4j(value.getHeaderFooter()), PageMarginsConverter.fromDocx4j(value.getPageMargins()), PageSetupConverter.fromDocx4j(value.getPageSetup()), RelIdConverter.fromDocx4j(value.getLegacyDrawingHF()));
  }

  public static CTPrintSettings toDocx4j(PrintSettingsModel value) {
    if (value == null) return null;
    CTPrintSettings result = new CTPrintSettings();
    result.setHeaderFooter(HeaderFooterConverter.toDocx4j(value.getHeaderFooter()));
    result.setPageMargins(PageMarginsConverter.toDocx4j(value.getPageMargins()));
    result.setPageSetup(PageSetupConverter.toDocx4j(value.getPageSetup()));
    result.setLegacyDrawingHF(RelIdConverter.toDocx4j(value.getLegacyDrawingHF()));
    return result;
  }
}
