package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineTypeModel;
import org.docx4j.dml.STTextUnderlineType;

public class TextUnderlineTypeConverter {
  private TextUnderlineTypeConverter() {
  }

  public static TextUnderlineTypeModel fromDocx4J(STTextUnderlineType value) {
    if (value == null) return null;
    if (value == STTextUnderlineType.NONE) return TextUnderlineTypeModel.NONE;
    if (value == STTextUnderlineType.WORDS) return TextUnderlineTypeModel.WORDS;
    if (value == STTextUnderlineType.SNG) return TextUnderlineTypeModel.SNG;
    if (value == STTextUnderlineType.DBL) return TextUnderlineTypeModel.DBL;
    if (value == STTextUnderlineType.HEAVY) return TextUnderlineTypeModel.HEAVY;
    if (value == STTextUnderlineType.DOTTED) return TextUnderlineTypeModel.DOTTED;
    if (value == STTextUnderlineType.DOTTED_HEAVY) return TextUnderlineTypeModel.DOTTED_HEAVY;
    if (value == STTextUnderlineType.DASH) return TextUnderlineTypeModel.DASH;
    if (value == STTextUnderlineType.DASH_HEAVY) return TextUnderlineTypeModel.DASH_HEAVY;
    if (value == STTextUnderlineType.DASH_LONG) return TextUnderlineTypeModel.DASH_LONG;
    if (value == STTextUnderlineType.DASH_LONG_HEAVY) return TextUnderlineTypeModel.DASH_LONG_HEAVY;
    if (value == STTextUnderlineType.DOT_DASH) return TextUnderlineTypeModel.DOT_DASH;
    if (value == STTextUnderlineType.DOT_DASH_HEAVY) return TextUnderlineTypeModel.DOT_DASH_HEAVY;
    if (value == STTextUnderlineType.DOT_DOT_DASH) return TextUnderlineTypeModel.DOT_DOT_DASH;
    if (value == STTextUnderlineType.DOT_DOT_DASH_HEAVY) return TextUnderlineTypeModel.DOT_DOT_DASH_HEAVY;
    if (value == STTextUnderlineType.WAVY) return TextUnderlineTypeModel.WAVY;
    if (value == STTextUnderlineType.WAVY_HEAVY) return TextUnderlineTypeModel.WAVY_HEAVY;
    if (value == STTextUnderlineType.WAVY_DBL) return TextUnderlineTypeModel.WAVY_DBL;
    return null;
  }
}
