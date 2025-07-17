package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import org.docx4j.dml.CTTextCharacterProperties;

public class CT_TextCharacterPropertiesConverter {
  private CT_TextCharacterPropertiesConverter() {
  }

  public static CT_TextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value) {
    if (value == null) return null;
    return new CT_TextCharacterPropertiesModel(ST_TextStrikeTypeConverter.fromDocx4j(value.getStrike()), BooleanConverter.fromDocx4j(value.getNoProof()), StringConverter.fromDocx4j(value.getBmk()), ST_PercentageConverter.fromDocx4j(value.getBaseline()), BooleanConverter.fromDocx4j(value.getDirty()), BooleanConverter.fromDocx4j(value.getSmtClean()), BooleanConverter.fromDocx4j(value.getErr()), BooleanConverter.fromDocx4j(value.getKumimoji()), BooleanConverter.fromDocx4j(value.getB()), BooleanConverter.fromDocx4j(value.getI()), ST_TextLanguageIDConverter.fromDocx4j(value.getLang()), ST_TextFontSizeConverter.fromDocx4j(value.getSz()), UnsignedIntConverter.fromDocx4j(value.getSmtId()), BooleanConverter.fromDocx4j(value.getNormalizeH()), ST_TextUnderlineTypeConverter.fromDocx4j(value.getU()), ST_TextNonNegativePointConverter.fromDocx4j(value.getKern()), ST_TextCapsTypeConverter.fromDocx4j(value.getCap()), ST_TextLanguageIDConverter.fromDocx4j(value.getAltLang()), ST_TextPointConverter.fromDocx4j(value.getSpc()), CT_LinePropertiesConverter.fromDocx4j(value.getLn()), NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill()), EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag()), CT_ColorConverter.fromDocx4j(value.getHighlight()), ULnTxOrULnConverter.fromDocx4j(value.getULnTxOrULn()), UFillTxOrUFillConverter.fromDocx4j(value.getUFillTxOrUFill()), CT_TextFontConverter.fromDocx4j(value.getLatin()), CT_TextFontConverter.fromDocx4j(value.getEa()), CT_TextFontConverter.fromDocx4j(value.getCs()), CT_TextFontConverter.fromDocx4j(value.getSym()), CT_HyperlinkConverter.fromDocx4j(value.getHlinkClick()), CT_HyperlinkConverter.fromDocx4j(value.getHlinkMouseOver()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextCharacterProperties toDocx4j(CT_TextCharacterPropertiesModel value) {
    return null;
  }

  public static class NoFillOrSolidFillOrGradFillConverter {
    private NoFillOrSolidFillOrGradFillConverter() {
    }

    public static CT_TextCharacterPropertiesModel.NoFillOrSolidFillOrGradFillModel fromDocx4j(
        CTTextCharacterProperties.NoFillOrSolidFillOrGradFill value) {
      if (value == null) return null;
    }

    public static CTTextCharacterProperties.NoFillOrSolidFillOrGradFill toDocx4j(
        CT_TextCharacterPropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
      return null;
    }
  }

  public static class EffectLstOrEffectDagConverter {
    private EffectLstOrEffectDagConverter() {
    }

    public static CT_TextCharacterPropertiesModel.EffectLstOrEffectDagModel fromDocx4j(
        CTTextCharacterProperties.EffectLstOrEffectDag value) {
      if (value == null) return null;
    }

    public static CTTextCharacterProperties.EffectLstOrEffectDag toDocx4j(
        CT_TextCharacterPropertiesModel.EffectLstOrEffectDagModel value) {
      return null;
    }
  }

  public static class ULnTxOrULnConverter {
    private ULnTxOrULnConverter() {
    }

    public static CT_TextCharacterPropertiesModel.ULnTxOrULnModel fromDocx4j(
        CTTextCharacterProperties.ULnTxOrULn value) {
      if (value == null) return null;
    }

    public static CTTextCharacterProperties.ULnTxOrULn toDocx4j(
        CT_TextCharacterPropertiesModel.ULnTxOrULnModel value) {
      return null;
    }
  }

  public static class UFillTxOrUFillConverter {
    private UFillTxOrUFillConverter() {
    }

    public static CT_TextCharacterPropertiesModel.UFillTxOrUFillModel fromDocx4j(
        CTTextCharacterProperties.UFillTxOrUFill value) {
      if (value == null) return null;
    }

    public static CTTextCharacterProperties.UFillTxOrUFill toDocx4j(
        CT_TextCharacterPropertiesModel.UFillTxOrUFillModel value) {
      return null;
    }
  }
}
