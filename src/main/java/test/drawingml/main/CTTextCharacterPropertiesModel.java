package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.BooleanModel;
import test.XMLSchema.StringModel;
import test.XMLSchema.UnsignedIntModel;

public class CTTextCharacterPropertiesModel {
  private final STTextStrikeTypeModel strike;

  private final BooleanModel noProof;

  private final StringModel bmk;

  private final STPercentageModel baseline;

  private final BooleanModel dirty;

  private final BooleanModel smtClean;

  private final BooleanModel err;

  private final BooleanModel kumimoji;

  private final BooleanModel b;

  private final BooleanModel i;

  private final STTextLanguageIDModel lang;

  private final STTextFontSizeModel sz;

  private final UnsignedIntModel smtId;

  private final BooleanModel normalizeH;

  private final STTextUnderlineTypeModel u;

  private final STTextNonNegativePointModel kern;

  private final STTextCapsTypeModel cap;

  private final STTextLanguageIDModel altLang;

  private final STTextPointModel spc;

  private final CTLinePropertiesModel ln;

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final EffectLstOrEffectDagModel effectLstOrEffectDag;

  private final CTColorModel highlight;

  private final ULnTxOrULnModel uLnTxOrULn;

  private final UFillTxOrUFillModel uFillTxOrUFill;

  private final CTTextFontModel latin;

  private final CTTextFontModel ea;

  private final CTTextFontModel cs;

  private final CTTextFontModel sym;

  private final CTHyperlinkModel hlinkClick;

  private final CTHyperlinkModel hlinkMouseOver;

  private final CTOfficeArtExtensionListModel extLst;

