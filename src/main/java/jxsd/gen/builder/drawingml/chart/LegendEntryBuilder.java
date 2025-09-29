package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LegendEntryModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class LegendEntryBuilder {
  private UnsignedIntModel idx;

  private LegendEntryModel.DeleteOrLegendEntryData deleteOrLegendEntryData;

  private ExtensionListModel extLst;

  public LegendEntryBuilder() {
  }

  public LegendEntryBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public LegendEntryBuilder setDeleteOrLegendEntryData(
      LegendEntryModel.DeleteOrLegendEntryData deleteOrLegendEntryData) {
    this.deleteOrLegendEntryData = deleteOrLegendEntryData;
    return this;
  }

  public LegendEntryBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LegendEntryBuilder from(LegendEntryModel value) {
    this.idx = value.getIdx();
    this.deleteOrLegendEntryData = value.getDeleteOrLegendEntryData();
    this.extLst = value.getExtLst();
    return this;
  }

  public LegendEntryModel build() {
    return new LegendEntryModel(this.idx, this.deleteOrLegendEntryData, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class DeleteOrLegendEntryData {
    private int type;

    private Object value;

    public DeleteOrLegendEntryData() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrLegendEntryData setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrLegendEntryData setTxPr(TextBodyModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrLegendEntryData from(LegendEntryModel.DeleteOrLegendEntryData value) {
      this.type = -1;
      this.value = null;
      if (value.isDelete()) {
        this.type = 0;
        this.value = value.getDelete();
      }
      if (value.isTxPr()) {
        this.type = 1;
        this.value = value.getTxPr();
      }
      return this;
    }

    public LegendEntryModel.DeleteOrLegendEntryData build() {
      if (this.type == -1) return new LegendEntryModel.DeleteOrLegendEntryData();
      if (this.type == 0) return LegendEntryModel.DeleteOrLegendEntryData.newDelete((BooleanModel) this.value);
      if (this.type == 1) return LegendEntryModel.DeleteOrLegendEntryData.newTxPr((TextBodyModel) this.value);
      return null;
    }
  }
}
