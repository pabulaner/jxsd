package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextTabStopModel;
import org.docx4j.dml.CTTextTabStop;

public class CT_TextTabStopConverter {
  private CT_TextTabStopConverter() {
  }

  public static CT_TextTabStopModel fromDocx4j(CTTextTabStop value) {
    if (value == null) return null;
    return new CT_TextTabStopModel(ST_Coordinate32Converter.fromDocx4j(value.getPos()), ST_TextTabAlignTypeConverter.fromDocx4j(value.getAlgn()));
  }

  public static CTTextTabStop toDocx4j(CT_TextTabStopModel value) {
    return null;
  }
}
