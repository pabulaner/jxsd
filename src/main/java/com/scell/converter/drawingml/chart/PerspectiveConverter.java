package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PerspectiveModel;
import org.docx4j.dml.chart.CTPerspective;

public class PerspectiveConverter {
  private PerspectiveConverter() {
  }

  public static PerspectiveModel fromDocx4J(CTPerspective value) {
    if (value == null) return null;
    return new PerspectiveModel(PerspectiveConverter.fromDocx4J(value.getVal()));
  }
}
