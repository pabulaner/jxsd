package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class LinePropertiesModel {
  private final LineWidthModel w;

  private final LineCapModel cap;

  private final CompoundLineModel cmpd;

  private final PenAlignmentModel algn;

  private final LineFillPropertiesModel egLineFillProperties;

  private final LineDashPropertiesModel egLineDashProperties;

  private final LineJoinPropertiesModel egLineJoinProperties;

  private final LineEndPropertiesModel headEnd;

  private final LineEndPropertiesModel tailEnd;

  private final OfficeArtExtensionListModel extLst;

  public LinePropertiesModel(LineWidthModel w, LineCapModel cap, CompoundLineModel cmpd,
      PenAlignmentModel algn, LineFillPropertiesModel egLineFillProperties,
      LineDashPropertiesModel egLineDashProperties, LineJoinPropertiesModel egLineJoinProperties,
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

  public LineWidthModel getW() {
    return this.w;
  }

  public LineCapModel getCap() {
    return this.cap;
  }

  public CompoundLineModel getCmpd() {
    return this.cmpd;
  }

  public PenAlignmentModel getAlgn() {
    return this.algn;
  }

  public LineFillPropertiesModel getEGLineFillProperties() {
    return this.egLineFillProperties;
  }

  public LineDashPropertiesModel getEGLineDashProperties() {
    return this.egLineDashProperties;
  }

  public LineJoinPropertiesModel getEGLineJoinProperties() {
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

  public static class LineFillPropertiesModel {
    private final int type;

    private final Object value;

    public LineFillPropertiesModel() {
      this(-1, null);
    }

    private LineFillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static LineFillPropertiesModel newNoFill(NoFillPropertiesModel value) {
      return new LineFillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static LineFillPropertiesModel newSolidFill(SolidColorFillPropertiesModel value) {
      return new LineFillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static LineFillPropertiesModel newGradFill(GradientFillPropertiesModel value) {
      return new LineFillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static LineFillPropertiesModel newPattFill(PatternFillPropertiesModel value) {
      return new LineFillPropertiesModel(3, value);
    }

    public boolean isPattFill() {
      return this.type == 3;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }
  }

  public static class LineDashPropertiesModel {
    private final int type;

    private final Object value;

    public LineDashPropertiesModel() {
      this(-1, null);
    }

    private LineDashPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static LineDashPropertiesModel newPrstDash(PresetLineDashPropertiesModel value) {
      return new LineDashPropertiesModel(0, value);
    }

    public boolean isPrstDash() {
      return this.type == 0;
    }

    public PresetLineDashPropertiesModel getPrstDash() {
      return (PresetLineDashPropertiesModel) this.value;
    }

    public static LineDashPropertiesModel newCustDash(DashStopListModel value) {
      return new LineDashPropertiesModel(1, value);
    }

    public boolean isCustDash() {
      return this.type == 1;
    }

    public DashStopListModel getCustDash() {
      return (DashStopListModel) this.value;
    }
  }

  public static class LineJoinPropertiesModel {
    private final int type;

    private final Object value;

    public LineJoinPropertiesModel() {
      this(-1, null);
    }

    private LineJoinPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static LineJoinPropertiesModel newRound(LineJoinRoundModel value) {
      return new LineJoinPropertiesModel(0, value);
    }

    public boolean isRound() {
      return this.type == 0;
    }

    public LineJoinRoundModel getRound() {
      return (LineJoinRoundModel) this.value;
    }

    public static LineJoinPropertiesModel newBevel(LineJoinBevelModel value) {
      return new LineJoinPropertiesModel(1, value);
    }

    public boolean isBevel() {
      return this.type == 1;
    }

    public LineJoinBevelModel getBevel() {
      return (LineJoinBevelModel) this.value;
    }

    public static LineJoinPropertiesModel newMiter(LineJoinMiterPropertiesModel value) {
      return new LineJoinPropertiesModel(2, value);
    }

    public boolean isMiter() {
      return this.type == 2;
    }

    public LineJoinMiterPropertiesModel getMiter() {
      return (LineJoinMiterPropertiesModel) this.value;
    }
  }
}
