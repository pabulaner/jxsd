package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_CatAxModel {
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

  private final CT_LblAlgnModel lblAlgn;

  private final CT_LblOffsetModel lblOffset;

  private final CT_SkipModel tickLblSkip;

  private final CT_SkipModel tickMarkSkip;

  private final CT_BooleanModel noMultiLvlLbl;

  private final CT_ExtensionListModel extLst;

  public CT_CatAxModel(CT_UnsignedIntModel axId, CT_ScalingModel scaling, CT_BooleanModel delete,
      CT_AxPosModel axPos, CT_ChartLinesModel majorGridlines, CT_ChartLinesModel minorGridlines,
      CT_TitleModel title, CT_NumFmtModel numFmt, CT_TickMarkModel majorTickMark,
      CT_TickMarkModel minorTickMark, CT_TickLblPosModel tickLblPos, CT_ShapePropertiesModel spPr,
      CT_TextBodyModel txPr, CT_UnsignedIntModel crossAx,
      CrossesOrCrossesAtModel crossesOrCrossesAt, CT_BooleanModel auto, CT_LblAlgnModel lblAlgn,
      CT_LblOffsetModel lblOffset, CT_SkipModel tickLblSkip, CT_SkipModel tickMarkSkip,
      CT_BooleanModel noMultiLvlLbl, CT_ExtensionListModel extLst) {
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
    this.lblAlgn = lblAlgn;
    this.lblOffset = lblOffset;
    this.tickLblSkip = tickLblSkip;
    this.tickMarkSkip = tickMarkSkip;
    this.noMultiLvlLbl = noMultiLvlLbl;
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

  public CT_LblAlgnModel getLblAlgn() {
    return this.lblAlgn;
  }

  public CT_LblOffsetModel getLblOffset() {
    return this.lblOffset;
  }

  public CT_SkipModel getTickLblSkip() {
    return this.tickLblSkip;
  }

  public CT_SkipModel getTickMarkSkip() {
    return this.tickMarkSkip;
  }

  public CT_BooleanModel getNoMultiLvlLbl() {
    return this.noMultiLvlLbl;
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
