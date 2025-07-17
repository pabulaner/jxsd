package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RotYModel;
import org.docx4j.dml.chart.CTRotY;

public class CT_RotYConverter {
  private CT_RotYConverter() {
  }

  public static CT_RotYModel fromDocx4j(CTRotY value) {
    if (value == null) return null;
    return new CT_RotYModel(ST_RotYConverter.fromDocx4j(value.getVal()));
  }

  public static CTRotY toDocx4j(CT_RotYModel value) {
    return null;
  }
}
