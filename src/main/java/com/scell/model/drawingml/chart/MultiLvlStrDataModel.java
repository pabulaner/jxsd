package com.scell.model.drawingml.chart;

import java.util.List;

public class MultiLvlStrDataModel {
  private final UnsignedIntModel ptCount;

  private final List<LvlModel> lvl;

  private final ExtensionListModel extLst;

  public MultiLvlStrDataModel(UnsignedIntModel ptCount, List<LvlModel> lvl,
      ExtensionListModel extLst) {
    this.ptCount = ptCount;
    this.lvl = lvl;
    this.extLst = extLst;
  }

  public UnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public List<LvlModel> getLvl() {
    return this.lvl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
