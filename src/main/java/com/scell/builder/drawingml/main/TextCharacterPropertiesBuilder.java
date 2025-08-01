package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.ColorModel;
import com.scell.model.drawingml.main.EffectContainerModel;
import com.scell.model.drawingml.main.EffectListModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.HyperlinkModel;
import com.scell.model.drawingml.main.LinePropertiesModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.TextCapsTypeValueModel;
import com.scell.model.drawingml.main.TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.TextFontSizeValueModel;
import com.scell.model.drawingml.main.TextFontValueModel;
import com.scell.model.drawingml.main.TextLanguageIDValueModel;
import com.scell.model.drawingml.main.TextNonNegativePointValueModel;
import com.scell.model.drawingml.main.TextPointValueModel;
import com.scell.model.drawingml.main.TextStrikeTypeValueModel;
import com.scell.model.drawingml.main.TextUnderlineFillFollowTextModel;
import com.scell.model.drawingml.main.TextUnderlineFillGroupWrapperModel;
import com.scell.model.drawingml.main.TextUnderlineLineFollowTextModel;
import com.scell.model.drawingml.main.TextUnderlineTypeValueModel;
import java.lang.Object;

public class TextCharacterPropertiesBuilder {
  private TextStrikeTypeValueModel strike;

  private BooleanValueModel noProof;

  private StringValueModel bmk;

  private PercentageValueModel baseline;

  private BooleanValueModel dirty;

  private BooleanValueModel smtClean;

  private BooleanValueModel err;

  private BooleanValueModel kumimoji;

  private BooleanValueModel b;

  private BooleanValueModel i;

  private TextLanguageIDValueModel lang;

  private TextFontSizeValueModel sz;

  private UnsignedIntValueModel smtId;

  private BooleanValueModel normalizeH;

  private TextUnderlineTypeValueModel u;

  private TextNonNegativePointValueModel kern;

  private TextCapsTypeValueModel cap;

  private TextLanguageIDValueModel altLang;

  private TextPointValueModel spc;

  private LinePropertiesModel ln;

  private TextCharacterPropertiesModel.FillPropertiesModel egFillProperties;

  private TextCharacterPropertiesModel.EffectPropertiesModel egEffectProperties;

  private ColorModel highlight;

  private TextCharacterPropertiesModel.TextUnderlineLineModel egTextUnderlineLine;

  private TextCharacterPropertiesModel.TextUnderlineFillModel egTextUnderlineFill;

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

  public TextCharacterPropertiesBuilder setNoProof(BooleanValueModel noProof) {
    this.noProof = noProof;
    return this;
  }

  public TextCharacterPropertiesBuilder setBmk(StringValueModel bmk) {
    this.bmk = bmk;
    return this;
  }

  public TextCharacterPropertiesBuilder setBaseline(PercentageValueModel baseline) {
    this.baseline = baseline;
    return this;
  }

  public TextCharacterPropertiesBuilder setDirty(BooleanValueModel dirty) {
    this.dirty = dirty;
    return this;
  }

  public TextCharacterPropertiesBuilder setSmtClean(BooleanValueModel smtClean) {
    this.smtClean = smtClean;
    return this;
  }

  public TextCharacterPropertiesBuilder setErr(BooleanValueModel err) {
    this.err = err;
    return this;
  }

  public TextCharacterPropertiesBuilder setKumimoji(BooleanValueModel kumimoji) {
    this.kumimoji = kumimoji;
    return this;
  }

  public TextCharacterPropertiesBuilder setB(BooleanValueModel b) {
    this.b = b;
    return this;
  }

  public TextCharacterPropertiesBuilder setI(BooleanValueModel i) {
    this.i = i;
    return this;
  }

  public TextCharacterPropertiesBuilder setLang(TextLanguageIDValueModel lang) {
    this.lang = lang;
    return this;
  }

  public TextCharacterPropertiesBuilder setSz(TextFontSizeValueModel sz) {
    this.sz = sz;
    return this;
  }

  public TextCharacterPropertiesBuilder setSmtId(UnsignedIntValueModel smtId) {
    this.smtId = smtId;
    return this;
  }

  public TextCharacterPropertiesBuilder setNormalizeH(BooleanValueModel normalizeH) {
    this.normalizeH = normalizeH;
    return this;
  }

  public TextCharacterPropertiesBuilder setU(TextUnderlineTypeValueModel u) {
    this.u = u;
    return this;
  }

  public TextCharacterPropertiesBuilder setKern(TextNonNegativePointValueModel kern) {
    this.kern = kern;
    return this;
  }

  public TextCharacterPropertiesBuilder setCap(TextCapsTypeValueModel cap) {
    this.cap = cap;
    return this;
  }

