package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinBevelModel;
import org.docx4j.dml.CTLineJoinBevel;

public class CT_LineJoinBevelConverter {
  private CT_LineJoinBevelConverter() {
  }

  public static CT_LineJoinBevelModel fromDocx4J(CTLineJoinBevel value) {
    if (value == null) return null;
    return new CT_LineJoinBevelModel();
  }

  public static CTLineJoinBevel toDocx4J(CT_LineJoinBevelModel value) {
    return null;
  }
}
