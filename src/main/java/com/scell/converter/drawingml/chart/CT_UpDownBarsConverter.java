package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_UpDownBarsModel;
import org.docx4j.dml.chart.CTUpDownBars;

public class CT_UpDownBarsConverter {
  private CT_UpDownBarsConverter() {
  }

  public static CT_UpDownBarsModel fromDocx4j(CTUpDownBars value) {
    if (value == null) return null;
    return new CT_UpDownBarsModel(CT_GapAmountConverter.fromDocx4j(value.getGapWidth()), CT_UpDownBarConverter.fromDocx4j(value.getUpBars()), CT_UpDownBarConverter.fromDocx4j(value.getDownBars()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTUpDownBars toDocx4j(CT_UpDownBarsModel value) {
    return null;
  }
}
