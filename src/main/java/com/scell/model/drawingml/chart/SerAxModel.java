package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class SerAxModel {
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

  private final CrossesOrCrossesAtModel crossesOrCrossesAt;

  private final SkipModel tickLblSkip;

  private final SkipModel tickMarkSkip;

  private final ExtensionListModel extLst;

  public SerAxModel(UnsignedIntModel axId, ScalingModel scaling, BooleanModel delete,
      AxPosModel axPos, ChartLinesModel majorGridlines, ChartLinesModel minorGridlines,
      TitleModel title, NumFmtModel numFmt, TickMarkModel majorTickMark,
      TickMarkModel minorTickMark, TickLblPosModel tickLblPos, ShapePropertiesModel spPr,
      TextBodyModel txPr, UnsignedIntModel crossAx, CrossesOrCrossesAtModel crossesOrCrossesAt,
      SkipModel tickLblSkip, SkipModel tickMarkSkip, ExtensionListModel extLst) {
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
    this.tickLblSkip = tickLblSkip;
    this.tickMarkSkip = tickMarkSkip;
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

  public CrossesOrCrossesAtModel getCrossesOrCrossesAt() {
    return this.crossesOrCrossesAt;
  }

  public SkipModel getTickLblSkip() {
    return this.tickLblSkip;
  }

  public SkipModel getTickMarkSkip() {
    return this.tickMarkSkip;
  }

  public ExtensionListModel getExtLst() {
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

    public static CrossesOrCrossesAtModel newCrosses(CrossesModel value) {
      return new CrossesOrCrossesAtModel(0, value);
    }

    public boolean isCrosses() {
      return this.type == 0;
    }

    public CrossesModel getCrosses() {
      return (CrossesModel) this.value;
    }

    public static CrossesOrCrossesAtModel newCrossesAt(DoubleModel value) {
      return new CrossesOrCrossesAtModel(1, value);
    }

    public boolean isCrossesAt() {
      return this.type == 1;
    }

    public DoubleModel getCrossesAt() {
      return (DoubleModel) this.value;
    }
  }
}
