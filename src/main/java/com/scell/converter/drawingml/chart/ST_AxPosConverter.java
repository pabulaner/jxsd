package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_AxPosModel;
import org.docx4j.dml.chart.STAxPos;

public class ST_AxPosConverter {
  private ST_AxPosConverter() {
  }

  public static ST_AxPosModel fromDocx4j(STAxPos value) {
    if (value == null) return null;
    if (value == STAxPos.B) return ST_AxPosModel.B;
    if (value == STAxPos.L) return ST_AxPosModel.L;
    if (value == STAxPos.R) return ST_AxPosModel.R;
    if (value == STAxPos.T) return ST_AxPosModel.T;
    return null;
  }

  public static STAxPos toDocx4j(ST_AxPosModel value) {
    return null;
  }
}
