package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextAutonumberSchemeModel;
import org.docx4j.dml.STTextAutonumberScheme;

public class ST_TextAutonumberSchemeConverter {
  private ST_TextAutonumberSchemeConverter() {
  }

  public static ST_TextAutonumberSchemeModel fromDocx4J(STTextAutonumberScheme value) {
    if (value == null) return null;
    if (value == STTextAutonumberScheme.ALPHA_LC_PAREN_BOTH) return ST_TextAutonumberSchemeModel.ALPHA_LC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ALPHA_UC_PAREN_BOTH) return ST_TextAutonumberSchemeModel.ALPHA_UC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ALPHA_LC_PAREN_R) return ST_TextAutonumberSchemeModel.ALPHA_LC_PAREN_R;
    if (value == STTextAutonumberScheme.ALPHA_UC_PAREN_R) return ST_TextAutonumberSchemeModel.ALPHA_UC_PAREN_R;
    if (value == STTextAutonumberScheme.ALPHA_LC_PERIOD) return ST_TextAutonumberSchemeModel.ALPHA_LC_PERIOD;
    if (value == STTextAutonumberScheme.ALPHA_UC_PERIOD) return ST_TextAutonumberSchemeModel.ALPHA_UC_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_PAREN_BOTH) return ST_TextAutonumberSchemeModel.ARABIC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ARABIC_PAREN_R) return ST_TextAutonumberSchemeModel.ARABIC_PAREN_R;
    if (value == STTextAutonumberScheme.ARABIC_PERIOD) return ST_TextAutonumberSchemeModel.ARABIC_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_PLAIN) return ST_TextAutonumberSchemeModel.ARABIC_PLAIN;
    if (value == STTextAutonumberScheme.ROMAN_LC_PAREN_BOTH) return ST_TextAutonumberSchemeModel.ROMAN_LC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ROMAN_UC_PAREN_BOTH) return ST_TextAutonumberSchemeModel.ROMAN_UC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ROMAN_LC_PAREN_R) return ST_TextAutonumberSchemeModel.ROMAN_LC_PAREN_R;
    if (value == STTextAutonumberScheme.ROMAN_UC_PAREN_R) return ST_TextAutonumberSchemeModel.ROMAN_UC_PAREN_R;
    if (value == STTextAutonumberScheme.ROMAN_LC_PERIOD) return ST_TextAutonumberSchemeModel.ROMAN_LC_PERIOD;
    if (value == STTextAutonumberScheme.ROMAN_UC_PERIOD) return ST_TextAutonumberSchemeModel.ROMAN_UC_PERIOD;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_DB_PLAIN) return ST_TextAutonumberSchemeModel.CIRCLE_NUM_DB_PLAIN;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_WD_BLACK_PLAIN) return ST_TextAutonumberSchemeModel.CIRCLE_NUM_WD_BLACK_PLAIN;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_WD_WHITE_PLAIN) return ST_TextAutonumberSchemeModel.CIRCLE_NUM_WD_WHITE_PLAIN;
    if (value == STTextAutonumberScheme.ARABIC_DB_PERIOD) return ST_TextAutonumberSchemeModel.ARABIC_DB_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_DB_PLAIN) return ST_TextAutonumberSchemeModel.ARABIC_DB_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_CHS_PERIOD) return ST_TextAutonumberSchemeModel.EA_1_CHS_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_CHS_PLAIN) return ST_TextAutonumberSchemeModel.EA_1_CHS_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_CHT_PERIOD) return ST_TextAutonumberSchemeModel.EA_1_CHT_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_CHT_PLAIN) return ST_TextAutonumberSchemeModel.EA_1_CHT_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_JPN_CHS_DB_PERIOD) return ST_TextAutonumberSchemeModel.EA_1_JPN_CHS_DB_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_JPN_KOR_PLAIN) return ST_TextAutonumberSchemeModel.EA_1_JPN_KOR_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_JPN_KOR_PERIOD) return ST_TextAutonumberSchemeModel.EA_1_JPN_KOR_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_1_MINUS) return ST_TextAutonumberSchemeModel.ARABIC_1_MINUS;
    if (value == STTextAutonumberScheme.ARABIC_2_MINUS) return ST_TextAutonumberSchemeModel.ARABIC_2_MINUS;
    if (value == STTextAutonumberScheme.HEBREW_2_MINUS) return ST_TextAutonumberSchemeModel.HEBREW_2_MINUS;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PERIOD) return ST_TextAutonumberSchemeModel.THAI_ALPHA_PERIOD;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PAREN_R) return ST_TextAutonumberSchemeModel.THAI_ALPHA_PAREN_R;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PAREN_BOTH) return ST_TextAutonumberSchemeModel.THAI_ALPHA_PAREN_BOTH;
    if (value == STTextAutonumberScheme.THAI_NUM_PERIOD) return ST_TextAutonumberSchemeModel.THAI_NUM_PERIOD;
    if (value == STTextAutonumberScheme.THAI_NUM_PAREN_R) return ST_TextAutonumberSchemeModel.THAI_NUM_PAREN_R;
    if (value == STTextAutonumberScheme.THAI_NUM_PAREN_BOTH) return ST_TextAutonumberSchemeModel.THAI_NUM_PAREN_BOTH;
    if (value == STTextAutonumberScheme.HINDI_ALPHA_PERIOD) return ST_TextAutonumberSchemeModel.HINDI_ALPHA_PERIOD;
    if (value == STTextAutonumberScheme.HINDI_NUM_PERIOD) return ST_TextAutonumberSchemeModel.HINDI_NUM_PERIOD;
    if (value == STTextAutonumberScheme.HINDI_NUM_PAREN_R) return ST_TextAutonumberSchemeModel.HINDI_NUM_PAREN_R;
    if (value == STTextAutonumberScheme.HINDI_ALPHA_1_PERIOD) return ST_TextAutonumberSchemeModel.HINDI_ALPHA_1_PERIOD;
    return null;
  }

  public static STTextAutonumberScheme toDocx4J(ST_TextAutonumberSchemeModel value) {
    return null;
  }
}
