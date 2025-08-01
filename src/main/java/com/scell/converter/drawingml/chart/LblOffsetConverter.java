package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LblOffsetModel;
import org.docx4j.dml.chart.CTLblOffset;

public class LblOffsetConverter {
  private LblOffsetConverter() {
  }

  public static LblOffsetModel fromDocx4J(CTLblOffset value) {
    if (value == null) return null;
    return new LblOffsetModel(LblOffsetValueConverter.fromDocx4J(value.getVal()));
  }
}
