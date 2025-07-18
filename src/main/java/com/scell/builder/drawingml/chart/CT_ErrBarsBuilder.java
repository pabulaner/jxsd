package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ErrBarTypeModel;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import com.scell.model.drawingml.chart.CT_ErrDirModel;
import com.scell.model.drawingml.chart.CT_ErrValTypeModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_ErrBarsBuilder {
  private CT_ErrDirModel errDir;

  private CT_ErrBarTypeModel errBarType;

  private CT_ErrValTypeModel errValType;

  private CT_BooleanModel noEndCap;

  private CT_NumDataSourceModel plus;

  private CT_NumDataSourceModel minus;

  private CT_DoubleModel val;

  private CT_ShapePropertiesModel spPr;

  private CT_ExtensionListModel extLst;

  public CT_ErrBarsBuilder() {
  }

  public CT_ErrBarsBuilder setErrDir(CT_ErrDirModel errDir) {
    this.errDir = errDir;
    return this;
  }

  public CT_ErrBarsBuilder setErrBarType(CT_ErrBarTypeModel errBarType) {
    this.errBarType = errBarType;
    return this;
  }

  public CT_ErrBarsBuilder setErrValType(CT_ErrValTypeModel errValType) {
    this.errValType = errValType;
    return this;
  }

  public CT_ErrBarsBuilder setNoEndCap(CT_BooleanModel noEndCap) {
    this.noEndCap = noEndCap;
    return this;
  }

  public CT_ErrBarsBuilder setPlus(CT_NumDataSourceModel plus) {
    this.plus = plus;
    return this;
  }

  public CT_ErrBarsBuilder setMinus(CT_NumDataSourceModel minus) {
    this.minus = minus;
    return this;
  }

  public CT_ErrBarsBuilder setVal(CT_DoubleModel val) {
    this.val = val;
    return this;
  }

  public CT_ErrBarsBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ErrBarsBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ErrBarsModel build() {
    return new CT_ErrBarsModel(this.errDir, this.errBarType, this.errValType, this.noEndCap, this.plus, this.minus, this.val, this.spPr, this.extLst);
  }

  public CT_ErrBarsBuilder from(CT_ErrBarsModel value) {
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
}
