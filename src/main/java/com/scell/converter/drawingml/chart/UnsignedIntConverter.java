package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.UnsignedIntModel;
import org.docx4j.dml.chart.CTUnsignedInt;

public class UnsignedIntConverter {
  private UnsignedIntConverter() {
  }

  public static UnsignedIntModel fromDocx4J(CTUnsignedInt value) {
    if (value == null) return null;
    return new UnsignedIntModel(com.scell.converter.XMLSchema.UnsignedIntConverter.fromDocx4J(value.getVal()));
  }
}
