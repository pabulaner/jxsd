package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.ColorModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.TextAlignTypeValueModel;
import jxsd.gen.model.drawingml.main.TextAutonumberBulletModel;
import jxsd.gen.model.drawingml.main.TextBlipBulletModel;
import jxsd.gen.model.drawingml.main.TextBulletColorFollowTextModel;
import jxsd.gen.model.drawingml.main.TextBulletSizeFollowTextModel;
import jxsd.gen.model.drawingml.main.TextBulletSizePercentModel;
import jxsd.gen.model.drawingml.main.TextBulletSizePointModel;
import jxsd.gen.model.drawingml.main.TextBulletTypefaceFollowTextModel;
import jxsd.gen.model.drawingml.main.TextCharBulletModel;
import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;
import jxsd.gen.model.drawingml.main.TextFontAlignTypeValueModel;
import jxsd.gen.model.drawingml.main.TextFontValueModel;
import jxsd.gen.model.drawingml.main.TextNoBulletModel;
import jxsd.gen.model.drawingml.main.TextParagraphPropertiesModel;
import jxsd.gen.model.drawingml.main.TextSpacingModel;
import jxsd.gen.model.drawingml.main.TextTabStopListModel;

/**
 * This is a generated sequence class.
 */
public class TextParagraphPropertiesBuilder {
  private int indent;

  private boolean latinLnBrk;

  private int marR;

  private boolean hangingPunct;

  private TextFontAlignTypeValueModel fontAlgn;

  private boolean eaLnBrk;

  private boolean rtl;

  private int lvl;

  private int marL;

  private int defTabSz;

  private TextAlignTypeValueModel algn;

  private TextSpacingModel lnSpc;

  private TextSpacingModel spcBef;

  private TextSpacingModel spcAft;

  private TextParagraphPropertiesModel.EG_TextBulletColor egTextBulletColor;

  private TextParagraphPropertiesModel.EG_TextBulletSize egTextBulletSize;

  private TextParagraphPropertiesModel.EG_TextBulletTypeface egTextBulletTypeface;

  private TextParagraphPropertiesModel.EG_TextBullet egTextBullet;

  private TextTabStopListModel tabLst;

  private TextCharacterPropertiesModel defRPr;

  private OfficeArtExtensionListModel extLst;

  public TextParagraphPropertiesBuilder() {
  }

  public TextParagraphPropertiesBuilder setIndent(int indent) {
    this.indent = indent;
    return this;
  }

  public TextParagraphPropertiesBuilder setLatinLnBrk(boolean latinLnBrk) {
    this.latinLnBrk = latinLnBrk;
    return this;
  }

  public TextParagraphPropertiesBuilder setMarR(int marR) {
    this.marR = marR;
    return this;
  }

  public TextParagraphPropertiesBuilder setHangingPunct(boolean hangingPunct) {
    this.hangingPunct = hangingPunct;
    return this;
  }

  public TextParagraphPropertiesBuilder setFontAlgn(TextFontAlignTypeValueModel fontAlgn) {
    this.fontAlgn = fontAlgn;
    return this;
  }

  public TextParagraphPropertiesBuilder setEaLnBrk(boolean eaLnBrk) {
    this.eaLnBrk = eaLnBrk;
    return this;
  }

  public TextParagraphPropertiesBuilder setRtl(boolean rtl) {
    this.rtl = rtl;
    return this;
  }

  public TextParagraphPropertiesBuilder setLvl(int lvl) {
    this.lvl = lvl;
    return this;
  }

  public TextParagraphPropertiesBuilder setMarL(int marL) {
    this.marL = marL;
    return this;
  }

  public TextParagraphPropertiesBuilder setDefTabSz(int defTabSz) {
    this.defTabSz = defTabSz;
    return this;
  }

