package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.ColorModel;
import com.scell.model.drawingml.main.Coordinate32Model;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.TextAlignTypeModel;
import com.scell.model.drawingml.main.TextAutonumberBulletModel;
import com.scell.model.drawingml.main.TextBlipBulletModel;
import com.scell.model.drawingml.main.TextBulletColorFollowTextModel;
import com.scell.model.drawingml.main.TextBulletSizeFollowTextModel;
import com.scell.model.drawingml.main.TextBulletSizePercentModel;
import com.scell.model.drawingml.main.TextBulletSizePointModel;
import com.scell.model.drawingml.main.TextBulletTypefaceFollowTextModel;
import com.scell.model.drawingml.main.TextCharBulletModel;
import com.scell.model.drawingml.main.TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.TextFontAlignTypeModel;
import com.scell.model.drawingml.main.TextFontModel;
import com.scell.model.drawingml.main.TextIndentLevelTypeModel;
import com.scell.model.drawingml.main.TextIndentModel;
import com.scell.model.drawingml.main.TextMarginModel;
import com.scell.model.drawingml.main.TextNoBulletModel;
import com.scell.model.drawingml.main.TextParagraphPropertiesModel;
import com.scell.model.drawingml.main.TextSpacingModel;
import com.scell.model.drawingml.main.TextTabStopListModel;
import java.lang.Object;

public class TextParagraphPropertiesBuilder {
  private TextIndentModel indent;

  private BooleanModel latinLnBrk;

  private TextMarginModel marR;

  private BooleanModel hangingPunct;

  private TextFontAlignTypeModel fontAlgn;

  private BooleanModel eaLnBrk;

  private BooleanModel rtl;

  private TextIndentLevelTypeModel lvl;

  private TextMarginModel marL;

  private Coordinate32Model defTabSz;

  private TextAlignTypeModel algn;

  private TextSpacingModel lnSpc;

  private TextSpacingModel spcBef;

  private TextSpacingModel spcAft;

  private TextParagraphPropertiesModel.TextBulletColorModel egTextBulletColor;

  private TextParagraphPropertiesModel.TextBulletSizeModel egTextBulletSize;

  private TextParagraphPropertiesModel.TextBulletTypefaceModel egTextBulletTypeface;

  private TextParagraphPropertiesModel.TextBulletModel egTextBullet;

  private TextTabStopListModel tabLst;

  private TextCharacterPropertiesModel defRPr;

  private OfficeArtExtensionListModel extLst;

  public TextParagraphPropertiesBuilder() {
  }

  public TextParagraphPropertiesBuilder setIndent(TextIndentModel indent) {
    this.indent = indent;
    return this;
  }

  public TextParagraphPropertiesBuilder setLatinLnBrk(BooleanModel latinLnBrk) {
    this.latinLnBrk = latinLnBrk;
    return this;
  }

  public TextParagraphPropertiesBuilder setMarR(TextMarginModel marR) {
    this.marR = marR;
    return this;
  }

  public TextParagraphPropertiesBuilder setHangingPunct(BooleanModel hangingPunct) {
    this.hangingPunct = hangingPunct;
    return this;
  }

  public TextParagraphPropertiesBuilder setFontAlgn(TextFontAlignTypeModel fontAlgn) {
    this.fontAlgn = fontAlgn;
    return this;
  }

  public TextParagraphPropertiesBuilder setEaLnBrk(BooleanModel eaLnBrk) {
    this.eaLnBrk = eaLnBrk;
    return this;
  }

  public TextParagraphPropertiesBuilder setRtl(BooleanModel rtl) {
    this.rtl = rtl;
    return this;
  }

  public TextParagraphPropertiesBuilder setLvl(TextIndentLevelTypeModel lvl) {
    this.lvl = lvl;
    return this;
  }

  public TextParagraphPropertiesBuilder setMarL(TextMarginModel marL) {
    this.marL = marL;
    return this;
  }

  public TextParagraphPropertiesBuilder setDefTabSz(Coordinate32Model defTabSz) {
    this.defTabSz = defTabSz;
    return this;
  }

  public TextParagraphPropertiesBuilder setAlgn(TextAlignTypeModel algn) {
    this.algn = algn;
    return this;
  }

  public TextParagraphPropertiesBuilder setLnSpc(TextSpacingModel lnSpc) {
    this.lnSpc = lnSpc;
    return this;
  }

  public TextParagraphPropertiesBuilder setSpcBef(TextSpacingModel spcBef) {
    this.spcBef = spcBef;
    return this;
  }

