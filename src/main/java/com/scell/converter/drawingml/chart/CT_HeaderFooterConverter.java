package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.chart.CT_HeaderFooterModel;
import org.docx4j.dml.chart.CTHeaderFooter;

public class CT_HeaderFooterConverter {
  private CT_HeaderFooterConverter() {
  }

  public static CT_HeaderFooterModel fromDocx4J(CTHeaderFooter value) {
    if (value == null) return null;
    return new CT_HeaderFooterModel(BooleanConverter.fromDocx4J(value.getDifferentOddEven()), BooleanConverter.fromDocx4J(value.getDifferentFirst()), BooleanConverter.fromDocx4J(value.getAlignWithMargins()), ST_XstringConverter.fromDocx4J(value.getOddHeader()), ST_XstringConverter.fromDocx4J(value.getOddFooter()), ST_XstringConverter.fromDocx4J(value.getEvenHeader()), ST_XstringConverter.fromDocx4J(value.getEvenFooter()), ST_XstringConverter.fromDocx4J(value.getFirstHeader()), ST_XstringConverter.fromDocx4J(value.getFirstFooter()));
  }

  public static CTHeaderFooter toDocx4J(CT_HeaderFooterModel value) {
    return null;
  }
}
