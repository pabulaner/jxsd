package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxPosModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.CrossesModel;
import com.scell.model.drawingml.chart.DoubleModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumFmtModel;
import com.scell.model.drawingml.chart.ScalingModel;
import com.scell.model.drawingml.chart.SerAxModel;
import com.scell.model.drawingml.chart.SkipModel;
import com.scell.model.drawingml.chart.TickLblPosModel;
import com.scell.model.drawingml.chart.TickMarkModel;
import com.scell.model.drawingml.chart.TitleModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Object;

public class SerAxBuilder {
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

  private SerAxModel.CrossesOrCrossesAtValueModel crossesOrCrossesAt;

  private SkipModel tickLblSkip;

  private SkipModel tickMarkSkip;

  private ExtensionListModel extLst;

  public SerAxBuilder() {
  }

  public SerAxBuilder setAxId(UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public SerAxBuilder setScaling(ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public SerAxBuilder setDelete(BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public SerAxBuilder setAxPos(AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public SerAxBuilder setMajorGridlines(ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public SerAxBuilder setMinorGridlines(ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public SerAxBuilder setTitle(TitleModel title) {
    this.title = title;
    return this;
  }

  public SerAxBuilder setNumFmt(NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public SerAxBuilder setMajorTickMark(TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public SerAxBuilder setMinorTickMark(TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public SerAxBuilder setTickLblPos(TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public SerAxBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public SerAxBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public SerAxBuilder setCrossAx(UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public SerAxBuilder setCrossesOrCrossesAt(
      SerAxModel.CrossesOrCrossesAtValueModel crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public SerAxBuilder setTickLblSkip(SkipModel tickLblSkip) {
    this.tickLblSkip = tickLblSkip;
    return this;
  }

  public SerAxBuilder setTickMarkSkip(SkipModel tickMarkSkip) {
    this.tickMarkSkip = tickMarkSkip;
    return this;
  }

  public SerAxBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public SerAxModel build() {
    return new SerAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.tickLblSkip, this.tickMarkSkip, this.extLst);
  }

  public SerAxBuilder from(SerAxModel value) {
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
    this.tickLblSkip = value.getTickLblSkip();
    this.tickMarkSkip = value.getTickMarkSkip();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class CrossesOrCrossesAtValueBuilder {
    private int type;

    private Object value;

    public CrossesOrCrossesAtValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CrossesOrCrossesAtValueBuilder setCrosses(CrossesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CrossesOrCrossesAtValueBuilder setCrossesAt(DoubleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public SerAxModel.CrossesOrCrossesAtValueModel build() {
      if (this.type == -1) return new SerAxModel.CrossesOrCrossesAtValueModel();
      if (this.type == 0) return SerAxModel.CrossesOrCrossesAtValueModel.newCrosses((CrossesModel) this.value);
      if (this.type == 1) return SerAxModel.CrossesOrCrossesAtValueModel.newCrossesAt((DoubleModel) this.value);
      return null;
    }

    public CrossesOrCrossesAtValueBuilder from(SerAxModel.CrossesOrCrossesAtValueModel value) {
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
  }
}
