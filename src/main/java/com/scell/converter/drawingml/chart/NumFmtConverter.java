package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.chart.NumFmtModel;
import org.docx4j.dml.chart.CTNumFmt;

public class NumFmtConverter {
  private NumFmtConverter() {
  }

  public static NumFmtModel fromDocx4J(CTNumFmt value) {
    if (value == null) return null;
    return new NumFmtModel(XstringConverter.fromDocx4J(value.getFormatCode()), BooleanConverter.fromDocx4J(value.isSourceLinked()));
  }
}
