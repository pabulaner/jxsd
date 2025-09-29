package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.AxPosValueBuilder;
import jxsd.gen.model.drawingml.chart.AxPosValueModel;
import org.docx4j.dml.chart.STAxPos;

/**
 * This is a generated enum class.
 */
public class AxPosValueConverter {
  private AxPosValueConverter() {
  }

  public static AxPosValueModel fromDocx4j(STAxPos value) {
    if (value == null) return null;
    if (value == AxPosValueBuilder.B) return AxPosValueModel.B;
    if (value == AxPosValueBuilder.L) return AxPosValueModel.L;
    if (value == AxPosValueBuilder.R) return AxPosValueModel.R;
    if (value == AxPosValueBuilder.T) return AxPosValueModel.T;
    return null;
  }

  public static STAxPos toDocx4j(AxPosValueModel value) {
    if (value == null) return null;
    if (value == AxPosValueModel.B) return AxPosValueBuilder.B;
    if (value == AxPosValueModel.L) return AxPosValueBuilder.L;
    if (value == AxPosValueModel.R) return AxPosValueBuilder.R;
    if (value == AxPosValueModel.T) return AxPosValueBuilder.T;
    return null;
  }
}
