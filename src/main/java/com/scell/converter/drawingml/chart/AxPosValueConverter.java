package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.AxPosValueModel;
import org.docx4j.dml.chart.STAxPos;

public class AxPosValueConverter {
  private AxPosValueConverter() {
  }

  public static AxPosValueModel fromDocx4J(STAxPos value) {
    if (value == null) return null;
    if (value == STAxPos.B) return AxPosValueModel.B;
    if (value == STAxPos.L) return AxPosValueModel.L;
    if (value == STAxPos.R) return AxPosValueModel.R;
    if (value == STAxPos.T) return AxPosValueModel.T;
    return null;
  }
}
