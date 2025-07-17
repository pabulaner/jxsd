package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxPosModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_CrossesModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.chart.CT_ScalingModel;
import com.scell.model.drawingml.chart.CT_SerAxModel;
import com.scell.model.drawingml.chart.CT_SkipModel;
import com.scell.model.drawingml.chart.CT_TickLblPosModel;
import com.scell.model.drawingml.chart.CT_TickMarkModel;
import com.scell.model.drawingml.chart.CT_TitleModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;

public class CT_SerAxBuilder {
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

  private CT_SerAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt;

  private CT_SkipModel tickLblSkip;

  private CT_SkipModel tickMarkSkip;

  private CT_ExtensionListModel extLst;

  public CT_SerAxBuilder() {
  }

  public CT_SerAxBuilder setAxId(CT_UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public CT_SerAxBuilder setScaling(CT_ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public CT_SerAxBuilder setDelete(CT_BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public CT_SerAxBuilder setAxPos(CT_AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public CT_SerAxBuilder setMajorGridlines(CT_ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public CT_SerAxBuilder setMinorGridlines(CT_ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public CT_SerAxBuilder setTitle(CT_TitleModel title) {
    this.title = title;
    return this;
  }

  public CT_SerAxBuilder setNumFmt(CT_NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public CT_SerAxBuilder setMajorTickMark(CT_TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public CT_SerAxBuilder setMinorTickMark(CT_TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public CT_SerAxBuilder setTickLblPos(CT_TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public CT_SerAxBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_SerAxBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_SerAxBuilder setCrossAx(CT_UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public CT_SerAxBuilder setCrossesOrCrossesAt(
      CT_SerAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public CT_SerAxBuilder setTickLblSkip(CT_SkipModel tickLblSkip) {
    this.tickLblSkip = tickLblSkip;
    return this;
  }

  public CT_SerAxBuilder setTickMarkSkip(CT_SkipModel tickMarkSkip) {
    this.tickMarkSkip = tickMarkSkip;
    return this;
  }

  public CT_SerAxBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_SerAxModel build() {
    return new CT_SerAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.tickLblSkip, this.tickMarkSkip, this.extLst);
  }

  public CT_SerAxBuilder from(CT_SerAxModel value) {
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

    public CT_SerAxModel.CrossesOrCrossesAtModel build() {
      if (this.type == -1) return new CT_SerAxModel.CrossesOrCrossesAtModel();
      if (this.type == 0) return CT_SerAxModel.CrossesOrCrossesAtModel.newCrosses((CT_CrossesModel) this.value);
      if (this.type == 1) return CT_SerAxModel.CrossesOrCrossesAtModel.newCrossesAt((CT_DoubleModel) this.value);
      return null;
    }

    public CrossesOrCrossesAtBuilder from(CT_SerAxModel.CrossesOrCrossesAtModel value) {
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
