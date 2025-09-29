package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.MultiLvlStrRefBuilder;

/**
 * This is a generated sequence class.
 */
public class MultiLvlStrRefModel {
  private final String f;

  private final MultiLvlStrDataModel multiLvlStrCache;

  private final ExtensionListModel extLst;

  public MultiLvlStrRefModel(String f, MultiLvlStrDataModel multiLvlStrCache,
      ExtensionListModel extLst) {
    this.f = f;
    this.multiLvlStrCache = multiLvlStrCache;
    this.extLst = extLst;
  }

  public MultiLvlStrRefBuilder builder() {
    return new MultiLvlStrRefBuilder().from(this);
  }

  public String getF() {
    return this.f;
  }

  public MultiLvlStrDataModel getMultiLvlStrCache() {
    return this.multiLvlStrCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
