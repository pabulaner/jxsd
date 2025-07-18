package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TextLanguageIDModel;
import org.docx4j.dml.chart.CTTextLanguageID;

public class CT_TextLanguageIDConverter {
  private CT_TextLanguageIDConverter() {
  }

  public static CT_TextLanguageIDModel fromDocx4J(CTTextLanguageID value) {
    if (value == null) return null;
    return new CT_TextLanguageIDModel(ST_TextLanguageIDConverter.fromDocx4J(value.getVal()));
  }

  public static CTTextLanguageID toDocx4J(CT_TextLanguageIDModel value) {
    return null;
  }
}
