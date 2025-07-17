package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_LinePropertiesModel {
  private final ST_LineWidthModel w;

  private final ST_LineCapModel cap;

  private final ST_CompoundLineModel cmpd;

  private final ST_PenAlignmentModel algn;

  private final noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final prstDashOrCustDashModel prstDashOrCustDash;

  private final roundOrBevelOrMiterModel roundOrBevelOrMiter;

  private final CT_LineEndPropertiesModel headEnd;

  private final CT_LineEndPropertiesModel tailEnd;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_LinePropertiesModel(ST_LineWidthModel w, ST_LineCapModel cap, ST_CompoundLineModel cmpd,
      ST_PenAlignmentModel algn, noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      prstDashOrCustDashModel prstDashOrCustDash, roundOrBevelOrMiterModel roundOrBevelOrMiter,
      CT_LineEndPropertiesModel headEnd, CT_LineEndPropertiesModel tailEnd,
      CT_OfficeArtExtensionListModel extLst) {
    this.w = w;
    this.cap = cap;
    this.cmpd = cmpd;
    this.algn = algn;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    this.prstDashOrCustDash = prstDashOrCustDash;
    this.roundOrBevelOrMiter = roundOrBevelOrMiter;
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

  public noFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public prstDashOrCustDashModel getPrstDashOrCustDash() {
    return this.prstDashOrCustDash;
  }

  public roundOrBevelOrMiterModel getRoundOrBevelOrMiter() {
    return this.roundOrBevelOrMiter;
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

    public static noFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isPattFill() {
      return this.type == 3;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }
  }

  public static class prstDashOrCustDashModel {
    private final int type;

    private final Object value;

    public prstDashOrCustDashModel() {
      this(-1, null);
    }

    private prstDashOrCustDashModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static prstDashOrCustDashModel newPrstDash(CT_PresetLineDashPropertiesModel value) {
      return new prstDashOrCustDashModel(0, value);
    }

    public boolean isPrstDash() {
      return this.type == 0;
    }

    public CT_PresetLineDashPropertiesModel getPrstDash() {
      return (CT_PresetLineDashPropertiesModel) this.value;
    }

    public static prstDashOrCustDashModel newCustDash(CT_DashStopListModel value) {
      return new prstDashOrCustDashModel(1, value);
    }

    public boolean isCustDash() {
      return this.type == 1;
    }

    public CT_DashStopListModel getCustDash() {
      return (CT_DashStopListModel) this.value;
    }
  }

  public static class roundOrBevelOrMiterModel {
    private final int type;

    private final Object value;

    public roundOrBevelOrMiterModel() {
      this(-1, null);
    }

    private roundOrBevelOrMiterModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static roundOrBevelOrMiterModel newRound(CT_LineJoinRoundModel value) {
      return new roundOrBevelOrMiterModel(0, value);
    }

    public boolean isRound() {
      return this.type == 0;
    }

    public CT_LineJoinRoundModel getRound() {
      return (CT_LineJoinRoundModel) this.value;
    }

    public static roundOrBevelOrMiterModel newBevel(CT_LineJoinBevelModel value) {
      return new roundOrBevelOrMiterModel(1, value);
    }

    public boolean isBevel() {
      return this.type == 1;
    }

    public CT_LineJoinBevelModel getBevel() {
      return (CT_LineJoinBevelModel) this.value;
    }

    public static roundOrBevelOrMiterModel newMiter(CT_LineJoinMiterPropertiesModel value) {
      return new roundOrBevelOrMiterModel(2, value);
    }

    public boolean isMiter() {
      return this.type == 2;
    }

    public CT_LineJoinMiterPropertiesModel getMiter() {
      return (CT_LineJoinMiterPropertiesModel) this.value;
    }
  }
}
