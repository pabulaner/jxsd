package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.CT_ConnectionModel;
import org.docx4j.dml.CTConnection;

public class CT_ConnectionConverter {
  private CT_ConnectionConverter() {
  }

  public static CT_ConnectionModel fromDocx4J(CTConnection value) {
    if (value == null) return null;
    return new CT_ConnectionModel(ST_DrawingElementIdConverter.fromDocx4J(value.getId()), UnsignedIntConverter.fromDocx4J(value.getIdx()));
  }

  public static CTConnection toDocx4J(CT_ConnectionModel value) {
    return null;
  }
}
