package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.TextParagraphPropertiesModel;
import org.docx4j.dml.CTTextParagraphProperties;

public class TextParagraphPropertiesConverter {
  private TextParagraphPropertiesConverter() {
  }

  public static TextParagraphPropertiesModel fromDocx4J(CTTextParagraphProperties value) {
    if (value == null) return null;
    TextParagraphPropertiesModel.TextBulletColorModel egTextBulletColor = new TextParagraphPropertiesModel.TextBulletColorModel();
    if (value.getBuClrTx() != null) egTextBulletColor = TextParagraphPropertiesModel.TextBulletColorModel.newBuClrTx(TextBulletColorFollowTextConverter.fromDocx4J(value.getBuClrTx()));
    if (value.getBuClr() != null) egTextBulletColor = TextParagraphPropertiesModel.TextBulletColorModel.newBuClr(ColorConverter.fromDocx4J(value.getBuClr()));
    TextParagraphPropertiesModel.TextBulletSizeModel egTextBulletSize = new TextParagraphPropertiesModel.TextBulletSizeModel();
    if (value.getBuSzTx() != null) egTextBulletSize = TextParagraphPropertiesModel.TextBulletSizeModel.newBuSzTx(TextBulletSizeFollowTextConverter.fromDocx4J(value.getBuSzTx()));
    if (value.getBuSzPct() != null) egTextBulletSize = TextParagraphPropertiesModel.TextBulletSizeModel.newBuSzPct(TextBulletSizePercentConverter.fromDocx4J(value.getBuSzPct()));
    if (value.getBuSzPts() != null) egTextBulletSize = TextParagraphPropertiesModel.TextBulletSizeModel.newBuSzPts(TextBulletSizePointConverter.fromDocx4J(value.getBuSzPts()));
    TextParagraphPropertiesModel.TextBulletTypefaceModel egTextBulletTypeface = new TextParagraphPropertiesModel.TextBulletTypefaceModel();
    if (value.getBuFontTx() != null) egTextBulletTypeface = TextParagraphPropertiesModel.TextBulletTypefaceModel.newBuFontTx(TextBulletTypefaceFollowTextConverter.fromDocx4J(value.getBuFontTx()));
    if (value.getBuFont() != null) egTextBulletTypeface = TextParagraphPropertiesModel.TextBulletTypefaceModel.newBuFont(TextFontConverter.fromDocx4J(value.getBuFont()));
    TextParagraphPropertiesModel.TextBulletModel egTextBullet = new TextParagraphPropertiesModel.TextBulletModel();
    if (value.getBuNone() != null) egTextBullet = TextParagraphPropertiesModel.TextBulletModel.newBuNone(TextNoBulletConverter.fromDocx4J(value.getBuNone()));
    if (value.getBuAutoNum() != null) egTextBullet = TextParagraphPropertiesModel.TextBulletModel.newBuAutoNum(TextAutonumberBulletConverter.fromDocx4J(value.getBuAutoNum()));
    if (value.getBuChar() != null) egTextBullet = TextParagraphPropertiesModel.TextBulletModel.newBuChar(TextCharBulletConverter.fromDocx4J(value.getBuChar()));
    if (value.getBuBlip() != null) egTextBullet = TextParagraphPropertiesModel.TextBulletModel.newBuBlip(TextBlipBulletConverter.fromDocx4J(value.getBuBlip()));
    return new TextParagraphPropertiesModel(TextIndentConverter.fromDocx4J(value.getIndent()), BooleanConverter.fromDocx4J(value.isLatinLnBrk()), TextMarginConverter.fromDocx4J(value.getMarR()), BooleanConverter.fromDocx4J(value.isHangingPunct()), TextFontAlignTypeConverter.fromDocx4J(value.getFontAlgn()), BooleanConverter.fromDocx4J(value.isEaLnBrk()), BooleanConverter.fromDocx4J(value.isRtl()), TextIndentLevelTypeConverter.fromDocx4J(value.getLvl()), TextMarginConverter.fromDocx4J(value.getMarL()), Coordinate32Converter.fromDocx4J(value.getDefTabSz()), TextAlignTypeConverter.fromDocx4J(value.getAlgn()), TextSpacingConverter.fromDocx4J(value.getLnSpc()), TextSpacingConverter.fromDocx4J(value.getSpcBef()), TextSpacingConverter.fromDocx4J(value.getSpcAft()), egTextBulletColor, egTextBulletSize, egTextBulletTypeface, egTextBullet, TextTabStopListConverter.fromDocx4J(value.getTabLst()), TextCharacterPropertiesConverter.fromDocx4J(value.getDefRPr()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
