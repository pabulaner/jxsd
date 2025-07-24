package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.DoubleConverter;
import com.scell.model.drawingml.chart.PageMarginsModel;
import org.docx4j.dml.chart.CTPageMargins;

public class PageMarginsConverter {
  private PageMarginsConverter() {
  }

  public static PageMarginsModel fromDocx4J(CTPageMargins value) {
    if (value == null) return null;
    return new PageMarginsModel(DoubleConverter.fromDocx4J(value.getFooter()), DoubleConverter.fromDocx4J(value.getL()), DoubleConverter.fromDocx4J(value.getT()), DoubleConverter.fromDocx4J(value.getHeader()), DoubleConverter.fromDocx4J(value.getR()), DoubleConverter.fromDocx4J(value.getB()));
  }
}