  public TextParagraphPropertiesBuilder setAlgn(TextAlignTypeValueModel algn) {
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
      TextParagraphPropertiesModel.EG_TextBulletColor egTextBulletColor) {
    this.egTextBulletColor = egTextBulletColor;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBulletSize(
      TextParagraphPropertiesModel.EG_TextBulletSize egTextBulletSize) {
    this.egTextBulletSize = egTextBulletSize;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBulletTypeface(
      TextParagraphPropertiesModel.EG_TextBulletTypeface egTextBulletTypeface) {
    this.egTextBulletTypeface = egTextBulletTypeface;
    return this;
  }

  public TextParagraphPropertiesBuilder setEGTextBullet(
      TextParagraphPropertiesModel.EG_TextBullet egTextBullet) {
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

  public TextParagraphPropertiesModel build() {
    return new TextParagraphPropertiesModel(this.indent, this.latinLnBrk, this.marR, this.hangingPunct, this.fontAlgn, this.eaLnBrk, this.rtl, this.lvl, this.marL, this.defTabSz, this.algn, this.lnSpc, this.spcBef, this.spcAft, this.egTextBulletColor, this.egTextBulletSize, this.egTextBulletTypeface, this.egTextBullet, this.tabLst, this.defRPr, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBulletColor {
    private int type;

    private Object value;

    public EG_TextBulletColor() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletColor setBuClrTx(TextBulletColorFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletColor setBuClr(ColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextBulletColor from(TextParagraphPropertiesModel.EG_TextBulletColor value) {
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

    public TextParagraphPropertiesModel.EG_TextBulletColor build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.EG_TextBulletColor();
      if (this.type == 0) return TextParagraphPropertiesModel.EG_TextBulletColor.newBuClrTx((TextBulletColorFollowTextModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.EG_TextBulletColor.newBuClr((ColorModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBulletSize {
    private int type;

    private Object value;

    public EG_TextBulletSize() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletSize setBuSzTx(TextBulletSizeFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletSize setBuSzPct(TextBulletSizePercentModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextBulletSize setBuSzPts(TextBulletSizePointModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_TextBulletSize from(TextParagraphPropertiesModel.EG_TextBulletSize value) {
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

    public TextParagraphPropertiesModel.EG_TextBulletSize build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.EG_TextBulletSize();
      if (this.type == 0) return TextParagraphPropertiesModel.EG_TextBulletSize.newBuSzTx((TextBulletSizeFollowTextModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.EG_TextBulletSize.newBuSzPct((TextBulletSizePercentModel) this.value);
      if (this.type == 2) return TextParagraphPropertiesModel.EG_TextBulletSize.newBuSzPts((TextBulletSizePointModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBulletTypeface {
    private int type;

    private Object value;

    public EG_TextBulletTypeface() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBulletTypeface setBuFontTx(TextBulletTypefaceFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBulletTypeface setBuFont(TextFontValueModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextBulletTypeface from(TextParagraphPropertiesModel.EG_TextBulletTypeface value) {
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

    public TextParagraphPropertiesModel.EG_TextBulletTypeface build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.EG_TextBulletTypeface();
      if (this.type == 0) return TextParagraphPropertiesModel.EG_TextBulletTypeface.newBuFontTx((TextBulletTypefaceFollowTextModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.EG_TextBulletTypeface.newBuFont((TextFontValueModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBullet {
    private int type;

    private Object value;

    public EG_TextBullet() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextBullet setBuNone(TextNoBulletModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextBullet setBuAutoNum(TextAutonumberBulletModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextBullet setBuChar(TextCharBulletModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_TextBullet setBuBlip(TextBlipBulletModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_TextBullet from(TextParagraphPropertiesModel.EG_TextBullet value) {
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

    public TextParagraphPropertiesModel.EG_TextBullet build() {
      if (this.type == -1) return new TextParagraphPropertiesModel.EG_TextBullet();
      if (this.type == 0) return TextParagraphPropertiesModel.EG_TextBullet.newBuNone((TextNoBulletModel) this.value);
      if (this.type == 1) return TextParagraphPropertiesModel.EG_TextBullet.newBuAutoNum((TextAutonumberBulletModel) this.value);
      if (this.type == 2) return TextParagraphPropertiesModel.EG_TextBullet.newBuChar((TextCharBulletModel) this.value);
      if (this.type == 3) return TextParagraphPropertiesModel.EG_TextBullet.newBuBlip((TextBlipBulletModel) this.value);
      return null;
    }
  }
}
