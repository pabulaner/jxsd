package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.XMLSchema.UnsignedIntValueModel;
import java.lang.Integer;
import java.lang.Object;

public class TextCharacterPropertiesModel {
  private final TextStrikeTypeValueModel strike;

  private final BooleanValueModel noProof;

  private final StringValueModel bmk;

  private final PercentageValueModel baseline;

  private final BooleanValueModel dirty;

  private final BooleanValueModel smtClean;

  private final BooleanValueModel err;

  private final BooleanValueModel kumimoji;

  private final BooleanValueModel b;

  private final BooleanValueModel i;

  private final TextLanguageIDValueModel lang;

  private final TextFontSizeValueModel sz;

  private final UnsignedIntValueModel smtId;

  private final BooleanValueModel normalizeH;

  private final TextUnderlineTypeValueModel u;

  private final TextNonNegativePointValueModel kern;

  private final TextCapsTypeValueModel cap;

  private final TextLanguageIDValueModel altLang;

  private final TextPointValueModel spc;

  private final LinePropertiesModel ln;

  private final FillPropertiesModel egFillProperties;

  private final EffectPropertiesModel egEffectProperties;

  private final ColorModel highlight;

  private final TextUnderlineLineModel egTextUnderlineLine;

  private final TextUnderlineFillModel egTextUnderlineFill;

  private final TextFontValueModel latin;

  private final TextFontValueModel ea;

  private final TextFontValueModel cs;

  private final TextFontValueModel sym;

  private final HyperlinkModel hlinkClick;

  private final HyperlinkModel hlinkMouseOver;

  private final OfficeArtExtensionListModel extLst;

  public TextCharacterPropertiesModel(TextStrikeTypeValueModel strike, BooleanValueModel noProof,
      StringValueModel bmk, PercentageValueModel baseline, BooleanValueModel dirty,
      BooleanValueModel smtClean, BooleanValueModel err, BooleanValueModel kumimoji,
      BooleanValueModel b, BooleanValueModel i, TextLanguageIDValueModel lang,
      TextFontSizeValueModel sz, UnsignedIntValueModel smtId, BooleanValueModel normalizeH,
      TextUnderlineTypeValueModel u, TextNonNegativePointValueModel kern,
      TextCapsTypeValueModel cap, TextLanguageIDValueModel altLang, TextPointValueModel spc,
      LinePropertiesModel ln, FillPropertiesModel egFillProperties,
      EffectPropertiesModel egEffectProperties, ColorModel highlight,
      TextUnderlineLineModel egTextUnderlineLine, TextUnderlineFillModel egTextUnderlineFill,
      TextFontValueModel latin, TextFontValueModel ea, TextFontValueModel cs,
      TextFontValueModel sym, HyperlinkModel hlinkClick, HyperlinkModel hlinkMouseOver,
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

  public TextStrikeTypeValueModel getStrike() {
    return this.strike;
  }

  public BooleanValueModel getNoProof() {
    return this.noProof;
  }

  public StringValueModel getBmk() {
    return this.bmk;
  }

  public PercentageValueModel getBaseline() {
    return this.baseline;
  }

  public BooleanValueModel getDirty() {
    return this.dirty;
  }

  public BooleanValueModel getSmtClean() {
    return this.smtClean;
  }

  public BooleanValueModel getErr() {
    return this.err;
  }

  public BooleanValueModel getKumimoji() {
    return this.kumimoji;
  }

  public BooleanValueModel getB() {
    return this.b;
  }

  public BooleanValueModel getI() {
    return this.i;
  }

  public TextLanguageIDValueModel getLang() {
    return this.lang;
  }

  public TextFontSizeValueModel getSz() {
    return this.sz;
  }

  public UnsignedIntValueModel getSmtId() {
    return this.smtId;
  }

  public BooleanValueModel getNormalizeH() {
    return this.normalizeH;
  }

  public TextUnderlineTypeValueModel getU() {
    return this.u;
  }

  public TextNonNegativePointValueModel getKern() {
    return this.kern;
  }

  public TextCapsTypeValueModel getCap() {
    return this.cap;
  }

  public TextLanguageIDValueModel getAltLang() {
    return this.altLang;
  }

  public TextPointValueModel getSpc() {
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

  public TextFontValueModel getLatin() {
    return this.latin;
  }

  public TextFontValueModel getEa() {
    return this.ea;
  }

  public TextFontValueModel getCs() {
    return this.cs;
  }

  public TextFontValueModel getSym() {
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
