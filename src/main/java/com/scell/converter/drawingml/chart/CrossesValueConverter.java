package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CrossesValueModel;
import org.docx4j.dml.chart.STCrosses;

public class CrossesValueConverter {
  private CrossesValueConverter() {
  }

  public static CrossesValueModel fromDocx4J(STCrosses value) {
    if (value == null) return null;
    if (value == STCrosses.AUTO_ZERO) return CrossesValueModel.AUTO_ZERO;
    if (value == STCrosses.MAX) return CrossesValueModel.MAX;
    if (value == STCrosses.MIN) return CrossesValueModel.MIN;
    return null;
  }
}
