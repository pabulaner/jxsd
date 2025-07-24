package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.StyleModel;
import org.docx4j.dml.chart.CTStyle;

public class StyleConverter {
  private StyleConverter() {
  }

  public static StyleModel fromDocx4J(CTStyle value) {
    if (value == null) return null;
    return new StyleModel(StyleConverter.fromDocx4J(value.getVal()));
  }
}
