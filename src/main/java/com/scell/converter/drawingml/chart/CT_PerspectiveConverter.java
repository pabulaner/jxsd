package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PerspectiveModel;
import org.docx4j.dml.chart.CTPerspective;

public class CT_PerspectiveConverter {
  private CT_PerspectiveConverter() {
  }

  public static CT_PerspectiveModel fromDocx4J(CTPerspective value) {
    if (value == null) return null;
    return new CT_PerspectiveModel(ST_PerspectiveConverter.fromDocx4J(value.getVal()));
  }

  public static CTPerspective toDocx4J(CT_PerspectiveModel value) {
    return null;
  }
}
