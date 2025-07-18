package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextUnderlineTypeModel;
import org.docx4j.dml.STTextUnderlineType;

public class ST_TextUnderlineTypeConverter {
  private ST_TextUnderlineTypeConverter() {
  }

  public static ST_TextUnderlineTypeModel fromDocx4J(STTextUnderlineType value) {
    if (value == null) return null;
    if (value == STTextUnderlineType.NONE) return ST_TextUnderlineTypeModel.NONE;
    if (value == STTextUnderlineType.WORDS) return ST_TextUnderlineTypeModel.WORDS;
    if (value == STTextUnderlineType.SNG) return ST_TextUnderlineTypeModel.SNG;
    if (value == STTextUnderlineType.DBL) return ST_TextUnderlineTypeModel.DBL;
    if (value == STTextUnderlineType.HEAVY) return ST_TextUnderlineTypeModel.HEAVY;
    if (value == STTextUnderlineType.DOTTED) return ST_TextUnderlineTypeModel.DOTTED;
    if (value == STTextUnderlineType.DOTTED_HEAVY) return ST_TextUnderlineTypeModel.DOTTED_HEAVY;
    if (value == STTextUnderlineType.DASH) return ST_TextUnderlineTypeModel.DASH;
    if (value == STTextUnderlineType.DASH_HEAVY) return ST_TextUnderlineTypeModel.DASH_HEAVY;
    if (value == STTextUnderlineType.DASH_LONG) return ST_TextUnderlineTypeModel.DASH_LONG;
    if (value == STTextUnderlineType.DASH_LONG_HEAVY) return ST_TextUnderlineTypeModel.DASH_LONG_HEAVY;
    if (value == STTextUnderlineType.DOT_DASH) return ST_TextUnderlineTypeModel.DOT_DASH;
    if (value == STTextUnderlineType.DOT_DASH_HEAVY) return ST_TextUnderlineTypeModel.DOT_DASH_HEAVY;
    if (value == STTextUnderlineType.DOT_DOT_DASH) return ST_TextUnderlineTypeModel.DOT_DOT_DASH;
    if (value == STTextUnderlineType.DOT_DOT_DASH_HEAVY) return ST_TextUnderlineTypeModel.DOT_DOT_DASH_HEAVY;
    if (value == STTextUnderlineType.WAVY) return ST_TextUnderlineTypeModel.WAVY;
    if (value == STTextUnderlineType.WAVY_HEAVY) return ST_TextUnderlineTypeModel.WAVY_HEAVY;
    if (value == STTextUnderlineType.WAVY_DBL) return ST_TextUnderlineTypeModel.WAVY_DBL;
    return null;
  }

  public static STTextUnderlineType toDocx4J(ST_TextUnderlineTypeModel value) {
    return null;
  }
}
