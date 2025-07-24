package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;

public class TextParagraphPropertiesModel {
  private final TextIndentModel indent;

  private final BooleanModel latinLnBrk;

  private final TextMarginModel marR;

  private final BooleanModel hangingPunct;

  private final TextFontAlignTypeModel fontAlgn;

  private final BooleanModel eaLnBrk;

  private final BooleanModel rtl;

  private final TextIndentLevelTypeModel lvl;

  private final TextMarginModel marL;

  private final Coordinate32Model defTabSz;

  private final TextAlignTypeModel algn;

  private final TextSpacingModel lnSpc;

  private final TextSpacingModel spcBef;

  private final TextSpacingModel spcAft;

  private final TextBulletColorModel egTextBulletColor;

  private final TextBulletSizeModel egTextBulletSize;

  private final TextBulletTypefaceModel egTextBulletTypeface;

  private final TextBulletModel egTextBullet;

  private final TextTabStopListModel tabLst;

  private final TextCharacterPropertiesModel defRPr;

  private final OfficeArtExtensionListModel extLst;

  public TextParagraphPropertiesModel(TextIndentModel indent, BooleanModel latinLnBrk,
      TextMarginModel marR, BooleanModel hangingPunct, TextFontAlignTypeModel fontAlgn,
      BooleanModel eaLnBrk, BooleanModel rtl, TextIndentLevelTypeModel lvl, TextMarginModel marL,
      Coordinate32Model defTabSz, TextAlignTypeModel algn, TextSpacingModel lnSpc,
      TextSpacingModel spcBef, TextSpacingModel spcAft, TextBulletColorModel egTextBulletColor,
      TextBulletSizeModel egTextBulletSize, TextBulletTypefaceModel egTextBulletTypeface,
      TextBulletModel egTextBullet, TextTabStopListModel tabLst,
      TextCharacterPropertiesModel defRPr, OfficeArtExtensionListModel extLst) {
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
    this.egTextBulletColor = egTextBulletColor;
    this.egTextBulletSize = egTextBulletSize;
    this.egTextBulletTypeface = egTextBulletTypeface;
    this.egTextBullet = egTextBullet;
    this.tabLst = tabLst;
    this.defRPr = defRPr;
    this.extLst = extLst;
  }

  public TextIndentModel getIndent() {
    return this.indent;
  }

  public BooleanModel getLatinLnBrk() {
    return this.latinLnBrk;
  }

  public TextMarginModel getMarR() {
    return this.marR;
  }

  public BooleanModel getHangingPunct() {
    return this.hangingPunct;
  }

  public TextFontAlignTypeModel getFontAlgn() {
    return this.fontAlgn;
  }

  public BooleanModel getEaLnBrk() {
    return this.eaLnBrk;
  }

  public BooleanModel getRtl() {
    return this.rtl;
  }

  public TextIndentLevelTypeModel getLvl() {
    return this.lvl;
  }

  public TextMarginModel getMarL() {
    return this.marL;
  }

  public Coordinate32Model getDefTabSz() {
    return this.defTabSz;
  }

  public TextAlignTypeModel getAlgn() {
    return this.algn;
  }

  public TextSpacingModel getLnSpc() {
    return this.lnSpc;
  }

  public TextSpacingModel getSpcBef() {
    return this.spcBef;
  }

  public TextSpacingModel getSpcAft() {
    return this.spcAft;
  }

  public TextBulletColorModel getEGTextBulletColor() {
    return this.egTextBulletColor;
  }

  public TextBulletSizeModel getEGTextBulletSize() {
    return this.egTextBulletSize;
  }

  public TextBulletTypefaceModel getEGTextBulletTypeface() {
    return this.egTextBulletTypeface;
  }

  public TextBulletModel getEGTextBullet() {
    return this.egTextBullet;
  }

  public TextTabStopListModel getTabLst() {
    return this.tabLst;
  }

