package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.AxPosModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.CatAxModel;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.CrossesModel;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LblAlgnModel;
import jxsd.gen.model.drawingml.chart.LblOffsetModel;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import jxsd.gen.model.drawingml.chart.ScalingModel;
import jxsd.gen.model.drawingml.chart.SkipModel;
import jxsd.gen.model.drawingml.chart.TickLblPosModel;
import jxsd.gen.model.drawingml.chart.TickMarkModel;
import jxsd.gen.model.drawingml.chart.TitleModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class CatAxBuilder {
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

  private CatAxModel.CrossesOrCrossesAt crossesOrCrossesAt;

  private BooleanModel auto;

  private LblAlgnModel lblAlgn;

  private LblOffsetModel lblOffset;

  private SkipModel tickLblSkip;

  private SkipModel tickMarkSkip;

  private BooleanModel noMultiLvlLbl;

  private ExtensionListModel extLst;

  public CatAxBuilder() {
  }

  public CatAxBuilder setAxId(UnsignedIntModel axId) {
    this.axId = axId;
    return this;
  }

  public CatAxBuilder setScaling(ScalingModel scaling) {
    this.scaling = scaling;
    return this;
  }

  public CatAxBuilder setDelete(BooleanModel delete) {
    this.delete = delete;
    return this;
  }

  public CatAxBuilder setAxPos(AxPosModel axPos) {
    this.axPos = axPos;
    return this;
  }

  public CatAxBuilder setMajorGridlines(ChartLinesModel majorGridlines) {
    this.majorGridlines = majorGridlines;
    return this;
  }

  public CatAxBuilder setMinorGridlines(ChartLinesModel minorGridlines) {
    this.minorGridlines = minorGridlines;
    return this;
  }

  public CatAxBuilder setTitle(TitleModel title) {
    this.title = title;
    return this;
  }

  public CatAxBuilder setNumFmt(NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public CatAxBuilder setMajorTickMark(TickMarkModel majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

  public CatAxBuilder setMinorTickMark(TickMarkModel minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

  public CatAxBuilder setTickLblPos(TickLblPosModel tickLblPos) {
    this.tickLblPos = tickLblPos;
    return this;
  }

  public CatAxBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CatAxBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CatAxBuilder setCrossAx(UnsignedIntModel crossAx) {
    this.crossAx = crossAx;
    return this;
  }

  public CatAxBuilder setCrossesOrCrossesAt(CatAxModel.CrossesOrCrossesAt crossesOrCrossesAt) {
    this.crossesOrCrossesAt = crossesOrCrossesAt;
    return this;
  }

  public CatAxBuilder setAuto(BooleanModel auto) {
    this.auto = auto;
    return this;
  }

  public CatAxBuilder setLblAlgn(LblAlgnModel lblAlgn) {
    this.lblAlgn = lblAlgn;
    return this;
  }

  public CatAxBuilder setLblOffset(LblOffsetModel lblOffset) {
    this.lblOffset = lblOffset;
    return this;
  }

  public CatAxBuilder setTickLblSkip(SkipModel tickLblSkip) {
    this.tickLblSkip = tickLblSkip;
    return this;
  }

  public CatAxBuilder setTickMarkSkip(SkipModel tickMarkSkip) {
    this.tickMarkSkip = tickMarkSkip;
    return this;
  }

  public CatAxBuilder setNoMultiLvlLbl(BooleanModel noMultiLvlLbl) {
    this.noMultiLvlLbl = noMultiLvlLbl;
    return this;
  }

  public CatAxBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CatAxBuilder from(CatAxModel value) {
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
    this.lblAlgn = value.getLblAlgn();
    this.lblOffset = value.getLblOffset();
    this.tickLblSkip = value.getTickLblSkip();
    this.tickMarkSkip = value.getTickMarkSkip();
    this.noMultiLvlLbl = value.getNoMultiLvlLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public CatAxModel build() {
    return new CatAxModel(this.axId, this.scaling, this.delete, this.axPos, this.majorGridlines, this.minorGridlines, this.title, this.numFmt, this.majorTickMark, this.minorTickMark, this.tickLblPos, this.spPr, this.txPr, this.crossAx, this.crossesOrCrossesAt, this.auto, this.lblAlgn, this.lblOffset, this.tickLblSkip, this.tickMarkSkip, this.noMultiLvlLbl, this.extLst);
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

    public CrossesOrCrossesAt from(CatAxModel.CrossesOrCrossesAt value) {
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

    public CatAxModel.CrossesOrCrossesAt build() {
      if (this.type == -1) return new CatAxModel.CrossesOrCrossesAt();
      if (this.type == 0) return CatAxModel.CrossesOrCrossesAt.newCrosses((CrossesModel) this.value);
      if (this.type == 1) return CatAxModel.CrossesOrCrossesAt.newCrossesAt((DoubleModel) this.value);
      return null;
    }
  }
}
