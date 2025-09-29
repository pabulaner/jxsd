package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumDataModel;
import jxsd.gen.model.drawingml.chart.NumRefModel;

/**
 * This is a generated sequence class.
 */
public class NumRefBuilder {
  private String f;

  private NumDataModel numCache;

  private ExtensionListModel extLst;

  public NumRefBuilder() {
  }

  public NumRefBuilder setF(String f) {
    this.f = f;
    return this;
  }

  public NumRefBuilder setNumCache(NumDataModel numCache) {
    this.numCache = numCache;
    return this;
  }

  public NumRefBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NumRefBuilder from(NumRefModel value) {
    this.f = value.getF();
    this.numCache = value.getNumCache();
    this.extLst = value.getExtLst();
    return this;
  }

  public NumRefModel build() {
    return new NumRefModel(this.f, this.numCache, this.extLst);
  }
}
