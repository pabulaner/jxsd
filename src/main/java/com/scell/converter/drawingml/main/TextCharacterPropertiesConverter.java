package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.XMLSchema.UnsignedIntValueConverter;
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
    return new TextCharacterPropertiesModel(TextStrikeTypeValueConverter.fromDocx4J(value.getStrike()), BooleanValueConverter.fromDocx4J(value.isNoProof()), StringValueConverter.fromDocx4J(value.getBmk()), PercentageValueConverter.fromDocx4J(value.getBaseline()), BooleanValueConverter.fromDocx4J(value.isDirty()), BooleanValueConverter.fromDocx4J(value.isSmtClean()), BooleanValueConverter.fromDocx4J(value.isErr()), BooleanValueConverter.fromDocx4J(value.isKumimoji()), BooleanValueConverter.fromDocx4J(value.isB()), BooleanValueConverter.fromDocx4J(value.isI()), TextLanguageIDValueConverter.fromDocx4J(value.getLang()), TextFontSizeValueConverter.fromDocx4J(value.getSz()), UnsignedIntValueConverter.fromDocx4J(value.getSmtId()), BooleanValueConverter.fromDocx4J(value.isNormalizeH()), TextUnderlineTypeValueConverter.fromDocx4J(value.getU()), TextNonNegativePointValueConverter.fromDocx4J(value.getKern()), TextCapsTypeValueConverter.fromDocx4J(value.getCap()), TextLanguageIDValueConverter.fromDocx4J(value.getAltLang()), TextPointValueConverter.fromDocx4J(value.getSpc()), LinePropertiesConverter.fromDocx4J(value.getLn()), egFillProperties, egEffectProperties, ColorConverter.fromDocx4J(value.getHighlight()), egTextUnderlineLine, egTextUnderlineFill, TextFontValueConverter.fromDocx4J(value.getLatin()), TextFontValueConverter.fromDocx4J(value.getEa()), TextFontValueConverter.fromDocx4J(value.getCs()), TextFontValueConverter.fromDocx4J(value.getSym()), HyperlinkConverter.fromDocx4J(value.getHlinkClick()), HyperlinkConverter.fromDocx4J(value.getHlinkMouseOver()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
