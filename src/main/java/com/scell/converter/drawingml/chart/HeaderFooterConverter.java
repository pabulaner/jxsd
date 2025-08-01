package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.chart.HeaderFooterModel;
import org.docx4j.dml.chart.CTHeaderFooter;

public class HeaderFooterConverter {
  private HeaderFooterConverter() {
  }

  public static HeaderFooterModel fromDocx4J(CTHeaderFooter value) {
    if (value == null) return null;
    return new HeaderFooterModel(BooleanValueConverter.fromDocx4J(value.isDifferentOddEven()), BooleanValueConverter.fromDocx4J(value.isDifferentFirst()), BooleanValueConverter.fromDocx4J(value.isAlignWithMargins()), XstringValueConverter.fromDocx4J(value.getOddHeader()), XstringValueConverter.fromDocx4J(value.getOddFooter()), XstringValueConverter.fromDocx4J(value.getEvenHeader()), XstringValueConverter.fromDocx4J(value.getEvenFooter()), XstringValueConverter.fromDocx4J(value.getFirstHeader()), XstringValueConverter.fromDocx4J(value.getFirstFooter()));
  }
}
