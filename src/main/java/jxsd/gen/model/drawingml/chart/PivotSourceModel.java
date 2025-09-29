package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.PivotSourceBuilder;

/**
 * This is a generated sequence class.
 */
public class PivotSourceModel {
  private final String name;

  private final UnsignedIntModel fmtId;

  private final List<ExtensionListModel> extLst;

  public PivotSourceModel(String name, UnsignedIntModel fmtId, List<ExtensionListModel> extLst) {
    this.name = name;
    this.fmtId = fmtId;
    this.extLst = extLst;
  }

  public PivotSourceBuilder builder() {
    return new PivotSourceBuilder().from(this);
  }

  public String getName() {
    return this.name;
  }

  public UnsignedIntModel getFmtId() {
    return this.fmtId;
  }

  public List<ExtensionListModel> getExtLst() {
    return this.extLst;
  }
}
