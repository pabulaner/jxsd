package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.AxPosModel;
import jxsd.gen.model.drawingml.chart.AxisUnitModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.CrossBetweenModel;
import jxsd.gen.model.drawingml.chart.CrossesModel;
import jxsd.gen.model.drawingml.chart.DispUnitsModel;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import jxsd.gen.model.drawingml.chart.ScalingModel;
import jxsd.gen.model.drawingml.chart.TickLblPosModel;
import jxsd.gen.model.drawingml.chart.TickMarkModel;
import jxsd.gen.model.drawingml.chart.TitleModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.chart.ValAxModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class ValAxBuilder {
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

  private ValAxModel.CrossesOrCrossesAt crossesOrCrossesAt;

  private CrossBetweenModel crossBetween;

  private AxisUnitModel majorUnit;

  private AxisUnitModel minorUnit;

  private DispUnitsModel dispUnits;

  private ExtensionListModel extLst;

  public ValAxBuilder() {
  }

  public ValAxBuilder setAxId(UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public ValAxBuilder setScaling(ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public ValAxBuilder setDelete(BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public ValAxBuilder setAxPos(AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public ValAxBuilder setMajorGridlines(ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public ValAxBuilder setMinorGridlines(ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public ValAxBuilder setTitle(TitleModel title) {
    this.title = title;
    return this;
  }

  public ValAxBuilder setNumFmt(NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public ValAxBuilder setMajorTickMark(TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public ValAxBuilder setMinorTickMark(TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public ValAxBuilder setTickLblPos(TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public ValAxBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ValAxBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public ValAxBuilder setCrossAx(UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public ValAxBuilder setCrossesOrCrossesAt(ValAxModel.CrossesOrCrossesAt crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public ValAxBuilder setCrossBetween(CrossBetweenModel crossBetween) {
    this.crossBetween = crossBetween;
    return this;
  }

  public ValAxBuilder setMajorUnit(AxisUnitModel majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

  public ValAxBuilder setMinorUnit(AxisUnitModel minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

  public ValAxBuilder setDispUnits(DispUnitsModel dispUnits) {
    this.dispUnits = dispUnits;
    return this;
  }

  public ValAxBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ValAxBuilder from(ValAxModel value) {
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
    this.crossBetween = value.getCrossBetween();
    this.majorUnit = value.getMajorUnit();
    this.minorUnit = value.getMinorUnit();
    this.dispUnits = value.getDispUnits();
    this.extLst = value.getExtLst();
    return this;
  }

  public ValAxModel build() {
    return new ValAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.crossBetween, this.majorUnit, this.minorUnit, this.dispUnits, this.extLst);
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

    public CrossesOrCrossesAt from(ValAxModel.CrossesOrCrossesAt value) {
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

    public ValAxModel.CrossesOrCrossesAt build() {
      if (this.type == -1) return new ValAxModel.CrossesOrCrossesAt();
      if (this.type == 0) return ValAxModel.CrossesOrCrossesAt.newCrosses((CrossesModel) this.value);
      if (this.type == 1) return ValAxModel.CrossesOrCrossesAt.newCrossesAt((DoubleModel) this.value);
      return null;
    }
  }
}
