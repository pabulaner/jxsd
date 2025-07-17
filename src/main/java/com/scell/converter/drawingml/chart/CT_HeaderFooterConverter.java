package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.chart.CT_HeaderFooterModel;
import org.docx4j.dml.chart.CTHeaderFooter;

public class CT_HeaderFooterConverter {
  private CT_HeaderFooterConverter() {
  }

  public static CT_HeaderFooterModel fromDocx4j(CTHeaderFooter value) {
    if (value == null) return null;
    return new CT_HeaderFooterModel(BooleanConverter.fromDocx4j(value.getDifferentOddEven()), BooleanConverter.fromDocx4j(value.getDifferentFirst()), BooleanConverter.fromDocx4j(value.getAlignWithMargins()), ST_XstringConverter.fromDocx4j(value.getOddHeader()), ST_XstringConverter.fromDocx4j(value.getOddFooter()), ST_XstringConverter.fromDocx4j(value.getEvenHeader()), ST_XstringConverter.fromDocx4j(value.getEvenFooter()), ST_XstringConverter.fromDocx4j(value.getFirstHeader()), ST_XstringConverter.fromDocx4j(value.getFirstFooter()));
  }

  public static CTHeaderFooter toDocx4j(CT_HeaderFooterModel value) {
    return null;
  }
}
