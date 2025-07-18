package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import org.docx4j.dml.CTTextCharacterProperties;

public class CT_TextCharacterPropertiesConverter {
  private CT_TextCharacterPropertiesConverter() {
  }

  public static CT_TextCharacterPropertiesModel fromDocx4J(CTTextCharacterProperties value) {
    if (value == null) return null;
    // look here false;
    CT_TextCharacterPropertiesModel.EG_FillPropertiesModel egFillProperties = new CT_TextCharacterPropertiesModel.EG_FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    // look here false;
    CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel egEffectProperties = new CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel.newEffectLst(CT_EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel.newEffectDag(CT_EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    // look here false;
    CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel egTextUnderlineLine = new CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel();
    if (value.getULnTx() != null) egTextUnderlineLine = CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel.newULnTx(CT_TextUnderlineLineFollowTextConverter.fromDocx4J(value.getULnTx()));
    if (value.getULn() != null) egTextUnderlineLine = CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel.newULn(CT_LinePropertiesConverter.fromDocx4J(value.getULn()));
    // look here false;
    CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel egTextUnderlineFill = new CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel();
    if (value.getUFillTx() != null) egTextUnderlineFill = CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel.newUFillTx(CT_TextUnderlineFillFollowTextConverter.fromDocx4J(value.getUFillTx()));
    if (value.getUFill() != null) egTextUnderlineFill = CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel.newUFill(CT_TextUnderlineFillGroupWrapperConverter.fromDocx4J(value.getUFill()));
    return new CT_TextCharacterPropertiesModel(ST_TextStrikeTypeConverter.fromDocx4J(value.getStrike()), BooleanConverter.fromDocx4J(value.getNoProof()), StringConverter.fromDocx4J(value.getBmk()), ST_PercentageConverter.fromDocx4J(value.getBaseline()), BooleanConverter.fromDocx4J(value.getDirty()), BooleanConverter.fromDocx4J(value.getSmtClean()), BooleanConverter.fromDocx4J(value.getErr()), BooleanConverter.fromDocx4J(value.getKumimoji()), BooleanConverter.fromDocx4J(value.getB()), BooleanConverter.fromDocx4J(value.getI()), ST_TextLanguageIDConverter.fromDocx4J(value.getLang()), ST_TextFontSizeConverter.fromDocx4J(value.getSz()), UnsignedIntConverter.fromDocx4J(value.getSmtId()), BooleanConverter.fromDocx4J(value.getNormalizeH()), ST_TextUnderlineTypeConverter.fromDocx4J(value.getU()), ST_TextNonNegativePointConverter.fromDocx4J(value.getKern()), ST_TextCapsTypeConverter.fromDocx4J(value.getCap()), ST_TextLanguageIDConverter.fromDocx4J(value.getAltLang()), ST_TextPointConverter.fromDocx4J(value.getSpc()), CT_LinePropertiesConverter.fromDocx4J(value.getLn()), egFillProperties, egEffectProperties, CT_ColorConverter.fromDocx4J(value.getHighlight()), egTextUnderlineLine, egTextUnderlineFill, CT_TextFontConverter.fromDocx4J(value.getLatin()), CT_TextFontConverter.fromDocx4J(value.getEa()), CT_TextFontConverter.fromDocx4J(value.getCs()), CT_TextFontConverter.fromDocx4J(value.getSym()), CT_HyperlinkConverter.fromDocx4J(value.getHlinkClick()), CT_HyperlinkConverter.fromDocx4J(value.getHlinkMouseOver()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTTextCharacterProperties toDocx4J(CT_TextCharacterPropertiesModel value) {
    return null;
  }
}
