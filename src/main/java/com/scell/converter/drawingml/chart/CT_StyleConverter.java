package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StyleModel;
import org.docx4j.dml.chart.CTStyle;

public class CT_StyleConverter {
  private CT_StyleConverter() {
  }

  public static CT_StyleModel fromDocx4J(CTStyle value) {
    if (value == null) return null;
    return new CT_StyleModel(ST_StyleConverter.fromDocx4J(value.getVal()));
  }

  public static CTStyle toDocx4J(CT_StyleModel value) {
    return null;
  }
}
