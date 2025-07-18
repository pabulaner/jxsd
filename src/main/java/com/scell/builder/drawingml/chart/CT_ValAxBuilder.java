package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxPosModel;
import com.scell.model.drawingml.chart.CT_AxisUnitModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_CrossBetweenModel;
import com.scell.model.drawingml.chart.CT_CrossesModel;
import com.scell.model.drawingml.chart.CT_DispUnitsModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.chart.CT_ScalingModel;
import com.scell.model.drawingml.chart.CT_TickLblPosModel;
import com.scell.model.drawingml.chart.CT_TickMarkModel;
import com.scell.model.drawingml.chart.CT_TitleModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_ValAxModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;

public class CT_ValAxBuilder {
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

  private CT_ValAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt;

  private CT_CrossBetweenModel crossBetween;

  private CT_AxisUnitModel majorUnit;

  private CT_AxisUnitModel minorUnit;

  private CT_DispUnitsModel dispUnits;

  private CT_ExtensionListModel extLst;

  public CT_ValAxBuilder() {
  }

  public CT_ValAxBuilder setAxId(CT_UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public CT_ValAxBuilder setScaling(CT_ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public CT_ValAxBuilder setDelete(CT_BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public CT_ValAxBuilder setAxPos(CT_AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public CT_ValAxBuilder setMajorGridlines(CT_ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public CT_ValAxBuilder setMinorGridlines(CT_ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public CT_ValAxBuilder setTitle(CT_TitleModel title) {
    this.title = title;
    return this;
  }

  public CT_ValAxBuilder setNumFmt(CT_NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public CT_ValAxBuilder setMajorTickMark(CT_TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public CT_ValAxBuilder setMinorTickMark(CT_TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public CT_ValAxBuilder setTickLblPos(CT_TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public CT_ValAxBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ValAxBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_ValAxBuilder setCrossAx(CT_UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public CT_ValAxBuilder setCrossesOrCrossesAt(
      CT_ValAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public CT_ValAxBuilder setCrossBetween(CT_CrossBetweenModel crossBetween) {
    this.crossBetween = crossBetween;
    return this;
  }

  public CT_ValAxBuilder setMajorUnit(CT_AxisUnitModel majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

  public CT_ValAxBuilder setMinorUnit(CT_AxisUnitModel minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

  public CT_ValAxBuilder setDispUnits(CT_DispUnitsModel dispUnits) {
    this.dispUnits = dispUnits;
    return this;
  }

  public CT_ValAxBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ValAxModel build() {
    return new CT_ValAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.crossBetween, this.majorUnit, this.minorUnit, this.dispUnits, this.extLst);
  }

  public CT_ValAxBuilder from(CT_ValAxModel value) {
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

    public CT_ValAxModel.CrossesOrCrossesAtModel build() {
      if (this.type == -1) return new CT_ValAxModel.CrossesOrCrossesAtModel();
      if (this.type == 0) return CT_ValAxModel.CrossesOrCrossesAtModel.newCrosses((CT_CrossesModel) this.value);
      if (this.type == 1) return CT_ValAxModel.CrossesOrCrossesAtModel.newCrossesAt((CT_DoubleModel) this.value);
      return null;
    }

    public CrossesOrCrossesAtBuilder from(CT_ValAxModel.CrossesOrCrossesAtModel value) {
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
