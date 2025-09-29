package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.TextParagraphPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class TextParagraphPropertiesModel {
  private final int indent;

  private final boolean latinLnBrk;

  private final int marR;

  private final boolean hangingPunct;

  private final TextFontAlignTypeValueModel fontAlgn;

  private final boolean eaLnBrk;

  private final boolean rtl;

  private final int lvl;

  private final int marL;

  private final int defTabSz;

  private final TextAlignTypeValueModel algn;

  private final TextSpacingModel lnSpc;

  private final TextSpacingModel spcBef;

  private final TextSpacingModel spcAft;

  private final EG_TextBulletColor egTextBulletColor;

  private final EG_TextBulletSize egTextBulletSize;

  private final EG_TextBulletTypeface egTextBulletTypeface;

  private final EG_TextBullet egTextBullet;

  private final TextTabStopListModel tabLst;

  private final TextCharacterPropertiesModel defRPr;

  private final OfficeArtExtensionListModel extLst;

  public TextParagraphPropertiesModel(int indent, boolean latinLnBrk, int marR,
      boolean hangingPunct, TextFontAlignTypeValueModel fontAlgn, boolean eaLnBrk, boolean rtl,
      int lvl, int marL, int defTabSz, TextAlignTypeValueModel algn, TextSpacingModel lnSpc,
      TextSpacingModel spcBef, TextSpacingModel spcAft, EG_TextBulletColor egTextBulletColor,
      EG_TextBulletSize egTextBulletSize, EG_TextBulletTypeface egTextBulletTypeface,
      EG_TextBullet egTextBullet, TextTabStopListModel tabLst, TextCharacterPropertiesModel defRPr,
      OfficeArtExtensionListModel extLst) {
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

  public TextParagraphPropertiesBuilder builder() {
    return new TextParagraphPropertiesBuilder().from(this);
  }

  public int getIndent() {
    return this.indent;
  }

  public boolean getLatinLnBrk() {
    return this.latinLnBrk;
  }

  public int getMarR() {
    return this.marR;
  }

  public boolean getHangingPunct() {
    return this.hangingPunct;
  }

  public TextFontAlignTypeValueModel getFontAlgn() {
    return this.fontAlgn;
  }

  public boolean getEaLnBrk() {
    return this.eaLnBrk;
  }

  public boolean getRtl() {
    return this.rtl;
  }

  public int getLvl() {
    return this.lvl;
  }

  public int getMarL() {
    return this.marL;
  }

  public int getDefTabSz() {
    return this.defTabSz;
  }

  public TextAlignTypeValueModel getAlgn() {
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

  public EG_TextBulletColor getEGTextBulletColor() {
    return this.egTextBulletColor;
  }

  public EG_TextBulletSize getEGTextBulletSize() {
    return this.egTextBulletSize;
  }

  public EG_TextBulletTypeface getEGTextBulletTypeface() {
    return this.egTextBulletTypeface;
  }

  public EG_TextBullet getEGTextBullet() {
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

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBulletColor {
    private final int type;

    private final Object value;

    public EG_TextBulletColor() {
      this(-1, null);
    }

    private EG_TextBulletColor(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextParagraphPropertiesBuilder.EG_TextBulletColor builder() {
      return new TextParagraphPropertiesBuilder.EG_TextBulletColor().from(this);
    }

    public static EG_TextBulletColor newBuClrTx(TextBulletColorFollowTextModel value) {
      return new EG_TextBulletColor(0, value);
    }

    public boolean isBuClrTx() {
      return this.type == 0;
    }

    public TextBulletColorFollowTextModel getBuClrTx() {
      return (TextBulletColorFollowTextModel) this.value;
    }

    public static EG_TextBulletColor newBuClr(ColorModel value) {
      return new EG_TextBulletColor(1, value);
    }

    public boolean isBuClr() {
      return this.type == 1;
    }

    public ColorModel getBuClr() {
      return (ColorModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBulletSize {
    private final int type;

    private final Object value;

    public EG_TextBulletSize() {
      this(-1, null);
    }

    private EG_TextBulletSize(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextParagraphPropertiesBuilder.EG_TextBulletSize builder() {
      return new TextParagraphPropertiesBuilder.EG_TextBulletSize().from(this);
    }

    public static EG_TextBulletSize newBuSzTx(TextBulletSizeFollowTextModel value) {
      return new EG_TextBulletSize(0, value);
    }

    public boolean isBuSzTx() {
      return this.type == 0;
    }

    public TextBulletSizeFollowTextModel getBuSzTx() {
      return (TextBulletSizeFollowTextModel) this.value;
    }

    public static EG_TextBulletSize newBuSzPct(TextBulletSizePercentModel value) {
      return new EG_TextBulletSize(1, value);
    }

    public boolean isBuSzPct() {
      return this.type == 1;
    }

    public TextBulletSizePercentModel getBuSzPct() {
      return (TextBulletSizePercentModel) this.value;
    }

    public static EG_TextBulletSize newBuSzPts(TextBulletSizePointModel value) {
      return new EG_TextBulletSize(2, value);
    }

    public boolean isBuSzPts() {
      return this.type == 2;
    }

    public TextBulletSizePointModel getBuSzPts() {
      return (TextBulletSizePointModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBulletTypeface {
    private final int type;

    private final Object value;

    public EG_TextBulletTypeface() {
      this(-1, null);
    }

    private EG_TextBulletTypeface(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextParagraphPropertiesBuilder.EG_TextBulletTypeface builder() {
      return new TextParagraphPropertiesBuilder.EG_TextBulletTypeface().from(this);
    }

    public static EG_TextBulletTypeface newBuFontTx(TextBulletTypefaceFollowTextModel value) {
      return new EG_TextBulletTypeface(0, value);
    }

    public boolean isBuFontTx() {
      return this.type == 0;
    }

    public TextBulletTypefaceFollowTextModel getBuFontTx() {
      return (TextBulletTypefaceFollowTextModel) this.value;
    }

    public static EG_TextBulletTypeface newBuFont(TextFontValueModel value) {
      return new EG_TextBulletTypeface(1, value);
    }

    public boolean isBuFont() {
      return this.type == 1;
    }

    public TextFontValueModel getBuFont() {
      return (TextFontValueModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextBullet {
    private final int type;

    private final Object value;

    public EG_TextBullet() {
      this(-1, null);
    }

    private EG_TextBullet(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextParagraphPropertiesBuilder.EG_TextBullet builder() {
      return new TextParagraphPropertiesBuilder.EG_TextBullet().from(this);
    }

    public static EG_TextBullet newBuNone(TextNoBulletModel value) {
      return new EG_TextBullet(0, value);
    }

    public boolean isBuNone() {
      return this.type == 0;
    }

    public TextNoBulletModel getBuNone() {
      return (TextNoBulletModel) this.value;
    }

    public static EG_TextBullet newBuAutoNum(TextAutonumberBulletModel value) {
      return new EG_TextBullet(1, value);
    }

    public boolean isBuAutoNum() {
      return this.type == 1;
    }

    public TextAutonumberBulletModel getBuAutoNum() {
      return (TextAutonumberBulletModel) this.value;
    }

    public static EG_TextBullet newBuChar(TextCharBulletModel value) {
      return new EG_TextBullet(2, value);
    }

    public boolean isBuChar() {
      return this.type == 2;
    }

    public TextCharBulletModel getBuChar() {
      return (TextCharBulletModel) this.value;
    }

    public static EG_TextBullet newBuBlip(TextBlipBulletModel value) {
      return new EG_TextBullet(3, value);
    }

    public boolean isBuBlip() {
      return this.type == 3;
    }

    public TextBlipBulletModel getBuBlip() {
      return (TextBlipBulletModel) this.value;
    }
  }
}
