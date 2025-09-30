package jxsd.gen.converter.drawingml.chart;

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
    if (value == STAxPos.B) return AxPosValueModel.B;
    if (value == STAxPos.L) return AxPosValueModel.L;
    if (value == STAxPos.R) return AxPosValueModel.R;
    if (value == STAxPos.T) return AxPosValueModel.T;
    return null;
  }

  public static STAxPos toDocx4j(AxPosValueModel value) {
    if (value == null) return null;
    if (value == AxPosValueModel.B) return STAxPos.B;
    if (value == AxPosValueModel.L) return STAxPos.L;
    if (value == AxPosValueModel.R) return STAxPos.R;
    if (value == AxPosValueModel.T) return STAxPos.T;
    return null;
  }
}
