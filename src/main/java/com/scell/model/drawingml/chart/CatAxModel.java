package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CatAxModel {
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

  private final CrossesOrCrossesAtValueModel crossesOrCrossesAt;

  private final BooleanModel auto;

  private final LblAlgnModel lblAlgn;

  private final LblOffsetModel lblOffset;

  private final SkipModel tickLblSkip;

  private final SkipModel tickMarkSkip;

  private final BooleanModel noMultiLvlLbl;

  private final ExtensionListModel extLst;

  public CatAxModel(UnsignedIntModel axId, ScalingModel scaling, BooleanModel delete,
      AxPosModel axPos, ChartLinesModel majorGridlines, ChartLinesModel minorGridlines,
      TitleModel title, NumFmtModel numFmt, TickMarkModel majorTickMark,
      TickMarkModel minorTickMark, TickLblPosModel tickLblPos, ShapePropertiesModel spPr,
      TextBodyModel txPr, UnsignedIntModel crossAx, CrossesOrCrossesAtValueModel crossesOrCrossesAt,
      BooleanModel auto, LblAlgnModel lblAlgn, LblOffsetModel lblOffset, SkipModel tickLblSkip,
      SkipModel tickMarkSkip, BooleanModel noMultiLvlLbl, ExtensionListModel extLst) {
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

  public CrossesOrCrossesAtValueModel getCrossesOrCrossesAt() {
    return this.crossesOrCrossesAt;
  }

  public BooleanModel getAuto() {
    return this.auto;
  }

  public LblAlgnModel getLblAlgn() {
    return this.lblAlgn;
  }

  public LblOffsetModel getLblOffset() {
    return this.lblOffset;
  }

  public SkipModel getTickLblSkip() {
    return this.tickLblSkip;
  }

  public SkipModel getTickMarkSkip() {
    return this.tickMarkSkip;
  }

  public BooleanModel getNoMultiLvlLbl() {
    return this.noMultiLvlLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class CrossesOrCrossesAtValueModel {
    private final int type;

    private final Object value;

    public CrossesOrCrossesAtValueModel() {
      this(-1, null);
    }

    private CrossesOrCrossesAtValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CrossesOrCrossesAtValueModel newCrosses(CrossesModel value) {
      return new CrossesOrCrossesAtValueModel(0, value);
    }

    public boolean isCrosses() {
      return this.type == 0;
    }

    public CrossesModel getCrosses() {
      return (CrossesModel) this.value;
    }

    public static CrossesOrCrossesAtValueModel newCrossesAt(DoubleModel value) {
      return new CrossesOrCrossesAtValueModel(1, value);
    }

    public boolean isCrossesAt() {
      return this.type == 1;
    }

    public DoubleModel getCrossesAt() {
      return (DoubleModel) this.value;
    }
  }
}
