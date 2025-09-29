package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextSpacingModel;
import org.docx4j.dml.CTTextSpacing;

/**
 * This is a generated choice class.
 */
public class TextSpacingConverter {
  private TextSpacingConverter() {
  }

  public static TextSpacingModel fromDocx4j(CTTextSpacing value) {
    if (value == null) return null;
    if (value.getSpcPct() != null) return TextSpacingModel.newSpcPct(TextSpacingPercentConverter.fromDocx4j(value.getSpcPct()));
    if (value.getSpcPts() != null) return TextSpacingModel.newSpcPts(TextSpacingPointConverter.fromDocx4j(value.getSpcPts()));
    return new TextSpacingModel();
  }

  public static CTTextSpacing toDocx4j(TextSpacingModel value) {
    if (value == null) return null;
    CTTextSpacing result = new CTTextSpacing();
    if (value.isSpcPct()) result.setSpcPct(TextSpacingPercentConverter.toDocx4j(value.getSpcPct()));
    if (value.isSpcPts()) result.setSpcPts(TextSpacingPointConverter.toDocx4j(value.getSpcPts()));
    return result;
  }
}
