package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.TextCharacterPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class TextCharacterPropertiesModel {
  private final TextStrikeTypeValueModel strike;

  private final boolean noProof;

  private final String bmk;

  private final int baseline;

  private final boolean dirty;

  private final boolean smtClean;

  private final boolean err;

  private final boolean kumimoji;

  private final boolean b;

  private final boolean i;

  private final String lang;

  private final int sz;

  private final long smtId;

  private final boolean normalizeH;

  private final TextUnderlineTypeValueModel u;

  private final int kern;

  private final TextCapsTypeValueModel cap;

  private final String altLang;

  private final int spc;

  private final LinePropertiesModel ln;

  private final EG_FillProperties egFillProperties;

  private final EG_EffectProperties egEffectProperties;

  private final ColorModel highlight;

  private final EG_TextUnderlineLine egTextUnderlineLine;

  private final EG_TextUnderlineFill egTextUnderlineFill;

  private final TextFontValueModel latin;

  private final TextFontValueModel ea;

  private final TextFontValueModel cs;

  private final TextFontValueModel sym;

  private final HyperlinkModel hlinkClick;

  private final HyperlinkModel hlinkMouseOver;

  private final OfficeArtExtensionListModel extLst;

  public TextCharacterPropertiesModel(TextStrikeTypeValueModel strike, boolean noProof, String bmk,
      int baseline, boolean dirty, boolean smtClean, boolean err, boolean kumimoji, boolean b,
      boolean i, String lang, int sz, long smtId, boolean normalizeH, TextUnderlineTypeValueModel u,
      int kern, TextCapsTypeValueModel cap, String altLang, int spc, LinePropertiesModel ln,
      EG_FillProperties egFillProperties, EG_EffectProperties egEffectProperties,
      ColorModel highlight, EG_TextUnderlineLine egTextUnderlineLine,
      EG_TextUnderlineFill egTextUnderlineFill, TextFontValueModel latin, TextFontValueModel ea,
      TextFontValueModel cs, TextFontValueModel sym, HyperlinkModel hlinkClick,
      HyperlinkModel hlinkMouseOver, OfficeArtExtensionListModel extLst) {
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

  public TextCharacterPropertiesBuilder builder() {
    return new TextCharacterPropertiesBuilder().from(this);
  }

  public TextStrikeTypeValueModel getStrike() {
    return this.strike;
  }

  public boolean getNoProof() {
    return this.noProof;
  }

  public String getBmk() {
    return this.bmk;
  }

  public int getBaseline() {
    return this.baseline;
  }

  public boolean getDirty() {
    return this.dirty;
  }

  public boolean getSmtClean() {
    return this.smtClean;
  }

  public boolean getErr() {
    return this.err;
  }

  public boolean getKumimoji() {
    return this.kumimoji;
  }

  public boolean getB() {
    return this.b;
  }

  public boolean getI() {
    return this.i;
  }

  public String getLang() {
    return this.lang;
  }

  public int getSz() {
    return this.sz;
  }

  public long getSmtId() {
    return this.smtId;
  }

  public boolean getNormalizeH() {
    return this.normalizeH;
  }

  public TextUnderlineTypeValueModel getU() {
    return this.u;
  }

  public int getKern() {
    return this.kern;
  }

  public TextCapsTypeValueModel getCap() {
    return this.cap;
  }

  public String getAltLang() {
    return this.altLang;
  }

  public int getSpc() {
    return this.spc;
  }

  public LinePropertiesModel getLn() {
    return this.ln;
  }

  public EG_FillProperties getEGFillProperties() {
    return this.egFillProperties;
  }

  public EG_EffectProperties getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public ColorModel getHighlight() {
    return this.highlight;
  }

  public EG_TextUnderlineLine getEGTextUnderlineLine() {
    return this.egTextUnderlineLine;
  }

  public EG_TextUnderlineFill getEGTextUnderlineFill() {
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

  /**
   * This is a generated choice class.
   */
  public static class EG_FillProperties {
    private final int type;

    private final Object value;

    public EG_FillProperties() {
      this(-1, null);
    }

    private EG_FillProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextCharacterPropertiesBuilder.EG_FillProperties builder() {
      return new TextCharacterPropertiesBuilder.EG_FillProperties().from(this);
    }

    public static EG_FillProperties newNoFill(NoFillPropertiesModel value) {
      return new EG_FillProperties(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newSolidFill(SolidColorFillPropertiesModel value) {
      return new EG_FillProperties(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newGradFill(GradientFillPropertiesModel value) {
      return new EG_FillProperties(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newBlipFill(BlipFillPropertiesModel value) {
      return new EG_FillProperties(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public BlipFillPropertiesModel getBlipFill() {
      return (BlipFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newPattFill(PatternFillPropertiesModel value) {
      return new EG_FillProperties(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newGrpFill(GroupFillPropertiesModel value) {
      return new EG_FillProperties(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public GroupFillPropertiesModel getGrpFill() {
      return (GroupFillPropertiesModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_EffectProperties {
    private final int type;

    private final Object value;

    public EG_EffectProperties() {
      this(-1, null);
    }

    private EG_EffectProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextCharacterPropertiesBuilder.EG_EffectProperties builder() {
      return new TextCharacterPropertiesBuilder.EG_EffectProperties().from(this);
    }

    public static EG_EffectProperties newEffectLst(EffectListModel value) {
      return new EG_EffectProperties(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public EffectListModel getEffectLst() {
      return (EffectListModel) this.value;
    }

    public static EG_EffectProperties newEffectDag(EffectContainerModel value) {
      return new EG_EffectProperties(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public EffectContainerModel getEffectDag() {
      return (EffectContainerModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextUnderlineLine {
    private final int type;

    private final Object value;

    public EG_TextUnderlineLine() {
      this(-1, null);
    }

    private EG_TextUnderlineLine(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextCharacterPropertiesBuilder.EG_TextUnderlineLine builder() {
      return new TextCharacterPropertiesBuilder.EG_TextUnderlineLine().from(this);
    }

    public static EG_TextUnderlineLine newULnTx(TextUnderlineLineFollowTextModel value) {
      return new EG_TextUnderlineLine(0, value);
    }

    public boolean isULnTx() {
      return this.type == 0;
    }

    public TextUnderlineLineFollowTextModel getULnTx() {
      return (TextUnderlineLineFollowTextModel) this.value;
    }

    public static EG_TextUnderlineLine newULn(LinePropertiesModel value) {
      return new EG_TextUnderlineLine(1, value);
    }

    public boolean isULn() {
      return this.type == 1;
    }

    public LinePropertiesModel getULn() {
      return (LinePropertiesModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextUnderlineFill {
    private final int type;

    private final Object value;

    public EG_TextUnderlineFill() {
      this(-1, null);
    }

    private EG_TextUnderlineFill(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextCharacterPropertiesBuilder.EG_TextUnderlineFill builder() {
      return new TextCharacterPropertiesBuilder.EG_TextUnderlineFill().from(this);
    }

    public static EG_TextUnderlineFill newUFillTx(TextUnderlineFillFollowTextModel value) {
      return new EG_TextUnderlineFill(0, value);
    }

    public boolean isUFillTx() {
      return this.type == 0;
    }

    public TextUnderlineFillFollowTextModel getUFillTx() {
      return (TextUnderlineFillFollowTextModel) this.value;
    }

    public static EG_TextUnderlineFill newUFill(TextUnderlineFillGroupWrapperModel value) {
      return new EG_TextUnderlineFill(1, value);
    }

    public boolean isUFill() {
      return this.type == 1;
    }

    public TextUnderlineFillGroupWrapperModel getUFill() {
      return (TextUnderlineFillGroupWrapperModel) this.value;
    }
  }
}
