package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextTabStopModel;
import org.docx4j.dml.CTTextTabStop;

/**
 * This is a generated sequence class.
 */
public class TextTabStopConverter {
  private TextTabStopConverter() {
  }

  public static TextTabStopModel fromDocx4j(CTTextTabStop value) {
    if (value == null) return null;
    return new TextTabStopModel(Coordinate32ValueConverter.fromDocx4j(value.getPos()), TextTabAlignTypeValueConverter.fromDocx4j(value.getAlgn()));
  }

  public static CTTextTabStop toDocx4j(TextTabStopModel value) {
    if (value == null) return null;
    CTTextTabStop result = new CTTextTabStop();
    result.setPos(Coordinate32ValueConverter.toDocx4j(value.getPos()));
    result.setAlgn(TextTabAlignTypeValueConverter.toDocx4j(value.getAlgn()));
    return result;
  }
}
