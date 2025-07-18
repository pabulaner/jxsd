package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LblOffsetModel;
import org.docx4j.dml.chart.CTLblOffset;

public class CT_LblOffsetConverter {
  private CT_LblOffsetConverter() {
  }

  public static CT_LblOffsetModel fromDocx4J(CTLblOffset value) {
    if (value == null) return null;
    return new CT_LblOffsetModel(ST_LblOffsetConverter.fromDocx4J(value.getVal()));
  }

  public static CTLblOffset toDocx4J(CT_LblOffsetModel value) {
    return null;
  }
}
