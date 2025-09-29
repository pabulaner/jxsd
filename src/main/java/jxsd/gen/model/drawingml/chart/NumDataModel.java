package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.NumDataBuilder;

/**
 * This is a generated sequence class.
 */
public class NumDataModel {
  private final String formatCode;

  private final UnsignedIntModel ptCount;

  private final List<NumValModel> pt;

  private final ExtensionListModel extLst;

  public NumDataModel(String formatCode, UnsignedIntModel ptCount, List<NumValModel> pt,
      ExtensionListModel extLst) {
    this.formatCode = formatCode;
    this.ptCount = ptCount;
    this.pt = pt;
    this.extLst = extLst;
  }

  public NumDataBuilder builder() {
    return new NumDataBuilder().from(this);
  }

  public String getFormatCode() {
    return this.formatCode;
  }

  public UnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public List<NumValModel> getPt() {
    return this.pt;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
