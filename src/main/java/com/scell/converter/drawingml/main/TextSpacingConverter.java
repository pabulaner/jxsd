package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingModel;
import org.docx4j.dml.CTTextSpacing;

public class TextSpacingConverter {
  private TextSpacingConverter() {
  }

  public static TextSpacingModel fromDocx4J(CTTextSpacing value) {
    if (value == null) return null;
    if (value.getSpcPct() != null) return TextSpacingModel.newSpcPct(TextSpacingPercentConverter.fromDocx4J(value.getSpcPct()));
    if (value.getSpcPts() != null) return TextSpacingModel.newSpcPts(TextSpacingPointConverter.fromDocx4J(value.getSpcPts()));
    return new TextSpacingModel();
  }
}
