package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.ColorModel;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
import jxsd.gen.model.drawingml.main.EffectListModel;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GroupFillPropertiesModel;
import jxsd.gen.model.drawingml.main.HyperlinkModel;
import jxsd.gen.model.drawingml.main.LinePropertiesModel;
import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;
import jxsd.gen.model.drawingml.main.TextCapsTypeValueModel;
import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;
import jxsd.gen.model.drawingml.main.TextFontValueModel;
import jxsd.gen.model.drawingml.main.TextStrikeTypeValueModel;
import jxsd.gen.model.drawingml.main.TextUnderlineFillFollowTextModel;
import jxsd.gen.model.drawingml.main.TextUnderlineFillGroupWrapperModel;
import jxsd.gen.model.drawingml.main.TextUnderlineLineFollowTextModel;
import jxsd.gen.model.drawingml.main.TextUnderlineTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class TextCharacterPropertiesBuilder {
  private TextStrikeTypeValueModel strike;

  private boolean noProof;

  private String bmk;

  private int baseline;

  private boolean dirty;

  private boolean smtClean;

  private boolean err;

  private boolean kumimoji;

  private boolean b;

  private boolean i;

  private String lang;

  private int sz;

  private long smtId;

  private boolean normalizeH;

  private TextUnderlineTypeValueModel u;

  private int kern;

  private TextCapsTypeValueModel cap;

  private String altLang;

  private int spc;

  private LinePropertiesModel ln;

  private TextCharacterPropertiesModel.EG_FillProperties egFillProperties;

  private TextCharacterPropertiesModel.EG_EffectProperties egEffectProperties;

  private ColorModel highlight;

  private TextCharacterPropertiesModel.EG_TextUnderlineLine egTextUnderlineLine;

  private TextCharacterPropertiesModel.EG_TextUnderlineFill egTextUnderlineFill;

  private TextFontValueModel latin;

  private TextFontValueModel ea;

  private TextFontValueModel cs;

  private TextFontValueModel sym;

  private HyperlinkModel hlinkClick;

  private HyperlinkModel hlinkMouseOver;

  private OfficeArtExtensionListModel extLst;

  public TextCharacterPropertiesBuilder() {
  }

  public TextCharacterPropertiesBuilder setStrike(TextStrikeTypeValueModel strike) {
    this.strike = strike;
    return this;
  }

  public TextCharacterPropertiesBuilder setNoProof(boolean noProof) {
    this.noProof = noProof;
    return this;
  }

  public TextCharacterPropertiesBuilder setBmk(String bmk) {
    this.bmk = bmk;
    return this;
  }

  public TextCharacterPropertiesBuilder setBaseline(int baseline) {
    this.baseline = baseline;
    return this;
  }

  public TextCharacterPropertiesBuilder setDirty(boolean dirty) {
    this.dirty = dirty;
    return this;
  }

  public TextCharacterPropertiesBuilder setSmtClean(boolean smtClean) {
    this.smtClean = smtClean;
    return this;
  }

  public TextCharacterPropertiesBuilder setErr(boolean err) {
    this.err = err;
    return this;
  }

  public TextCharacterPropertiesBuilder setKumimoji(boolean kumimoji) {
    this.kumimoji = kumimoji;
    return this;
  }

  public TextCharacterPropertiesBuilder setB(boolean b) {
    this.b = b;
    return this;
  }

  public TextCharacterPropertiesBuilder setI(boolean i) {
    this.i = i;
    return this;
  }

  public TextCharacterPropertiesBuilder setLang(String lang) {
    this.lang = lang;
    return this;
  }

  public TextCharacterPropertiesBuilder setSz(int sz) {
    this.sz = sz;
    return this;
  }

  public TextCharacterPropertiesBuilder setSmtId(long smtId) {
    this.smtId = smtId;
    return this;
  }

  public TextCharacterPropertiesBuilder setNormalizeH(boolean normalizeH) {
    this.normalizeH = normalizeH;
    return this;
  }

  public TextCharacterPropertiesBuilder setU(TextUnderlineTypeValueModel u) {
    this.u = u;
    return this;
  }

  public TextCharacterPropertiesBuilder setKern(int kern) {
    this.kern = kern;
    return this;
  }

  public TextCharacterPropertiesBuilder setCap(TextCapsTypeValueModel cap) {
    this.cap = cap;
    return this;
  }

  public TextCharacterPropertiesBuilder setAltLang(String altLang) {
    this.altLang = altLang;
    return this;
  }

  public TextCharacterPropertiesBuilder setSpc(int spc) {
    this.spc = spc;
    return this;
  }

  public TextCharacterPropertiesBuilder setLn(LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGFillProperties(
      TextCharacterPropertiesModel.EG_FillProperties egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGEffectProperties(
      TextCharacterPropertiesModel.EG_EffectProperties egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public TextCharacterPropertiesBuilder setHighlight(ColorModel highlight) {
    this.highlight = highlight;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGTextUnderlineLine(
      TextCharacterPropertiesModel.EG_TextUnderlineLine egTextUnderlineLine) {
    this.egTextUnderlineLine = egTextUnderlineLine;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGTextUnderlineFill(
      TextCharacterPropertiesModel.EG_TextUnderlineFill egTextUnderlineFill) {
    this.egTextUnderlineFill = egTextUnderlineFill;
    return this;
  }

  public TextCharacterPropertiesBuilder setLatin(TextFontValueModel latin) {
    this.latin = latin;
    return this;
  }

  public TextCharacterPropertiesBuilder setEa(TextFontValueModel ea) {
    this.ea = ea;
    return this;
  }

  public TextCharacterPropertiesBuilder setCs(TextFontValueModel cs) {
    this.cs = cs;
    return this;
  }

  public TextCharacterPropertiesBuilder setSym(TextFontValueModel sym) {
    this.sym = sym;
    return this;
  }

  public TextCharacterPropertiesBuilder setHlinkClick(HyperlinkModel hlinkClick) {
    this.hlinkClick = hlinkClick;
    return this;
  }

  public TextCharacterPropertiesBuilder setHlinkMouseOver(HyperlinkModel hlinkMouseOver) {
    this.hlinkMouseOver = hlinkMouseOver;
    return this;
  }

  public TextCharacterPropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TextCharacterPropertiesBuilder from(TextCharacterPropertiesModel value) {
    this.strike = value.getStrike();
    this.noProof = value.getNoProof();
    this.bmk = value.getBmk();
    this.baseline = value.getBaseline();
    this.dirty = value.getDirty();
    this.smtClean = value.getSmtClean();
    this.err = value.getErr();
    this.kumimoji = value.getKumimoji();
    this.b = value.getB();
    this.i = value.getI();
    this.lang = value.getLang();
    this.sz = value.getSz();
    this.smtId = value.getSmtId();
    this.normalizeH = value.getNormalizeH();
    this.u = value.getU();
    this.kern = value.getKern();
    this.cap = value.getCap();
    this.altLang = value.getAltLang();
    this.spc = value.getSpc();
    this.ln = value.getLn();
    this.egFillProperties = value.getEGFillProperties();
    this.egEffectProperties = value.getEGEffectProperties();
    this.highlight = value.getHighlight();
    this.egTextUnderlineLine = value.getEGTextUnderlineLine();
    this.egTextUnderlineFill = value.getEGTextUnderlineFill();
    this.latin = value.getLatin();
    this.ea = value.getEa();
    this.cs = value.getCs();
    this.sym = value.getSym();
    this.hlinkClick = value.getHlinkClick();
    this.hlinkMouseOver = value.getHlinkMouseOver();
    this.extLst = value.getExtLst();
    return this;
  }

  public TextCharacterPropertiesModel build() {
    return new TextCharacterPropertiesModel(this.strike, this.noProof, this.bmk, this.baseline, this.dirty, this.smtClean, this.err, this.kumimoji, this.b, this.i, this.lang, this.sz, this.smtId, this.normalizeH, this.u, this.kern, this.cap, this.altLang, this.spc, this.ln, this.egFillProperties, this.egEffectProperties, this.highlight, this.egTextUnderlineLine, this.egTextUnderlineFill, this.latin, this.ea, this.cs, this.sym, this.hlinkClick, this.hlinkMouseOver, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillProperties {
    private int type;

    private Object value;

    public EG_FillProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillProperties setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillProperties setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_FillProperties setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_FillProperties setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_FillProperties setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_FillProperties setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_FillProperties from(TextCharacterPropertiesModel.EG_FillProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isNoFill()) {
        this.type = 0;
        this.value = value.getNoFill();
      }
      if (value.isSolidFill()) {
        this.type = 1;
        this.value = value.getSolidFill();
      }
      if (value.isGradFill()) {
        this.type = 2;
        this.value = value.getGradFill();
      }
      if (value.isBlipFill()) {
        this.type = 3;
        this.value = value.getBlipFill();
      }
      if (value.isPattFill()) {
        this.type = 4;
        this.value = value.getPattFill();
      }
      if (value.isGrpFill()) {
        this.type = 5;
        this.value = value.getGrpFill();
      }
      return this;
    }

    public TextCharacterPropertiesModel.EG_FillProperties build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.EG_FillProperties();
      if (this.type == 0) return TextCharacterPropertiesModel.EG_FillProperties.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.EG_FillProperties.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return TextCharacterPropertiesModel.EG_FillProperties.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return TextCharacterPropertiesModel.EG_FillProperties.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return TextCharacterPropertiesModel.EG_FillProperties.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return TextCharacterPropertiesModel.EG_FillProperties.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_EffectProperties {
    private int type;

    private Object value;

    public EG_EffectProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_EffectProperties setEffectLst(EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_EffectProperties setEffectDag(EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_EffectProperties from(TextCharacterPropertiesModel.EG_EffectProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isEffectLst()) {
        this.type = 0;
        this.value = value.getEffectLst();
      }
      if (value.isEffectDag()) {
        this.type = 1;
        this.value = value.getEffectDag();
      }
      return this;
    }

    public TextCharacterPropertiesModel.EG_EffectProperties build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.EG_EffectProperties();
      if (this.type == 0) return TextCharacterPropertiesModel.EG_EffectProperties.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.EG_EffectProperties.newEffectDag((EffectContainerModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextUnderlineLine {
    private int type;

    private Object value;

    public EG_TextUnderlineLine() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextUnderlineLine setULnTx(TextUnderlineLineFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextUnderlineLine setULn(LinePropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextUnderlineLine from(TextCharacterPropertiesModel.EG_TextUnderlineLine value) {
      this.type = -1;
      this.value = null;
      if (value.isULnTx()) {
        this.type = 0;
        this.value = value.getULnTx();
      }
      if (value.isULn()) {
        this.type = 1;
        this.value = value.getULn();
      }
      return this;
    }

    public TextCharacterPropertiesModel.EG_TextUnderlineLine build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.EG_TextUnderlineLine();
      if (this.type == 0) return TextCharacterPropertiesModel.EG_TextUnderlineLine.newULnTx((TextUnderlineLineFollowTextModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.EG_TextUnderlineLine.newULn((LinePropertiesModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextUnderlineFill {
    private int type;

    private Object value;

    public EG_TextUnderlineFill() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextUnderlineFill setUFillTx(TextUnderlineFillFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextUnderlineFill setUFill(TextUnderlineFillGroupWrapperModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextUnderlineFill from(TextCharacterPropertiesModel.EG_TextUnderlineFill value) {
      this.type = -1;
      this.value = null;
      if (value.isUFillTx()) {
        this.type = 0;
        this.value = value.getUFillTx();
      }
      if (value.isUFill()) {
        this.type = 1;
        this.value = value.getUFill();
      }
      return this;
    }

    public TextCharacterPropertiesModel.EG_TextUnderlineFill build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.EG_TextUnderlineFill();
      if (this.type == 0) return TextCharacterPropertiesModel.EG_TextUnderlineFill.newUFillTx((TextUnderlineFillFollowTextModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.EG_TextUnderlineFill.newUFill((TextUnderlineFillGroupWrapperModel) this.value);
      return null;
    }
  }
}
