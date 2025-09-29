package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.AxPosModel;
import jxsd.gen.model.drawingml.chart.AxisUnitModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.CrossesModel;
import jxsd.gen.model.drawingml.chart.DateAxModel;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LblOffsetModel;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import jxsd.gen.model.drawingml.chart.ScalingModel;
import jxsd.gen.model.drawingml.chart.TickLblPosModel;
import jxsd.gen.model.drawingml.chart.TickMarkModel;
import jxsd.gen.model.drawingml.chart.TimeUnitModel;
import jxsd.gen.model.drawingml.chart.TitleModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DateAxBuilder {
  private UnsignedIntModel axId;

  private ScalingModel scaling;

  private BooleanModel delete;

  private AxPosModel axPos;

  private ChartLinesModel majorGridlines;

  private ChartLinesModel minorGridlines;

  private TitleModel title;

  private NumFmtModel numFmt;

  private TickMarkModel majorTickMark;

  private TickMarkModel minorTickMark;

  private TickLblPosModel tickLblPos;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private UnsignedIntModel crossAx;

  private DateAxModel.CrossesOrCrossesAt crossesOrCrossesAt;

  private BooleanModel auto;

  private LblOffsetModel lblOffset;

  private TimeUnitModel baseTimeUnit;

  private AxisUnitModel majorUnit;

  private TimeUnitModel majorTimeUnit;

  private AxisUnitModel minorUnit;

  private TimeUnitModel minorTimeUnit;

  private ExtensionListModel extLst;

  public DateAxBuilder() {
  }

  public DateAxBuilder setAxId(UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public DateAxBuilder setScaling(ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public DateAxBuilder setDelete(BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public DateAxBuilder setAxPos(AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public DateAxBuilder setMajorGridlines(ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public DateAxBuilder setMinorGridlines(ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public DateAxBuilder setTitle(TitleModel title) {
    this.title = title;
    return this;
  }

  public DateAxBuilder setNumFmt(NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public DateAxBuilder setMajorTickMark(TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public DateAxBuilder setMinorTickMark(TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public DateAxBuilder setTickLblPos(TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public DateAxBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public DateAxBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public DateAxBuilder setCrossAx(UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public DateAxBuilder setCrossesOrCrossesAt(DateAxModel.CrossesOrCrossesAt crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public DateAxBuilder setAuto(BooleanModel auto) {
    this.auto = auto;
    return this;
  }

  public DateAxBuilder setLblOffset(LblOffsetModel lblOffset) {
    this.lblOffset = lblOffset;
    return this;
  }

  public DateAxBuilder setBaseTimeUnit(TimeUnitModel baseTimeUnit) {
    this.baseTimeUnit = baseTimeUnit;
    return this;
  }

  public DateAxBuilder setMajorUnit(AxisUnitModel majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

  public DateAxBuilder setMajorTimeUnit(TimeUnitModel majorTimeUnit) {
    this.majorTimeUnit = majorTimeUnit;
    return this;
  }

  public DateAxBuilder setMinorUnit(AxisUnitModel minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

  public DateAxBuilder setMinorTimeUnit(TimeUnitModel minorTimeUnit) {
    this.minorTimeUnit = minorTimeUnit;
    return this;
  }

  public DateAxBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DateAxBuilder from(DateAxModel value) {
    this.axId = value.getAxId();
    this.scaling = value.getScaling();
    this.delete = value.getDelete();
    this.axPos = value.getAxPos();
    this.majorGridlines = value.getMajorGridlines();
    this.minorGridlines = value.getMinorGridlines();
    this.title = value.getTitle();
    this.numFmt = value.getNumFmt();
    this.majorTickMark = value.getMajorTickMark();
    this.minorTickMark = value.getMinorTickMark();
    this.tickLblPos = value.getTickLblPos();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.crossAx = value.getCrossAx();
    this.crossesOrCrossesAt = value.getCrossesOrCrossesAt();
    this.auto = value.getAuto();
    this.lblOffset = value.getLblOffset();
    this.baseTimeUnit = value.getBaseTimeUnit();
    this.majorUnit = value.getMajorUnit();
    this.majorTimeUnit = value.getMajorTimeUnit();
    this.minorUnit = value.getMinorUnit();
    this.minorTimeUnit = value.getMinorTimeUnit();
    this.extLst = value.getExtLst();
    return this;
  }

  public DateAxModel build() {
    return new DateAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.auto, this.lblOffset, this.baseTimeUnit, this.majorUnit, this.majorTimeUnit, this.minorUnit, this.minorTimeUnit, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class CrossesOrCrossesAt {
    private int type;

    private Object value;

    public CrossesOrCrossesAt() {
      this.type = -1;
      this.value = null;
    }

    public CrossesOrCrossesAt setCrosses(CrossesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CrossesOrCrossesAt setCrossesAt(DoubleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CrossesOrCrossesAt from(DateAxModel.CrossesOrCrossesAt value) {
      this.type = -1;
      this.value = null;
      if (value.isCrosses()) {
        this.type = 0;
        this.value = value.getCrosses();
      }
      if (value.isCrossesAt()) {
        this.type = 1;
        this.value = value.getCrossesAt();
      }
      return this;
    }

    public DateAxModel.CrossesOrCrossesAt build() {
      if (this.type == -1) return new DateAxModel.CrossesOrCrossesAt();
      if (this.type == 0) return DateAxModel.CrossesOrCrossesAt.newCrosses((CrossesModel) this.value);
      if (this.type == 1) return DateAxModel.CrossesOrCrossesAt.newCrossesAt((DoubleModel) this.value);
      return null;
    }
  }
}
