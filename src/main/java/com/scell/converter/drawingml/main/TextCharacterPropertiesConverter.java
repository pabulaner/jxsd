package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.TextCharacterPropertiesModel;
import org.docx4j.dml.CTTextCharacterProperties;

public class TextCharacterPropertiesConverter {
  private TextCharacterPropertiesConverter() {
  }

  public static TextCharacterPropertiesModel fromDocx4J(CTTextCharacterProperties value) {
    if (value == null) return null;
    TextCharacterPropertiesModel.FillPropertiesModel egFillProperties = new TextCharacterPropertiesModel.FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = TextCharacterPropertiesModel.FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = TextCharacterPropertiesModel.FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = TextCharacterPropertiesModel.FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = TextCharacterPropertiesModel.FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = TextCharacterPropertiesModel.FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = TextCharacterPropertiesModel.FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    TextCharacterPropertiesModel.EffectPropertiesModel egEffectProperties = new TextCharacterPropertiesModel.EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = TextCharacterPropertiesModel.EffectPropertiesModel.newEffectLst(EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = TextCharacterPropertiesModel.EffectPropertiesModel.newEffectDag(EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    TextCharacterPropertiesModel.TextUnderlineLineModel egTextUnderlineLine = new TextCharacterPropertiesModel.TextUnderlineLineModel();
    if (value.getULnTx() != null) egTextUnderlineLine = TextCharacterPropertiesModel.TextUnderlineLineModel.newULnTx(TextUnderlineLineFollowTextConverter.fromDocx4J(value.getULnTx()));
    if (value.getULn() != null) egTextUnderlineLine = TextCharacterPropertiesModel.TextUnderlineLineModel.newULn(LinePropertiesConverter.fromDocx4J(value.getULn()));
    TextCharacterPropertiesModel.TextUnderlineFillModel egTextUnderlineFill = new TextCharacterPropertiesModel.TextUnderlineFillModel();
    if (value.getUFillTx() != null) egTextUnderlineFill = TextCharacterPropertiesModel.TextUnderlineFillModel.newUFillTx(TextUnderlineFillFollowTextConverter.fromDocx4J(value.getUFillTx()));
    if (value.getUFill() != null) egTextUnderlineFill = TextCharacterPropertiesModel.TextUnderlineFillModel.newUFill(TextUnderlineFillGroupWrapperConverter.fromDocx4J(value.getUFill()));
    return new TextCharacterPropertiesModel(TextStrikeTypeConverter.fromDocx4J(value.getStrike()), BooleanConverter.fromDocx4J(value.isNoProof()), StringConverter.fromDocx4J(value.getBmk()), PercentageConverter.fromDocx4J(value.getBaseline()), BooleanConverter.fromDocx4J(value.isDirty()), BooleanConverter.fromDocx4J(value.isSmtClean()), BooleanConverter.fromDocx4J(value.isErr()), BooleanConverter.fromDocx4J(value.isKumimoji()), BooleanConverter.fromDocx4J(value.isB()), BooleanConverter.fromDocx4J(value.isI()), TextLanguageIDConverter.fromDocx4J(value.getLang()), TextFontSizeConverter.fromDocx4J(value.getSz()), UnsignedIntConverter.fromDocx4J(value.getSmtId()), BooleanConverter.fromDocx4J(value.isNormalizeH()), TextUnderlineTypeConverter.fromDocx4J(value.getU()), TextNonNegativePointConverter.fromDocx4J(value.getKern()), TextCapsTypeConverter.fromDocx4J(value.getCap()), TextLanguageIDConverter.fromDocx4J(value.getAltLang()), TextPointConverter.fromDocx4J(value.getSpc()), LinePropertiesConverter.fromDocx4J(value.getLn()), egFillProperties, egEffectProperties, ColorConverter.fromDocx4J(value.getHighlight()), egTextUnderlineLine, egTextUnderlineFill, TextFontConverter.fromDocx4J(value.getLatin()), TextFontConverter.fromDocx4J(value.getEa()), TextFontConverter.fromDocx4J(value.getCs()), TextFontConverter.fromDocx4J(value.getSym()), HyperlinkConverter.fromDocx4J(value.getHlinkClick()), HyperlinkConverter.fromDocx4J(value.getHlinkMouseOver()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
