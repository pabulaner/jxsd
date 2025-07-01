package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.BooleanModel;

public class CTTextParagraphPropertiesModel {
  private final STTextIndentModel indent;

  private final BooleanModel latinLnBrk;

  private final STTextMarginModel marR;

  private final BooleanModel hangingPunct;

  private final STTextFontAlignTypeModel fontAlgn;

  private final BooleanModel eaLnBrk;

  private final BooleanModel rtl;

  private final STTextIndentLevelTypeModel lvl;

  private final STTextMarginModel marL;

  private final STCoordinate32Model defTabSz;

  private final STTextAlignTypeModel algn;

  private final CTTextSpacingModel lnSpc;

  private final CTTextSpacingModel spcBef;

  private final CTTextSpacingModel spcAft;

  private final BuClrTxOrBuClrModel buClrTxOrBuClr;

  private final BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts;

  private final BuFontTxOrBuFontModel buFontTxOrBuFont;

  private final BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar;

  private final CTTextTabStopListModel tabLst;

  private final CTTextCharacterPropertiesModel defRPr;

  private final CTOfficeArtExtensionListModel extLst;

  public CTTextParagraphPropertiesModel(STTextIndentModel indent, BooleanModel latinLnBrk,
      STTextMarginModel marR, BooleanModel hangingPunct, STTextFontAlignTypeModel fontAlgn,
      BooleanModel eaLnBrk, BooleanModel rtl, STTextIndentLevelTypeModel lvl,
      STTextMarginModel marL, STCoordinate32Model defTabSz, STTextAlignTypeModel algn,
      CTTextSpacingModel lnSpc, CTTextSpacingModel spcBef, CTTextSpacingModel spcAft,
      BuClrTxOrBuClrModel buClrTxOrBuClr, BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts,
      BuFontTxOrBuFontModel buFontTxOrBuFont,
      BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar, CTTextTabStopListModel tabLst,
      CTTextCharacterPropertiesModel defRPr, CTOfficeArtExtensionListModel extLst) {
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

  public STTextIndentModel getIndent() {
    return this.indent;
  }

  public BooleanModel getLatinLnBrk() {
    return this.latinLnBrk;
  }

  public STTextMarginModel getMarR() {
    return this.marR;
  }

  public BooleanModel getHangingPunct() {
    return this.hangingPunct;
  }

  public STTextFontAlignTypeModel getFontAlgn() {
    return this.fontAlgn;
  }

  public BooleanModel getEaLnBrk() {
    return this.eaLnBrk;
  }

  public BooleanModel getRtl() {
    return this.rtl;
  }

  public STTextIndentLevelTypeModel getLvl() {
    return this.lvl;
  }

  public STTextMarginModel getMarL() {
    return this.marL;
  }

  public STCoordinate32Model getDefTabSz() {
    return this.defTabSz;
  }

  public STTextAlignTypeModel getAlgn() {
    return this.algn;
  }

  public CTTextSpacingModel getLnSpc() {
    return this.lnSpc;
  }

  public CTTextSpacingModel getSpcBef() {
    return this.spcBef;
  }

  public CTTextSpacingModel getSpcAft() {
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

  public CTTextTabStopListModel getTabLst() {
    return this.tabLst;
  }

  public CTTextCharacterPropertiesModel getDefRPr() {
    return this.defRPr;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class BuClrTxOrBuClrModel {
    private final Integer type;

    private final Object value;

    public BuClrTxOrBuClrModel() {
      this(-1, null);
    }

    private BuClrTxOrBuClrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuClrTxOrBuClrModel newBuClrTx(CTTextBulletColorFollowTextModel value) {
      return new BuClrTxOrBuClrModel(0, value);
    }

    public Boolean isBuClrTx() {
      return this.type == 0;
    }

    public CTTextBulletColorFollowTextModel getBuClrTx() {
      return (CTTextBulletColorFollowTextModel) this.value;
    }

    public static BuClrTxOrBuClrModel newBuClr(CTColorModel value) {
      return new BuClrTxOrBuClrModel(1, value);
    }

    public Boolean isBuClr() {
      return this.type == 1;
    }

    public CTColorModel getBuClr() {
      return (CTColorModel) this.value;
    }
  }

  public static class BuSzTxOrBuSzPctOrBuSzPtsModel {
    private final Integer type;

    private final Object value;

    public BuSzTxOrBuSzPctOrBuSzPtsModel() {
      this(-1, null);
    }

    private BuSzTxOrBuSzPctOrBuSzPtsModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuSzTxOrBuSzPctOrBuSzPtsModel newBuSzTx(CTTextBulletSizeFollowTextModel value) {
      return new BuSzTxOrBuSzPctOrBuSzPtsModel(0, value);
    }

    public Boolean isBuSzTx() {
      return this.type == 0;
    }

    public CTTextBulletSizeFollowTextModel getBuSzTx() {
      return (CTTextBulletSizeFollowTextModel) this.value;
    }

    public static BuSzTxOrBuSzPctOrBuSzPtsModel newBuSzPct(CTTextBulletSizePercentModel value) {
      return new BuSzTxOrBuSzPctOrBuSzPtsModel(1, value);
    }

    public Boolean isBuSzPct() {
      return this.type == 1;
    }

    public CTTextBulletSizePercentModel getBuSzPct() {
      return (CTTextBulletSizePercentModel) this.value;
    }

    public static BuSzTxOrBuSzPctOrBuSzPtsModel newBuSzPts(CTTextBulletSizePointModel value) {
      return new BuSzTxOrBuSzPctOrBuSzPtsModel(2, value);
    }

    public Boolean isBuSzPts() {
      return this.type == 2;
    }

    public CTTextBulletSizePointModel getBuSzPts() {
      return (CTTextBulletSizePointModel) this.value;
    }
  }

  public static class BuFontTxOrBuFontModel {
    private final Integer type;

    private final Object value;

    public BuFontTxOrBuFontModel() {
      this(-1, null);
    }

    private BuFontTxOrBuFontModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuFontTxOrBuFontModel newBuFontTx(CTTextBulletTypefaceFollowTextModel value) {
      return new BuFontTxOrBuFontModel(0, value);
    }

    public Boolean isBuFontTx() {
      return this.type == 0;
    }

    public CTTextBulletTypefaceFollowTextModel getBuFontTx() {
      return (CTTextBulletTypefaceFollowTextModel) this.value;
    }

    public static BuFontTxOrBuFontModel newBuFont(CTTextFontModel value) {
      return new BuFontTxOrBuFontModel(1, value);
    }

    public Boolean isBuFont() {
      return this.type == 1;
    }

    public CTTextFontModel getBuFont() {
      return (CTTextFontModel) this.value;
    }
  }

  public static class BuNoneOrBuAutoNumOrBuCharModel {
    private final Integer type;

    private final Object value;

    public BuNoneOrBuAutoNumOrBuCharModel() {
      this(-1, null);
    }

    private BuNoneOrBuAutoNumOrBuCharModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuNone(CTTextNoBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(0, value);
    }

    public Boolean isBuNone() {
      return this.type == 0;
    }

    public CTTextNoBulletModel getBuNone() {
      return (CTTextNoBulletModel) this.value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuAutoNum(CTTextAutonumberBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(1, value);
    }

    public Boolean isBuAutoNum() {
      return this.type == 1;
    }

    public CTTextAutonumberBulletModel getBuAutoNum() {
      return (CTTextAutonumberBulletModel) this.value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuChar(CTTextCharBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(2, value);
    }

    public Boolean isBuChar() {
      return this.type == 2;
    }

    public CTTextCharBulletModel getBuChar() {
      return (CTTextCharBulletModel) this.value;
    }

    public static BuNoneOrBuAutoNumOrBuCharModel newBuBlip(CTTextBlipBulletModel value) {
      return new BuNoneOrBuAutoNumOrBuCharModel(3, value);
    }

    public Boolean isBuBlip() {
      return this.type == 3;
    }

    public CTTextBlipBulletModel getBuBlip() {
      return (CTTextBlipBulletModel) this.value;
    }
  }
}
