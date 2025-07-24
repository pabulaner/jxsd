package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextAutonumberSchemeModel;
import org.docx4j.dml.STTextAutonumberScheme;

public class TextAutonumberSchemeConverter {
  private TextAutonumberSchemeConverter() {
  }

  public static TextAutonumberSchemeModel fromDocx4J(STTextAutonumberScheme value) {
    if (value == null) return null;
    if (value == STTextAutonumberScheme.ALPHA_LC_PAREN_BOTH) return TextAutonumberSchemeModel.ALPHA_LC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ALPHA_UC_PAREN_BOTH) return TextAutonumberSchemeModel.ALPHA_UC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ALPHA_LC_PAREN_R) return TextAutonumberSchemeModel.ALPHA_LC_PAREN_R;
    if (value == STTextAutonumberScheme.ALPHA_UC_PAREN_R) return TextAutonumberSchemeModel.ALPHA_UC_PAREN_R;
    if (value == STTextAutonumberScheme.ALPHA_LC_PERIOD) return TextAutonumberSchemeModel.ALPHA_LC_PERIOD;
    if (value == STTextAutonumberScheme.ALPHA_UC_PERIOD) return TextAutonumberSchemeModel.ALPHA_UC_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_PAREN_BOTH) return TextAutonumberSchemeModel.ARABIC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ARABIC_PAREN_R) return TextAutonumberSchemeModel.ARABIC_PAREN_R;
    if (value == STTextAutonumberScheme.ARABIC_PERIOD) return TextAutonumberSchemeModel.ARABIC_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_PLAIN) return TextAutonumberSchemeModel.ARABIC_PLAIN;
    if (value == STTextAutonumberScheme.ROMAN_LC_PAREN_BOTH) return TextAutonumberSchemeModel.ROMAN_LC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ROMAN_UC_PAREN_BOTH) return TextAutonumberSchemeModel.ROMAN_UC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ROMAN_LC_PAREN_R) return TextAutonumberSchemeModel.ROMAN_LC_PAREN_R;
    if (value == STTextAutonumberScheme.ROMAN_UC_PAREN_R) return TextAutonumberSchemeModel.ROMAN_UC_PAREN_R;
    if (value == STTextAutonumberScheme.ROMAN_LC_PERIOD) return TextAutonumberSchemeModel.ROMAN_LC_PERIOD;
    if (value == STTextAutonumberScheme.ROMAN_UC_PERIOD) return TextAutonumberSchemeModel.ROMAN_UC_PERIOD;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_DB_PLAIN) return TextAutonumberSchemeModel.CIRCLE_NUM_DB_PLAIN;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_WD_BLACK_PLAIN) return TextAutonumberSchemeModel.CIRCLE_NUM_WD_BLACK_PLAIN;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_WD_WHITE_PLAIN) return TextAutonumberSchemeModel.CIRCLE_NUM_WD_WHITE_PLAIN;
    if (value == STTextAutonumberScheme.ARABIC_DB_PERIOD) return TextAutonumberSchemeModel.ARABIC_DB_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_DB_PLAIN) return TextAutonumberSchemeModel.ARABIC_DB_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_CHS_PERIOD) return TextAutonumberSchemeModel.EA_1_CHS_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_CHS_PLAIN) return TextAutonumberSchemeModel.EA_1_CHS_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_CHT_PERIOD) return TextAutonumberSchemeModel.EA_1_CHT_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_CHT_PLAIN) return TextAutonumberSchemeModel.EA_1_CHT_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_JPN_CHS_DB_PERIOD) return TextAutonumberSchemeModel.EA_1_JPN_CHS_DB_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_JPN_KOR_PLAIN) return TextAutonumberSchemeModel.EA_1_JPN_KOR_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_JPN_KOR_PERIOD) return TextAutonumberSchemeModel.EA_1_JPN_KOR_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_1_MINUS) return TextAutonumberSchemeModel.ARABIC_1_MINUS;
    if (value == STTextAutonumberScheme.ARABIC_2_MINUS) return TextAutonumberSchemeModel.ARABIC_2_MINUS;
    if (value == STTextAutonumberScheme.HEBREW_2_MINUS) return TextAutonumberSchemeModel.HEBREW_2_MINUS;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PERIOD) return TextAutonumberSchemeModel.THAI_ALPHA_PERIOD;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PAREN_R) return TextAutonumberSchemeModel.THAI_ALPHA_PAREN_R;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PAREN_BOTH) return TextAutonumberSchemeModel.THAI_ALPHA_PAREN_BOTH;
    if (value == STTextAutonumberScheme.THAI_NUM_PERIOD) return TextAutonumberSchemeModel.THAI_NUM_PERIOD;
    if (value == STTextAutonumberScheme.THAI_NUM_PAREN_R) return TextAutonumberSchemeModel.THAI_NUM_PAREN_R;
    if (value == STTextAutonumberScheme.THAI_NUM_PAREN_BOTH) return TextAutonumberSchemeModel.THAI_NUM_PAREN_BOTH;
    if (value == STTextAutonumberScheme.HINDI_ALPHA_PERIOD) return TextAutonumberSchemeModel.HINDI_ALPHA_PERIOD;
    if (value == STTextAutonumberScheme.HINDI_NUM_PERIOD) return TextAutonumberSchemeModel.HINDI_NUM_PERIOD;
    if (value == STTextAutonumberScheme.HINDI_NUM_PAREN_R) return TextAutonumberSchemeModel.HINDI_NUM_PAREN_R;
    if (value == STTextAutonumberScheme.HINDI_ALPHA_1_PERIOD) return TextAutonumberSchemeModel.HINDI_ALPHA_1_PERIOD;
    return null;
  }
}
