package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutModeValueModel;
import org.docx4j.dml.chart.STLayoutMode;

/**
 * This is a generated enum class.
 */
public class LayoutModeValueConverter {
  private LayoutModeValueConverter() {
  }

  public static LayoutModeValueModel fromDocx4j(STLayoutMode value) {
    if (value == null) return null;
    if (value == STLayoutMode.EDGE) return LayoutModeValueModel.EDGE;
    if (value == STLayoutMode.FACTOR) return LayoutModeValueModel.FACTOR;
    return null;
  }

  public static STLayoutMode toDocx4j(LayoutModeValueModel value) {
    if (value == null) return null;
    if (value == LayoutModeValueModel.EDGE) return STLayoutMode.EDGE;
    if (value == LayoutModeValueModel.FACTOR) return STLayoutMode.FACTOR;
    return null;
  }
}
