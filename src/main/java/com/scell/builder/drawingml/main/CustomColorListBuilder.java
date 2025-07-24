package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CustomColorListModel;
import com.scell.model.drawingml.main.CustomColorModel;
import java.util.List;

public class CustomColorListBuilder {
  private List<CustomColorModel> custClr;

  public CustomColorListBuilder() {
  }

  public CustomColorListBuilder setCustClr(List<CustomColorModel> custClr) {
    this.custClr = custClr;
    return this;
  }

  public CustomColorListModel build() {
    return new CustomColorListModel(this.custClr);
  }

  public CustomColorListBuilder from(CustomColorListModel value) {
    this.custClr = value.getCustClr();
    return this;
  }
}
