package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextAnchoringTypeValueBuilder;
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
    if (value == TextAnchoringTypeValueBuilder.T) return TextAnchoringTypeValueModel.T;
    if (value == TextAnchoringTypeValueBuilder.CTR) return TextAnchoringTypeValueModel.CTR;
    if (value == TextAnchoringTypeValueBuilder.B) return TextAnchoringTypeValueModel.B;
    if (value == TextAnchoringTypeValueBuilder.JUST) return TextAnchoringTypeValueModel.JUST;
    if (value == TextAnchoringTypeValueBuilder.DIST) return TextAnchoringTypeValueModel.DIST;
    return null;
  }

  public static STTextAnchoringType toDocx4j(TextAnchoringTypeValueModel value) {
    if (value == null) return null;
    if (value == TextAnchoringTypeValueModel.T) return TextAnchoringTypeValueBuilder.T;
    if (value == TextAnchoringTypeValueModel.CTR) return TextAnchoringTypeValueBuilder.CTR;
    if (value == TextAnchoringTypeValueModel.B) return TextAnchoringTypeValueBuilder.B;
    if (value == TextAnchoringTypeValueModel.JUST) return TextAnchoringTypeValueBuilder.JUST;
    if (value == TextAnchoringTypeValueModel.DIST) return TextAnchoringTypeValueBuilder.DIST;
    return null;
  }
}
