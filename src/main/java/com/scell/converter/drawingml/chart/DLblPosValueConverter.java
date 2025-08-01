package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DLblPosValueModel;
import org.docx4j.dml.chart.STDLblPos;

public class DLblPosValueConverter {
  private DLblPosValueConverter() {
  }

  public static DLblPosValueModel fromDocx4J(STDLblPos value) {
    if (value == null) return null;
    if (value == STDLblPos.BEST_FIT) return DLblPosValueModel.BEST_FIT;
    if (value == STDLblPos.B) return DLblPosValueModel.B;
    if (value == STDLblPos.CTR) return DLblPosValueModel.CTR;
    if (value == STDLblPos.IN_BASE) return DLblPosValueModel.IN_BASE;
    if (value == STDLblPos.IN_END) return DLblPosValueModel.IN_END;
    if (value == STDLblPos.L) return DLblPosValueModel.L;
    if (value == STDLblPos.OUT_END) return DLblPosValueModel.OUT_END;
    if (value == STDLblPos.R) return DLblPosValueModel.R;
    if (value == STDLblPos.T) return DLblPosValueModel.T;
    return null;
  }
}
