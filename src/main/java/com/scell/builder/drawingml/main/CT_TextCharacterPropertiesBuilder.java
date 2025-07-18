package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_ColorModel;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import com.scell.model.drawingml.main.CT_HyperlinkModel;
import com.scell.model.drawingml.main.CT_LinePropertiesModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.CT_TextFontModel;
import com.scell.model.drawingml.main.CT_TextUnderlineFillFollowTextModel;
import com.scell.model.drawingml.main.CT_TextUnderlineFillGroupWrapperModel;
import com.scell.model.drawingml.main.CT_TextUnderlineLineFollowTextModel;
import com.scell.model.drawingml.main.ST_PercentageModel;
import com.scell.model.drawingml.main.ST_TextCapsTypeModel;
import com.scell.model.drawingml.main.ST_TextFontSizeModel;
import com.scell.model.drawingml.main.ST_TextLanguageIDModel;
import com.scell.model.drawingml.main.ST_TextNonNegativePointModel;
import com.scell.model.drawingml.main.ST_TextPointModel;
import com.scell.model.drawingml.main.ST_TextStrikeTypeModel;
import com.scell.model.drawingml.main.ST_TextUnderlineTypeModel;
import java.lang.Object;

public class CT_TextCharacterPropertiesBuilder {
  private ST_TextStrikeTypeModel strike;

  private BooleanModel noProof;

  private StringModel bmk;

  private ST_PercentageModel baseline;

  private BooleanModel dirty;

  private BooleanModel smtClean;

  private BooleanModel err;

  private BooleanModel kumimoji;

  private BooleanModel b;

  private BooleanModel i;

  private ST_TextLanguageIDModel lang;

  private ST_TextFontSizeModel sz;

  private UnsignedIntModel smtId;

  private BooleanModel normalizeH;

  private ST_TextUnderlineTypeModel u;

  private ST_TextNonNegativePointModel kern;

  private ST_TextCapsTypeModel cap;

  private ST_TextLanguageIDModel altLang;

  private ST_TextPointModel spc;

  private CT_LinePropertiesModel ln;

  private CT_TextCharacterPropertiesModel.EG_FillPropertiesModel egFillProperties;

  private CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel egEffectProperties;

  private CT_ColorModel highlight;

  private CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel egTextUnderlineLine;

  private CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel egTextUnderlineFill;

  private CT_TextFontModel latin;

  private CT_TextFontModel ea;

  private CT_TextFontModel cs;

  private CT_TextFontModel sym;

  private CT_HyperlinkModel hlinkClick;

  private CT_HyperlinkModel hlinkMouseOver;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_TextCharacterPropertiesBuilder() {
  }

