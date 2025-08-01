package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.chart.NumFmtModel;
import org.docx4j.dml.chart.CTNumFmt;

public class NumFmtConverter {
  private NumFmtConverter() {
  }

  public static NumFmtModel fromDocx4J(CTNumFmt value) {
    if (value == null) return null;
    return new NumFmtModel(XstringValueConverter.fromDocx4J(value.getFormatCode()), BooleanValueConverter.fromDocx4J(value.isSourceLinked()));
  }
}
