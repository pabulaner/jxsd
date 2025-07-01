package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTLinePropertiesModel {
  private final STLineWidthModel w;

  private final STLineCapModel cap;

  private final STCompoundLineModel cmpd;

  private final STPenAlignmentModel algn;

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final PrstDashOrCustDashModel prstDashOrCustDash;

  private final RoundOrBevelOrMiterModel roundOrBevelOrMiter;

  private final CTLineEndPropertiesModel headEnd;

  private final CTLineEndPropertiesModel tailEnd;

  private final CTOfficeArtExtensionListModel extLst;

  public CTLinePropertiesModel(STLineWidthModel w, STLineCapModel cap, STCompoundLineModel cmpd,
      STPenAlignmentModel algn, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      PrstDashOrCustDashModel prstDashOrCustDash, RoundOrBevelOrMiterModel roundOrBevelOrMiter,
      CTLineEndPropertiesModel headEnd, CTLineEndPropertiesModel tailEnd,
      CTOfficeArtExtensionListModel extLst) {
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

  public STLineWidthModel getW() {
    return this.w;
  }

  public STLineCapModel getCap() {
    return this.cap;
  }

  public STCompoundLineModel getCmpd() {
    return this.cmpd;
  }

  public STPenAlignmentModel getAlgn() {
    return this.algn;
  }

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public PrstDashOrCustDashModel getPrstDashOrCustDash() {
    return this.prstDashOrCustDash;
  }

  public RoundOrBevelOrMiterModel getRoundOrBevelOrMiter() {
    return this.roundOrBevelOrMiter;
  }

  public CTLineEndPropertiesModel getHeadEnd() {
    return this.headEnd;
  }

  public CTLineEndPropertiesModel getTailEnd() {
    return this.tailEnd;
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

    public static NoFillOrSolidFillOrGradFillModel newPattFill(CTPatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public Boolean isPattFill() {
      return this.type == 3;
    }

    public CTPatternFillPropertiesModel getPattFill() {
      return (CTPatternFillPropertiesModel) this.value;
    }
  }

  public static class PrstDashOrCustDashModel {
    private final Integer type;

    private final Object value;

    public PrstDashOrCustDashModel() {
      this(-1, null);
    }

    private PrstDashOrCustDashModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static PrstDashOrCustDashModel newPrstDash(CTPresetLineDashPropertiesModel value) {
      return new PrstDashOrCustDashModel(0, value);
    }

    public Boolean isPrstDash() {
      return this.type == 0;
    }

    public CTPresetLineDashPropertiesModel getPrstDash() {
      return (CTPresetLineDashPropertiesModel) this.value;
    }

    public static PrstDashOrCustDashModel newCustDash(CTDashStopListModel value) {
      return new PrstDashOrCustDashModel(1, value);
    }

    public Boolean isCustDash() {
      return this.type == 1;
    }

    public CTDashStopListModel getCustDash() {
      return (CTDashStopListModel) this.value;
    }
  }

  public static class RoundOrBevelOrMiterModel {
    private final Integer type;

    private final Object value;

    public RoundOrBevelOrMiterModel() {
      this(-1, null);
    }

    private RoundOrBevelOrMiterModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static RoundOrBevelOrMiterModel newRound(CTLineJoinRoundModel value) {
      return new RoundOrBevelOrMiterModel(0, value);
    }

    public Boolean isRound() {
      return this.type == 0;
    }

    public CTLineJoinRoundModel getRound() {
      return (CTLineJoinRoundModel) this.value;
    }

    public static RoundOrBevelOrMiterModel newBevel(CTLineJoinBevelModel value) {
      return new RoundOrBevelOrMiterModel(1, value);
    }

    public Boolean isBevel() {
      return this.type == 1;
    }

    public CTLineJoinBevelModel getBevel() {
      return (CTLineJoinBevelModel) this.value;
    }

    public static RoundOrBevelOrMiterModel newMiter(CTLineJoinMiterPropertiesModel value) {
      return new RoundOrBevelOrMiterModel(2, value);
    }

    public Boolean isMiter() {
      return this.type == 2;
    }

    public CTLineJoinMiterPropertiesModel getMiter() {
      return (CTLineJoinMiterPropertiesModel) this.value;
    }
  }
}