  public TextCharacterPropertiesModel getDefRPr() {
    return this.defRPr;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class TextBulletColorModel {
    private final int type;

    private final Object value;

    public TextBulletColorModel() {
      this(-1, null);
    }

    private TextBulletColorModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextBulletColorModel newBuClrTx(TextBulletColorFollowTextModel value) {
      return new TextBulletColorModel(0, value);
    }

    public boolean isBuClrTx() {
      return this.type == 0;
    }

    public TextBulletColorFollowTextModel getBuClrTx() {
      return (TextBulletColorFollowTextModel) this.value;
    }

    public static TextBulletColorModel newBuClr(ColorModel value) {
      return new TextBulletColorModel(1, value);
    }

    public boolean isBuClr() {
      return this.type == 1;
    }

    public ColorModel getBuClr() {
      return (ColorModel) this.value;
    }
  }

  public static class TextBulletSizeModel {
    private final int type;

    private final Object value;

    public TextBulletSizeModel() {
      this(-1, null);
    }

    private TextBulletSizeModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextBulletSizeModel newBuSzTx(TextBulletSizeFollowTextModel value) {
      return new TextBulletSizeModel(0, value);
    }

    public boolean isBuSzTx() {
      return this.type == 0;
    }

    public TextBulletSizeFollowTextModel getBuSzTx() {
      return (TextBulletSizeFollowTextModel) this.value;
    }

    public static TextBulletSizeModel newBuSzPct(TextBulletSizePercentModel value) {
      return new TextBulletSizeModel(1, value);
    }

    public boolean isBuSzPct() {
      return this.type == 1;
    }

    public TextBulletSizePercentModel getBuSzPct() {
      return (TextBulletSizePercentModel) this.value;
    }

    public static TextBulletSizeModel newBuSzPts(TextBulletSizePointModel value) {
      return new TextBulletSizeModel(2, value);
    }

    public boolean isBuSzPts() {
      return this.type == 2;
    }

    public TextBulletSizePointModel getBuSzPts() {
      return (TextBulletSizePointModel) this.value;
    }
  }

  public static class TextBulletTypefaceModel {
    private final int type;

    private final Object value;

    public TextBulletTypefaceModel() {
      this(-1, null);
    }

    private TextBulletTypefaceModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextBulletTypefaceModel newBuFontTx(TextBulletTypefaceFollowTextModel value) {
      return new TextBulletTypefaceModel(0, value);
    }

    public boolean isBuFontTx() {
      return this.type == 0;
    }

    public TextBulletTypefaceFollowTextModel getBuFontTx() {
      return (TextBulletTypefaceFollowTextModel) this.value;
    }

    public static TextBulletTypefaceModel newBuFont(TextFontModel value) {
      return new TextBulletTypefaceModel(1, value);
    }

    public boolean isBuFont() {
      return this.type == 1;
    }

    public TextFontModel getBuFont() {
      return (TextFontModel) this.value;
    }
  }

  public static class TextBulletModel {
    private final int type;

    private final Object value;

    public TextBulletModel() {
      this(-1, null);
    }

    private TextBulletModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextBulletModel newBuNone(TextNoBulletModel value) {
      return new TextBulletModel(0, value);
    }

    public boolean isBuNone() {
      return this.type == 0;
    }

    public TextNoBulletModel getBuNone() {
      return (TextNoBulletModel) this.value;
    }

    public static TextBulletModel newBuAutoNum(TextAutonumberBulletModel value) {
      return new TextBulletModel(1, value);
    }

    public boolean isBuAutoNum() {
      return this.type == 1;
    }

    public TextAutonumberBulletModel getBuAutoNum() {
      return (TextAutonumberBulletModel) this.value;
    }

    public static TextBulletModel newBuChar(TextCharBulletModel value) {
      return new TextBulletModel(2, value);
    }

    public boolean isBuChar() {
      return this.type == 2;
    }

    public TextCharBulletModel getBuChar() {
      return (TextCharBulletModel) this.value;
    }

    public static TextBulletModel newBuBlip(TextBlipBulletModel value) {
      return new TextBulletModel(3, value);
    }

    public boolean isBuBlip() {
      return this.type == 3;
    }

    public TextBlipBulletModel getBuBlip() {
      return (TextBlipBulletModel) this.value;
    }
  }
}
