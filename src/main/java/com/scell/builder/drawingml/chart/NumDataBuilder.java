package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumDataModel;
import com.scell.model.drawingml.chart.NumValModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.chart.XstringModel;
import java.util.List;

public class NumDataBuilder {
  private XstringModel formatCode;

  private UnsignedIntModel ptCount;

  private List<NumValModel> pt;

  private ExtensionListModel extLst;

  public NumDataBuilder() {
  }

  public NumDataBuilder setFormatCode(XstringModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumDataBuilder setPtCount(UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public NumDataBuilder setPt(List<NumValModel> pt) {
    this.pt = pt;
    return this;
  }

  public NumDataBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NumDataModel build() {
    return new NumDataModel(this.formatCode, this.ptCount, this.pt, this.extLst);
  }

  public NumDataBuilder from(NumDataModel value) {
    this.formatCode = value.getFormatCode();
    this.ptCount = value.getPtCount();
    this.pt = value.getPt();
    this.extLst = value.getExtLst();
    return this;
  }
}
