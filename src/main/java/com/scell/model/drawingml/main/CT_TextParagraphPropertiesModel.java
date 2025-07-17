package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_TextParagraphPropertiesModel {
  private final ST_TextIndentModel indent;

  private final BooleanModel latinLnBrk;

  private final ST_TextMarginModel marR;

  private final BooleanModel hangingPunct;

  private final ST_TextFontAlignTypeModel fontAlgn;

  private final BooleanModel eaLnBrk;

  private final BooleanModel rtl;

  private final ST_TextIndentLevelTypeModel lvl;

  private final ST_TextMarginModel marL;

  private final ST_Coordinate32Model defTabSz;

  private final ST_TextAlignTypeModel algn;

  private final CT_TextSpacingModel lnSpc;

  private final CT_TextSpacingModel spcBef;

  private final CT_TextSpacingModel spcAft;

  private final BuClrTxOrBuClrModel buClrTxOrBuClr;

  private final BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts;

  private final BuFontTxOrBuFontModel buFontTxOrBuFont;

  private final BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar;

  private final CT_TextTabStopListModel tabLst;

  private final CT_TextCharacterPropertiesModel defRPr;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_TextParagraphPropertiesModel(ST_TextIndentModel indent, BooleanModel latinLnBrk,
      ST_TextMarginModel marR, BooleanModel hangingPunct, ST_TextFontAlignTypeModel fontAlgn,
      BooleanModel eaLnBrk, BooleanModel rtl, ST_TextIndentLevelTypeModel lvl,
      ST_TextMarginModel marL, ST_Coordinate32Model defTabSz, ST_TextAlignTypeModel algn,
      CT_TextSpacingModel lnSpc, CT_TextSpacingModel spcBef, CT_TextSpacingModel spcAft,
      BuClrTxOrBuClrModel buClrTxOrBuClr, BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts,
      BuFontTxOrBuFontModel buFontTxOrBuFont,
      BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar, CT_TextTabStopListModel tabLst,
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

  public BooleanModel getLatinLnBrk() {
    return this.latinLnBrk;
  }

  public ST_TextMarginModel getMarR() {
    return this.marR;
  }

  public BooleanModel getHangingPunct() {
    return this.hangingPunct;
  }

  public ST_TextFontAlignTypeModel getFontAlgn() {
    return this.fontAlgn;
  }

  public BooleanModel getEaLnBrk() {
    return this.eaLnBrk;
  }

  public BooleanModel getRtl() {
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

  public BuClrTxOrBuClrModel getBuClrTxOrBuClr() {
    return this.buClrTxOrBuClr;
  }

  public BuSzTxOrBuSzPctOrBuSzPtsModel getBuSzTxOrBuSzPctOrBuSzPts() {
    return this.buSzTxOrBuSzPctOrBuSzPts;
  }

  public BuFontTxOrBuFontModel getBuFontTxOrBuFont() {
    return this.buFontTxOrBuFont;
  }

  public BuNoneOrBuAutoNumOrBuCharModel getBuNoneOrBuAutoNumOrBuChar() {
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

  public static class BuClrTxOrBuClrModel {
    private final int type;

    private final Object value;

    public BuClrTxOrBuClrModel() {
      this(-1, null);
    }

    private BuClrTxOrBuClrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuClrTxOrBuClrModel newBuClrTx(CT_TextBulletColorFollowTextModel value) {
      return new BuClrTxOrBuClrModel(0, value);
    }

    public boolean isBuClrTx() {
      return this.type == 0;
    }

    public CT_TextBulletColorFollowTextModel getBuClrTx() {
      return (CT_TextBulletColorFollowTextModel) this.value;
    }

    public static BuClrTxOrBuClrModel newBuClr(CT_ColorModel value) {
      return new BuClrTxOrBuClrModel(1, value);
    }

    public boolean isBuClr() {
      return this.type == 1;
    }

    public CT_ColorModel getBuClr() {
      return (CT_ColorModel) this.value;
    }
  }

  public static class BuSzTxOrBuSzPctOrBuSzPtsModel {
    private final int type;

    private final Object value;

    public BuSzTxOrBuSzPctOrBuSzPtsModel() {
      this(-1, null);
    }

    private BuSzTxOrBuSzPctOrBuSzPtsModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuSzTxOrBuSzPctOrBuSzPtsModel newBuSzTx(CT_TextBulletSizeFollowTextModel value) {
      return new BuSzTxOrBuSzPctOrBuSzPtsModel(0, value);
    }

    public boolean isBuSzTx() {
      return this.type == 0;
    }

    public CT_TextBulletSizeFollowTextModel getBuSzTx() {
      return (CT_TextBulletSizeFollowTextModel) this.value;
    }

    public static BuSzTxOrBuSzPctOrBuSzPtsModel newBuSzPct(CT_TextBulletSizePercentModel value) {
      return new BuSzTxOrBuSzPctOrBuSzPtsModel(1, value);
    }

    public boolean isBuSzPct() {
      return this.type == 1;
    }

    public CT_TextBulletSizePercentModel getBuSzPct() {
      return (CT_TextBulletSizePercentModel) this.value;
    }

    public static BuSzTxOrBuSzPctOrBuSzPtsModel newBuSzPts(CT_TextBulletSizePointModel value) {
      return new BuSzTxOrBuSzPctOrBuSzPtsModel(2, value);
    }

    public boolean isBuSzPts() {
      return this.type == 2;
    }

    public CT_TextBulletSizePointModel getBuSzPts() {
      return (CT_TextBulletSizePointModel) this.value;
    }
  }

  public static class BuFontTxOrBuFontModel {
    private final int type;

    private final Object value;

    public BuFontTxOrBuFontModel() {
      this(-1, null);
    }

    private BuFontTxOrBuFontModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuFontTxOrBuFontModel newBuFontTx(CT_TextBulletTypefaceFollowTextModel value) {
      return new BuFontTxOrBuFontModel(0, value);
    }

    public boolean isBuFontTx() {
      return this.type == 0;
    }

    public CT_TextBulletTypefaceFollowTextModel getBuFontTx() {
      return (CT_TextBulletTypefaceFollowTextModel) this.value;
    }

    public static BuFontTxOrBuFontModel newBuFont(CT_TextFontModel value) {
      return new BuFontTxOrBuFontModel(1, value);
    }

    public boolean isBuFont() {
      return this.type == 1;
    }

    public CT_TextFontModel getBuFont() {
      return (CT_TextFontModel) this.value;
    }
  }

  public static class BuNoneOrBuAutoNumOrBuCharModel {
    private final int type;

    private final Object value;

    public BuNoneOrBuAutoNumOrBuCharModel() {
      this(-1, null);
    }

    private BuNoneOrBuAutoNumOrBuCharModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuNone(CT_TextNoBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(0, value);
    }

    public boolean isBuNone() {
      return this.type == 0;
    }

    public CT_TextNoBulletModel getBuNone() {
      return (CT_TextNoBulletModel) this.value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuAutoNum(CT_TextAutonumberBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(1, value);
    }

    public boolean isBuAutoNum() {
      return this.type == 1;
    }

    public CT_TextAutonumberBulletModel getBuAutoNum() {
      return (CT_TextAutonumberBulletModel) this.value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuChar(CT_TextCharBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(2, value);
    }

    public boolean isBuChar() {
      return this.type == 2;
    }

    public CT_TextCharBulletModel getBuChar() {
      return (CT_TextCharBulletModel) this.value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuBlip(CT_TextBlipBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(3, value);
    }

    public boolean isBuBlip() {
      return this.type == 3;
    }

    public CT_TextBlipBulletModel getBuBlip() {
      return (CT_TextBlipBulletModel) this.value;
    }
  }
}
