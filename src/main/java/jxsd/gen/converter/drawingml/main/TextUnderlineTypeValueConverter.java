package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextUnderlineTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextUnderlineTypeValueModel;
import org.docx4j.dml.STTextUnderlineType;

/**
 * This is a generated enum class.
 */
public class TextUnderlineTypeValueConverter {
  private TextUnderlineTypeValueConverter() {
  }

  public static TextUnderlineTypeValueModel fromDocx4j(STTextUnderlineType value) {
    if (value == null) return null;
    if (value == TextUnderlineTypeValueBuilder.NONE) return TextUnderlineTypeValueModel.NONE;
    if (value == TextUnderlineTypeValueBuilder.WORDS) return TextUnderlineTypeValueModel.WORDS;
    if (value == TextUnderlineTypeValueBuilder.SNG) return TextUnderlineTypeValueModel.SNG;
    if (value == TextUnderlineTypeValueBuilder.DBL) return TextUnderlineTypeValueModel.DBL;
    if (value == TextUnderlineTypeValueBuilder.HEAVY) return TextUnderlineTypeValueModel.HEAVY;
    if (value == TextUnderlineTypeValueBuilder.DOTTED) return TextUnderlineTypeValueModel.DOTTED;
    if (value == TextUnderlineTypeValueBuilder.DOTTED_HEAVY) return TextUnderlineTypeValueModel.DOTTED_HEAVY;
    if (value == TextUnderlineTypeValueBuilder.DASH) return TextUnderlineTypeValueModel.DASH;
    if (value == TextUnderlineTypeValueBuilder.DASH_HEAVY) return TextUnderlineTypeValueModel.DASH_HEAVY;
    if (value == TextUnderlineTypeValueBuilder.DASH_LONG) return TextUnderlineTypeValueModel.DASH_LONG;
    if (value == TextUnderlineTypeValueBuilder.DASH_LONG_HEAVY) return TextUnderlineTypeValueModel.DASH_LONG_HEAVY;
    if (value == TextUnderlineTypeValueBuilder.DOT_DASH) return TextUnderlineTypeValueModel.DOT_DASH;
    if (value == TextUnderlineTypeValueBuilder.DOT_DASH_HEAVY) return TextUnderlineTypeValueModel.DOT_DASH_HEAVY;
    if (value == TextUnderlineTypeValueBuilder.DOT_DOT_DASH) return TextUnderlineTypeValueModel.DOT_DOT_DASH;
    if (value == TextUnderlineTypeValueBuilder.DOT_DOT_DASH_HEAVY) return TextUnderlineTypeValueModel.DOT_DOT_DASH_HEAVY;
    if (value == TextUnderlineTypeValueBuilder.WAVY) return TextUnderlineTypeValueModel.WAVY;
    if (value == TextUnderlineTypeValueBuilder.WAVY_HEAVY) return TextUnderlineTypeValueModel.WAVY_HEAVY;
    if (value == TextUnderlineTypeValueBuilder.WAVY_DBL) return TextUnderlineTypeValueModel.WAVY_DBL;
    return null;
  }

  public static STTextUnderlineType toDocx4j(TextUnderlineTypeValueModel value) {
    if (value == null) return null;
    if (value == TextUnderlineTypeValueModel.NONE) return TextUnderlineTypeValueBuilder.NONE;
    if (value == TextUnderlineTypeValueModel.WORDS) return TextUnderlineTypeValueBuilder.WORDS;
    if (value == TextUnderlineTypeValueModel.SNG) return TextUnderlineTypeValueBuilder.SNG;
    if (value == TextUnderlineTypeValueModel.DBL) return TextUnderlineTypeValueBuilder.DBL;
    if (value == TextUnderlineTypeValueModel.HEAVY) return TextUnderlineTypeValueBuilder.HEAVY;
    if (value == TextUnderlineTypeValueModel.DOTTED) return TextUnderlineTypeValueBuilder.DOTTED;
    if (value == TextUnderlineTypeValueModel.DOTTED_HEAVY) return TextUnderlineTypeValueBuilder.DOTTED_HEAVY;
    if (value == TextUnderlineTypeValueModel.DASH) return TextUnderlineTypeValueBuilder.DASH;
    if (value == TextUnderlineTypeValueModel.DASH_HEAVY) return TextUnderlineTypeValueBuilder.DASH_HEAVY;
    if (value == TextUnderlineTypeValueModel.DASH_LONG) return TextUnderlineTypeValueBuilder.DASH_LONG;
    if (value == TextUnderlineTypeValueModel.DASH_LONG_HEAVY) return TextUnderlineTypeValueBuilder.DASH_LONG_HEAVY;
    if (value == TextUnderlineTypeValueModel.DOT_DASH) return TextUnderlineTypeValueBuilder.DOT_DASH;
    if (value == TextUnderlineTypeValueModel.DOT_DASH_HEAVY) return TextUnderlineTypeValueBuilder.DOT_DASH_HEAVY;
    if (value == TextUnderlineTypeValueModel.DOT_DOT_DASH) return TextUnderlineTypeValueBuilder.DOT_DOT_DASH;
    if (value == TextUnderlineTypeValueModel.DOT_DOT_DASH_HEAVY) return TextUnderlineTypeValueBuilder.DOT_DOT_DASH_HEAVY;
    if (value == TextUnderlineTypeValueModel.WAVY) return TextUnderlineTypeValueBuilder.WAVY;
    if (value == TextUnderlineTypeValueModel.WAVY_HEAVY) return TextUnderlineTypeValueBuilder.WAVY_HEAVY;
    if (value == TextUnderlineTypeValueModel.WAVY_DBL) return TextUnderlineTypeValueBuilder.WAVY_DBL;
    return null;
  }
}
