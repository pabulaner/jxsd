package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_TextCharacterPropertiesModel {
  private final ST_TextStrikeTypeModel strike;

  private final BooleanModel noProof;

  private final StringModel bmk;

  private final ST_PercentageModel baseline;

  private final BooleanModel dirty;

  private final BooleanModel smtClean;

  private final BooleanModel err;

  private final BooleanModel kumimoji;

  private final BooleanModel b;

  private final BooleanModel i;

  private final ST_TextLanguageIDModel lang;

  private final ST_TextFontSizeModel sz;

  private final UnsignedIntModel smtId;

  private final BooleanModel normalizeH;

  private final ST_TextUnderlineTypeModel u;

  private final ST_TextNonNegativePointModel kern;

  private final ST_TextCapsTypeModel cap;

  private final ST_TextLanguageIDModel altLang;

  private final ST_TextPointModel spc;

  private final CT_LinePropertiesModel ln;

  private final EG_FillPropertiesModel egFillProperties;

  private final EG_EffectPropertiesModel egEffectProperties;

  private final CT_ColorModel highlight;

  private final EG_TextUnderlineLineModel egTextUnderlineLine;

  private final EG_TextUnderlineFillModel egTextUnderlineFill;

  private final CT_TextFontModel latin;

  private final CT_TextFontModel ea;

  private final CT_TextFontModel cs;

  private final CT_TextFontModel sym;

  private final CT_HyperlinkModel hlinkClick;

  private final CT_HyperlinkModel hlinkMouseOver;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_TextCharacterPropertiesModel(ST_TextStrikeTypeModel strike, BooleanModel noProof,
      StringModel bmk, ST_PercentageModel baseline, BooleanModel dirty, BooleanModel smtClean,
      BooleanModel err, BooleanModel kumimoji, BooleanModel b, BooleanModel i,
      ST_TextLanguageIDModel lang, ST_TextFontSizeModel sz, UnsignedIntModel smtId,
      BooleanModel normalizeH, ST_TextUnderlineTypeModel u, ST_TextNonNegativePointModel kern,
      ST_TextCapsTypeModel cap, ST_TextLanguageIDModel altLang, ST_TextPointModel spc,
      CT_LinePropertiesModel ln, EG_FillPropertiesModel egFillProperties,
      EG_EffectPropertiesModel egEffectProperties, CT_ColorModel highlight,
      EG_TextUnderlineLineModel egTextUnderlineLine, EG_TextUnderlineFillModel egTextUnderlineFill,
      CT_TextFontModel latin, CT_TextFontModel ea, CT_TextFontModel cs, CT_TextFontModel sym,
      CT_HyperlinkModel hlinkClick, CT_HyperlinkModel hlinkMouseOver,
      CT_OfficeArtExtensionListModel extLst) {
    this.strike = strike;
    this.noProof = noProof;
    this.bmk = bmk;
    this.baseline = baseline;
    this.dirty = dirty;
    this.smtClean = smtClean;
    this.err = err;
    this.kumimoji = kumimoji;
    this.b = b;
    this.i = i;
    this.lang = lang;
    this.sz = sz;
    this.smtId = smtId;
    this.normalizeH = normalizeH;
    this.u = u;
    this.kern = kern;
    this.cap = cap;
    this.altLang = altLang;
    this.spc = spc;
    this.ln = ln;
    this.egFillProperties = egFillProperties;
    this.egEffectProperties = egEffectProperties;
    this.highlight = highlight;
    this.egTextUnderlineLine = egTextUnderlineLine;
    this.egTextUnderlineFill = egTextUnderlineFill;
    this.latin = latin;
    this.ea = ea;
    this.cs = cs;
    this.sym = sym;
    this.hlinkClick = hlinkClick;
    this.hlinkMouseOver = hlinkMouseOver;
    this.extLst = extLst;
  }

  public ST_TextStrikeTypeModel getStrike() {
    return this.strike;
  }

  public BooleanModel getNoProof() {
    return this.noProof;
  }

  public StringModel getBmk() {
    return this.bmk;
  }

  public ST_PercentageModel getBaseline() {
    return this.baseline;
  }

  public BooleanModel getDirty() {
    return this.dirty;
  }

  public BooleanModel getSmtClean() {
    return this.smtClean;
  }

  public BooleanModel getErr() {
    return this.err;
  }

  public BooleanModel getKumimoji() {
    return this.kumimoji;
  }

  public BooleanModel getB() {
    return this.b;
  }

  public BooleanModel getI() {
    return this.i;
  }

  public ST_TextLanguageIDModel getLang() {
    return this.lang;
  }

  public ST_TextFontSizeModel getSz() {
    return this.sz;
  }

  public UnsignedIntModel getSmtId() {
    return this.smtId;
  }

  public BooleanModel getNormalizeH() {
    return this.normalizeH;
  }

  public ST_TextUnderlineTypeModel getU() {
    return this.u;
  }

  public ST_TextNonNegativePointModel getKern() {
    return this.kern;
  }

  public ST_TextCapsTypeModel getCap() {
    return this.cap;
  }

  public ST_TextLanguageIDModel getAltLang() {
    return this.altLang;
  }

  public ST_TextPointModel getSpc() {
    return this.spc;
  }

  public CT_LinePropertiesModel getLn() {
    return this.ln;
  }

  public EG_FillPropertiesModel getEGFillProperties() {
    return this.egFillProperties;
  }

  public EG_EffectPropertiesModel getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public CT_ColorModel getHighlight() {
    return this.highlight;
  }

  public EG_TextUnderlineLineModel getEGTextUnderlineLine() {
    return this.egTextUnderlineLine;
  }

  public EG_TextUnderlineFillModel getEGTextUnderlineFill() {
    return this.egTextUnderlineFill;
  }

  public CT_TextFontModel getLatin() {
    return this.latin;
  }

  public CT_TextFontModel getEa() {
    return this.ea;
  }

  public CT_TextFontModel getCs() {
    return this.cs;
  }

  public CT_TextFontModel getSym() {
    return this.sym;
  }

  public CT_HyperlinkModel getHlinkClick() {
    return this.hlinkClick;
  }

  public CT_HyperlinkModel getHlinkMouseOver() {
    return this.hlinkMouseOver;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class EG_FillPropertiesModel {
    private final int type;

    private final Object value;

    public EG_FillPropertiesModel() {
      this(-1, null);
    }

    private EG_FillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_FillPropertiesModel newNoFill(CT_NoFillPropertiesModel value) {
      return new EG_FillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newSolidFill(CT_SolidColorFillPropertiesModel value) {
      return new EG_FillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newGradFill(CT_GradientFillPropertiesModel value) {
      return new EG_FillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new EG_FillPropertiesModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newPattFill(CT_PatternFillPropertiesModel value) {
      return new EG_FillPropertiesModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new EG_FillPropertiesModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }

  public static class EG_EffectPropertiesModel {
    private final int type;

    private final Object value;

    public EG_EffectPropertiesModel() {
      this(-1, null);
    }

    private EG_EffectPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_EffectPropertiesModel newEffectLst(CT_EffectListModel value) {
      return new EG_EffectPropertiesModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public CT_EffectListModel getEffectLst() {
      return (CT_EffectListModel) this.value;
    }

    public static EG_EffectPropertiesModel newEffectDag(CT_EffectContainerModel value) {
      return new EG_EffectPropertiesModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public CT_EffectContainerModel getEffectDag() {
      return (CT_EffectContainerModel) this.value;
    }
  }

  public static class EG_TextUnderlineLineModel {
    private final int type;

    private final Object value;

    public EG_TextUnderlineLineModel() {
      this(-1, null);
    }

    private EG_TextUnderlineLineModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_TextUnderlineLineModel newULnTx(CT_TextUnderlineLineFollowTextModel value) {
      return new EG_TextUnderlineLineModel(0, value);
    }

    public boolean isULnTx() {
      return this.type == 0;
    }

    public CT_TextUnderlineLineFollowTextModel getULnTx() {
      return (CT_TextUnderlineLineFollowTextModel) this.value;
    }

    public static EG_TextUnderlineLineModel newULn(CT_LinePropertiesModel value) {
      return new EG_TextUnderlineLineModel(1, value);
    }

    public boolean isULn() {
      return this.type == 1;
    }

    public CT_LinePropertiesModel getULn() {
      return (CT_LinePropertiesModel) this.value;
    }
  }

  public static class EG_TextUnderlineFillModel {
    private final int type;

    private final Object value;

    public EG_TextUnderlineFillModel() {
      this(-1, null);
    }

    private EG_TextUnderlineFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_TextUnderlineFillModel newUFillTx(CT_TextUnderlineFillFollowTextModel value) {
      return new EG_TextUnderlineFillModel(0, value);
    }

    public boolean isUFillTx() {
      return this.type == 0;
    }

    public CT_TextUnderlineFillFollowTextModel getUFillTx() {
      return (CT_TextUnderlineFillFollowTextModel) this.value;
    }

    public static EG_TextUnderlineFillModel newUFill(CT_TextUnderlineFillGroupWrapperModel value) {
      return new EG_TextUnderlineFillModel(1, value);
    }

    public boolean isUFill() {
      return this.type == 1;
    }

    public CT_TextUnderlineFillGroupWrapperModel getUFill() {
      return (CT_TextUnderlineFillGroupWrapperModel) this.value;
    }
  }
}
