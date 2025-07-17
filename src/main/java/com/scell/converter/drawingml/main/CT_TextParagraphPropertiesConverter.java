package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_TextParagraphPropertiesModel;
import org.docx4j.dml.CTTextParagraphProperties;

public class CT_TextParagraphPropertiesConverter {
  private CT_TextParagraphPropertiesConverter() {
  }

  public static CT_TextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value) {
    if (value == null) return null;
    return new CT_TextParagraphPropertiesModel(ST_TextIndentConverter.fromDocx4j(value.getIndent()), BooleanConverter.fromDocx4j(value.getLatinLnBrk()), ST_TextMarginConverter.fromDocx4j(value.getMarR()), BooleanConverter.fromDocx4j(value.getHangingPunct()), ST_TextFontAlignTypeConverter.fromDocx4j(value.getFontAlgn()), BooleanConverter.fromDocx4j(value.getEaLnBrk()), BooleanConverter.fromDocx4j(value.getRtl()), ST_TextIndentLevelTypeConverter.fromDocx4j(value.getLvl()), ST_TextMarginConverter.fromDocx4j(value.getMarL()), ST_Coordinate32Converter.fromDocx4j(value.getDefTabSz()), ST_TextAlignTypeConverter.fromDocx4j(value.getAlgn()), CT_TextSpacingConverter.fromDocx4j(value.getLnSpc()), CT_TextSpacingConverter.fromDocx4j(value.getSpcBef()), CT_TextSpacingConverter.fromDocx4j(value.getSpcAft()), BuClrTxOrBuClrConverter.fromDocx4j(value.getBuClrTxOrBuClr()), BuSzTxOrBuSzPctOrBuSzPtsConverter.fromDocx4j(value.getBuSzTxOrBuSzPctOrBuSzPts()), BuFontTxOrBuFontConverter.fromDocx4j(value.getBuFontTxOrBuFont()), BuNoneOrBuAutoNumOrBuCharConverter.fromDocx4j(value.getBuNoneOrBuAutoNumOrBuChar()), CT_TextTabStopListConverter.fromDocx4j(value.getTabLst()), CT_TextCharacterPropertiesConverter.fromDocx4j(value.getDefRPr()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextParagraphProperties toDocx4j(CT_TextParagraphPropertiesModel value) {
    return null;
  }

  public static class BuClrTxOrBuClrConverter {
    private BuClrTxOrBuClrConverter() {
    }

    public static CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel fromDocx4j(
        CTTextParagraphProperties.BuClrTxOrBuClr value) {
      if (value == null) return null;
    }

    public static CTTextParagraphProperties.BuClrTxOrBuClr toDocx4j(
        CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel value) {
      return null;
    }
  }

  public static class BuSzTxOrBuSzPctOrBuSzPtsConverter {
    private BuSzTxOrBuSzPctOrBuSzPtsConverter() {
    }

    public static CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel fromDocx4j(
        CTTextParagraphProperties.BuSzTxOrBuSzPctOrBuSzPts value) {
      if (value == null) return null;
    }

    public static CTTextParagraphProperties.BuSzTxOrBuSzPctOrBuSzPts toDocx4j(
        CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel value) {
      return null;
    }
  }

  public static class BuFontTxOrBuFontConverter {
    private BuFontTxOrBuFontConverter() {
    }

    public static CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel fromDocx4j(
        CTTextParagraphProperties.BuFontTxOrBuFont value) {
      if (value == null) return null;
    }

    public static CTTextParagraphProperties.BuFontTxOrBuFont toDocx4j(
        CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel value) {
      return null;
    }
  }

  public static class BuNoneOrBuAutoNumOrBuCharConverter {
    private BuNoneOrBuAutoNumOrBuCharConverter() {
    }

    public static CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel fromDocx4j(
        CTTextParagraphProperties.BuNoneOrBuAutoNumOrBuChar value) {
      if (value == null) return null;
    }

    public static CTTextParagraphProperties.BuNoneOrBuAutoNumOrBuChar toDocx4j(
        CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel value) {
      return null;
    }
  }
}
