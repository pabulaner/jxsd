package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.XMLSchema.unsignedIntModel;

public class CT_TextCharacterPropertiesModel {
  private final ST_TextStrikeTypeModel strike;

  private final booleanModel noProof;

  private final stringModel bmk;

  private final ST_PercentageModel baseline;

  private final booleanModel dirty;

  private final booleanModel smtClean;

  private final booleanModel err;

  private final booleanModel kumimoji;

  private final booleanModel b;

  private final booleanModel i;

  private final ST_TextLanguageIDModel lang;

  private final ST_TextFontSizeModel sz;

  private final unsignedIntModel smtId;

  private final booleanModel normalizeH;

  private final ST_TextUnderlineTypeModel u;

  private final ST_TextNonNegativePointModel kern;

  private final ST_TextCapsTypeModel cap;

  private final ST_TextLanguageIDModel altLang;

  private final ST_TextPointModel spc;

  private final CT_LinePropertiesModel ln;

  private final noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final effectLstOrEffectDagModel effectLstOrEffectDag;

  private final CT_ColorModel highlight;

  private final uLnTxOrULnModel uLnTxOrULn;

  private final uFillTxOrUFillModel uFillTxOrUFill;

  private final CT_TextFontModel latin;

  private final CT_TextFontModel ea;

  private final CT_TextFontModel cs;

  private final CT_TextFontModel sym;

  private final CT_HyperlinkModel hlinkClick;

  private final CT_HyperlinkModel hlinkMouseOver;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_TextCharacterPropertiesModel(ST_TextStrikeTypeModel strike, booleanModel noProof,
      stringModel bmk, ST_PercentageModel baseline, booleanModel dirty, booleanModel smtClean,
      booleanModel err, booleanModel kumimoji, booleanModel b, booleanModel i,
      ST_TextLanguageIDModel lang, ST_TextFontSizeModel sz, unsignedIntModel smtId,
      booleanModel normalizeH, ST_TextUnderlineTypeModel u, ST_TextNonNegativePointModel kern,
      ST_TextCapsTypeModel cap, ST_TextLanguageIDModel altLang, ST_TextPointModel spc,
      CT_LinePropertiesModel ln, noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      effectLstOrEffectDagModel effectLstOrEffectDag, CT_ColorModel highlight,
      uLnTxOrULnModel uLnTxOrULn, uFillTxOrUFillModel uFillTxOrUFill, CT_TextFontModel latin,
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

  public booleanModel getNoProof() {
    return this.noProof;
  }

  public stringModel getBmk() {
    return this.bmk;
  }

  public ST_PercentageModel getBaseline() {
    return this.baseline;
  }

  public booleanModel getDirty() {
    return this.dirty;
  }

  public booleanModel getSmtClean() {
    return this.smtClean;
  }

  public booleanModel getErr() {
    return this.err;
  }

  public booleanModel getKumimoji() {
    return this.kumimoji;
  }

  public booleanModel getB() {
    return this.b;
  }

  public booleanModel getI() {
    return this.i;
  }

  public ST_TextLanguageIDModel getLang() {
    return this.lang;
  }

  public ST_TextFontSizeModel getSz() {
    return this.sz;
  }

  public unsignedIntModel getSmtId() {
    return this.smtId;
  }

  public booleanModel getNormalizeH() {
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

  public noFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public effectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CT_ColorModel getHighlight() {
    return this.highlight;
  }

  public uLnTxOrULnModel getULnTxOrULn() {
    return this.uLnTxOrULn;
  }

  public uFillTxOrUFillModel getUFillTxOrUFill() {
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

  public static class noFillOrSolidFillOrGradFillModel {
    private final int type;

    private final Object value;

    public noFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private noFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static noFillOrSolidFillOrGradFillModel newNoFill(CT_NoFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newSolidFill(
        CT_SolidColorFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newGradFill(
        CT_GradientFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }

  public static class effectLstOrEffectDagModel {
    private final int type;

    private final Object value;

    public effectLstOrEffectDagModel() {
      this(-1, null);
    }

    private effectLstOrEffectDagModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static effectLstOrEffectDagModel newEffectLst(CT_EffectListModel value) {
      return new effectLstOrEffectDagModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public CT_EffectListModel getEffectLst() {
      return (CT_EffectListModel) this.value;
    }

    public static effectLstOrEffectDagModel newEffectDag(CT_EffectContainerModel value) {
      return new effectLstOrEffectDagModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public CT_EffectContainerModel getEffectDag() {
      return (CT_EffectContainerModel) this.value;
    }
  }

  public static class uLnTxOrULnModel {
    private final int type;

    private final Object value;

    public uLnTxOrULnModel() {
      this(-1, null);
    }

    private uLnTxOrULnModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static uLnTxOrULnModel newULnTx(CT_TextUnderlineLineFollowTextModel value) {
      return new uLnTxOrULnModel(0, value);
    }

    public boolean isULnTx() {
      return this.type == 0;
    }

    public CT_TextUnderlineLineFollowTextModel getULnTx() {
      return (CT_TextUnderlineLineFollowTextModel) this.value;
    }

    public static uLnTxOrULnModel newULn(CT_LinePropertiesModel value) {
      return new uLnTxOrULnModel(1, value);
    }

    public boolean isULn() {
      return this.type == 1;
    }

    public CT_LinePropertiesModel getULn() {
      return (CT_LinePropertiesModel) this.value;
    }
  }

  public static class uFillTxOrUFillModel {
    private final int type;

    private final Object value;

    public uFillTxOrUFillModel() {
      this(-1, null);
    }

    private uFillTxOrUFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static uFillTxOrUFillModel newUFillTx(CT_TextUnderlineFillFollowTextModel value) {
      return new uFillTxOrUFillModel(0, value);
    }

    public boolean isUFillTx() {
      return this.type == 0;
    }

    public CT_TextUnderlineFillFollowTextModel getUFillTx() {
      return (CT_TextUnderlineFillFollowTextModel) this.value;
    }

    public static uFillTxOrUFillModel newUFill(CT_TextUnderlineFillGroupWrapperModel value) {
      return new uFillTxOrUFillModel(1, value);
    }

    public boolean isUFill() {
      return this.type == 1;
    }

    public CT_TextUnderlineFillGroupWrapperModel getUFill() {
      return (CT_TextUnderlineFillGroupWrapperModel) this.value;
    }
  }
}
