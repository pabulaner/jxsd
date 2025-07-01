package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTDateAxModel {
  private final CTUnsignedIntModel axId;

  private final CTScalingModel scaling;

  private final CTBooleanModel delete;

  private final CTAxPosModel axPos;

  private final CTChartLinesModel majorGridlines;

  private final CTChartLinesModel minorGridlines;

  private final CTTitleModel title;

  private final CTNumFmtModel numFmt;

  private final CTTickMarkModel majorTickMark;

  private final CTTickMarkModel minorTickMark;

  private final CTTickLblPosModel tickLblPos;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  private final CTUnsignedIntModel crossAx;

  private final CrossesOrCrossesAtModel crossesOrCrossesAt;

  private final CTBooleanModel auto;

  private final CTLblOffsetModel lblOffset;

  private final CTTimeUnitModel baseTimeUnit;

  private final CTAxisUnitModel majorUnit;

  private final CTTimeUnitModel majorTimeUnit;

  private final CTAxisUnitModel minorUnit;

  private final CTTimeUnitModel minorTimeUnit;

  private final CTExtensionListModel extLst;

  public CTDateAxModel(CTUnsignedIntModel axId, CTScalingModel scaling, CTBooleanModel delete,
      CTAxPosModel axPos, CTChartLinesModel majorGridlines, CTChartLinesModel minorGridlines,
      CTTitleModel title, CTNumFmtModel numFmt, CTTickMarkModel majorTickMark,
      CTTickMarkModel minorTickMark, CTTickLblPosModel tickLblPos, CTShapePropertiesModel spPr,
      CTTextBodyModel txPr, CTUnsignedIntModel crossAx, CrossesOrCrossesAtModel crossesOrCrossesAt,
      CTBooleanModel auto, CTLblOffsetModel lblOffset, CTTimeUnitModel baseTimeUnit,
      CTAxisUnitModel majorUnit, CTTimeUnitModel majorTimeUnit, CTAxisUnitModel minorUnit,
      CTTimeUnitModel minorTimeUnit, CTExtensionListModel extLst) {
    this.axId = axId;
    this.scaling = scaling;
    this.delete = delete;
    this.axPos = axPos;
    this.majorGridlines = majorGridlines;
    this.minorGridlines = minorGridlines;
    this.title = title;
    this.numFmt = numFmt;
    this.majorTickMark = majorTickMark;
    this.minorTickMark = minorTickMark;
    this.tickLblPos = tickLblPos;
    this.spPr = spPr;
    this.txPr = txPr;
    this.crossAx = crossAx;
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    this.auto = auto;
    this.lblOffset = lblOffset;
    this.baseTimeUnit = baseTimeUnit;
    this.majorUnit = majorUnit;
    this.majorTimeUnit = majorTimeUnit;
    this.minorUnit = minorUnit;
    this.minorTimeUnit = minorTimeUnit;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTScalingModel getScaling() {
    return this.scaling;
  }

  public CTBooleanModel getDelete() {
    return this.delete;
  }

  public CTAxPosModel getAxPos() {
    return this.axPos;
  }

  public CTChartLinesModel getMajorGridlines() {
    return this.majorGridlines;
  }

  public CTChartLinesModel getMinorGridlines() {
    return this.minorGridlines;
  }

  public CTTitleModel getTitle() {
    return this.title;
  }

  public CTNumFmtModel getNumFmt() {
    return this.numFmt;
  }

  public CTTickMarkModel getMajorTickMark() {
    return this.majorTickMark;
  }

  public CTTickMarkModel getMinorTickMark() {
    return this.minorTickMark;
  }

  public CTTickLblPosModel getTickLblPos() {
    return this.tickLblPos;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyModel getTxPr() {
    return this.txPr;
  }

  public CTUnsignedIntModel getCrossAx() {
    return this.crossAx;
  }

  public CrossesOrCrossesAtModel getCrossesOrCrossesAt() {
    return this.crossesOrCrossesAt;
  }

  public CTBooleanModel getAuto() {
    return this.auto;
  }

  public CTLblOffsetModel getLblOffset() {
    return this.lblOffset;
  }

  public CTTimeUnitModel getBaseTimeUnit() {
    return this.baseTimeUnit;
  }

  public CTAxisUnitModel getMajorUnit() {
    return this.majorUnit;
  }

  public CTTimeUnitModel getMajorTimeUnit() {
    return this.majorTimeUnit;
  }

  public CTAxisUnitModel getMinorUnit() {
    return this.minorUnit;
  }

  public CTTimeUnitModel getMinorTimeUnit() {
    return this.minorTimeUnit;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class CrossesOrCrossesAtModel {
    private final Integer type;

    private final Object value;

    public CrossesOrCrossesAtModel() {
      this(-1, null);
    }

    private CrossesOrCrossesAtModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CrossesOrCrossesAtModel newCrosses(CTCrossesModel value) {
      return new CrossesOrCrossesAtModel(0, value);
    }

    public Boolean isCrosses() {
      return this.type == 0;
    }

    public CTCrossesModel getCrosses() {
      return (CTCrossesModel) this.value;
    }

    public static CrossesOrCrossesAtModel newCrossesAt(CTDoubleModel value) {
      return new CrossesOrCrossesAtModel(1, value);
    }

    public Boolean isCrossesAt() {
      return this.type == 1;
    }

    public CTDoubleModel getCrossesAt() {
      return (CTDoubleModel) this.value;
    }
  }
}