  public CT_TextCharacterPropertiesBuilder setStrike(ST_TextStrikeTypeModel strike) {
    this.strike = strike;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setNoProof(BooleanModel noProof) {
    this.noProof = noProof;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setBmk(StringModel bmk) {
    this.bmk = bmk;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setBaseline(ST_PercentageModel baseline) {
    this.baseline = baseline;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setDirty(BooleanModel dirty) {
    this.dirty = dirty;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setSmtClean(BooleanModel smtClean) {
    this.smtClean = smtClean;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setErr(BooleanModel err) {
    this.err = err;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setKumimoji(BooleanModel kumimoji) {
    this.kumimoji = kumimoji;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setB(BooleanModel b) {
    this.b = b;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setI(BooleanModel i) {
    this.i = i;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setLang(ST_TextLanguageIDModel lang) {
    this.lang = lang;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setSz(ST_TextFontSizeModel sz) {
    this.sz = sz;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setSmtId(UnsignedIntModel smtId) {
    this.smtId = smtId;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setNormalizeH(BooleanModel normalizeH) {
    this.normalizeH = normalizeH;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setU(ST_TextUnderlineTypeModel u) {
    this.u = u;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setKern(ST_TextNonNegativePointModel kern) {
    this.kern = kern;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setCap(ST_TextCapsTypeModel cap) {
    this.cap = cap;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setAltLang(ST_TextLanguageIDModel altLang) {
    this.altLang = altLang;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setSpc(ST_TextPointModel spc) {
    this.spc = spc;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setLn(CT_LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setEGFillProperties(
      CT_TextCharacterPropertiesModel.EG_FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setEGEffectProperties(
      CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setHighlight(CT_ColorModel highlight) {
    this.highlight = highlight;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setEGTextUnderlineLine(
      CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel egTextUnderlineLine) {
    this.egTextUnderlineLine = egTextUnderlineLine;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setEGTextUnderlineFill(
      CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel egTextUnderlineFill) {
    this.egTextUnderlineFill = egTextUnderlineFill;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setLatin(CT_TextFontModel latin) {
    this.latin = latin;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setEa(CT_TextFontModel ea) {
    this.ea = ea;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setCs(CT_TextFontModel cs) {
    this.cs = cs;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setSym(CT_TextFontModel sym) {
    this.sym = sym;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setHlinkClick(CT_HyperlinkModel hlinkClick) {
    this.hlinkClick = hlinkClick;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setHlinkMouseOver(CT_HyperlinkModel hlinkMouseOver) {
    this.hlinkMouseOver = hlinkMouseOver;
    return this;
  }

  public CT_TextCharacterPropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TextCharacterPropertiesModel build() {
    return new CT_TextCharacterPropertiesModel(this.strike, this.noProof, this.bmk, this.baseline, this.dirty, this.smtClean, this.err, this.kumimoji, this.b, this.i, this.lang, this.sz, this.smtId, this.normalizeH, this.u, this.kern, this.cap, this.altLang, this.spc, this.ln, this.egFillProperties, this.egEffectProperties, this.highlight, this.egTextUnderlineLine, this.egTextUnderlineFill, this.latin, this.ea, this.cs, this.sym, this.hlinkClick, this.hlinkMouseOver, this.extLst);
  }

  public CT_TextCharacterPropertiesBuilder from(CT_TextCharacterPropertiesModel value) {
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

  public static class EG_FillPropertiesBuilder {
    private int type;

    private Object value;

    public EG_FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillPropertiesBuilder setNoFill(CT_NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setGradFill(CT_GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setBlipFill(CT_BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setPattFill(CT_PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setGrpFill(CT_GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_TextCharacterPropertiesModel.EG_FillPropertiesModel build() {
      if (this.type == -1) return new CT_TextCharacterPropertiesModel.EG_FillPropertiesModel();
      if (this.type == 0) return CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
      if (this.type == 4) return CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      if (this.type == 5) return CT_TextCharacterPropertiesModel.EG_FillPropertiesModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
      return null;
    }

    public EG_FillPropertiesBuilder from(
        CT_TextCharacterPropertiesModel.EG_FillPropertiesModel value) {
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

  public static class EG_EffectPropertiesBuilder {
    private int type;

    private Object value;

    public EG_EffectPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_EffectPropertiesBuilder setEffectLst(CT_EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_EffectPropertiesBuilder setEffectDag(CT_EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel build() {
      if (this.type == -1) return new CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel();
      if (this.type == 0) return CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EG_EffectPropertiesBuilder from(
        CT_TextCharacterPropertiesModel.EG_EffectPropertiesModel value) {
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

  public static class EG_TextUnderlineLineBuilder {
    private int type;

    private Object value;

    public EG_TextUnderlineLineBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextUnderlineLineBuilder setULnTx(CT_TextUnderlineLineFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextUnderlineLineBuilder setULn(CT_LinePropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel build() {
      if (this.type == -1) return new CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel();
      if (this.type == 0) return CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel.newULnTx((CT_TextUnderlineLineFollowTextModel) this.value);
      if (this.type == 1) return CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel.newULn((CT_LinePropertiesModel) this.value);
      return null;
    }

    public EG_TextUnderlineLineBuilder from(
        CT_TextCharacterPropertiesModel.EG_TextUnderlineLineModel value) {
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

  public static class EG_TextUnderlineFillBuilder {
    private int type;

    private Object value;

    public EG_TextUnderlineFillBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextUnderlineFillBuilder setUFillTx(CT_TextUnderlineFillFollowTextModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextUnderlineFillBuilder setUFill(CT_TextUnderlineFillGroupWrapperModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel build() {
      if (this.type == -1) return new CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel();
      if (this.type == 0) return CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel.newUFillTx((CT_TextUnderlineFillFollowTextModel) this.value);
      if (this.type == 1) return CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel.newUFill((CT_TextUnderlineFillGroupWrapperModel) this.value);
      return null;
    }

    public EG_TextUnderlineFillBuilder from(
        CT_TextCharacterPropertiesModel.EG_TextUnderlineFillModel value) {
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
