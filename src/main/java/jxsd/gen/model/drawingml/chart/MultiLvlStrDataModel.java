package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.MultiLvlStrDataBuilder;

/**
 * This is a generated sequence class.
 */
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

  public MultiLvlStrDataBuilder builder() {
    return new MultiLvlStrDataBuilder().from(this);
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
