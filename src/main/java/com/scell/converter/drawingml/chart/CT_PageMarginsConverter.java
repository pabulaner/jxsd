package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.DoubleConverter;
import com.scell.model.drawingml.chart.CT_PageMarginsModel;
import org.docx4j.dml.chart.CTPageMargins;

public class CT_PageMarginsConverter {
  private CT_PageMarginsConverter() {
  }

  public static CT_PageMarginsModel fromDocx4j(CTPageMargins value) {
    if (value == null) return null;
    return new CT_PageMarginsModel(DoubleConverter.fromDocx4j(value.getFooter()), DoubleConverter.fromDocx4j(value.getL()), DoubleConverter.fromDocx4j(value.getT()), DoubleConverter.fromDocx4j(value.getHeader()), DoubleConverter.fromDocx4j(value.getR()), DoubleConverter.fromDocx4j(value.getB()));
  }

  public static CTPageMargins toDocx4j(CT_PageMarginsModel value) {
    return null;
  }
}
