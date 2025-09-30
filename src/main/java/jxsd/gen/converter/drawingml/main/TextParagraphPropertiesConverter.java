package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.TextParagraphPropertiesModel;
import org.docx4j.dml.CTTextParagraphProperties;

/**
 * This is a generated sequence class.
 */
public class TextParagraphPropertiesConverter {
  private TextParagraphPropertiesConverter() {
  }

  public static TextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value) {
    if (value == null) return null;
    TextParagraphPropertiesModel.EG_TextBulletColor egTextBulletColor = new TextParagraphPropertiesModel.EG_TextBulletColor();
    if (value.getBuClrTx() != null) egTextBulletColor = TextParagraphPropertiesModel.EG_TextBulletColor.newBuClrTx(TextBulletColorFollowTextConverter.fromDocx4j(value.getBuClrTx()));
    if (value.getBuClr() != null) egTextBulletColor = TextParagraphPropertiesModel.EG_TextBulletColor.newBuClr(ColorConverter.fromDocx4j(value.getBuClr()));
    TextParagraphPropertiesModel.EG_TextBulletSize egTextBulletSize = new TextParagraphPropertiesModel.EG_TextBulletSize();
    if (value.getBuSzTx() != null) egTextBulletSize = TextParagraphPropertiesModel.EG_TextBulletSize.newBuSzTx(TextBulletSizeFollowTextConverter.fromDocx4j(value.getBuSzTx()));
    if (value.getBuSzPct() != null) egTextBulletSize = TextParagraphPropertiesModel.EG_TextBulletSize.newBuSzPct(TextBulletSizePercentConverter.fromDocx4j(value.getBuSzPct()));
    if (value.getBuSzPts() != null) egTextBulletSize = TextParagraphPropertiesModel.EG_TextBulletSize.newBuSzPts(TextBulletSizePointConverter.fromDocx4j(value.getBuSzPts()));
    TextParagraphPropertiesModel.EG_TextBulletTypeface egTextBulletTypeface = new TextParagraphPropertiesModel.EG_TextBulletTypeface();
    if (value.getBuFontTx() != null) egTextBulletTypeface = TextParagraphPropertiesModel.EG_TextBulletTypeface.newBuFontTx(TextBulletTypefaceFollowTextConverter.fromDocx4j(value.getBuFontTx()));
    if (value.getBuFont() != null) egTextBulletTypeface = TextParagraphPropertiesModel.EG_TextBulletTypeface.newBuFont(TextFontValueConverter.fromDocx4j(value.getBuFont()));
    TextParagraphPropertiesModel.EG_TextBullet egTextBullet = new TextParagraphPropertiesModel.EG_TextBullet();
    if (value.getBuNone() != null) egTextBullet = TextParagraphPropertiesModel.EG_TextBullet.newBuNone(TextNoBulletConverter.fromDocx4j(value.getBuNone()));
    if (value.getBuAutoNum() != null) egTextBullet = TextParagraphPropertiesModel.EG_TextBullet.newBuAutoNum(TextAutonumberBulletConverter.fromDocx4j(value.getBuAutoNum()));
    if (value.getBuChar() != null) egTextBullet = TextParagraphPropertiesModel.EG_TextBullet.newBuChar(TextCharBulletConverter.fromDocx4j(value.getBuChar()));
    if (value.getBuBlip() != null) egTextBullet = TextParagraphPropertiesModel.EG_TextBullet.newBuBlip(TextBlipBulletConverter.fromDocx4j(value.getBuBlip()));
    return new TextParagraphPropertiesModel(TextIndentValueConverter.fromDocx4j(value.getIndent()), BooleanValueConverter.fromDocx4j(value.isLatinLnBrk()), TextMarginValueConverter.fromDocx4j(value.getMarR()), BooleanValueConverter.fromDocx4j(value.isHangingPunct()), TextFontAlignTypeValueConverter.fromDocx4j(value.getFontAlgn()), BooleanValueConverter.fromDocx4j(value.isEaLnBrk()), BooleanValueConverter.fromDocx4j(value.isRtl()), TextIndentLevelTypeValueConverter.fromDocx4j(value.getLvl()), TextMarginValueConverter.fromDocx4j(value.getMarL()), Coordinate32ValueConverter.fromDocx4j(value.getDefTabSz()), TextAlignTypeValueConverter.fromDocx4j(value.getAlgn()), TextSpacingConverter.fromDocx4j(value.getLnSpc()), TextSpacingConverter.fromDocx4j(value.getSpcBef()), TextSpacingConverter.fromDocx4j(value.getSpcAft()), egTextBulletColor, egTextBulletSize, egTextBulletTypeface, egTextBullet, TextTabStopListConverter.fromDocx4j(value.getTabLst()), TextCharacterPropertiesConverter.fromDocx4j(value.getDefRPr()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextParagraphProperties toDocx4j(TextParagraphPropertiesModel value) {
    if (value == null) return null;
    CTTextParagraphProperties result = new CTTextParagraphProperties();
    result.setIndent(TextIndentValueConverter.toDocx4j(value.getIndent()));
    result.setLatinLnBrk(BooleanValueConverter.toDocx4j(value.getLatinLnBrk()));
    result.setMarR(TextMarginValueConverter.toDocx4j(value.getMarR()));
    result.setHangingPunct(BooleanValueConverter.toDocx4j(value.getHangingPunct()));
    result.setFontAlgn(TextFontAlignTypeValueConverter.toDocx4j(value.getFontAlgn()));
    result.setEaLnBrk(BooleanValueConverter.toDocx4j(value.getEaLnBrk()));
    result.setRtl(BooleanValueConverter.toDocx4j(value.getRtl()));
    result.setLvl(TextIndentLevelTypeValueConverter.toDocx4j(value.getLvl()));
    result.setMarL(TextMarginValueConverter.toDocx4j(value.getMarL()));
    result.setDefTabSz(Coordinate32ValueConverter.toDocx4j(value.getDefTabSz()));
    result.setAlgn(TextAlignTypeValueConverter.toDocx4j(value.getAlgn()));
    result.setLnSpc(TextSpacingConverter.toDocx4j(value.getLnSpc()));
    result.setSpcBef(TextSpacingConverter.toDocx4j(value.getSpcBef()));
    result.setSpcAft(TextSpacingConverter.toDocx4j(value.getSpcAft()));
    result.setTabLst(TextTabStopListConverter.toDocx4j(value.getTabLst()));
    result.setDefRPr(TextCharacterPropertiesConverter.toDocx4j(value.getDefRPr()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getEGTextBulletColor().isBuClrTx()) result.setBuClrTx(TextBulletColorFollowTextConverter.toDocx4j(value.getEGTextBulletColor().getBuClrTx()));
    if (value.getEGTextBulletColor().isBuClr()) result.setBuClr(ColorConverter.toDocx4j(value.getEGTextBulletColor().getBuClr()));
    if (value.getEGTextBulletSize().isBuSzTx()) result.setBuSzTx(TextBulletSizeFollowTextConverter.toDocx4j(value.getEGTextBulletSize().getBuSzTx()));
    if (value.getEGTextBulletSize().isBuSzPct()) result.setBuSzPct(TextBulletSizePercentConverter.toDocx4j(value.getEGTextBulletSize().getBuSzPct()));
    if (value.getEGTextBulletSize().isBuSzPts()) result.setBuSzPts(TextBulletSizePointConverter.toDocx4j(value.getEGTextBulletSize().getBuSzPts()));
    if (value.getEGTextBulletTypeface().isBuFontTx()) result.setBuFontTx(TextBulletTypefaceFollowTextConverter.toDocx4j(value.getEGTextBulletTypeface().getBuFontTx()));
    if (value.getEGTextBulletTypeface().isBuFont()) result.setBuFont(TextFontValueConverter.toDocx4j(value.getEGTextBulletTypeface().getBuFont()));
    if (value.getEGTextBullet().isBuNone()) result.setBuNone(TextNoBulletConverter.toDocx4j(value.getEGTextBullet().getBuNone()));
    if (value.getEGTextBullet().isBuAutoNum()) result.setBuAutoNum(TextAutonumberBulletConverter.toDocx4j(value.getEGTextBullet().getBuAutoNum()));
    if (value.getEGTextBullet().isBuChar()) result.setBuChar(TextCharBulletConverter.toDocx4j(value.getEGTextBullet().getBuChar()));
    if (value.getEGTextBullet().isBuBlip()) result.setBuBlip(TextBlipBulletConverter.toDocx4j(value.getEGTextBullet().getBuBlip()));
    return result;
  }
}
