package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextTabStopModel;
import org.docx4j.dml.CTTextTabStop;

public class TextTabStopConverter {
  private TextTabStopConverter() {
  }

  public static TextTabStopModel fromDocx4J(CTTextTabStop value) {
    if (value == null) return null;
    return new TextTabStopModel(Coordinate32ValueConverter.fromDocx4J(value.getPos()), TextTabAlignTypeValueConverter.fromDocx4J(value.getAlgn()));
  }
}
