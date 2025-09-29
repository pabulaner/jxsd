package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.PivotSourceModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class PivotSourceBuilder {
  private String name;

  private UnsignedIntModel fmtId;

  private List<ExtensionListModel> extLst;

  public PivotSourceBuilder() {
  }

  public PivotSourceBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public PivotSourceBuilder setFmtId(UnsignedIntModel fmtId) {
    this.fmtId = fmtId;
    return this;
  }

  public PivotSourceBuilder setExtLst(List<ExtensionListModel> extLst) {
    this.extLst = extLst;
    return this;
  }

  public PivotSourceBuilder from(PivotSourceModel value) {
    this.name = value.getName();
    this.fmtId = value.getFmtId();
    this.extLst = value.getExtLst();
    return this;
  }

  public PivotSourceModel build() {
    return new PivotSourceModel(this.name, this.fmtId, this.extLst);
  }
}
