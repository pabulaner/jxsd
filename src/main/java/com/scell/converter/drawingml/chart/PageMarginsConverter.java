package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.DoubleValueConverter;
import com.scell.model.drawingml.chart.PageMarginsModel;
import org.docx4j.dml.chart.CTPageMargins;

public class PageMarginsConverter {
  private PageMarginsConverter() {
  }

  public static PageMarginsModel fromDocx4J(CTPageMargins value) {
    if (value == null) return null;
    return new PageMarginsModel(DoubleValueConverter.fromDocx4J(value.getFooter()), DoubleValueConverter.fromDocx4J(value.getL()), DoubleValueConverter.fromDocx4J(value.getT()), DoubleValueConverter.fromDocx4J(value.getHeader()), DoubleValueConverter.fromDocx4J(value.getR()), DoubleValueConverter.fromDocx4J(value.getB()));
  }
}
