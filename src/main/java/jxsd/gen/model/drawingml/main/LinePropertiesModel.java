package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.LinePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class LinePropertiesModel {
  private final int w;

  private final LineCapValueModel cap;

  private final CompoundLineValueModel cmpd;

  private final PenAlignmentValueModel algn;

  private final EG_LineFillProperties egLineFillProperties;

  private final EG_LineDashProperties egLineDashProperties;

  private final EG_LineJoinProperties egLineJoinProperties;

  private final LineEndPropertiesModel headEnd;

  private final LineEndPropertiesModel tailEnd;

  private final OfficeArtExtensionListModel extLst;

  public LinePropertiesModel(int w, LineCapValueModel cap, CompoundLineValueModel cmpd,
      PenAlignmentValueModel algn, EG_LineFillProperties egLineFillProperties,
      EG_LineDashProperties egLineDashProperties, EG_LineJoinProperties egLineJoinProperties,
      LineEndPropertiesModel headEnd, LineEndPropertiesModel tailEnd,
      OfficeArtExtensionListModel extLst) {
    this.w = w;
    this.cap = cap;
    this.cmpd = cmpd;
    this.algn = algn;
    this.egLineFillProperties = egLineFillProperties;
    this.egLineDashProperties = egLineDashProperties;
    this.egLineJoinProperties = egLineJoinProperties;
    this.headEnd = headEnd;
    this.tailEnd = tailEnd;
    this.extLst = extLst;
  }

  public LinePropertiesBuilder builder() {
    return new LinePropertiesBuilder().from(this);
  }

  public int getW() {
    return this.w;
  }

  public LineCapValueModel getCap() {
    return this.cap;
  }

  public CompoundLineValueModel getCmpd() {
    return this.cmpd;
  }

  public PenAlignmentValueModel getAlgn() {
    return this.algn;
  }

  public EG_LineFillProperties getEGLineFillProperties() {
    return this.egLineFillProperties;
  }

  public EG_LineDashProperties getEGLineDashProperties() {
    return this.egLineDashProperties;
  }

  public EG_LineJoinProperties getEGLineJoinProperties() {
    return this.egLineJoinProperties;
  }

  public LineEndPropertiesModel getHeadEnd() {
    return this.headEnd;
  }

  public LineEndPropertiesModel getTailEnd() {
    return this.tailEnd;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_LineFillProperties {
    private final int type;

    private final Object value;

    public EG_LineFillProperties() {
      this(-1, null);
    }

    private EG_LineFillProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public LinePropertiesBuilder.EG_LineFillProperties builder() {
      return new LinePropertiesBuilder.EG_LineFillProperties().from(this);
    }

    public static EG_LineFillProperties newNoFill(NoFillPropertiesModel value) {
      return new EG_LineFillProperties(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static EG_LineFillProperties newSolidFill(SolidColorFillPropertiesModel value) {
      return new EG_LineFillProperties(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static EG_LineFillProperties newGradFill(GradientFillPropertiesModel value) {
      return new EG_LineFillProperties(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static EG_LineFillProperties newPattFill(PatternFillPropertiesModel value) {
      return new EG_LineFillProperties(3, value);
    }

    public boolean isPattFill() {
      return this.type == 3;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_LineDashProperties {
    private final int type;

    private final Object value;

    public EG_LineDashProperties() {
      this(-1, null);
    }

    private EG_LineDashProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public LinePropertiesBuilder.EG_LineDashProperties builder() {
      return new LinePropertiesBuilder.EG_LineDashProperties().from(this);
    }

    public static EG_LineDashProperties newPrstDash(PresetLineDashPropertiesModel value) {
      return new EG_LineDashProperties(0, value);
    }

    public boolean isPrstDash() {
      return this.type == 0;
    }

    public PresetLineDashPropertiesModel getPrstDash() {
      return (PresetLineDashPropertiesModel) this.value;
    }

    public static EG_LineDashProperties newCustDash(DashStopListModel value) {
      return new EG_LineDashProperties(1, value);
    }

    public boolean isCustDash() {
      return this.type == 1;
    }

    public DashStopListModel getCustDash() {
      return (DashStopListModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_LineJoinProperties {
    private final int type;

    private final Object value;

    public EG_LineJoinProperties() {
      this(-1, null);
    }

    private EG_LineJoinProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public LinePropertiesBuilder.EG_LineJoinProperties builder() {
      return new LinePropertiesBuilder.EG_LineJoinProperties().from(this);
    }

    public static EG_LineJoinProperties newRound(LineJoinRoundModel value) {
      return new EG_LineJoinProperties(0, value);
    }

    public boolean isRound() {
      return this.type == 0;
    }

    public LineJoinRoundModel getRound() {
      return (LineJoinRoundModel) this.value;
    }

    public static EG_LineJoinProperties newBevel(LineJoinBevelModel value) {
      return new EG_LineJoinProperties(1, value);
    }

    public boolean isBevel() {
      return this.type == 1;
    }

    public LineJoinBevelModel getBevel() {
      return (LineJoinBevelModel) this.value;
    }

    public static EG_LineJoinProperties newMiter(LineJoinMiterPropertiesModel value) {
      return new EG_LineJoinProperties(2, value);
    }

    public boolean isMiter() {
      return this.type == 2;
    }

    public LineJoinMiterPropertiesModel getMiter() {
      return (LineJoinMiterPropertiesModel) this.value;
    }
  }
}
