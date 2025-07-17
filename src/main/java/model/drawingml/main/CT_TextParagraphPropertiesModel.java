package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.booleanModel;

public class CT_TextParagraphPropertiesModel {
  private final ST_TextIndentModel indent;

  private final booleanModel latinLnBrk;

  private final ST_TextMarginModel marR;

  private final booleanModel hangingPunct;

  private final ST_TextFontAlignTypeModel fontAlgn;

  private final booleanModel eaLnBrk;

  private final booleanModel rtl;

  private final ST_TextIndentLevelTypeModel lvl;

  private final ST_TextMarginModel marL;

  private final ST_Coordinate32Model defTabSz;

  private final ST_TextAlignTypeModel algn;

  private final CT_TextSpacingModel lnSpc;

  private final CT_TextSpacingModel spcBef;

  private final CT_TextSpacingModel spcAft;

  private final buClrTxOrBuClrModel buClrTxOrBuClr;

  private final buSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts;

  private final buFontTxOrBuFontModel buFontTxOrBuFont;

  private final buNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar;

  private final CT_TextTabStopListModel tabLst;

  private final CT_TextCharacterPropertiesModel defRPr;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_TextParagraphPropertiesModel(ST_TextIndentModel indent, booleanModel latinLnBrk,
      ST_TextMarginModel marR, booleanModel hangingPunct, ST_TextFontAlignTypeModel fontAlgn,
      booleanModel eaLnBrk, booleanModel rtl, ST_TextIndentLevelTypeModel lvl,
      ST_TextMarginModel marL, ST_Coordinate32Model defTabSz, ST_TextAlignTypeModel algn,
      CT_TextSpacingModel lnSpc, CT_TextSpacingModel spcBef, CT_TextSpacingModel spcAft,
      buClrTxOrBuClrModel buClrTxOrBuClr, buSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts,
      buFontTxOrBuFontModel buFontTxOrBuFont,
      buNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar, CT_TextTabStopListModel tabLst,
      CT_TextCharacterPropertiesModel defRPr, CT_OfficeArtExtensionListModel extLst) {
    this.indent = indent;
    this.latinLnBrk = latinLnBrk;
    this.marR = marR;
    this.hangingPunct = hangingPunct;
    this.fontAlgn = fontAlgn;
    this.eaLnBrk = eaLnBrk;
    this.rtl = rtl;
    this.lvl = lvl;
    this.marL = marL;
    this.defTabSz = defTabSz;
    this.algn = algn;
    this.lnSpc = lnSpc;
    this.spcBef = spcBef;
    this.spcAft = spcAft;
    this.buClrTxOrBuClr = buClrTxOrBuClr;
    this.buSzTxOrBuSzPctOrBuSzPts = buSzTxOrBuSzPctOrBuSzPts;
    this.buFontTxOrBuFont = buFontTxOrBuFont;
    this.buNoneOrBuAutoNumOrBuChar = buNoneOrBuAutoNumOrBuChar;
    this.tabLst = tabLst;
    this.defRPr = defRPr;
    this.extLst = extLst;
  }

  public ST_TextIndentModel getIndent() {
    return this.indent;
  }

  public booleanModel getLatinLnBrk() {
    return this.latinLnBrk;
  }

  public ST_TextMarginModel getMarR() {
    return this.marR;
  }

  public booleanModel getHangingPunct() {
    return this.hangingPunct;
  }

  public ST_TextFontAlignTypeModel getFontAlgn() {
    return this.fontAlgn;
  }

  public booleanModel getEaLnBrk() {
    return this.eaLnBrk;
  }

  public booleanModel getRtl() {
    return this.rtl;
  }

  public ST_TextIndentLevelTypeModel getLvl() {
    return this.lvl;
  }

  public ST_TextMarginModel getMarL() {
    return this.marL;
  }

  public ST_Coordinate32Model getDefTabSz() {
    return this.defTabSz;
  }

  public ST_TextAlignTypeModel getAlgn() {
    return this.algn;
  }

  public CT_TextSpacingModel getLnSpc() {
    return this.lnSpc;
  }

  public CT_TextSpacingModel getSpcBef() {
    return this.spcBef;
  }

  public CT_TextSpacingModel getSpcAft() {
    return this.spcAft;
  }

  public buClrTxOrBuClrModel getBuClrTxOrBuClr() {
    return this.buClrTxOrBuClr;
  }

  public buSzTxOrBuSzPctOrBuSzPtsModel getBuSzTxOrBuSzPctOrBuSzPts() {
    return this.buSzTxOrBuSzPctOrBuSzPts;
  }

  public buFontTxOrBuFontModel getBuFontTxOrBuFont() {
    return this.buFontTxOrBuFont;
  }

  public buNoneOrBuAutoNumOrBuCharModel getBuNoneOrBuAutoNumOrBuChar() {
    return this.buNoneOrBuAutoNumOrBuChar;
  }

  public CT_TextTabStopListModel getTabLst() {
    return this.tabLst;
  }

