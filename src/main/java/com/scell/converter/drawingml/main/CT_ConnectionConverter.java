package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.CT_ConnectionModel;
import org.docx4j.dml.CTConnection;

public class CT_ConnectionConverter {
  private CT_ConnectionConverter() {
  }

  public static CT_ConnectionModel fromDocx4j(CTConnection value) {
    if (value == null) return null;
    return new CT_ConnectionModel(ST_DrawingElementIdConverter.fromDocx4j(value.getId()), UnsignedIntConverter.fromDocx4j(value.getIdx()));
  }

  public static CTConnection toDocx4j(CT_ConnectionModel value) {
    return null;
  }
}
