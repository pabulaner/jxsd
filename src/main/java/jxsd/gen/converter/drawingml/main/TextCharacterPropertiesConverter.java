package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;
import org.docx4j.dml.CTTextCharacterProperties;

/**
 * This is a generated sequence class.
 */
public class TextCharacterPropertiesConverter {
  private TextCharacterPropertiesConverter() {
  }

  public static TextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value) {
    if (value == null) return null;
    TextCharacterPropertiesModel.EG_FillProperties egFillProperties = new TextCharacterPropertiesModel.EG_FillProperties();
    if (value.getNoFill() != null) egFillProperties = TextCharacterPropertiesModel.EG_FillProperties.newNoFill(NoFillPropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = TextCharacterPropertiesModel.EG_FillProperties.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = TextCharacterPropertiesModel.EG_FillProperties.newGradFill(GradientFillPropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = TextCharacterPropertiesModel.EG_FillProperties.newBlipFill(BlipFillPropertiesConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = TextCharacterPropertiesModel.EG_FillProperties.newPattFill(PatternFillPropertiesConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = TextCharacterPropertiesModel.EG_FillProperties.newGrpFill(GroupFillPropertiesConverter.fromDocx4j(value.getGrpFill()));
    TextCharacterPropertiesModel.EG_EffectProperties egEffectProperties = new TextCharacterPropertiesModel.EG_EffectProperties();
    if (value.getEffectLst() != null) egEffectProperties = TextCharacterPropertiesModel.EG_EffectProperties.newEffectLst(EffectListConverter.fromDocx4j(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = TextCharacterPropertiesModel.EG_EffectProperties.newEffectDag(EffectContainerConverter.fromDocx4j(value.getEffectDag()));
    TextCharacterPropertiesModel.EG_TextUnderlineLine egTextUnderlineLine = new TextCharacterPropertiesModel.EG_TextUnderlineLine();
    if (value.getULnTx() != null) egTextUnderlineLine = TextCharacterPropertiesModel.EG_TextUnderlineLine.newULnTx(TextUnderlineLineFollowTextConverter.fromDocx4j(value.getULnTx()));
    if (value.getULn() != null) egTextUnderlineLine = TextCharacterPropertiesModel.EG_TextUnderlineLine.newULn(LinePropertiesConverter.fromDocx4j(value.getULn()));
    TextCharacterPropertiesModel.EG_TextUnderlineFill egTextUnderlineFill = new TextCharacterPropertiesModel.EG_TextUnderlineFill();
    if (value.getUFillTx() != null) egTextUnderlineFill = TextCharacterPropertiesModel.EG_TextUnderlineFill.newUFillTx(TextUnderlineFillFollowTextConverter.fromDocx4j(value.getUFillTx()));
    if (value.getUFill() != null) egTextUnderlineFill = TextCharacterPropertiesModel.EG_TextUnderlineFill.newUFill(TextUnderlineFillGroupWrapperConverter.fromDocx4j(value.getUFill()));
    return new TextCharacterPropertiesModel(TextStrikeTypeValueConverter.fromDocx4j(value.getStrike()), BooleanValueConverter.fromDocx4j(value.isNoProof()), StringValueConverter.fromDocx4j(value.getBmk()), PercentageValueConverter.fromDocx4j(value.getBaseline()), BooleanValueConverter.fromDocx4j(value.isDirty()), BooleanValueConverter.fromDocx4j(value.isSmtClean()), BooleanValueConverter.fromDocx4j(value.isErr()), BooleanValueConverter.fromDocx4j(value.isKumimoji()), BooleanValueConverter.fromDocx4j(value.isB()), BooleanValueConverter.fromDocx4j(value.isI()), TextLanguageIDValueConverter.fromDocx4j(value.getLang()), TextFontSizeValueConverter.fromDocx4j(value.getSz()), UnsignedIntValueConverter.fromDocx4j(value.getSmtId()), BooleanValueConverter.fromDocx4j(value.isNormalizeH()), TextUnderlineTypeValueConverter.fromDocx4j(value.getU()), TextNonNegativePointValueConverter.fromDocx4j(value.getKern()), TextCapsTypeValueConverter.fromDocx4j(value.getCap()), TextLanguageIDValueConverter.fromDocx4j(value.getAltLang()), TextPointValueConverter.fromDocx4j(value.getSpc()), LinePropertiesConverter.fromDocx4j(value.getLn()), egFillProperties, egEffectProperties, ColorConverter.fromDocx4j(value.getHighlight()), egTextUnderlineLine, egTextUnderlineFill, TextFontValueConverter.fromDocx4j(value.getLatin()), TextFontValueConverter.fromDocx4j(value.getEa()), TextFontValueConverter.fromDocx4j(value.getCs()), TextFontValueConverter.fromDocx4j(value.getSym()), HyperlinkConverter.fromDocx4j(value.getHlinkClick()), HyperlinkConverter.fromDocx4j(value.getHlinkMouseOver()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextCharacterProperties toDocx4j(TextCharacterPropertiesModel value) {
    if (value == null) return null;
    CTTextCharacterProperties result = new CTTextCharacterProperties();
    result.setStrike(TextStrikeTypeValueConverter.toDocx4j(value.getStrike()));
    result.setNoProof(BooleanValueConverter.toDocx4j(value.getNoProof()));
    result.setBmk(StringValueConverter.toDocx4j(value.getBmk()));
    result.setBaseline(PercentageValueConverter.toDocx4j(value.getBaseline()));
    result.setDirty(BooleanValueConverter.toDocx4j(value.getDirty()));
    result.setSmtClean(BooleanValueConverter.toDocx4j(value.getSmtClean()));
    result.setErr(BooleanValueConverter.toDocx4j(value.getErr()));
    result.setKumimoji(BooleanValueConverter.toDocx4j(value.getKumimoji()));
    result.setB(BooleanValueConverter.toDocx4j(value.getB()));
    result.setI(BooleanValueConverter.toDocx4j(value.getI()));
    result.setLang(TextLanguageIDValueConverter.toDocx4j(value.getLang()));
    result.setSz(TextFontSizeValueConverter.toDocx4j(value.getSz()));
    result.setSmtId(UnsignedIntValueConverter.toDocx4j(value.getSmtId()));
    result.setNormalizeH(BooleanValueConverter.toDocx4j(value.getNormalizeH()));
    result.setU(TextUnderlineTypeValueConverter.toDocx4j(value.getU()));
    result.setKern(TextNonNegativePointValueConverter.toDocx4j(value.getKern()));
    result.setCap(TextCapsTypeValueConverter.toDocx4j(value.getCap()));
    result.setAltLang(TextLanguageIDValueConverter.toDocx4j(value.getAltLang()));
    result.setSpc(TextPointValueConverter.toDocx4j(value.getSpc()));
    result.setLn(LinePropertiesConverter.toDocx4j(value.getLn()));
    result.setHighlight(ColorConverter.toDocx4j(value.getHighlight()));
    result.setLatin(TextFontValueConverter.toDocx4j(value.getLatin()));
    result.setEa(TextFontValueConverter.toDocx4j(value.getEa()));
    result.setCs(TextFontValueConverter.toDocx4j(value.getCs()));
    result.setSym(TextFontValueConverter.toDocx4j(value.getSym()));
    result.setHlinkClick(HyperlinkConverter.toDocx4j(value.getHlinkClick()));
    result.setHlinkMouseOver(HyperlinkConverter.toDocx4j(value.getHlinkMouseOver()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getEGFillProperties().isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getNoFill()));
    if (value.getEGFillProperties().isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getSolidFill()));
    if (value.getEGFillProperties().isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getGradFill()));
    if (value.getEGFillProperties().isBlipFill()) result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getBlipFill()));
    if (value.getEGFillProperties().isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getPattFill()));
    if (value.getEGFillProperties().isGrpFill()) result.setGrpFill(GroupFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getGrpFill()));
    if (value.getEGEffectProperties().isEffectLst()) result.setEffectLst(EffectListConverter.toDocx4j(value.getEGEffectProperties().getEffectLst()));
    if (value.getEGEffectProperties().isEffectDag()) result.setEffectDag(EffectContainerConverter.toDocx4j(value.getEGEffectProperties().getEffectDag()));
    if (value.getEGTextUnderlineLine().isULnTx()) result.setULnTx(TextUnderlineLineFollowTextConverter.toDocx4j(value.getEGTextUnderlineLine().getULnTx()));
    if (value.getEGTextUnderlineLine().isULn()) result.setULn(LinePropertiesConverter.toDocx4j(value.getEGTextUnderlineLine().getULn()));
    if (value.getEGTextUnderlineFill().isUFillTx()) result.setUFillTx(TextUnderlineFillFollowTextConverter.toDocx4j(value.getEGTextUnderlineFill().getUFillTx()));
    if (value.getEGTextUnderlineFill().isUFill()) result.setUFill(TextUnderlineFillGroupWrapperConverter.toDocx4j(value.getEGTextUnderlineFill().getUFill()));
    return result;
  }
}
