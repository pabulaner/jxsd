package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import org.docx4j.dml.chart.CTBoolean;

public class CT_BooleanConverter {
  private CT_BooleanConverter() {
  }

  public static CT_BooleanModel fromDocx4j(CTBoolean value) {
    if (value == null) return null;
    return new CT_BooleanModel(BooleanConverter.fromDocx4j(value.getVal()));
  }

  public static CTBoolean toDocx4j(CT_BooleanModel value) {
    return null;
  }
}
