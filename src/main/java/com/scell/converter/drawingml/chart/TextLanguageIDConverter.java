package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TextLanguageIDModel;
import org.docx4j.dml.chart.CTTextLanguageID;

public class TextLanguageIDConverter {
  private TextLanguageIDConverter() {
  }

  public static TextLanguageIDModel fromDocx4J(CTTextLanguageID value) {
    if (value == null) return null;
    return new TextLanguageIDModel(TextLanguageIDValueConverter.fromDocx4J(value.getVal()));
  }
}
