package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.NumRefBuilder;

/**
 * This is a generated sequence class.
 */
public class NumRefModel {
  private final String f;

  private final NumDataModel numCache;

  private final ExtensionListModel extLst;

  public NumRefModel(String f, NumDataModel numCache, ExtensionListModel extLst) {
    this.f = f;
    this.numCache = numCache;
    this.extLst = extLst;
  }

  public NumRefBuilder builder() {
    return new NumRefBuilder().from(this);
  }

  public String getF() {
    return this.f;
  }

  public NumDataModel getNumCache() {
    return this.numCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
