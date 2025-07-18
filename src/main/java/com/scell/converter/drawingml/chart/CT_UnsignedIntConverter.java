package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import org.docx4j.dml.chart.CTUnsignedInt;

public class CT_UnsignedIntConverter {
  private CT_UnsignedIntConverter() {
  }

  public static CT_UnsignedIntModel fromDocx4J(CTUnsignedInt value) {
    if (value == null) return null;
    return new CT_UnsignedIntModel(UnsignedIntConverter.fromDocx4J(value.getVal()));
  }

  public static CTUnsignedInt toDocx4J(CT_UnsignedIntModel value) {
    return null;
  }
}
