package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataModel;
import com.scell.model.drawingml.chart.CT_NumValModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.chart.ST_XstringModel;
import java.util.List;

public class CT_NumDataBuilder {
  private ST_XstringModel formatCode;

  private CT_UnsignedIntModel ptCount;

  private List<CT_NumValModel> pt;

  private CT_ExtensionListModel extLst;

  public CT_NumDataBuilder() {
  }

  public CT_NumDataBuilder setFormatCode(ST_XstringModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public CT_NumDataBuilder setPtCount(CT_UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public CT_NumDataBuilder setPt(List<CT_NumValModel> pt) {
    this.pt = pt;
    return this;
  }

  public CT_NumDataBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NumDataModel build() {
    return new CT_NumDataModel(this.formatCode, this.ptCount, this.pt, this.extLst);
  }

  public CT_NumDataBuilder from(CT_NumDataModel value) {
    this.formatCode = value.getFormatCode();
    this.ptCount = value.getPtCount();
    this.pt = value.getPt();
    this.extLst = value.getExtLst();
    return this;
  }
}
