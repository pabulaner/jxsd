package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LineJoinRoundModel;
import org.docx4j.dml.CTLineJoinRound;

/**
 * This is a generated sequence class.
 */
public class LineJoinRoundConverter {
  private LineJoinRoundConverter() {
  }

  public static LineJoinRoundModel fromDocx4j(CTLineJoinRound value) {
    if (value == null) return null;
    return new LineJoinRoundModel();
  }

  public static CTLineJoinRound toDocx4j(LineJoinRoundModel value) {
    if (value == null) return null;
    CTLineJoinRound result = new CTLineJoinRound();
    return result;
  }
}
