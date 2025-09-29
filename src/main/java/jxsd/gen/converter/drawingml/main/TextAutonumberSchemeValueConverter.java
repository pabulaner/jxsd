package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextAutonumberSchemeValueBuilder;
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
    if (value == TextAutonumberSchemeValueBuilder.ALPHA_LC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.ALPHA_UC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.ALPHA_LC_PAREN_R) return TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.ALPHA_UC_PAREN_R) return TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.ALPHA_LC_PERIOD) return TextAutonumberSchemeValueModel.ALPHA_LC_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.ALPHA_UC_PERIOD) return TextAutonumberSchemeValueModel.ALPHA_UC_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ARABIC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_PAREN_R) return TextAutonumberSchemeValueModel.ARABIC_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_PERIOD) return TextAutonumberSchemeValueModel.ARABIC_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_PLAIN) return TextAutonumberSchemeValueModel.ARABIC_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.ROMAN_LC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.ROMAN_UC_PAREN_BOTH) return TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.ROMAN_LC_PAREN_R) return TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.ROMAN_UC_PAREN_R) return TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.ROMAN_LC_PERIOD) return TextAutonumberSchemeValueModel.ROMAN_LC_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.ROMAN_UC_PERIOD) return TextAutonumberSchemeValueModel.ROMAN_UC_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.CIRCLE_NUM_DB_PLAIN) return TextAutonumberSchemeValueModel.CIRCLE_NUM_DB_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.CIRCLE_NUM_WD_BLACK_PLAIN) return TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_BLACK_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.CIRCLE_NUM_WD_WHITE_PLAIN) return TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_WHITE_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_DB_PERIOD) return TextAutonumberSchemeValueModel.ARABIC_DB_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_DB_PLAIN) return TextAutonumberSchemeValueModel.ARABIC_DB_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_CHS_PERIOD) return TextAutonumberSchemeValueModel.EA_1_CHS_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_CHS_PLAIN) return TextAutonumberSchemeValueModel.EA_1_CHS_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_CHT_PERIOD) return TextAutonumberSchemeValueModel.EA_1_CHT_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_CHT_PLAIN) return TextAutonumberSchemeValueModel.EA_1_CHT_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_JPN_CHS_DB_PERIOD) return TextAutonumberSchemeValueModel.EA_1_JPN_CHS_DB_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_JPN_KOR_PLAIN) return TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PLAIN;
    if (value == TextAutonumberSchemeValueBuilder.EA_1_JPN_KOR_PERIOD) return TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_1_MINUS) return TextAutonumberSchemeValueModel.ARABIC_1_MINUS;
    if (value == TextAutonumberSchemeValueBuilder.ARABIC_2_MINUS) return TextAutonumberSchemeValueModel.ARABIC_2_MINUS;
    if (value == TextAutonumberSchemeValueBuilder.HEBREW_2_MINUS) return TextAutonumberSchemeValueModel.HEBREW_2_MINUS;
    if (value == TextAutonumberSchemeValueBuilder.THAI_ALPHA_PERIOD) return TextAutonumberSchemeValueModel.THAI_ALPHA_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.THAI_ALPHA_PAREN_R) return TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.THAI_ALPHA_PAREN_BOTH) return TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.THAI_NUM_PERIOD) return TextAutonumberSchemeValueModel.THAI_NUM_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.THAI_NUM_PAREN_R) return TextAutonumberSchemeValueModel.THAI_NUM_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.THAI_NUM_PAREN_BOTH) return TextAutonumberSchemeValueModel.THAI_NUM_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueBuilder.HINDI_ALPHA_PERIOD) return TextAutonumberSchemeValueModel.HINDI_ALPHA_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.HINDI_NUM_PERIOD) return TextAutonumberSchemeValueModel.HINDI_NUM_PERIOD;
    if (value == TextAutonumberSchemeValueBuilder.HINDI_NUM_PAREN_R) return TextAutonumberSchemeValueModel.HINDI_NUM_PAREN_R;
    if (value == TextAutonumberSchemeValueBuilder.HINDI_ALPHA_1_PERIOD) return TextAutonumberSchemeValueModel.HINDI_ALPHA_1_PERIOD;
    return null;
  }

  public static STTextAutonumberScheme toDocx4j(TextAutonumberSchemeValueModel value) {
    if (value == null) return null;
    if (value == TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.ALPHA_LC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.ALPHA_UC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ALPHA_LC_PAREN_R) return TextAutonumberSchemeValueBuilder.ALPHA_LC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ALPHA_UC_PAREN_R) return TextAutonumberSchemeValueBuilder.ALPHA_UC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ALPHA_LC_PERIOD) return TextAutonumberSchemeValueBuilder.ALPHA_LC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ALPHA_UC_PERIOD) return TextAutonumberSchemeValueBuilder.ALPHA_UC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.ARABIC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PAREN_R) return TextAutonumberSchemeValueBuilder.ARABIC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PERIOD) return TextAutonumberSchemeValueBuilder.ARABIC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_PLAIN) return TextAutonumberSchemeValueBuilder.ARABIC_PLAIN;
    if (value == TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.ROMAN_LC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.ROMAN_UC_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.ROMAN_LC_PAREN_R) return TextAutonumberSchemeValueBuilder.ROMAN_LC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ROMAN_UC_PAREN_R) return TextAutonumberSchemeValueBuilder.ROMAN_UC_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.ROMAN_LC_PERIOD) return TextAutonumberSchemeValueBuilder.ROMAN_LC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ROMAN_UC_PERIOD) return TextAutonumberSchemeValueBuilder.ROMAN_UC_PERIOD;
    if (value == TextAutonumberSchemeValueModel.CIRCLE_NUM_DB_PLAIN) return TextAutonumberSchemeValueBuilder.CIRCLE_NUM_DB_PLAIN;
    if (value == TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_BLACK_PLAIN) return TextAutonumberSchemeValueBuilder.CIRCLE_NUM_WD_BLACK_PLAIN;
    if (value == TextAutonumberSchemeValueModel.CIRCLE_NUM_WD_WHITE_PLAIN) return TextAutonumberSchemeValueBuilder.CIRCLE_NUM_WD_WHITE_PLAIN;
    if (value == TextAutonumberSchemeValueModel.ARABIC_DB_PERIOD) return TextAutonumberSchemeValueBuilder.ARABIC_DB_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_DB_PLAIN) return TextAutonumberSchemeValueBuilder.ARABIC_DB_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHS_PERIOD) return TextAutonumberSchemeValueBuilder.EA_1_CHS_PERIOD;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHS_PLAIN) return TextAutonumberSchemeValueBuilder.EA_1_CHS_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHT_PERIOD) return TextAutonumberSchemeValueBuilder.EA_1_CHT_PERIOD;
    if (value == TextAutonumberSchemeValueModel.EA_1_CHT_PLAIN) return TextAutonumberSchemeValueBuilder.EA_1_CHT_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_JPN_CHS_DB_PERIOD) return TextAutonumberSchemeValueBuilder.EA_1_JPN_CHS_DB_PERIOD;
    if (value == TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PLAIN) return TextAutonumberSchemeValueBuilder.EA_1_JPN_KOR_PLAIN;
    if (value == TextAutonumberSchemeValueModel.EA_1_JPN_KOR_PERIOD) return TextAutonumberSchemeValueBuilder.EA_1_JPN_KOR_PERIOD;
    if (value == TextAutonumberSchemeValueModel.ARABIC_1_MINUS) return TextAutonumberSchemeValueBuilder.ARABIC_1_MINUS;
    if (value == TextAutonumberSchemeValueModel.ARABIC_2_MINUS) return TextAutonumberSchemeValueBuilder.ARABIC_2_MINUS;
    if (value == TextAutonumberSchemeValueModel.HEBREW_2_MINUS) return TextAutonumberSchemeValueBuilder.HEBREW_2_MINUS;
    if (value == TextAutonumberSchemeValueModel.THAI_ALPHA_PERIOD) return TextAutonumberSchemeValueBuilder.THAI_ALPHA_PERIOD;
    if (value == TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_R) return TextAutonumberSchemeValueBuilder.THAI_ALPHA_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.THAI_ALPHA_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.THAI_ALPHA_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.THAI_NUM_PERIOD) return TextAutonumberSchemeValueBuilder.THAI_NUM_PERIOD;
    if (value == TextAutonumberSchemeValueModel.THAI_NUM_PAREN_R) return TextAutonumberSchemeValueBuilder.THAI_NUM_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.THAI_NUM_PAREN_BOTH) return TextAutonumberSchemeValueBuilder.THAI_NUM_PAREN_BOTH;
    if (value == TextAutonumberSchemeValueModel.HINDI_ALPHA_PERIOD) return TextAutonumberSchemeValueBuilder.HINDI_ALPHA_PERIOD;
    if (value == TextAutonumberSchemeValueModel.HINDI_NUM_PERIOD) return TextAutonumberSchemeValueBuilder.HINDI_NUM_PERIOD;
    if (value == TextAutonumberSchemeValueModel.HINDI_NUM_PAREN_R) return TextAutonumberSchemeValueBuilder.HINDI_NUM_PAREN_R;
    if (value == TextAutonumberSchemeValueModel.HINDI_ALPHA_1_PERIOD) return TextAutonumberSchemeValueBuilder.HINDI_ALPHA_1_PERIOD;
    return null;
  }
}
