package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineJoinBevelModel;
import org.docx4j.dml.CTLineJoinBevel;

public class LineJoinBevelConverter {
  private LineJoinBevelConverter() {
  }

  public static LineJoinBevelModel fromDocx4J(CTLineJoinBevel value) {
    if (value == null) return null;
    return new LineJoinBevelModel();
  }
}
