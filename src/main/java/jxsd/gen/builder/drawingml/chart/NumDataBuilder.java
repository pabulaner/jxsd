package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumDataModel;
import jxsd.gen.model.drawingml.chart.NumValModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class NumDataBuilder {
  private String formatCode;

  private UnsignedIntModel ptCount;

  private List<NumValModel> pt;

  private ExtensionListModel extLst;

  public NumDataBuilder() {
  }

  public NumDataBuilder setFormatCode(String formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumDataBuilder setPtCount(UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public NumDataBuilder setPt(List<NumValModel> pt) {
    this.pt = pt;
    return this;
  }

  public NumDataBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NumDataBuilder from(NumDataModel value) {
    this.formatCode = value.getFormatCode();
    this.ptCount = value.getPtCount();
    this.pt = value.getPt();
    this.extLst = value.getExtLst();
    return this;
  }

  public NumDataModel build() {
    return new NumDataModel(this.formatCode, this.ptCount, this.pt, this.extLst);
  }
}
