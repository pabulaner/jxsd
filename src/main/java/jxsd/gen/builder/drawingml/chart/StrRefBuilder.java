package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.StrDataModel;
import jxsd.gen.model.drawingml.chart.StrRefModel;

/**
 * This is a generated sequence class.
 */
public class StrRefBuilder {
  private String f;

  private StrDataModel strCache;

  private ExtensionListModel extLst;

  public StrRefBuilder() {
  }

  public StrRefBuilder setF(String f) {
    this.f = f;
    return this;
  }

  public StrRefBuilder setStrCache(StrDataModel strCache) {
    this.strCache = strCache;
    return this;
  }

  public StrRefBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public StrRefBuilder from(StrRefModel value) {
    this.f = value.getF();
    this.strCache = value.getStrCache();
    this.extLst = value.getExtLst();
    return this;
  }

  public StrRefModel build() {
    return new StrRefModel(this.f, this.strCache, this.extLst);
  }
}
