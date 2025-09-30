package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAutonumberSchemeValueModel;
import org.docx4j.dml.STTextAutonumberScheme;

/**
 * This is a generated enum class.
 */
public class TextAutonumberSchemeValueConverter {
  private TextAutonumberSchemeValueConverter() {
  }

  public static TextAutonumberSchemeValueModel fromDocx4j(STTextAutonumberScheme value) {
    if (value == null) return null;
    if (value == STTextAutonumberScheme.ALPHA_LC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ALPHA_UC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ALPHA_LC_PAREN_R) return TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_R;
    if (value == STTextAutonumberScheme.ALPHA_UC_PAREN_R) return TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_R;
    if (value == STTextAutonumberScheme.ALPHA_LC_PERIOD) return TextAutonumberSchemeValueModel.ALPHA_LC_PERIOD;
    if (value == STTextAutonumberScheme.ALPHA_UC_PERIOD) return TextAutonumberSchemeValueModel.ALPHA_UC_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ARABIC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ARABIC_PAREN_R) return TextAutonumberSchemeValueModel.ARABIC_PAREN_R;
    if (value == STTextAutonumberScheme.ARABIC_PERIOD) return TextAutonumberSchemeValueModel.ARABIC_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_PLAIN) return TextAutonumberSchemeValueModel.ARABIC_PLAIN;
    if (value == STTextAutonumberScheme.ROMAN_LC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ROMAN_UC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_BOTH;
    if (value == STTextAutonumberScheme.ROMAN_LC_PAREN_R) return TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_R;
    if (value == STTextAutonumberScheme.ROMAN_UC_PAREN_R) return TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_R;
    if (value == STTextAutonumberScheme.ROMAN_LC_PERIOD) return TextAutonumberSchemeValueModel.ROMAN_LC_PERIOD;
    if (value == STTextAutonumberScheme.ROMAN_UC_PERIOD) return TextAutonumberSchemeValueModel.ROMAN_UC_PERIOD;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_DB_PLAIN) return TextAutonumberSchemeValueModel.CIRCLE_NUM_DB_PLAIN;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_WD_BLACK_PLAIN) return TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_BLACK_PLAIN;
    if (value == STTextAutonumberScheme.CIRCLE_NUM_WD_WHITE_PLAIN) return TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_WHITE_PLAIN;
    if (value == STTextAutonumberScheme.ARABIC_DB_PERIOD) return TextAutonumberSchemeValueModel.ARABIC_DB_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_DB_PLAIN) return TextAutonumberSchemeValueModel.ARABIC_DB_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_CHS_PERIOD) return TextAutonumberSchemeValueModel.EA_1_CHS_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_CHS_PLAIN) return TextAutonumberSchemeValueModel.EA_1_CHS_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_CHT_PERIOD) return TextAutonumberSchemeValueModel.EA_1_CHT_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_CHT_PLAIN) return TextAutonumberSchemeValueModel.EA_1_CHT_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_JPN_CHS_DB_PERIOD) return TextAutonumberSchemeValueModel.EA_1_JPN_CHS_DB_PERIOD;
    if (value == STTextAutonumberScheme.EA_1_JPN_KOR_PLAIN) return TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PLAIN;
    if (value == STTextAutonumberScheme.EA_1_JPN_KOR_PERIOD) return TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PERIOD;
    if (value == STTextAutonumberScheme.ARABIC_1_MINUS) return TextAutonumberSchemeValueModel.ARABIC_1_MINUS;
    if (value == STTextAutonumberScheme.ARABIC_2_MINUS) return TextAutonumberSchemeValueModel.ARABIC_2_MINUS;
    if (value == STTextAutonumberScheme.HEBREW_2_MINUS) return TextAutonumberSchemeValueModel.HEBREW_2_MINUS;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PERIOD) return TextAutonumberSchemeValueModel.THAI_ALPHA_PERIOD;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PAREN_R) return TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_R;
    if (value == STTextAutonumberScheme.THAI_ALPHA_PAREN_BOTH) return TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_BOTH;
    if (value == STTextAutonumberScheme.THAI_NUM_PERIOD) return TextAutonumberSchemeValueModel.THAI_NUM_PERIOD;
    if (value == STTextAutonumberScheme.THAI_NUM_PAREN_R) return TextAutonumberSchemeValueModel.THAI_NUM_PAREN_R;
    if (value == STTextAutonumberScheme.THAI_NUM_PAREN_BOTH) return TextAutonumberSchemeValueModel.THAI_NUM_PAREN_BOTH;
    if (value == STTextAutonumberScheme.HINDI_ALPHA_PERIOD) return TextAutonumberSchemeValueModel.HINDI_ALPHA_PERIOD;
    if (value == STTextAutonumberScheme.HINDI_NUM_PERIOD) return TextAutonumberSchemeValueModel.HINDI_NUM_PERIOD;
    if (value == STTextAutonumberScheme.HINDI_NUM_PAREN_R) return TextAutonumberSchemeValueModel.HINDI_NUM_PAREN_R;
    if (value == STTextAutonumberScheme.HINDI_ALPHA_1_PERIOD) return TextAutonumberSchemeValueModel.HINDI_ALPHA_1_PERIOD;
    return null;
  }

  public static STTextAutonumberScheme toDocx4j(TextAutonumberSchemeValueModel value) {
    if (value == null) return null;
    if (value == TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_BOTH) return STTextAutonumberScheme.ALPHA_LC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_BOTH) return STTextAutonumberScheme.ALPHA_UC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_R) return STTextAutonumberScheme.ALPHA_LC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_R) return STTextAutonumberScheme.ALPHA_UC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ALPHA_LC_PERIOD) return STTextAutonumberScheme.ALPHA_LC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ALPHA_UC_PERIOD) return STTextAutonumberScheme.ALPHA_UC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PAREN_BOTH) return STTextAutonumberScheme.ARABIC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PAREN_R) return STTextAutonumberScheme.ARABIC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PERIOD) return STTextAutonumberScheme.ARABIC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PLAIN) return STTextAutonumberScheme.ARABIC_PLAIN;
    if (value == TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_BOTH) return STTextAutonumberScheme.ROMAN_LC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_BOTH) return STTextAutonumberScheme.ROMAN_UC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_R) return STTextAutonumberScheme.ROMAN_LC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_R) return STTextAutonumberScheme.ROMAN_UC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ROMAN_LC_PERIOD) return STTextAutonumberScheme.ROMAN_LC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ROMAN_UC_PERIOD) return STTextAutonumberScheme.ROMAN_UC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.CIRCLE_NUM_DB_PLAIN) return STTextAutonumberScheme.CIRCLE_NUM_DB_PLAIN;
    if (value == TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_BLACK_PLAIN) return STTextAutonumberScheme.CIRCLE_NUM_WD_BLACK_PLAIN;
    if (value == TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_WHITE_PLAIN) return STTextAutonumberScheme.CIRCLE_NUM_WD_WHITE_PLAIN;
    if (value == TextAutonumberSchemeValueModel.ARABIC_DB_PERIOD) return STTextAutonumberScheme.ARABIC_DB_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_DB_PLAIN) return STTextAutonumberScheme.ARABIC_DB_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHS_PERIOD) return STTextAutonumberScheme.EA_1_CHS_PERIOD;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHS_PLAIN) return STTextAutonumberScheme.EA_1_CHS_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHT_PERIOD) return STTextAutonumberScheme.EA_1_CHT_PERIOD;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHT_PLAIN) return STTextAutonumberScheme.EA_1_CHT_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_JPN_CHS_DB_PERIOD) return STTextAutonumberScheme.EA_1_JPN_CHS_DB_PERIOD;
    if (value == TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PLAIN) return STTextAutonumberScheme.EA_1_JPN_KOR_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PERIOD) return STTextAutonumberScheme.EA_1_JPN_KOR_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_1_MINUS) return STTextAutonumberScheme.ARABIC_1_MINUS;
    if (value == TextAutonumberSchemeValueModel.ARABIC_2_MINUS) return STTextAutonumberScheme.ARABIC_2_MINUS;
    if (value == TextAutonumberSchemeValueModel.HEBREW_2_MINUS) return STTextAutonumberScheme.HEBREW_2_MINUS;
    if (value == TextAutonumberSchemeValueModel.THAI_ALPHA_PERIOD) return STTextAutonumberScheme.THAI_ALPHA_PERIOD;
    if (value == TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_R) return STTextAutonumberScheme.THAI_ALPHA_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_BOTH) return STTextAutonumberScheme.THAI_ALPHA_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.THAI_NUM_PERIOD) return STTextAutonumberScheme.THAI_NUM_PERIOD;
    if (value == TextAutonumberSchemeValueModel.THAI_NUM_PAREN_R) return STTextAutonumberScheme.THAI_NUM_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.THAI_NUM_PAREN_BOTH) return STTextAutonumberScheme.THAI_NUM_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.HINDI_ALPHA_PERIOD) return STTextAutonumberScheme.HINDI_ALPHA_PERIOD;
    if (value == TextAutonumberSchemeValueModel.HINDI_NUM_PERIOD) return STTextAutonumberScheme.HINDI_NUM_PERIOD;
    if (value == TextAutonumberSchemeValueModel.HINDI_NUM_PAREN_R) return STTextAutonumberScheme.HINDI_NUM_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.HINDI_ALPHA_1_PERIOD) return STTextAutonumberScheme.HINDI_ALPHA_1_PERIOD;
    return null;
  }
}
