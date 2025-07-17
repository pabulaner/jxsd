package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_ColorModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_TextAutonumberBulletModel;
import com.scell.model.drawingml.main.CT_TextBlipBulletModel;
import com.scell.model.drawingml.main.CT_TextBulletColorFollowTextModel;
import com.scell.model.drawingml.main.CT_TextBulletSizeFollowTextModel;
import com.scell.model.drawingml.main.CT_TextBulletSizePercentModel;
import com.scell.model.drawingml.main.CT_TextBulletSizePointModel;
import com.scell.model.drawingml.main.CT_TextBulletTypefaceFollowTextModel;
import com.scell.model.drawingml.main.CT_TextCharBulletModel;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.CT_TextFontModel;
import com.scell.model.drawingml.main.CT_TextNoBulletModel;
import com.scell.model.drawingml.main.CT_TextParagraphPropertiesModel;
import com.scell.model.drawingml.main.CT_TextSpacingModel;
import com.scell.model.drawingml.main.CT_TextTabStopListModel;
import com.scell.model.drawingml.main.ST_Coordinate32Model;
import com.scell.model.drawingml.main.ST_TextAlignTypeModel;
import com.scell.model.drawingml.main.ST_TextFontAlignTypeModel;
import com.scell.model.drawingml.main.ST_TextIndentLevelTypeModel;
import com.scell.model.drawingml.main.ST_TextIndentModel;
import com.scell.model.drawingml.main.ST_TextMarginModel;
import java.lang.Object;

public class CT_TextParagraphPropertiesBuilder {
  private ST_TextIndentModel indent;

  private BooleanModel latinLnBrk;

  private ST_TextMarginModel marR;

  private BooleanModel hangingPunct;

  private ST_TextFontAlignTypeModel fontAlgn;

  private BooleanModel eaLnBrk;

  private BooleanModel rtl;

  private ST_TextIndentLevelTypeModel lvl;

  private ST_TextMarginModel marL;

  private ST_Coordinate32Model defTabSz;

  private ST_TextAlignTypeModel algn;

  private CT_TextSpacingModel lnSpc;

  private CT_TextSpacingModel spcBef;

  private CT_TextSpacingModel spcAft;

  private CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel buClrTxOrBuClr;

  private CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts;

  private CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel buFontTxOrBuFont;

  private CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar;

  private CT_TextTabStopListModel tabLst;

  private CT_TextCharacterPropertiesModel defRPr;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_TextParagraphPropertiesBuilder() {
  }

