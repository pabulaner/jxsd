package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_LinePropertiesModel {
  private final ST_LineWidthModel w;

  private final ST_LineCapModel cap;

  private final ST_CompoundLineModel cmpd;

  private final ST_PenAlignmentModel algn;

  private final EG_LineFillPropertiesModel egLineFillProperties;

  private final EG_LineDashPropertiesModel egLineDashProperties;

  private final EG_LineJoinPropertiesModel egLineJoinProperties;

  private final CT_LineEndPropertiesModel headEnd;

  private final CT_LineEndPropertiesModel tailEnd;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_LinePropertiesModel(ST_LineWidthModel w, ST_LineCapModel cap, ST_CompoundLineModel cmpd,
      ST_PenAlignmentModel algn, EG_LineFillPropertiesModel egLineFillProperties,
      EG_LineDashPropertiesModel egLineDashProperties,
      EG_LineJoinPropertiesModel egLineJoinProperties, CT_LineEndPropertiesModel headEnd,
      CT_LineEndPropertiesModel tailEnd, CT_OfficeArtExtensionListModel extLst) {
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

  public ST_LineWidthModel getW() {
    return this.w;
  }

  public ST_LineCapModel getCap() {
    return this.cap;
  }

  public ST_CompoundLineModel getCmpd() {
    return this.cmpd;
  }

  public ST_PenAlignmentModel getAlgn() {
    return this.algn;
  }

  public EG_LineFillPropertiesModel getEGLineFillProperties() {
    return this.egLineFillProperties;
  }

  public EG_LineDashPropertiesModel getEGLineDashProperties() {
    return this.egLineDashProperties;
  }

  public EG_LineJoinPropertiesModel getEGLineJoinProperties() {
    return this.egLineJoinProperties;
  }

  public CT_LineEndPropertiesModel getHeadEnd() {
    return this.headEnd;
  }

  public CT_LineEndPropertiesModel getTailEnd() {
    return this.tailEnd;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class EG_LineFillPropertiesModel {
    private final int type;

    private final Object value;

    public EG_LineFillPropertiesModel() {
      this(-1, null);
    }

    private EG_LineFillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_LineFillPropertiesModel newNoFill(CT_NoFillPropertiesModel value) {
      return new EG_LineFillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static EG_LineFillPropertiesModel newSolidFill(CT_SolidColorFillPropertiesModel value) {
      return new EG_LineFillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static EG_LineFillPropertiesModel newGradFill(CT_GradientFillPropertiesModel value) {
      return new EG_LineFillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static EG_LineFillPropertiesModel newPattFill(CT_PatternFillPropertiesModel value) {
      return new EG_LineFillPropertiesModel(3, value);
    }

    public boolean isPattFill() {
      return this.type == 3;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }
  }

  public static class EG_LineDashPropertiesModel {
    private final int type;

    private final Object value;

    public EG_LineDashPropertiesModel() {
      this(-1, null);
    }

    private EG_LineDashPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_LineDashPropertiesModel newPrstDash(CT_PresetLineDashPropertiesModel value) {
      return new EG_LineDashPropertiesModel(0, value);
    }

    public boolean isPrstDash() {
      return this.type == 0;
    }

    public CT_PresetLineDashPropertiesModel getPrstDash() {
      return (CT_PresetLineDashPropertiesModel) this.value;
    }

    public static EG_LineDashPropertiesModel newCustDash(CT_DashStopListModel value) {
      return new EG_LineDashPropertiesModel(1, value);
    }

    public boolean isCustDash() {
      return this.type == 1;
    }

    public CT_DashStopListModel getCustDash() {
      return (CT_DashStopListModel) this.value;
    }
  }

  public static class EG_LineJoinPropertiesModel {
    private final int type;

    private final Object value;

    public EG_LineJoinPropertiesModel() {
      this(-1, null);
    }

    private EG_LineJoinPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_LineJoinPropertiesModel newRound(CT_LineJoinRoundModel value) {
      return new EG_LineJoinPropertiesModel(0, value);
    }

    public boolean isRound() {
      return this.type == 0;
    }

    public CT_LineJoinRoundModel getRound() {
      return (CT_LineJoinRoundModel) this.value;
    }

    public static EG_LineJoinPropertiesModel newBevel(CT_LineJoinBevelModel value) {
      return new EG_LineJoinPropertiesModel(1, value);
    }

    public boolean isBevel() {
      return this.type == 1;
    }

    public CT_LineJoinBevelModel getBevel() {
      return (CT_LineJoinBevelModel) this.value;
    }

    public static EG_LineJoinPropertiesModel newMiter(CT_LineJoinMiterPropertiesModel value) {
      return new EG_LineJoinPropertiesModel(2, value);
    }

    public boolean isMiter() {
      return this.type == 2;
    }

    public CT_LineJoinMiterPropertiesModel getMiter() {
      return (CT_LineJoinMiterPropertiesModel) this.value;
    }
  }
}
