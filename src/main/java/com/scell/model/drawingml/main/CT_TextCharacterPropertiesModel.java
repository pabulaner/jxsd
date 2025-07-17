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

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final EffectLstOrEffectDagModel effectLstOrEffectDag;

  private final CT_ColorModel highlight;

  private final ULnTxOrULnModel uLnTxOrULn;

  private final UFillTxOrUFillModel uFillTxOrUFill;

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
      CT_LinePropertiesModel ln, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      EffectLstOrEffectDagModel effectLstOrEffectDag, CT_ColorModel highlight,
      ULnTxOrULnModel uLnTxOrULn, UFillTxOrUFillModel uFillTxOrUFill, CT_TextFontModel latin,
      CT_TextFontModel ea, CT_TextFontModel cs, CT_TextFontModel sym, CT_HyperlinkModel hlinkClick,
      CT_HyperlinkModel hlinkMouseOver, CT_OfficeArtExtensionListModel extLst) {
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
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    this.highlight = highlight;
    this.uLnTxOrULn = uLnTxOrULn;
    this.uFillTxOrUFill = uFillTxOrUFill;
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

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CT_ColorModel getHighlight() {
    return this.highlight;
  }

  public ULnTxOrULnModel getULnTxOrULn() {
    return this.uLnTxOrULn;
  }

  public UFillTxOrUFillModel getUFillTxOrUFill() {
    return this.uFillTxOrUFill;
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

  public static class NoFillOrSolidFillOrGradFillModel {
    private final int type;

    private final Object value;

    public NoFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private NoFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoFillOrSolidFillOrGradFillModel newNoFill(CT_NoFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newSolidFill(
        CT_SolidColorFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGradFill(
        CT_GradientFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }

  public static class EffectLstOrEffectDagModel {
    private final int type;

    private final Object value;

    public EffectLstOrEffectDagModel() {
      this(-1, null);
    }

    private EffectLstOrEffectDagModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectLstOrEffectDagModel newEffectLst(CT_EffectListModel value) {
      return new EffectLstOrEffectDagModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public CT_EffectListModel getEffectLst() {
      return (CT_EffectListModel) this.value;
    }

    public static EffectLstOrEffectDagModel newEffectDag(CT_EffectContainerModel value) {
      return new EffectLstOrEffectDagModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public CT_EffectContainerModel getEffectDag() {
      return (CT_EffectContainerModel) this.value;
    }
  }

  public static class ULnTxOrULnModel {
    private final int type;

    private final Object value;

    public ULnTxOrULnModel() {
      this(-1, null);
    }

    private ULnTxOrULnModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ULnTxOrULnModel newULnTx(CT_TextUnderlineLineFollowTextModel value) {
      return new ULnTxOrULnModel(0, value);
    }

    public boolean isULnTx() {
      return this.type == 0;
    }

    public CT_TextUnderlineLineFollowTextModel getULnTx() {
      return (CT_TextUnderlineLineFollowTextModel) this.value;
    }

    public static ULnTxOrULnModel newULn(CT_LinePropertiesModel value) {
      return new ULnTxOrULnModel(1, value);
    }

    public boolean isULn() {
      return this.type == 1;
    }

    public CT_LinePropertiesModel getULn() {
      return (CT_LinePropertiesModel) this.value;
    }
  }

  public static class UFillTxOrUFillModel {
    private final int type;

    private final Object value;

    public UFillTxOrUFillModel() {
      this(-1, null);
    }

    private UFillTxOrUFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static UFillTxOrUFillModel newUFillTx(CT_TextUnderlineFillFollowTextModel value) {
      return new UFillTxOrUFillModel(0, value);
    }

    public boolean isUFillTx() {
      return this.type == 0;
    }

    public CT_TextUnderlineFillFollowTextModel getUFillTx() {
      return (CT_TextUnderlineFillFollowTextModel) this.value;
    }

    public static UFillTxOrUFillModel newUFill(CT_TextUnderlineFillGroupWrapperModel value) {
      return new UFillTxOrUFillModel(1, value);
    }

    public boolean isUFill() {
      return this.type == 1;
    }

    public CT_TextUnderlineFillGroupWrapperModel getUFill() {
      return (CT_TextUnderlineFillGroupWrapperModel) this.value;
    }
  }
}
