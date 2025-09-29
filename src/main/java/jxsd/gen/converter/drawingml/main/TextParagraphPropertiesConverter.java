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
    if (value.getBuClrTx() != null) egTextBulletColor = TextParagraphPropertiesConverter.newEGTextBulletColor(TextParagraphPropertiesConverter.fromDocx4j(value.getBuClrTx()));
    if (value.getBuClr() != null) egTextBulletColor = TextParagraphPropertiesConverter.newEGTextBulletColor(TextParagraphPropertiesConverter.fromDocx4j(value.getBuClr()));
    TextParagraphPropertiesModel.EG_TextBulletSize egTextBulletSize = new TextParagraphPropertiesModel.EG_TextBulletSize();
    if (value.getBuSzTx() != null) egTextBulletSize = TextParagraphPropertiesConverter.newEGTextBulletSize(TextParagraphPropertiesConverter.fromDocx4j(value.getBuSzTx()));
    if (value.getBuSzPct() != null) egTextBulletSize = TextParagraphPropertiesConverter.newEGTextBulletSize(TextParagraphPropertiesConverter.fromDocx4j(value.getBuSzPct()));
    if (value.getBuSzPts() != null) egTextBulletSize = TextParagraphPropertiesConverter.newEGTextBulletSize(TextParagraphPropertiesConverter.fromDocx4j(value.getBuSzPts()));
    TextParagraphPropertiesModel.EG_TextBulletTypeface egTextBulletTypeface = new TextParagraphPropertiesModel.EG_TextBulletTypeface();
    if (value.getBuFontTx() != null) egTextBulletTypeface = TextParagraphPropertiesConverter.newEGTextBulletTypeface(TextParagraphPropertiesConverter.fromDocx4j(value.getBuFontTx()));
    if (value.getBuFont() != null) egTextBulletTypeface = TextParagraphPropertiesConverter.newEGTextBulletTypeface(TextParagraphPropertiesConverter.fromDocx4j(value.getBuFont()));
    TextParagraphPropertiesModel.EG_TextBullet egTextBullet = new TextParagraphPropertiesModel.EG_TextBullet();
    if (value.getBuNone() != null) egTextBullet = TextParagraphPropertiesConverter.newEGTextBullet(TextParagraphPropertiesConverter.fromDocx4j(value.getBuNone()));
    if (value.getBuAutoNum() != null) egTextBullet = TextParagraphPropertiesConverter.newEGTextBullet(TextParagraphPropertiesConverter.fromDocx4j(value.getBuAutoNum()));
    if (value.getBuChar() != null) egTextBullet = TextParagraphPropertiesConverter.newEGTextBullet(TextParagraphPropertiesConverter.fromDocx4j(value.getBuChar()));
    if (value.getBuBlip() != null) egTextBullet = TextParagraphPropertiesConverter.newEGTextBullet(TextParagraphPropertiesConverter.fromDocx4j(value.getBuBlip()));
    return new TextParagraphPropertiesModel(TextIndentValueConverter.fromDocx4j(value.getIndent()), BooleanValueConverter.fromDocx4j(value.getLatinLnBrk()), TextMarginValueConverter.fromDocx4j(value.getMarR()), BooleanValueConverter.fromDocx4j(value.getHangingPunct()), TextFontAlignTypeValueConverter.fromDocx4j(value.getFontAlgn()), BooleanValueConverter.fromDocx4j(value.getEaLnBrk()), BooleanValueConverter.fromDocx4j(value.getRtl()), TextIndentLevelTypeValueConverter.fromDocx4j(value.getLvl()), TextMarginValueConverter.fromDocx4j(value.getMarL()), Coordinate32ValueConverter.fromDocx4j(value.getDefTabSz()), TextAlignTypeValueConverter.fromDocx4j(value.getAlgn()), TextSpacingConverter.fromDocx4j(value.getLnSpc()), TextSpacingConverter.fromDocx4j(value.getSpcBef()), TextSpacingConverter.fromDocx4j(value.getSpcAft()), egTextBulletColor, egTextBulletSize, egTextBulletTypeface, egTextBullet, TextTabStopListConverter.fromDocx4j(value.getTabLst()), TextCharacterPropertiesConverter.fromDocx4j(value.getDefRPr()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
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