  public TextParagraphPropertiesBuilder setSpcAft(TextSpacingModel spcAft) {
    this.spcAft = spcAft;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBulletColor(
      TextParagraphPropertiesModel.TextBulletColorModel egTextBulletColor) {
    this.egTextBulletColor = egTextBulletColor;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBulletSize(
      TextParagraphPropertiesModel.TextBulletSizeModel egTextBulletSize) {
    this.egTextBulletSize = egTextBulletSize;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBulletTypeface(
      TextParagraphPropertiesModel.TextBulletTypefaceModel egTextBulletTypeface) {
    this.egTextBulletTypeface = egTextBulletTypeface;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBullet(
      TextParagraphPropertiesModel.TextBulletModel egTextBullet) {
    this.egTextBullet = egTextBullet;
    return this;
  }

  public TextParagraphPropertiesBuilder setTabLst(TextTabStopListModel tabLst) {
    this.tabLst = tabLst;
    return this;
  }

  public TextParagraphPropertiesBuilder setDefRPr(TextCharacterPropertiesModel defRPr) {
    this.defRPr = defRPr;
    return this;
  }

  public TextParagraphPropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TextParagraphPropertiesModel build() {
    return new TextParagraphPropertiesModel(this.indent, this.latinLnBrk, this.marR, this.hangingPunct, this.fontAlgn, this.eaLnBrk, this.rtl, this.lvl, this.marL, this.defTabSz, this.algn, this.lnSpc, this.spcBef, this.spcAft, this.egTextBulletColor, this.egTextBulletSize, this.egTextBulletTypeface, this.egTextBullet, this.tabLst, this.defRPr, this.extLst);
  }

  public TextParagraphPropertiesBuilder from(TextParagraphPropertiesModel value) {
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

  public static class TextBulletColorBuilder {
    private int type;

    private Object value;

    public TextBulletColorBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextBulletColorBuilder setBuClrTx(TextBulletColorFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextBulletColorBuilder setBuClr(ColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextParagraphPropertiesModel.TextBulletColorModel build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.TextBulletColorModel();
      if (this.type == 0) return TextParagraphPropertiesModel.TextBulletColorModel.newBuClrTx((TextBulletColorFollowTextModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.TextBulletColorModel.newBuClr((ColorModel) this.value);
      return null;
    }

    public TextBulletColorBuilder from(TextParagraphPropertiesModel.TextBulletColorModel value) {
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

  public static class TextBulletSizeBuilder {
    private int type;

    private Object value;

    public TextBulletSizeBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextBulletSizeBuilder setBuSzTx(TextBulletSizeFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextBulletSizeBuilder setBuSzPct(TextBulletSizePercentModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextBulletSizeBuilder setBuSzPts(TextBulletSizePointModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public TextParagraphPropertiesModel.TextBulletSizeModel build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.TextBulletSizeModel();
      if (this.type == 0) return TextParagraphPropertiesModel.TextBulletSizeModel.newBuSzTx((TextBulletSizeFollowTextModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.TextBulletSizeModel.newBuSzPct((TextBulletSizePercentModel) this.value);
      if (this.type == 2) return TextParagraphPropertiesModel.TextBulletSizeModel.newBuSzPts((TextBulletSizePointModel) this.value);
      return null;
    }

    public TextBulletSizeBuilder from(TextParagraphPropertiesModel.TextBulletSizeModel value) {
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

  public static class TextBulletTypefaceBuilder {
    private int type;

    private Object value;

    public TextBulletTypefaceBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextBulletTypefaceBuilder setBuFontTx(TextBulletTypefaceFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextBulletTypefaceBuilder setBuFont(TextFontModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextParagraphPropertiesModel.TextBulletTypefaceModel build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.TextBulletTypefaceModel();
      if (this.type == 0) return TextParagraphPropertiesModel.TextBulletTypefaceModel.newBuFontTx((TextBulletTypefaceFollowTextModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.TextBulletTypefaceModel.newBuFont((TextFontModel) this.value);
      return null;
    }

    public TextBulletTypefaceBuilder from(
        TextParagraphPropertiesModel.TextBulletTypefaceModel value) {
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

  public static class TextBulletBuilder {
    private int type;

    private Object value;

    public TextBulletBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextBulletBuilder setBuNone(TextNoBulletModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextBulletBuilder setBuAutoNum(TextAutonumberBulletModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextBulletBuilder setBuChar(TextCharBulletModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public TextBulletBuilder setBuBlip(TextBlipBulletModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public TextParagraphPropertiesModel.TextBulletModel build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.TextBulletModel();
      if (this.type == 0) return TextParagraphPropertiesModel.TextBulletModel.newBuNone((TextNoBulletModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.TextBulletModel.newBuAutoNum((TextAutonumberBulletModel) this.value);
      if (this.type == 2) return TextParagraphPropertiesModel.TextBulletModel.newBuChar((TextCharBulletModel) this.value);
      if (this.type == 3) return TextParagraphPropertiesModel.TextBulletModel.newBuBlip((TextBlipBulletModel) this.value);
      return null;
    }

    public TextBulletBuilder from(TextParagraphPropertiesModel.TextBulletModel value) {
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
