package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import org.docx4j.dml.chart.CTNumFmt;

public class CT_NumFmtConverter {
  private CT_NumFmtConverter() {
  }

  public static CT_NumFmtModel fromDocx4J(CTNumFmt value) {
    if (value == null) return null;
    return new CT_NumFmtModel(ST_XstringConverter.fromDocx4J(value.getFormatCode()), BooleanConverter.fromDocx4J(value.getSourceLinked()));
  }

  public static CTNumFmt toDocx4J(CT_NumFmtModel value) {
    return null;
  }
}
