package com.scell.model.drawingml.main;

import java.util.List;

public class CustomColorListModel {
  private final List<CustomColorModel> custClr;

  public CustomColorListModel(List<CustomColorModel> custClr) {
    this.custClr = custClr;
  }

  public List<CustomColorModel> getCustClr() {
    return this.custClr;
  }
}
