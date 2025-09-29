package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ScatterStyleValueBuilder;
import jxsd.gen.model.drawingml.chart.ScatterStyleValueModel;
import org.docx4j.dml.chart.STScatterStyle;

/**
 * This is a generated enum class.
 */
public class ScatterStyleValueConverter {
  private ScatterStyleValueConverter() {
  }

  public static ScatterStyleValueModel fromDocx4j(STScatterStyle value) {
    if (value == null) return null;
    if (value == ScatterStyleValueBuilder.NONE) return ScatterStyleValueModel.NONE;
    if (value == ScatterStyleValueBuilder.LINE) return ScatterStyleValueModel.LINE;
    if (value == ScatterStyleValueBuilder.LINE_MARKER) return ScatterStyleValueModel.LINE_MARKER;
    if (value == ScatterStyleValueBuilder.MARKER) return ScatterStyleValueModel.MARKER;
    if (value == ScatterStyleValueBuilder.SMOOTH) return ScatterStyleValueModel.SMOOTH;
    if (value == ScatterStyleValueBuilder.SMOOTH_MARKER) return ScatterStyleValueModel.SMOOTH_MARKER;
    return null;
  }

  public static STScatterStyle toDocx4j(ScatterStyleValueModel value) {
    if (value == null) return null;
    if (value == ScatterStyleValueModel.NONE) return ScatterStyleValueBuilder.NONE;
    if (value == ScatterStyleValueModel.LINE) return ScatterStyleValueBuilder.LINE;
    if (value == ScatterStyleValueModel.LINE_MARKER) return ScatterStyleValueBuilder.LINE_MARKER;
    if (value == ScatterStyleValueModel.MARKER) return ScatterStyleValueBuilder.MARKER;
    if (value == ScatterStyleValueModel.SMOOTH) return ScatterStyleValueBuilder.SMOOTH;
    if (value == ScatterStyleValueModel.SMOOTH_MARKER) return ScatterStyleValueBuilder.SMOOTH_MARKER;
    return null;
  }
}
