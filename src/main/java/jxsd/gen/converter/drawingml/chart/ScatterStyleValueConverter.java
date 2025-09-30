package jxsd.gen.converter.drawingml.chart;

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
    if (value == STScatterStyle.NONE) return ScatterStyleValueModel.NONE;
    if (value == STScatterStyle.LINE) return ScatterStyleValueModel.LINE;
    if (value == STScatterStyle.LINE_MARKER) return ScatterStyleValueModel.LINE_MARKER;
    if (value == STScatterStyle.MARKER) return ScatterStyleValueModel.MARKER;
    if (value == STScatterStyle.SMOOTH) return ScatterStyleValueModel.SMOOTH;
    if (value == STScatterStyle.SMOOTH_MARKER) return ScatterStyleValueModel.SMOOTH_MARKER;
    return null;
  }

  public static STScatterStyle toDocx4j(ScatterStyleValueModel value) {
    if (value == null) return null;
    if (value == ScatterStyleValueModel.NONE) return STScatterStyle.NONE;
    if (value == ScatterStyleValueModel.LINE) return STScatterStyle.LINE;
    if (value == ScatterStyleValueModel.LINE_MARKER) return STScatterStyle.LINE_MARKER;
    if (value == ScatterStyleValueModel.MARKER) return STScatterStyle.MARKER;
    if (value == ScatterStyleValueModel.SMOOTH) return STScatterStyle.SMOOTH;
    if (value == ScatterStyleValueModel.SMOOTH_MARKER) return STScatterStyle.SMOOTH_MARKER;
    return null;
  }
}
