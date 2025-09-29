package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.MultiLvlStrDataModel;
import jxsd.gen.model.drawingml.chart.MultiLvlStrRefModel;

/**
 * This is a generated sequence class.
 */
public class MultiLvlStrRefBuilder {
  private String f;

  private MultiLvlStrDataModel multiLvlStrCache;

  private ExtensionListModel extLst;

  public MultiLvlStrRefBuilder() {
  }

  public MultiLvlStrRefBuilder setF(String f) {
    this.f = f;
    return this;
  }

  public MultiLvlStrRefBuilder setMultiLvlStrCache(MultiLvlStrDataModel multiLvlStrCache) {
    this.multiLvlStrCache = multiLvlStrCache;
    return this;
  }

  public MultiLvlStrRefBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public MultiLvlStrRefBuilder from(MultiLvlStrRefModel value) {
    this.f = value.getF();
    this.multiLvlStrCache = value.getMultiLvlStrCache();
    this.extLst = value.getExtLst();
    return this;
  }

  public MultiLvlStrRefModel build() {
    return new MultiLvlStrRefModel(this.f, this.multiLvlStrCache, this.extLst);
  }
}
