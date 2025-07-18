package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.DoubleConverter;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import org.docx4j.dml.chart.CTDouble;

public class CT_DoubleConverter {
  private CT_DoubleConverter() {
  }

  public static CT_DoubleModel fromDocx4J(CTDouble value) {
    if (value == null) return null;
    return new CT_DoubleModel(DoubleConverter.fromDocx4J(value.getVal()));
  }

  public static CTDouble toDocx4J(CT_DoubleModel value) {
    return null;
  }
}
