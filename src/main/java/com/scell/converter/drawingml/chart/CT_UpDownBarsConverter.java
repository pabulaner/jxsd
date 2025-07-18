package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_UpDownBarsModel;
import org.docx4j.dml.chart.CTUpDownBars;

public class CT_UpDownBarsConverter {
  private CT_UpDownBarsConverter() {
  }

  public static CT_UpDownBarsModel fromDocx4J(CTUpDownBars value) {
    if (value == null) return null;
    return new CT_UpDownBarsModel(CT_GapAmountConverter.fromDocx4J(value.getGapWidth()), CT_UpDownBarConverter.fromDocx4J(value.getUpBars()), CT_UpDownBarConverter.fromDocx4J(value.getDownBars()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTUpDownBars toDocx4J(CT_UpDownBarsModel value) {
    return null;
  }
}
