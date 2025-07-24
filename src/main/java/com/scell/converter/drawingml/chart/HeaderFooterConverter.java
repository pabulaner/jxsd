package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.chart.HeaderFooterModel;
import org.docx4j.dml.chart.CTHeaderFooter;

public class HeaderFooterConverter {
  private HeaderFooterConverter() {
  }

  public static HeaderFooterModel fromDocx4J(CTHeaderFooter value) {
    if (value == null) return null;
    return new HeaderFooterModel(BooleanConverter.fromDocx4J(value.isDifferentOddEven()), BooleanConverter.fromDocx4J(value.isDifferentFirst()), BooleanConverter.fromDocx4J(value.isAlignWithMargins()), XstringConverter.fromDocx4J(value.getOddHeader()), XstringConverter.fromDocx4J(value.getOddFooter()), XstringConverter.fromDocx4J(value.getEvenHeader()), XstringConverter.fromDocx4J(value.getEvenFooter()), XstringConverter.fromDocx4J(value.getFirstHeader()), XstringConverter.fromDocx4J(value.getFirstFooter()));
  }
}