  public CT_TextCharacterPropertiesModel getDefRPr() {
    return this.defRPr;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class buClrTxOrBuClrModel {
    private final int type;

    private final Object value;

    public buClrTxOrBuClrModel() {
      this(-1, null);
    }

    private buClrTxOrBuClrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static buClrTxOrBuClrModel newBuClrTx(CT_TextBulletColorFollowTextModel value) {
      return new buClrTxOrBuClrModel(0, value);
    }

    public boolean isBuClrTx() {
      return this.type == 0;
    }

    public CT_TextBulletColorFollowTextModel getBuClrTx() {
      return (CT_TextBulletColorFollowTextModel) this.value;
    }

    public static buClrTxOrBuClrModel newBuClr(CT_ColorModel value) {
      return new buClrTxOrBuClrModel(1, value);
    }

    public boolean isBuClr() {
      return this.type == 1;
    }

    public CT_ColorModel getBuClr() {
      return (CT_ColorModel) this.value;
    }
  }

  public static class buSzTxOrBuSzPctOrBuSzPtsModel {
    private final int type;

    private final Object value;

    public buSzTxOrBuSzPctOrBuSzPtsModel() {
      this(-1, null);
    }

    private buSzTxOrBuSzPctOrBuSzPtsModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static buSzTxOrBuSzPctOrBuSzPtsModel newBuSzTx(CT_TextBulletSizeFollowTextModel value) {
      return new buSzTxOrBuSzPctOrBuSzPtsModel(0, value);
    }

    public boolean isBuSzTx() {
      return this.type == 0;
    }

    public CT_TextBulletSizeFollowTextModel getBuSzTx() {
      return (CT_TextBulletSizeFollowTextModel) this.value;
    }

    public static buSzTxOrBuSzPctOrBuSzPtsModel newBuSzPct(CT_TextBulletSizePercentModel value) {
      return new buSzTxOrBuSzPctOrBuSzPtsModel(1, value);
    }

    public boolean isBuSzPct() {
      return this.type == 1;
    }

    public CT_TextBulletSizePercentModel getBuSzPct() {
      return (CT_TextBulletSizePercentModel) this.value;
    }

    public static buSzTxOrBuSzPctOrBuSzPtsModel newBuSzPts(CT_TextBulletSizePointModel value) {
      return new buSzTxOrBuSzPctOrBuSzPtsModel(2, value);
    }

    public boolean isBuSzPts() {
      return this.type == 2;
    }

    public CT_TextBulletSizePointModel getBuSzPts() {
      return (CT_TextBulletSizePointModel) this.value;
    }
  }

  public static class buFontTxOrBuFontModel {
    private final int type;

    private final Object value;

    public buFontTxOrBuFontModel() {
      this(-1, null);
    }

    private buFontTxOrBuFontModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static buFontTxOrBuFontModel newBuFontTx(CT_TextBulletTypefaceFollowTextModel value) {
      return new buFontTxOrBuFontModel(0, value);
    }

    public boolean isBuFontTx() {
      return this.type == 0;
    }

    public CT_TextBulletTypefaceFollowTextModel getBuFontTx() {
      return (CT_TextBulletTypefaceFollowTextModel) this.value;
    }

    public static buFontTxOrBuFontModel newBuFont(CT_TextFontModel value) {
      return new buFontTxOrBuFontModel(1, value);
    }

    public boolean isBuFont() {
      return this.type == 1;
    }

    public CT_TextFontModel getBuFont() {
      return (CT_TextFontModel) this.value;
    }
  }

  public static class buNoneOrBuAutoNumOrBuCharModel {
    private final int type;

    private final Object value;

    public buNoneOrBuAutoNumOrBuCharModel() {
      this(-1, null);
    }

    private buNoneOrBuAutoNumOrBuCharModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static buNoneOrBuAutoNumOrBuCharModel newBuNone(CT_TextNoBulletModel value) {
      return new buNoneOrBuAutoNumOrBuCharModel(0, value);
    }

    public boolean isBuNone() {
      return this.type == 0;
    }

    public CT_TextNoBulletModel getBuNone() {
      return (CT_TextNoBulletModel) this.value;
    }

    public static buNoneOrBuAutoNumOrBuCharModel newBuAutoNum(CT_TextAutonumberBulletModel value) {
      return new buNoneOrBuAutoNumOrBuCharModel(1, value);
    }

    public boolean isBuAutoNum() {
      return this.type == 1;
    }

    public CT_TextAutonumberBulletModel getBuAutoNum() {
      return (CT_TextAutonumberBulletModel) this.value;
    }

    public static buNoneOrBuAutoNumOrBuCharModel newBuChar(CT_TextCharBulletModel value) {
      return new buNoneOrBuAutoNumOrBuCharModel(2, value);
    }

    public boolean isBuChar() {
      return this.type == 2;
    }

    public CT_TextCharBulletModel getBuChar() {
      return (CT_TextCharBulletModel) this.value;
    }

    public static buNoneOrBuAutoNumOrBuCharModel newBuBlip(CT_TextBlipBulletModel value) {
      return new buNoneOrBuAutoNumOrBuCharModel(3, value);
    }

    public boolean isBuBlip() {
      return this.type == 3;
    }

    public CT_TextBlipBulletModel getBuBlip() {
      return (CT_TextBlipBulletModel) this.value;
    }
  }
}