  public TextCharacterPropertiesBuilder setAltLang(TextLanguageIDValueModel altLang) {
    this.altLang = altLang;
    return this;
  }

  public TextCharacterPropertiesBuilder setSpc(TextPointValueModel spc) {
    this.spc = spc;
    return this;
  }

  public TextCharacterPropertiesBuilder setLn(LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGFillProperties(
      TextCharacterPropertiesModel.FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGEffectProperties(
      TextCharacterPropertiesModel.EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public TextCharacterPropertiesBuilder setHighlight(ColorModel highlight) {
    this.highlight = highlight;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGTextUnderlineLine(
      TextCharacterPropertiesModel.TextUnderlineLineModel egTextUnderlineLine) {
    this.egTextUnderlineLine = egTextUnderlineLine;
    return this;
  }

  public TextCharacterPropertiesBuilder setEGTextUnderlineFill(
      TextCharacterPropertiesModel.TextUnderlineFillModel egTextUnderlineFill) {
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

  public TextCharacterPropertiesModel build() {
    return new TextCharacterPropertiesModel(this.strike, this.noProof, this.bmk, this.baseline, this.dirty, this.smtClean, this.err, this.kumimoji, this.b, this.i, this.lang, this.sz, this.smtId, this.normalizeH, this.u, this.kern, this.cap, this.altLang, this.spc, this.ln, this.egFillProperties, this.egEffectProperties, this.highlight, this.egTextUnderlineLine, this.egTextUnderlineFill, this.latin, this.ea, this.cs, this.sym, this.hlinkClick, this.hlinkMouseOver, this.extLst);
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

  public static class FillPropertiesBuilder {
    private int type;

    private Object value;

    public FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public FillPropertiesBuilder setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public TextCharacterPropertiesModel.FillPropertiesModel build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.FillPropertiesModel();
      if (this.type == 0) return TextCharacterPropertiesModel.FillPropertiesModel.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.FillPropertiesModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return TextCharacterPropertiesModel.FillPropertiesModel.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return TextCharacterPropertiesModel.FillPropertiesModel.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return TextCharacterPropertiesModel.FillPropertiesModel.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return TextCharacterPropertiesModel.FillPropertiesModel.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }

    public FillPropertiesBuilder from(TextCharacterPropertiesModel.FillPropertiesModel value) {
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
  }

  public static class EffectPropertiesBuilder {
    private int type;

    private Object value;

    public EffectPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EffectPropertiesBuilder setEffectLst(EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EffectPropertiesBuilder setEffectDag(EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextCharacterPropertiesModel.EffectPropertiesModel build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.EffectPropertiesModel();
      if (this.type == 0) return TextCharacterPropertiesModel.EffectPropertiesModel.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.EffectPropertiesModel.newEffectDag((EffectContainerModel) this.value);
      return null;
    }

    public EffectPropertiesBuilder from(TextCharacterPropertiesModel.EffectPropertiesModel value) {
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
  }

  public static class TextUnderlineLineBuilder {
    private int type;

    private Object value;

    public TextUnderlineLineBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextUnderlineLineBuilder setULnTx(TextUnderlineLineFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextUnderlineLineBuilder setULn(LinePropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextCharacterPropertiesModel.TextUnderlineLineModel build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.TextUnderlineLineModel();
      if (this.type == 0) return TextCharacterPropertiesModel.TextUnderlineLineModel.newULnTx((TextUnderlineLineFollowTextModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.TextUnderlineLineModel.newULn((LinePropertiesModel) this.value);
      return null;
    }

    public TextUnderlineLineBuilder from(
        TextCharacterPropertiesModel.TextUnderlineLineModel value) {
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
  }

  public static class TextUnderlineFillBuilder {
    private int type;

    private Object value;

    public TextUnderlineFillBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextUnderlineFillBuilder setUFillTx(TextUnderlineFillFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextUnderlineFillBuilder setUFill(TextUnderlineFillGroupWrapperModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextCharacterPropertiesModel.TextUnderlineFillModel build() {
      if (this.type == -1) return new TextCharacterPropertiesModel.TextUnderlineFillModel();
      if (this.type == 0) return TextCharacterPropertiesModel.TextUnderlineFillModel.newUFillTx((TextUnderlineFillFollowTextModel) this.value);
      if (this.type == 1) return TextCharacterPropertiesModel.TextUnderlineFillModel.newUFill((TextUnderlineFillGroupWrapperModel) this.value);
      return null;
    }

    public TextUnderlineFillBuilder from(
        TextCharacterPropertiesModel.TextUnderlineFillModel value) {
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
  }
}
