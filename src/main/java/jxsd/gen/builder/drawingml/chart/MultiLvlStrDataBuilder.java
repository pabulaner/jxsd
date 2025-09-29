package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LvlModel;
import jxsd.gen.model.drawingml.chart.MultiLvlStrDataModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
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

  public MultiLvlStrDataBuilder from(MultiLvlStrDataModel value) {
    this.ptCount = value.getPtCount();
    this.lvl = value.getLvl();
    this.extLst = value.getExtLst();
    return this;
  }

  public MultiLvlStrDataModel build() {
    return new MultiLvlStrDataModel(this.ptCount, this.lvl, this.extLst);
  }
}
