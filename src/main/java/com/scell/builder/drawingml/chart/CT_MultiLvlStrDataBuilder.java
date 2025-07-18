package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LvlModel;
import com.scell.model.drawingml.chart.CT_MultiLvlStrDataModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_MultiLvlStrDataBuilder {
  private CT_UnsignedIntModel ptCount;

  private List<CT_LvlModel> lvl;

  private CT_ExtensionListModel extLst;

  public CT_MultiLvlStrDataBuilder() {
  }

  public CT_MultiLvlStrDataBuilder setPtCount(CT_UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public CT_MultiLvlStrDataBuilder setLvl(List<CT_LvlModel> lvl) {
    this.lvl = lvl;
    return this;
  }

  public CT_MultiLvlStrDataBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_MultiLvlStrDataModel build() {
    return new CT_MultiLvlStrDataModel(this.ptCount, this.lvl, this.extLst);
  }

  public CT_MultiLvlStrDataBuilder from(CT_MultiLvlStrDataModel value) {
    this.ptCount = value.getPtCount();
    this.lvl = value.getLvl();
    this.extLst = value.getExtLst();
    return this;
  }
}
