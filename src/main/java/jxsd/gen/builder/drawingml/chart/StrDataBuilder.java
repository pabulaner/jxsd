package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.StrDataModel;
import jxsd.gen.model.drawingml.chart.StrValModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class StrDataBuilder {
  private UnsignedIntModel ptCount;

  private List<StrValModel> pt;

  private ExtensionListModel extLst;

  public StrDataBuilder() {
  }

  public StrDataBuilder setPtCount(UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public StrDataBuilder setPt(List<StrValModel> pt) {
    this.pt = pt;
    return this;
  }

  public StrDataBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public StrDataBuilder from(StrDataModel value) {
    this.ptCount = value.getPtCount();
    this.pt = value.getPt();
    this.extLst = value.getExtLst();
    return this;
  }

  public StrDataModel build() {
    return new StrDataModel(this.ptCount, this.pt, this.extLst);
  }
}
