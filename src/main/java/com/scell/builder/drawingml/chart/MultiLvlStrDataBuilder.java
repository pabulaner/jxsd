package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LvlModel;
import com.scell.model.drawingml.chart.MultiLvlStrDataModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class MultiLvlStrDataBuilder {
  private UnsignedIntModel ptCount;

  private List<LvlModel> lvl;

  private ExtensionListModel extLst;

  public MultiLvlStrDataBuilder() {
  }

  public MultiLvlStrDataBuilder setPtCount(UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public MultiLvlStrDataBuilder setLvl(List<LvlModel> lvl) {
    this.lvl = lvl;
    return this;
  }

  public MultiLvlStrDataBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public MultiLvlStrDataModel build() {
    return new MultiLvlStrDataModel(this.ptCount, this.lvl, this.extLst);
  }

  public MultiLvlStrDataBuilder from(MultiLvlStrDataModel value) {
    this.ptCount = value.getPtCount();
    this.lvl = value.getLvl();
    this.extLst = value.getExtLst();
    return this;
  }
}
