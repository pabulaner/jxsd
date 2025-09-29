package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextNormalAutofitModel;
import org.docx4j.dml.CTTextNormalAutofit;

/**
 * This is a generated sequence class.
 */
public class TextNormalAutofitConverter {
  private TextNormalAutofitConverter() {
  }

  public static TextNormalAutofitModel fromDocx4j(CTTextNormalAutofit value) {
    if (value == null) return null;
    return new TextNormalAutofitModel(TextFontScalePercentValueConverter.fromDocx4j(value.getFontScale()), TextSpacingPercentValueConverter.fromDocx4j(value.getLnSpcReduction()));
  }

  public static CTTextNormalAutofit toDocx4j(TextNormalAutofitModel value) {
    if (value == null) return null;
    CTTextNormalAutofit result = new CTTextNormalAutofit();
    result.setFontScale(TextFontScalePercentValueConverter.toDocx4j(value.getFontScale()));
    result.setLnSpcReduction(TextSpacingPercentValueConverter.toDocx4j(value.getLnSpcReduction()));
    return result;
  }
}
