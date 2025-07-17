package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxPosModel;
import com.scell.model.drawingml.chart.CT_AxisUnitModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_CrossesModel;
import com.scell.model.drawingml.chart.CT_DateAxModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LblOffsetModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.chart.CT_ScalingModel;
import com.scell.model.drawingml.chart.CT_TickLblPosModel;
import com.scell.model.drawingml.chart.CT_TickMarkModel;
import com.scell.model.drawingml.chart.CT_TimeUnitModel;
import com.scell.model.drawingml.chart.CT_TitleModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;

public class CT_DateAxBuilder {
  private CT_UnsignedIntModel axId;

  private CT_ScalingModel scaling;

  private CT_BooleanModel delete;

  private CT_AxPosModel axPos;

  private CT_ChartLinesModel majorGridlines;

  private CT_ChartLinesModel minorGridlines;

  private CT_TitleModel title;

  private CT_NumFmtModel numFmt;

  private CT_TickMarkModel majorTickMark;

  private CT_TickMarkModel minorTickMark;

  private CT_TickLblPosModel tickLblPos;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_UnsignedIntModel crossAx;

  private CT_DateAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt;

  private CT_BooleanModel auto;

  private CT_LblOffsetModel lblOffset;

  private CT_TimeUnitModel baseTimeUnit;

  private CT_AxisUnitModel majorUnit;

  private CT_TimeUnitModel majorTimeUnit;

  private CT_AxisUnitModel minorUnit;

  private CT_TimeUnitModel minorTimeUnit;

  private CT_ExtensionListModel extLst;

  public CT_DateAxBuilder() {
  }

  public CT_DateAxBuilder setAxId(CT_UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public CT_DateAxBuilder setScaling(CT_ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public CT_DateAxBuilder setDelete(CT_BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public CT_DateAxBuilder setAxPos(CT_AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public CT_DateAxBuilder setMajorGridlines(CT_ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public CT_DateAxBuilder setMinorGridlines(CT_ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public CT_DateAxBuilder setTitle(CT_TitleModel title) {
    this.title = title;
    return this;
  }

  public CT_DateAxBuilder setNumFmt(CT_NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public CT_DateAxBuilder setMajorTickMark(CT_TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public CT_DateAxBuilder setMinorTickMark(CT_TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public CT_DateAxBuilder setTickLblPos(CT_TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public CT_DateAxBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_DateAxBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_DateAxBuilder setCrossAx(CT_UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public CT_DateAxBuilder setCrossesOrCrossesAt(
      CT_DateAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public CT_DateAxBuilder setAuto(CT_BooleanModel auto) {
    this.auto = auto;
    return this;
  }

  public CT_DateAxBuilder setLblOffset(CT_LblOffsetModel lblOffset) {
    this.lblOffset = lblOffset;
    return this;
  }

  public CT_DateAxBuilder setBaseTimeUnit(CT_TimeUnitModel baseTimeUnit) {
    this.baseTimeUnit = baseTimeUnit;
    return this;
  }

  public CT_DateAxBuilder setMajorUnit(CT_AxisUnitModel majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

  public CT_DateAxBuilder setMajorTimeUnit(CT_TimeUnitModel majorTimeUnit) {
    this.majorTimeUnit = majorTimeUnit;
    return this;
  }

  public CT_DateAxBuilder setMinorUnit(CT_AxisUnitModel minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

  public CT_DateAxBuilder setMinorTimeUnit(CT_TimeUnitModel minorTimeUnit) {
    this.minorTimeUnit = minorTimeUnit;
    return this;
  }

  public CT_DateAxBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DateAxModel build() {
    return new CT_DateAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.auto, this.lblOffset, this.baseTimeUnit, this.majorUnit, this.majorTimeUnit, this.minorUnit, this.minorTimeUnit, this.extLst);
  }

  public CT_DateAxBuilder from(CT_DateAxModel value) {
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

  public static class CrossesOrCrossesAtBuilder {
    private int type;

    private Object value;

    public CrossesOrCrossesAtBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CrossesOrCrossesAtBuilder setCrosses(CT_CrossesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CrossesOrCrossesAtBuilder setCrossesAt(CT_DoubleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_DateAxModel.CrossesOrCrossesAtModel build() {
      if (this.type == -1) return new CT_DateAxModel.CrossesOrCrossesAtModel();
      if (this.type == 0) return CT_DateAxModel.CrossesOrCrossesAtModel.newCrosses((CT_CrossesModel) this.value);
      if (this.type == 1) return CT_DateAxModel.CrossesOrCrossesAtModel.newCrossesAt((CT_DoubleModel) this.value);
      return null;
    }

    public CrossesOrCrossesAtBuilder from(CT_DateAxModel.CrossesOrCrossesAtModel value) {
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
