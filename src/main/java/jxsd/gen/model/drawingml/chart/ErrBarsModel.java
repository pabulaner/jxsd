package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrBarsBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class ErrBarsModel {
  private final ErrDirModel errDir;

  private final ErrBarTypeModel errBarType;

  private final ErrValTypeModel errValType;

  private final BooleanModel noEndCap;

  private final NumDataSourceModel plus;

  private final NumDataSourceModel minus;

  private final DoubleModel val;

  private final ShapePropertiesModel spPr;

  private final ExtensionListModel extLst;

  public ErrBarsModel(ErrDirModel errDir, ErrBarTypeModel errBarType, ErrValTypeModel errValType,
      BooleanModel noEndCap, NumDataSourceModel plus, NumDataSourceModel minus, DoubleModel val,
      ShapePropertiesModel spPr, ExtensionListModel extLst) {
    this.errDir = errDir;
    this.errBarType = errBarType;
    this.errValType = errValType;
    this.noEndCap = noEndCap;
    this.plus = plus;
    this.minus = minus;
    this.val = val;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public ErrBarsBuilder builder() {
    return new ErrBarsBuilder().from(this);
  }

  public ErrDirModel getErrDir() {
    return this.errDir;
  }

  public ErrBarTypeModel getErrBarType() {
    return this.errBarType;
  }

  public ErrValTypeModel getErrValType() {
    return this.errValType;
  }

  public BooleanModel getNoEndCap() {
    return this.noEndCap;
  }

  public NumDataSourceModel getPlus() {
    return this.plus;
  }

  public NumDataSourceModel getMinus() {
    return this.minus;
  }

  public DoubleModel getVal() {
    return this.val;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
