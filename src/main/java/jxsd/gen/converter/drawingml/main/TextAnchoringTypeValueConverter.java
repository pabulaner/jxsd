package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAnchoringTypeValueModel;
import org.docx4j.dml.STTextAnchoringType;

/**
 * This is a generated enum class.
 */
public class TextAnchoringTypeValueConverter {
  private TextAnchoringTypeValueConverter() {
  }

  public static TextAnchoringTypeValueModel fromDocx4j(STTextAnchoringType value) {
    if (value == null) return null;
    if (value == STTextAnchoringType.T) return TextAnchoringTypeValueModel.T;
    if (value == STTextAnchoringType.CTR) return TextAnchoringTypeValueModel.CTR;
    if (value == STTextAnchoringType.B) return TextAnchoringTypeValueModel.B;
    if (value == STTextAnchoringType.JUST) return TextAnchoringTypeValueModel.JUST;
    if (value == STTextAnchoringType.DIST) return TextAnchoringTypeValueModel.DIST;
    return null;
  }

  public static STTextAnchoringType toDocx4j(TextAnchoringTypeValueModel value) {
    if (value == null) return null;
    if (value == TextAnchoringTypeValueModel.T) return STTextAnchoringType.T;
    if (value == TextAnchoringTypeValueModel.CTR) return STTextAnchoringType.CTR;
    if (value == TextAnchoringTypeValueModel.B) return STTextAnchoringType.B;
    if (value == TextAnchoringTypeValueModel.JUST) return STTextAnchoringType.JUST;
    if (value == TextAnchoringTypeValueModel.DIST) return STTextAnchoringType.DIST;
    return null;
  }
}
