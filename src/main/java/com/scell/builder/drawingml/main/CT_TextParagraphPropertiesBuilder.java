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

  private CT_TextParagraphPropertiesModel.EG_TextBulletColorModel egTextBulletColor;

  private CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel egTextBulletSize;

  private CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel egTextBulletTypeface;

  private CT_TextParagraphPropertiesModel.EG_TextBulletModel egTextBullet;

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

  public CT_TextParagraphPropertiesBuilder setEGTextBulletColor(
      CT_TextParagraphPropertiesModel.EG_TextBulletColorModel egTextBulletColor) {
    this.egTextBulletColor = egTextBulletColor;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setEGTextBulletSize(
      CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel egTextBulletSize) {
    this.egTextBulletSize = egTextBulletSize;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setEGTextBulletTypeface(
      CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel egTextBulletTypeface) {
    this.egTextBulletTypeface = egTextBulletTypeface;
    return this;
  }

  public CT_TextParagraphPropertiesBuilder setEGTextBullet(
      CT_TextParagraphPropertiesModel.EG_TextBulletModel egTextBullet) {
    this.egTextBullet = egTextBullet;
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
    return new CT_TextParagraphPropertiesModel(this.indent, this.latinLnBrk, this.marR, this.hangingPunct, this.fontAlgn, this.eaLnBrk, this.rtl, this.lvl, this.marL, this.defTabSz, this.algn, this.lnSpc, this.spcBef, this.spcAft, this.egTextBulletColor, this.egTextBulletSize, this.egTextBulletTypeface, this.egTextBullet, this.tabLst, this.defRPr, this.extLst);
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
    this.egTextBulletColor = value.getEGTextBulletColor();
    this.egTextBulletSize = value.getEGTextBulletSize();
    this.egTextBulletTypeface = value.getEGTextBulletTypeface();
    this.egTextBullet = value.getEGTextBullet();
    this.tabLst = value.getTabLst();
    this.defRPr = value.getDefRPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class EG_TextBulletColorBuilder {
    private int type;

    private Object value;

    public EG_TextBulletColorBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletColorBuilder setBuClrTx(CT_TextBulletColorFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletColorBuilder setBuClr(CT_ColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.EG_TextBulletColorModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.EG_TextBulletColorModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.EG_TextBulletColorModel.newBuClrTx((CT_TextBulletColorFollowTextModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.EG_TextBulletColorModel.newBuClr((CT_ColorModel) this.value);
      return null;
    }

    public EG_TextBulletColorBuilder from(
        CT_TextParagraphPropertiesModel.EG_TextBulletColorModel value) {
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

  public static class EG_TextBulletSizeBuilder {
    private int type;

    private Object value;

    public EG_TextBulletSizeBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletSizeBuilder setBuSzTx(CT_TextBulletSizeFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletSizeBuilder setBuSzPct(CT_TextBulletSizePercentModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextBulletSizeBuilder setBuSzPts(CT_TextBulletSizePointModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel.newBuSzTx((CT_TextBulletSizeFollowTextModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel.newBuSzPct((CT_TextBulletSizePercentModel) this.value);
      if (this.type == 2) return CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel.newBuSzPts((CT_TextBulletSizePointModel) this.value);
      return null;
    }

    public EG_TextBulletSizeBuilder from(
        CT_TextParagraphPropertiesModel.EG_TextBulletSizeModel value) {
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

  public static class EG_TextBulletTypefaceBuilder {
    private int type;

    private Object value;

    public EG_TextBulletTypefaceBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletTypefaceBuilder setBuFontTx(CT_TextBulletTypefaceFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletTypefaceBuilder setBuFont(CT_TextFontModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel.newBuFontTx((CT_TextBulletTypefaceFollowTextModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel.newBuFont((CT_TextFontModel) this.value);
      return null;
    }

    public EG_TextBulletTypefaceBuilder from(
        CT_TextParagraphPropertiesModel.EG_TextBulletTypefaceModel value) {
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

  public static class EG_TextBulletBuilder {
    private int type;

    private Object value;

    public EG_TextBulletBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletBuilder setBuNone(CT_TextNoBulletModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletBuilder setBuAutoNum(CT_TextAutonumberBulletModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextBulletBuilder setBuChar(CT_TextCharBulletModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_TextBulletBuilder setBuBlip(CT_TextBlipBulletModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CT_TextParagraphPropertiesModel.EG_TextBulletModel build() {
      if (this.type == -1) return new CT_TextParagraphPropertiesModel.EG_TextBulletModel();
      if (this.type == 0) return CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuNone((CT_TextNoBulletModel) this.value);
      if (this.type == 1) return CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuAutoNum((CT_TextAutonumberBulletModel) this.value);
      if (this.type == 2) return CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuChar((CT_TextCharBulletModel) this.value);
      if (this.type == 3) return CT_TextParagraphPropertiesModel.EG_TextBulletModel.newBuBlip((CT_TextBlipBulletModel) this.value);
      return null;
    }

    public EG_TextBulletBuilder from(CT_TextParagraphPropertiesModel.EG_TextBulletModel value) {
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
