package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import java.lang.Integer;
import java.lang.Object;

public class TextCharacterPropertiesModel {
  private final TextStrikeTypeModel strike;

  private final BooleanModel noProof;

  private final StringModel bmk;

  private final PercentageModel baseline;

  private final BooleanModel dirty;

  private final BooleanModel smtClean;

  private final BooleanModel err;

  private final BooleanModel kumimoji;

  private final BooleanModel b;

  private final BooleanModel i;

  private final TextLanguageIDModel lang;

  private final TextFontSizeModel sz;

  private final UnsignedIntModel smtId;

  private final BooleanModel normalizeH;

  private final TextUnderlineTypeModel u;

  private final TextNonNegativePointModel kern;

  private final TextCapsTypeModel cap;

  private final TextLanguageIDModel altLang;

  private final TextPointModel spc;

  private final LinePropertiesModel ln;

  private final FillPropertiesModel egFillProperties;

  private final EffectPropertiesModel egEffectProperties;

  private final ColorModel highlight;

  private final TextUnderlineLineModel egTextUnderlineLine;

  private final TextUnderlineFillModel egTextUnderlineFill;

  private final TextFontModel latin;

  private final TextFontModel ea;

  private final TextFontModel cs;

  private final TextFontModel sym;

  private final HyperlinkModel hlinkClick;

  private final HyperlinkModel hlinkMouseOver;

  private final OfficeArtExtensionListModel extLst;

  public TextCharacterPropertiesModel(TextStrikeTypeModel strike, BooleanModel noProof,
      StringModel bmk, PercentageModel baseline, BooleanModel dirty, BooleanModel smtClean,
      BooleanModel err, BooleanModel kumimoji, BooleanModel b, BooleanModel i,
      TextLanguageIDModel lang, TextFontSizeModel sz, UnsignedIntModel smtId,
      BooleanModel normalizeH, TextUnderlineTypeModel u, TextNonNegativePointModel kern,
      TextCapsTypeModel cap, TextLanguageIDModel altLang, TextPointModel spc,
      LinePropertiesModel ln, FillPropertiesModel egFillProperties,
      EffectPropertiesModel egEffectProperties, ColorModel highlight,
      TextUnderlineLineModel egTextUnderlineLine, TextUnderlineFillModel egTextUnderlineFill,
      TextFontModel latin, TextFontModel ea, TextFontModel cs, TextFontModel sym,
      HyperlinkModel hlinkClick, HyperlinkModel hlinkMouseOver,
      OfficeArtExtensionListModel extLst) {
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

  public TextStrikeTypeModel getStrike() {
    return this.strike;
  }

  public BooleanModel getNoProof() {
    return this.noProof;
  }

  public StringModel getBmk() {
    return this.bmk;
  }

  public PercentageModel getBaseline() {
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

  public TextLanguageIDModel getLang() {
    return this.lang;
  }

  public TextFontSizeModel getSz() {
    return this.sz;
  }

  public UnsignedIntModel getSmtId() {
    return this.smtId;
  }

  public BooleanModel getNormalizeH() {
    return this.normalizeH;
  }

  public TextUnderlineTypeModel getU() {
    return this.u;
  }

  public TextNonNegativePointModel getKern() {
    return this.kern;
  }

  public TextCapsTypeModel getCap() {
    return this.cap;
  }

  public TextLanguageIDModel getAltLang() {
    return this.altLang;
  }

  public TextPointModel getSpc() {
    return this.spc;
  }

  public LinePropertiesModel getLn() {
    return this.ln;
  }

  public FillPropertiesModel getEGFillProperties() {
    return this.egFillProperties;
  }

  public EffectPropertiesModel getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public ColorModel getHighlight() {
    return this.highlight;
  }

  public TextUnderlineLineModel getEGTextUnderlineLine() {
    return this.egTextUnderlineLine;
  }

  public TextUnderlineFillModel getEGTextUnderlineFill() {
    return this.egTextUnderlineFill;
  }

  public TextFontModel getLatin() {
    return this.latin;
  }

  public TextFontModel getEa() {
    return this.ea;
  }

  public TextFontModel getCs() {
    return this.cs;
  }

  public TextFontModel getSym() {
    return this.sym;
  }

  public HyperlinkModel getHlinkClick() {
    return this.hlinkClick;
  }

  public HyperlinkModel getHlinkMouseOver() {
    return this.hlinkMouseOver;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class FillPropertiesModel {
    private final int type;

    private final Object value;

    public FillPropertiesModel() {
      this(-1, null);
    }

    private FillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static FillPropertiesModel newNoFill(NoFillPropertiesModel value) {
      return new FillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newSolidFill(SolidColorFillPropertiesModel value) {
      return new FillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newGradFill(GradientFillPropertiesModel value) {
      return new FillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newBlipFill(BlipFillPropertiesModel value) {
      return new FillPropertiesModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public BlipFillPropertiesModel getBlipFill() {
      return (BlipFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newPattFill(PatternFillPropertiesModel value) {
      return new FillPropertiesModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newGrpFill(GroupFillPropertiesModel value) {
      return new FillPropertiesModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public GroupFillPropertiesModel getGrpFill() {
      return (GroupFillPropertiesModel) this.value;
    }
  }

  public static class EffectPropertiesModel {
    private final int type;

    private final Object value;

    public EffectPropertiesModel() {
      this(-1, null);
    }

    private EffectPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectPropertiesModel newEffectLst(EffectListModel value) {
      return new EffectPropertiesModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public EffectListModel getEffectLst() {
      return (EffectListModel) this.value;
    }

    public static EffectPropertiesModel newEffectDag(EffectContainerModel value) {
      return new EffectPropertiesModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public EffectContainerModel getEffectDag() {
      return (EffectContainerModel) this.value;
    }
  }

  public static class TextUnderlineLineModel {
    private final int type;

    private final Object value;

    public TextUnderlineLineModel() {
      this(-1, null);
    }

    private TextUnderlineLineModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextUnderlineLineModel newULnTx(TextUnderlineLineFollowTextModel value) {
      return new TextUnderlineLineModel(0, value);
    }

    public boolean isULnTx() {
      return this.type == 0;
    }

    public TextUnderlineLineFollowTextModel getULnTx() {
      return (TextUnderlineLineFollowTextModel) this.value;
    }

    public static TextUnderlineLineModel newULn(LinePropertiesModel value) {
      return new TextUnderlineLineModel(1, value);
    }

    public boolean isULn() {
      return this.type == 1;
    }

    public LinePropertiesModel getULn() {
      return (LinePropertiesModel) this.value;
    }
  }

  public static class TextUnderlineFillModel {
    private final int type;

    private final Object value;

    public TextUnderlineFillModel() {
      this(-1, null);
    }

    private TextUnderlineFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextUnderlineFillModel newUFillTx(TextUnderlineFillFollowTextModel value) {
      return new TextUnderlineFillModel(0, value);
    }

    public boolean isUFillTx() {
      return this.type == 0;
    }

    public TextUnderlineFillFollowTextModel getUFillTx() {
      return (TextUnderlineFillFollowTextModel) this.value;
    }

    public static TextUnderlineFillModel newUFill(TextUnderlineFillGroupWrapperModel value) {
      return new TextUnderlineFillModel(1, value);
    }

    public boolean isUFill() {
      return this.type == 1;
    }

    public TextUnderlineFillGroupWrapperModel getUFill() {
      return (TextUnderlineFillGroupWrapperModel) this.value;
    }
  }
}
