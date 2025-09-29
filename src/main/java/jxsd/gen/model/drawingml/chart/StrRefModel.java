package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.StrRefBuilder;

/**
 * This is a generated sequence class.
 */
public class StrRefModel {
  private final String f;

  private final StrDataModel strCache;

  private final ExtensionListModel extLst;

  public StrRefModel(String f, StrDataModel strCache, ExtensionListModel extLst) {
    this.f = f;
    this.strCache = strCache;
    this.extLst = extLst;
  }

  public StrRefBuilder builder() {
    return new StrRefBuilder().from(this);
  }

  public String getF() {
    return this.f;
  }

  public StrDataModel getStrCache() {
    return this.strCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
