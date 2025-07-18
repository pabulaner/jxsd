package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_CustomColorListModel;
import com.scell.model.drawingml.main.CT_CustomColorModel;
import java.util.List;

public class CT_CustomColorListBuilder {
  private List<CT_CustomColorModel> custClr;

  public CT_CustomColorListBuilder() {
  }

  public CT_CustomColorListBuilder setCustClr(List<CT_CustomColorModel> custClr) {
    this.custClr = custClr;
    return this;
  }

  public CT_CustomColorListModel build() {
    return new CT_CustomColorListModel(this.custClr);
  }

  public CT_CustomColorListBuilder from(CT_CustomColorListModel value) {
    this.custClr = value.getCustClr();
    return this;
  }
}
