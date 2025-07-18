package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_TextParagraphPropertiesModel;
import org.docx4j.dml.CTTextParagraphProperties;

public class CT_TextParagraphPropertiesConverter {
  private CT_TextParagraphPropertiesConverter() {
  }

  public static CT_TextParagraphPropertiesModel fromDocx4J(CTTextParagraphProperties value) {
    if (value == null) return null;
    // look here false;
    CT_TextParagraphPropertiesModel.EG_TextBulletColorModel egTextBulletColor = new CT_TextParagraphPropertiesModel.EG_TextBulletColorModel();
    if (value.getBuClrTx() != null) egTextBulletColor = CT_TextParagraphPropertiesModel.EG_TextBulletColorModel.newBuClrTx(CT_TextBulletColorFollowTextConverter.fromDocx4J(value.getBuClrTx()));
    if (value.getBuClr() != null) egTextBulletColor = CT_TextParagraphPropertiesModel.EG_TextBulletColorModel.newBuClr(CT_ColorConverter.fromDocx4J(value.getBuClr()));
    // look here false;
    CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel egTextBulletSize = new CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel();
    if (value.getBuSzTx() != null) egTextBulletSize = CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel.newBuSzTx(CT_TextBulletSizeFollowTextConverter.fromDocx4J(value.getBuSzTx()));
    if (value.getBuSzPct() != null) egTextBulletSize = CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel.newBuSzPct(CT_TextBulletSizePercentConverter.fromDocx4J(value.getBuSzPct()));
    if (value.getBuSzPts() != null) egTextBulletSize = CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel.newBuSzPts(CT_TextBulletSizePointConverter.fromDocx4J(value.getBuSzPts()));
    // look here false;
    CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel egTextBulletTypeface = new CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel();
    if (value.getBuFontTx() != null) egTextBulletTypeface = CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel.newBuFontTx(CT_TextBulletTypefaceFollowTextConverter.fromDocx4J(value.getBuFontTx()));
    if (value.getBuFont() != null) egTextBulletTypeface = CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel.newBuFont(CT_TextFontConverter.fromDocx4J(value.getBuFont()));
    // look here false;
    CT_TextParagraphPropertiesModel.EG_TextBulletModel egTextBullet = new CT_TextParagraphPropertiesModel.EG_TextBulletModel();
    if (value.getBuNone() != null) egTextBullet = CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuNone(CT_TextNoBulletConverter.fromDocx4J(value.getBuNone()));
    if (value.getBuAutoNum() != null) egTextBullet = CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuAutoNum(CT_TextAutonumberBulletConverter.fromDocx4J(value.getBuAutoNum()));
    if (value.getBuChar() != null) egTextBullet = CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuChar(CT_TextCharBulletConverter.fromDocx4J(value.getBuChar()));
    if (value.getBuBlip() != null) egTextBullet = CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuBlip(CT_TextBlipBulletConverter.fromDocx4J(value.getBuBlip()));
    return new CT_TextParagraphPropertiesModel(ST_TextIndentConverter.fromDocx4J(value.getIndent()), BooleanConverter.fromDocx4J(value.getLatinLnBrk()), ST_TextMarginConverter.fromDocx4J(value.getMarR()), BooleanConverter.fromDocx4J(value.getHangingPunct()), ST_TextFontAlignTypeConverter.fromDocx4J(value.getFontAlgn()), BooleanConverter.fromDocx4J(value.getEaLnBrk()), BooleanConverter.fromDocx4J(value.getRtl()), ST_TextIndentLevelTypeConverter.fromDocx4J(value.getLvl()), ST_TextMarginConverter.fromDocx4J(value.getMarL()), ST_Coordinate32Converter.fromDocx4J(value.getDefTabSz()), ST_TextAlignTypeConverter.fromDocx4J(value.getAlgn()), CT_TextSpacingConverter.fromDocx4J(value.getLnSpc()), CT_TextSpacingConverter.fromDocx4J(value.getSpcBef()), CT_TextSpacingConverter.fromDocx4J(value.getSpcAft()), egTextBulletColor, egTextBulletSize, egTextBulletTypeface, egTextBullet, CT_TextTabStopListConverter.fromDocx4J(value.getTabLst()), CT_TextCharacterPropertiesConverter.fromDocx4J(value.getDefRPr()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTTextParagraphProperties toDocx4J(CT_TextParagraphPropertiesModel value) {
    return null;
  }
}