  public CT_TextParagraphPropertiesBuilder setIndent(ST_TextIndentModel indent) {
    this.indent = indent;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setLatinLnBrk(BooleanModel latinLnBrk) {
    this.latinLnBrk = latinLnBrk;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setMarR(ST_TextMarginModel marR) {
    this.marR = marR;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setHangingPunct(BooleanModel hangingPunct) {
    this.hangingPunct = hangingPunct;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setFontAlgn(ST_TextFontAlignTypeModel fontAlgn) {
    this.fontAlgn = fontAlgn;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setEaLnBrk(BooleanModel eaLnBrk) {
    this.eaLnBrk = eaLnBrk;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setRtl(BooleanModel rtl) {
    this.rtl = rtl;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setLvl(ST_TextIndentLevelTypeModel lvl) {
    this.lvl = lvl;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setMarL(ST_TextMarginModel marL) {
    this.marL = marL;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setDefTabSz(ST_Coordinate32Model defTabSz) {
    this.defTabSz = defTabSz;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setAlgn(ST_TextAlignTypeModel algn) {
    this.algn = algn;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setLnSpc(CT_TextSpacingModel lnSpc) {
    this.lnSpc = lnSpc;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setSpcBef(CT_TextSpacingModel spcBef) {
    this.spcBef = spcBef;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setSpcAft(CT_TextSpacingModel spcAft) {
    this.spcAft = spcAft;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setBuClrTxOrBuClr(
      CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel buClrTxOrBuClr) {
    this.buClrTxOrBuClr = buClrTxOrBuClr;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setBuSzTxOrBuSzPctOrBuSzPts(
      CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts) {
    this.buSzTxOrBuSzPctOrBuSzPts = buSzTxOrBuSzPctOrBuSzPts;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setBuFontTxOrBuFont(
      CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel buFontTxOrBuFont) {
    this.buFontTxOrBuFont = buFontTxOrBuFont;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setBuNoneOrBuAutoNumOrBuChar(
      CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar) {
    this.buNoneOrBuAutoNumOrBuChar = buNoneOrBuAutoNumOrBuChar;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setTabLst(CT_TextTabStopListModel tabLst) {
    this.tabLst = tabLst;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setDefRPr(CT_TextCharacterPropertiesModel defRPr) {
    this.defRPr = defRPr;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TextParagraphPropertiesModel build() {
    return new CT_TextParagraphPropertiesModel(this.indent, this.latinLnBrk, this.marR, this.hangingPunct, this.fontAlgn, this.eaLnBrk, this.rtl, this.lvl, this.marL, this.defTabSz, this.algn, this.lnSpc, this.spcBef, this.spcAft, this.buClrTxOrBuClr, this.buSzTxOrBuSzPctOrBuSzPts, this.buFontTxOrBuFont, this.buNoneOrBuAutoNumOrBuChar, this.tabLst, this.defRPr, this.extLst);
  }

  public CT_TextParagraphPropertiesBuilder from(CT_TextParagraphPropertiesModel value) {
    this.indent = value.getIndent();
    this.latinLnBrk = value.getLatinLnBrk();
    this.marR = value.getMarR();
    this.hangingPunct = value.getHangingPunct();
    this.fontAlgn = value.getFontAlgn();
    this.eaLnBrk = value.getEaLnBrk();
    this.rtl = value.getRtl();
    this.lvl = value.getLvl();
    this.marL = value.getMarL();
    this.defTabSz = value.getDefTabSz();
    this.algn = value.getAlgn();
    this.lnSpc = value.getLnSpc();
    this.spcBef = value.getSpcBef();
    this.spcAft = value.getSpcAft();
    this.buClrTxOrBuClr = value.getBuClrTxOrBuClr();
    this.buSzTxOrBuSzPctOrBuSzPts = value.getBuSzTxOrBuSzPctOrBuSzPts();
    this.buFontTxOrBuFont = value.getBuFontTxOrBuFont();
    this.buNoneOrBuAutoNumOrBuChar = value.getBuNoneOrBuAutoNumOrBuChar();
    this.tabLst = value.getTabLst();
    this.defRPr = value.getDefRPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class BuClrTxOrBuClrBuilder {
    private int type;

    private Object value;

    public BuClrTxOrBuClrBuilder() {
      this.type = -1;
      this.value = null;
    }

    public BuClrTxOrBuClrBuilder setBuClrTx(CT_TextBulletColorFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public BuClrTxOrBuClrBuilder setBuClr(CT_ColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel.newBuClrTx((CT_TextBulletColorFollowTextModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel.newBuClr((CT_ColorModel) this.value);
      return null;
    }

    public BuClrTxOrBuClrBuilder from(CT_TextParagraphPropertiesModel.BuClrTxOrBuClrModel value) {
      this.type = -1;
      this.value = null;
      if (value.isBuClrTx()) {
        this.type = 0;
        this.value = value.getBuClrTx();
      }
      if (value.isBuClr()) {
        this.type = 1;
        this.value = value.getBuClr();
      }
      return this;
    }
  }

  public static class BuSzTxOrBuSzPctOrBuSzPtsBuilder {
    private int type;

    private Object value;

    public BuSzTxOrBuSzPctOrBuSzPtsBuilder() {
      this.type = -1;
      this.value = null;
    }

    public BuSzTxOrBuSzPctOrBuSzPtsBuilder setBuSzTx(CT_TextBulletSizeFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public BuSzTxOrBuSzPctOrBuSzPtsBuilder setBuSzPct(CT_TextBulletSizePercentModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public BuSzTxOrBuSzPctOrBuSzPtsBuilder setBuSzPts(CT_TextBulletSizePointModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.newBuSzTx((CT_TextBulletSizeFollowTextModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.newBuSzPct((CT_TextBulletSizePercentModel) this.value);
      if (this.type == 2) return CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.newBuSzPts((CT_TextBulletSizePointModel) this.value);
      return null;
    }

    public BuSzTxOrBuSzPctOrBuSzPtsBuilder from(
        CT_TextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel value) {
      this.type = -1;
      this.value = null;
      if (value.isBuSzTx()) {
        this.type = 0;
        this.value = value.getBuSzTx();
      }
      if (value.isBuSzPct()) {
        this.type = 1;
        this.value = value.getBuSzPct();
      }
      if (value.isBuSzPts()) {
        this.type = 2;
        this.value = value.getBuSzPts();
      }
      return this;
    }
  }

  public static class BuFontTxOrBuFontBuilder {
    private int type;

    private Object value;

    public BuFontTxOrBuFontBuilder() {
      this.type = -1;
      this.value = null;
    }

    public BuFontTxOrBuFontBuilder setBuFontTx(CT_TextBulletTypefaceFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public BuFontTxOrBuFontBuilder setBuFont(CT_TextFontModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel.newBuFontTx((CT_TextBulletTypefaceFollowTextModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel.newBuFont((CT_TextFontModel) this.value);
      return null;
    }

    public BuFontTxOrBuFontBuilder from(
        CT_TextParagraphPropertiesModel.BuFontTxOrBuFontModel value) {
      this.type = -1;
      this.value = null;
      if (value.isBuFontTx()) {
        this.type = 0;
        this.value = value.getBuFontTx();
      }
      if (value.isBuFont()) {
        this.type = 1;
        this.value = value.getBuFont();
      }
      return this;
    }
  }

  public static class BuNoneOrBuAutoNumOrBuCharBuilder {
    private int type;

    private Object value;

    public BuNoneOrBuAutoNumOrBuCharBuilder() {
      this.type = -1;
      this.value = null;
    }

    public BuNoneOrBuAutoNumOrBuCharBuilder setBuNone(CT_TextNoBulletModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public BuNoneOrBuAutoNumOrBuCharBuilder setBuAutoNum(CT_TextAutonumberBulletModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public BuNoneOrBuAutoNumOrBuCharBuilder setBuChar(CT_TextCharBulletModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public BuNoneOrBuAutoNumOrBuCharBuilder setBuBlip(CT_TextBlipBulletModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.newBuNone((CT_TextNoBulletModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.newBuAutoNum((CT_TextAutonumberBulletModel) this.value);
      if (this.type == 2) return CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.newBuChar((CT_TextCharBulletModel) this.value);
      if (this.type == 3) return CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.newBuBlip((CT_TextBlipBulletModel) this.value);
      return null;
    }

    public BuNoneOrBuAutoNumOrBuCharBuilder from(
        CT_TextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel value) {
      this.type = -1;
      this.value = null;
      if (value.isBuNone()) {
        this.type = 0;
        this.value = value.getBuNone();
      }
      if (value.isBuAutoNum()) {
        this.type = 1;
        this.value = value.getBuAutoNum();
      }
      if (value.isBuChar()) {
        this.type = 2;
        this.value = value.getBuChar();
      }
      if (value.isBuBlip()) {
        this.type = 3;
        this.value = value.getBuBlip();
      }
      return this;
    }
  }
}
