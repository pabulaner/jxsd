package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextUnderlineType.NONE) return TextUnderlineTypeValueModel.NONE;
    if (value == STTextUnderlineType.WORDS) return TextUnderlineTypeValueModel.WORDS;
    if (value == STTextUnderlineType.SNG) return TextUnderlineTypeValueModel.SNG;
    if (value == STTextUnderlineType.DBL) return TextUnderlineTypeValueModel.DBL;
    if (value == STTextUnderlineType.HEAVY) return TextUnderlineTypeValueModel.HEAVY;
    if (value == STTextUnderlineType.DOTTED) return TextUnderlineTypeValueModel.DOTTED;
    if (value == STTextUnderlineType.DOTTED_HEAVY) return TextUnderlineTypeValueModel.DOTTED_HEAVY;
    if (value == STTextUnderlineType.DASH) return TextUnderlineTypeValueModel.DASH;
    if (value == STTextUnderlineType.DASH_HEAVY) return TextUnderlineTypeValueModel.DASH_HEAVY;
    if (value == STTextUnderlineType.DASH_LONG) return TextUnderlineTypeValueModel.DASH_LONG;
    if (value == STTextUnderlineType.DASH_LONG_HEAVY) return TextUnderlineTypeValueModel.DASH_LONG_HEAVY;
    if (value == STTextUnderlineType.DOT_DASH) return TextUnderlineTypeValueModel.DOT_DASH;
    if (value == STTextUnderlineType.DOT_DASH_HEAVY) return TextUnderlineTypeValueModel.DOT_DASH_HEAVY;
    if (value == STTextUnderlineType.DOT_DOT_DASH) return TextUnderlineTypeValueModel.DOT_DOT_DASH;
    if (value == STTextUnderlineType.DOT_DOT_DASH_HEAVY) return TextUnderlineTypeValueModel.DOT_DOT_DASH_HEAVY;
    if (value == STTextUnderlineType.WAVY) return TextUnderlineTypeValueModel.WAVY;
    if (value == STTextUnderlineType.WAVY_HEAVY) return TextUnderlineTypeValueModel.WAVY_HEAVY;
    if (value == STTextUnderlineType.WAVY_DBL) return TextUnderlineTypeValueModel.WAVY_DBL;
    return null;
  }

  public static STTextUnderlineType toDocx4j(TextUnderlineTypeValueModel value) {
    if (value == null) return null;
    if (value == TextUnderlineTypeValueModel.NONE) return STTextUnderlineType.NONE;
    if (value == TextUnderlineTypeValueModel.WORDS) return STTextUnderlineType.WORDS;
    if (value == TextUnderlineTypeValueModel.SNG) return STTextUnderlineType.SNG;
    if (value == TextUnderlineTypeValueModel.DBL) return STTextUnderlineType.DBL;
    if (value == TextUnderlineTypeValueModel.HEAVY) return STTextUnderlineType.HEAVY;
    if (value == TextUnderlineTypeValueModel.DOTTED) return STTextUnderlineType.DOTTED;
    if (value == TextUnderlineTypeValueModel.DOTTED_HEAVY) return STTextUnderlineType.DOTTED_HEAVY;
    if (value == TextUnderlineTypeValueModel.DASH) return STTextUnderlineType.DASH;
    if (value == TextUnderlineTypeValueModel.DASH_HEAVY) return STTextUnderlineType.DASH_HEAVY;
    if (value == TextUnderlineTypeValueModel.DASH_LONG) return STTextUnderlineType.DASH_LONG;
    if (value == TextUnderlineTypeValueModel.DASH_LONG_HEAVY) return STTextUnderlineType.DASH_LONG_HEAVY;
    if (value == TextUnderlineTypeValueModel.DOT_DASH) return STTextUnderlineType.DOT_DASH;
    if (value == TextUnderlineTypeValueModel.DOT_DASH_HEAVY) return STTextUnderlineType.DOT_DASH_HEAVY;
    if (value == TextUnderlineTypeValueModel.DOT_DOT_DASH) return STTextUnderlineType.DOT_DOT_DASH;
    if (value == TextUnderlineTypeValueModel.DOT_DOT_DASH_HEAVY) return STTextUnderlineType.DOT_DOT_DASH_HEAVY;
    if (value == TextUnderlineTypeValueModel.WAVY) return STTextUnderlineType.WAVY;
    if (value == TextUnderlineTypeValueModel.WAVY_HEAVY) return STTextUnderlineType.WAVY_HEAVY;
    if (value == TextUnderlineTypeValueModel.WAVY_DBL) return STTextUnderlineType.WAVY_DBL;
    return null;
  }
}
