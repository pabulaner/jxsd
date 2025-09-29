package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.DateAxBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DateAxModel {
  private final UnsignedIntModel axId;

  private final ScalingModel scaling;

  private final BooleanModel delete;

  private final AxPosModel axPos;

  private final ChartLinesModel majorGridlines;

  private final ChartLinesModel minorGridlines;

  private final TitleModel title;

  private final NumFmtModel numFmt;

  private final TickMarkModel majorTickMark;

  private final TickMarkModel minorTickMark;

  private final TickLblPosModel tickLblPos;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final UnsignedIntModel crossAx;

  private final CrossesOrCrossesAt crossesOrCrossesAt;

  private final BooleanModel auto;

  private final LblOffsetModel lblOffset;

  private final TimeUnitModel baseTimeUnit;

  private final AxisUnitModel majorUnit;

  private final TimeUnitModel majorTimeUnit;

  private final AxisUnitModel minorUnit;

  private final TimeUnitModel minorTimeUnit;

  private final ExtensionListModel extLst;

  public DateAxModel(UnsignedIntModel axId, ScalingModel scaling, BooleanModel delete,
      AxPosModel axPos, ChartLinesModel majorGridlines, ChartLinesModel minorGridlines,
      TitleModel title, NumFmtModel numFmt, TickMarkModel majorTickMark,
      TickMarkModel minorTickMark, TickLblPosModel tickLblPos, ShapePropertiesModel spPr,
      TextBodyModel txPr, UnsignedIntModel crossAx, CrossesOrCrossesAt crossesOrCrossesAt,
      BooleanModel auto, LblOffsetModel lblOffset, TimeUnitModel baseTimeUnit,
      AxisUnitModel majorUnit, TimeUnitModel majorTimeUnit, AxisUnitModel minorUnit,
      TimeUnitModel minorTimeUnit, ExtensionListModel extLst) {
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

  public DateAxBuilder builder() {
    return new DateAxBuilder().from(this);
  }

  public UnsignedIntModel getAxId() {
    return this.axId;
  }

  public ScalingModel getScaling() {
    return this.scaling;
  }

  public BooleanModel getDelete() {
    return this.delete;
  }

  public AxPosModel getAxPos() {
    return this.axPos;
  }

  public ChartLinesModel getMajorGridlines() {
    return this.majorGridlines;
  }

  public ChartLinesModel getMinorGridlines() {
    return this.minorGridlines;
  }

  public TitleModel getTitle() {
    return this.title;
  }

  public NumFmtModel getNumFmt() {
    return this.numFmt;
  }

  public TickMarkModel getMajorTickMark() {
    return this.majorTickMark;
  }

  public TickMarkModel getMinorTickMark() {
    return this.minorTickMark;
  }

  public TickLblPosModel getTickLblPos() {
    return this.tickLblPos;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyModel getTxPr() {
    return this.txPr;
  }

  public UnsignedIntModel getCrossAx() {
    return this.crossAx;
  }

  public CrossesOrCrossesAt getCrossesOrCrossesAt() {
    return this.crossesOrCrossesAt;
  }

  public BooleanModel getAuto() {
    return this.auto;
  }

  public LblOffsetModel getLblOffset() {
    return this.lblOffset;
  }

  public TimeUnitModel getBaseTimeUnit() {
    return this.baseTimeUnit;
  }

  public AxisUnitModel getMajorUnit() {
    return this.majorUnit;
  }

  public TimeUnitModel getMajorTimeUnit() {
    return this.majorTimeUnit;
  }

  public AxisUnitModel getMinorUnit() {
    return this.minorUnit;
  }

  public TimeUnitModel getMinorTimeUnit() {
    return this.minorTimeUnit;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class CrossesOrCrossesAt {
    private final int type;

    private final Object value;

    public CrossesOrCrossesAt() {
      this(-1, null);
    }

    private CrossesOrCrossesAt(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public DateAxBuilder.CrossesOrCrossesAt builder() {
      return new DateAxBuilder.CrossesOrCrossesAt().from(this);
    }

    public static CrossesOrCrossesAt newCrosses(CrossesModel value) {
      return new CrossesOrCrossesAt(0, value);
    }

    public boolean isCrosses() {
      return this.type == 0;
    }

    public CrossesModel getCrosses() {
      return (CrossesModel) this.value;
    }

    public static CrossesOrCrossesAt newCrossesAt(DoubleModel value) {
      return new CrossesOrCrossesAt(1, value);
    }

    public boolean isCrossesAt() {
      return this.type == 1;
    }

    public DoubleModel getCrossesAt() {
      return (DoubleModel) this.value;
    }
  }
}
