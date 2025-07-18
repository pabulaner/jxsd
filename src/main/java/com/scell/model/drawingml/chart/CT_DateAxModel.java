package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_DateAxModel {
  private final CT_UnsignedIntModel axId;

  private final CT_ScalingModel scaling;

  private final CT_BooleanModel delete;

  private final CT_AxPosModel axPos;

  private final CT_ChartLinesModel majorGridlines;

  private final CT_ChartLinesModel minorGridlines;

  private final CT_TitleModel title;

  private final CT_NumFmtModel numFmt;

  private final CT_TickMarkModel majorTickMark;

  private final CT_TickMarkModel minorTickMark;

  private final CT_TickLblPosModel tickLblPos;

  private final CT_ShapePropertiesModel spPr;

  private final CT_TextBodyModel txPr;

  private final CT_UnsignedIntModel crossAx;

  private final CrossesOrCrossesAtModel crossesOrCrossesAt;

  private final CT_BooleanModel auto;

  private final CT_LblOffsetModel lblOffset;

  private final CT_TimeUnitModel baseTimeUnit;

  private final CT_AxisUnitModel majorUnit;

  private final CT_TimeUnitModel majorTimeUnit;

  private final CT_AxisUnitModel minorUnit;

  private final CT_TimeUnitModel minorTimeUnit;

  private final CT_ExtensionListModel extLst;

  public CT_DateAxModel(CT_UnsignedIntModel axId, CT_ScalingModel scaling, CT_BooleanModel delete,
      CT_AxPosModel axPos, CT_ChartLinesModel majorGridlines, CT_ChartLinesModel minorGridlines,
      CT_TitleModel title, CT_NumFmtModel numFmt, CT_TickMarkModel majorTickMark,
      CT_TickMarkModel minorTickMark, CT_TickLblPosModel tickLblPos, CT_ShapePropertiesModel spPr,
      CT_TextBodyModel txPr, CT_UnsignedIntModel crossAx,
      CrossesOrCrossesAtModel crossesOrCrossesAt, CT_BooleanModel auto, CT_LblOffsetModel lblOffset,
      CT_TimeUnitModel baseTimeUnit, CT_AxisUnitModel majorUnit, CT_TimeUnitModel majorTimeUnit,
      CT_AxisUnitModel minorUnit, CT_TimeUnitModel minorTimeUnit, CT_ExtensionListModel extLst) {
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

  public CT_UnsignedIntModel getAxId() {
    return this.axId;
  }

  public CT_ScalingModel getScaling() {
    return this.scaling;
  }

  public CT_BooleanModel getDelete() {
    return this.delete;
  }

  public CT_AxPosModel getAxPos() {
    return this.axPos;
  }

  public CT_ChartLinesModel getMajorGridlines() {
    return this.majorGridlines;
  }

  public CT_ChartLinesModel getMinorGridlines() {
    return this.minorGridlines;
  }

  public CT_TitleModel getTitle() {
    return this.title;
  }

  public CT_NumFmtModel getNumFmt() {
    return this.numFmt;
  }

  public CT_TickMarkModel getMajorTickMark() {
    return this.majorTickMark;
  }

  public CT_TickMarkModel getMinorTickMark() {
    return this.minorTickMark;
  }

  public CT_TickLblPosModel getTickLblPos() {
    return this.tickLblPos;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_TextBodyModel getTxPr() {
    return this.txPr;
  }

  public CT_UnsignedIntModel getCrossAx() {
    return this.crossAx;
  }

  public CrossesOrCrossesAtModel getCrossesOrCrossesAt() {
    return this.crossesOrCrossesAt;
  }

  public CT_BooleanModel getAuto() {
    return this.auto;
  }

  public CT_LblOffsetModel getLblOffset() {
    return this.lblOffset;
  }

  public CT_TimeUnitModel getBaseTimeUnit() {
    return this.baseTimeUnit;
  }

  public CT_AxisUnitModel getMajorUnit() {
    return this.majorUnit;
  }

  public CT_TimeUnitModel getMajorTimeUnit() {
    return this.majorTimeUnit;
  }

  public CT_AxisUnitModel getMinorUnit() {
    return this.minorUnit;
  }

  public CT_TimeUnitModel getMinorTimeUnit() {
    return this.minorTimeUnit;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class CrossesOrCrossesAtModel {
    private final int type;

    private final Object value;

    public CrossesOrCrossesAtModel() {
      this(-1, null);
    }

    private CrossesOrCrossesAtModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CrossesOrCrossesAtModel newCrosses(CT_CrossesModel value) {
      return new CrossesOrCrossesAtModel(0, value);
    }

    public boolean isCrosses() {
      return this.type == 0;
    }

    public CT_CrossesModel getCrosses() {
      return (CT_CrossesModel) this.value;
    }

    public static CrossesOrCrossesAtModel newCrossesAt(CT_DoubleModel value) {
      return new CrossesOrCrossesAtModel(1, value);
    }

    public boolean isCrossesAt() {
      return this.type == 1;
    }

    public CT_DoubleModel getCrossesAt() {
      return (CT_DoubleModel) this.value;
    }
  }
}
