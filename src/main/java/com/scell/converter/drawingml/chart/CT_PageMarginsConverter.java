package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.DoubleConverter;
import com.scell.model.drawingml.chart.CT_PageMarginsModel;
import org.docx4j.dml.chart.CTPageMargins;

public class CT_PageMarginsConverter {
  private CT_PageMarginsConverter() {
  }

  public static CT_PageMarginsModel fromDocx4J(CTPageMargins value) {
    if (value == null) return null;
    return new CT_PageMarginsModel(DoubleConverter.fromDocx4J(value.getFooter()), DoubleConverter.fromDocx4J(value.getL()), DoubleConverter.fromDocx4J(value.getT()), DoubleConverter.fromDocx4J(value.getHeader()), DoubleConverter.fromDocx4J(value.getR()), DoubleConverter.fromDocx4J(value.getB()));
  }

  public static CTPageMargins toDocx4J(CT_PageMarginsModel value) {
    return null;
  }
}
