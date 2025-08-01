package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineTypeValueModel;
import org.docx4j.dml.STTextUnderlineType;

public class TextUnderlineTypeValueConverter {
  private TextUnderlineTypeValueConverter() {
  }

  public static TextUnderlineTypeValueModel fromDocx4J(STTextUnderlineType value) {
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
}
