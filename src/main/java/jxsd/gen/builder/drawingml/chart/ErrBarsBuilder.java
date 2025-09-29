package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ErrBarTypeModel;
import jxsd.gen.model.drawingml.chart.ErrBarsModel;
import jxsd.gen.model.drawingml.chart.ErrDirModel;
import jxsd.gen.model.drawingml.chart.ErrValTypeModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class ErrBarsBuilder {
  private ErrDirModel errDir;

  private ErrBarTypeModel errBarType;

  private ErrValTypeModel errValType;

  private BooleanModel noEndCap;

  private NumDataSourceModel plus;

  private NumDataSourceModel minus;

  private DoubleModel val;

  private ShapePropertiesModel spPr;

  private ExtensionListModel extLst;

  public ErrBarsBuilder() {
  }

  public ErrBarsBuilder setErrDir(ErrDirModel errDir) {
    this.errDir = errDir;
    return this;
  }

  public ErrBarsBuilder setErrBarType(ErrBarTypeModel errBarType) {
    this.errBarType = errBarType;
    return this;
  }

  public ErrBarsBuilder setErrValType(ErrValTypeModel errValType) {
    this.errValType = errValType;
    return this;
  }

  public ErrBarsBuilder setNoEndCap(BooleanModel noEndCap) {
    this.noEndCap = noEndCap;
    return this;
  }

  public ErrBarsBuilder setPlus(NumDataSourceModel plus) {
    this.plus = plus;
    return this;
  }

  public ErrBarsBuilder setMinus(NumDataSourceModel minus) {
    this.minus = minus;
    return this;
  }

  public ErrBarsBuilder setVal(DoubleModel val) {
    this.val = val;
    return this;
  }

  public ErrBarsBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ErrBarsBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ErrBarsBuilder from(ErrBarsModel value) {
    this.errDir = value.getErrDir();
    this.errBarType = value.getErrBarType();
    this.errValType = value.getErrValType();
    this.noEndCap = value.getNoEndCap();
    this.plus = value.getPlus();
    this.minus = value.getMinus();
    this.val = value.getVal();
    this.spPr = value.getSpPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public ErrBarsModel build() {
    return new ErrBarsModel(this.errDir, this.errBarType, this.errValType, this.noEndCap, this.plus, this.minus, this.val, this.spPr, this.extLst);
  }
}