  public CTTextCharacterPropertiesModel(STTextStrikeTypeModel strike, BooleanModel noProof,
      StringModel bmk, STPercentageModel baseline, BooleanModel dirty, BooleanModel smtClean,
      BooleanModel err, BooleanModel kumimoji, BooleanModel b, BooleanModel i,
      STTextLanguageIDModel lang, STTextFontSizeModel sz, UnsignedIntModel smtId,
      BooleanModel normalizeH, STTextUnderlineTypeModel u, STTextNonNegativePointModel kern,
      STTextCapsTypeModel cap, STTextLanguageIDModel altLang, STTextPointModel spc,
      CTLinePropertiesModel ln, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      EffectLstOrEffectDagModel effectLstOrEffectDag, CTColorModel highlight,
      ULnTxOrULnModel uLnTxOrULn, UFillTxOrUFillModel uFillTxOrUFill, CTTextFontModel latin,
      CTTextFontModel ea, CTTextFontModel cs, CTTextFontModel sym, CTHyperlinkModel hlinkClick,
      CTHyperlinkModel hlinkMouseOver, CTOfficeArtExtensionListModel extLst) {
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

  public STTextStrikeTypeModel getStrike() {
    return this.strike;
  }

  public BooleanModel getNoProof() {
    return this.noProof;
  }

  public StringModel getBmk() {
    return this.bmk;
  }

  public STPercentageModel getBaseline() {
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

  public STTextLanguageIDModel getLang() {
    return this.lang;
  }

  public STTextFontSizeModel getSz() {
    return this.sz;
  }

  public UnsignedIntModel getSmtId() {
    return this.smtId;
  }

  public BooleanModel getNormalizeH() {
    return this.normalizeH;
  }

  public STTextUnderlineTypeModel getU() {
    return this.u;
  }

  public STTextNonNegativePointModel getKern() {
    return this.kern;
  }

  public STTextCapsTypeModel getCap() {
    return this.cap;
  }

  public STTextLanguageIDModel getAltLang() {
    return this.altLang;
  }

  public STTextPointModel getSpc() {
    return this.spc;
  }

  public CTLinePropertiesModel getLn() {
    return this.ln;
  }

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CTColorModel getHighlight() {
    return this.highlight;
  }

  public ULnTxOrULnModel getULnTxOrULn() {
    return this.uLnTxOrULn;
  }

  public UFillTxOrUFillModel getUFillTxOrUFill() {
    return this.uFillTxOrUFill;
  }

  public CTTextFontModel getLatin() {
    return this.latin;
  }

  public CTTextFontModel getEa() {
    return this.ea;
  }

  public CTTextFontModel getCs() {
    return this.cs;
  }

  public CTTextFontModel getSym() {
    return this.sym;
  }

  public CTHyperlinkModel getHlinkClick() {
    return this.hlinkClick;
  }

  public CTHyperlinkModel getHlinkMouseOver() {
    return this.hlinkMouseOver;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class NoFillOrSolidFillOrGradFillModel {
    private final Integer type;

    private final Object value;

    public NoFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private NoFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoFillOrSolidFillOrGradFillModel newNoFill(CTNoFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(0, value);
    }

    public Boolean isNoFill() {
      return this.type == 0;
    }

    public CTNoFillPropertiesModel getNoFill() {
      return (CTNoFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newSolidFill(
        CTSolidColorFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(1, value);
    }

    public Boolean isSolidFill() {
      return this.type == 1;
    }

    public CTSolidColorFillPropertiesModel getSolidFill() {
      return (CTSolidColorFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGradFill(
        CTGradientFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(2, value);
    }

    public Boolean isGradFill() {
      return this.type == 2;
    }

    public CTGradientFillPropertiesModel getGradFill() {
      return (CTGradientFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newBlipFill(CTBlipFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public Boolean isBlipFill() {
      return this.type == 3;
    }

    public CTBlipFillPropertiesModel getBlipFill() {
      return (CTBlipFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newPattFill(CTPatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(4, value);
    }

    public Boolean isPattFill() {
      return this.type == 4;
    }

    public CTPatternFillPropertiesModel getPattFill() {
      return (CTPatternFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGrpFill(CTGroupFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(5, value);
    }

    public Boolean isGrpFill() {
      return this.type == 5;
    }

    public CTGroupFillPropertiesModel getGrpFill() {
      return (CTGroupFillPropertiesModel) this.value;
    }
  }

  public static class EffectLstOrEffectDagModel {
    private final Integer type;

    private final Object value;

    public EffectLstOrEffectDagModel() {
      this(-1, null);
    }

    private EffectLstOrEffectDagModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectLstOrEffectDagModel newEffectLst(CTEffectListModel value) {
      return new EffectLstOrEffectDagModel(0, value);
    }

    public Boolean isEffectLst() {
      return this.type == 0;
    }

    public CTEffectListModel getEffectLst() {
      return (CTEffectListModel) this.value;
    }

    public static EffectLstOrEffectDagModel newEffectDag(CTEffectContainerModel value) {
      return new EffectLstOrEffectDagModel(1, value);
    }

    public Boolean isEffectDag() {
      return this.type == 1;
    }

    public CTEffectContainerModel getEffectDag() {
      return (CTEffectContainerModel) this.value;
    }
  }

  public static class ULnTxOrULnModel {
    private final Integer type;

    private final Object value;

    public ULnTxOrULnModel() {
      this(-1, null);
    }

    private ULnTxOrULnModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ULnTxOrULnModel newULnTx(CTTextUnderlineLineFollowTextModel value) {
      return new ULnTxOrULnModel(0, value);
    }

    public Boolean isULnTx() {
      return this.type == 0;
    }

    public CTTextUnderlineLineFollowTextModel getULnTx() {
      return (CTTextUnderlineLineFollowTextModel) this.value;
    }

    public static ULnTxOrULnModel newULn(CTLinePropertiesModel value) {
      return new ULnTxOrULnModel(1, value);
    }

    public Boolean isULn() {
      return this.type == 1;
    }

    public CTLinePropertiesModel getULn() {
      return (CTLinePropertiesModel) this.value;
    }
  }

  public static class UFillTxOrUFillModel {
    private final Integer type;

    private final Object value;

    public UFillTxOrUFillModel() {
      this(-1, null);
    }

    private UFillTxOrUFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static UFillTxOrUFillModel newUFillTx(CTTextUnderlineFillFollowTextModel value) {
      return new UFillTxOrUFillModel(0, value);
    }

    public Boolean isUFillTx() {
      return this.type == 0;
    }

    public CTTextUnderlineFillFollowTextModel getUFillTx() {
      return (CTTextUnderlineFillFollowTextModel) this.value;
    }

    public static UFillTxOrUFillModel newUFill(CTTextUnderlineFillGroupWrapperModel value) {
      return new UFillTxOrUFillModel(1, value);
    }

    public Boolean isUFill() {
      return this.type == 1;
    }

    public CTTextUnderlineFillGroupWrapperModel getUFill() {
      return (CTTextUnderlineFillGroupWrapperModel) this.value;
    }
  }
}
