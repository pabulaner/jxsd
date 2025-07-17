package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_DLblPosModel;
import org.docx4j.dml.chart.STDLblPos;

public class ST_DLblPosConverter {
  private ST_DLblPosConverter() {
  }

  public static ST_DLblPosModel fromDocx4j(STDLblPos value) {
    if (value == null) return null;
    if (value == STDLblPos.BEST_FIT) return ST_DLblPosModel.BEST_FIT;
    if (value == STDLblPos.B) return ST_DLblPosModel.B;
    if (value == STDLblPos.CTR) return ST_DLblPosModel.CTR;
    if (value == STDLblPos.IN_BASE) return ST_DLblPosModel.IN_BASE;
    if (value == STDLblPos.IN_END) return ST_DLblPosModel.IN_END;
    if (value == STDLblPos.L) return ST_DLblPosModel.L;
    if (value == STDLblPos.OUT_END) return ST_DLblPosModel.OUT_END;
    if (value == STDLblPos.R) return ST_DLblPosModel.R;
    if (value == STDLblPos.T) return ST_DLblPosModel.T;
    return null;
  }

  public static STDLblPos toDocx4j(ST_DLblPosModel value) {
    return null;
  }
}
