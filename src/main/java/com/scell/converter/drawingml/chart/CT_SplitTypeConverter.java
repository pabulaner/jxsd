package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SplitTypeModel;
import org.docx4j.dml.chart.CTSplitType;

public class CT_SplitTypeConverter {
  private CT_SplitTypeConverter() {
  }

  public static CT_SplitTypeModel fromDocx4J(CTSplitType value) {
    if (value == null) return null;
    return new CT_SplitTypeModel(ST_SplitTypeConverter.fromDocx4J(value.getVal()));
  }

  public static CTSplitType toDocx4J(CT_SplitTypeModel value) {
    return null;
  }
}
