package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.StrDataBuilder;

/**
 * This is a generated sequence class.
 */
public class StrDataModel {
  private final UnsignedIntModel ptCount;

  private final List<StrValModel> pt;

  private final ExtensionListModel extLst;

  public StrDataModel(UnsignedIntModel ptCount, List<StrValModel> pt, ExtensionListModel extLst) {
    this.ptCount = ptCount;
    this.pt = pt;
    this.extLst = extLst;
  }

  public StrDataBuilder builder() {
    return new StrDataBuilder().from(this);
  }

  public UnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public List<StrValModel> getPt() {
    return this.pt;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
