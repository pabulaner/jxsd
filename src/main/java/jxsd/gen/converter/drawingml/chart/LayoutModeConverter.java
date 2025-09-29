package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutModeModel;
import org.docx4j.dml.chart.CTLayoutMode;

/**
 * This is a generated sequence class.
 */
public class LayoutModeConverter {
  private LayoutModeConverter() {
  }

  public static LayoutModeModel fromDocx4j(CTLayoutMode value) {
    if (value == null) return null;
    return new LayoutModeModel(LayoutModeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTLayoutMode toDocx4j(LayoutModeModel value) {
    if (value == null) return null;
    CTLayoutMode result = new CTLayoutMode();
    result.setVal(LayoutModeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
