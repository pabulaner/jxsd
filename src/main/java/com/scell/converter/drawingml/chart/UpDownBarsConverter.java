package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.UpDownBarsModel;
import org.docx4j.dml.chart.CTUpDownBars;

public class UpDownBarsConverter {
  private UpDownBarsConverter() {
  }

  public static UpDownBarsModel fromDocx4J(CTUpDownBars value) {
    if (value == null) return null;
    return new UpDownBarsModel(GapAmountConverter.fromDocx4J(value.getGapWidth()), UpDownBarConverter.fromDocx4J(value.getUpBars()), UpDownBarConverter.fromDocx4J(value.getDownBars()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
