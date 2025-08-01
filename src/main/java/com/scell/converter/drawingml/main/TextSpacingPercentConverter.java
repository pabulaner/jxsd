package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPercentModel;
import org.docx4j.dml.CTTextSpacingPercent;

public class TextSpacingPercentConverter {
  private TextSpacingPercentConverter() {
  }

  public static TextSpacingPercentModel fromDocx4J(CTTextSpacingPercent value) {
    if (value == null) return null;
    return new TextSpacingPercentModel(TextSpacingPercentValueConverter.fromDocx4J(value.getVal()));
  }
}
