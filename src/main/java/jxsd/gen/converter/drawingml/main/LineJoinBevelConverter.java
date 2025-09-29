package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LineJoinBevelModel;
import org.docx4j.dml.CTLineJoinBevel;

/**
 * This is a generated sequence class.
 */
public class LineJoinBevelConverter {
  private LineJoinBevelConverter() {
  }

  public static LineJoinBevelModel fromDocx4j(CTLineJoinBevel value) {
    if (value == null) return null;
    return new LineJoinBevelModel();
  }

  public static CTLineJoinBevel toDocx4j(LineJoinBevelModel value) {
    if (value == null) return null;
    CTLineJoinBevel result = new CTLineJoinBevel();
    return result;
  }
}
