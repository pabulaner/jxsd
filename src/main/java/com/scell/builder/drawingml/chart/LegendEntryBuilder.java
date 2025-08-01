package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LegendEntryModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Object;

public class LegendEntryBuilder {
  private UnsignedIntModel idx;

  private LegendEntryModel.DeleteOrLegendEntryDataValueModel deleteOrLegendEntryData;

  private ExtensionListModel extLst;

  public LegendEntryBuilder() {
  }

  public LegendEntryBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public LegendEntryBuilder setDeleteOrLegendEntryData(
      LegendEntryModel.DeleteOrLegendEntryDataValueModel deleteOrLegendEntryData) {
    this.deleteOrLegendEntryData = deleteOrLegendEntryData;
    return this;
  }

  public LegendEntryBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LegendEntryModel build() {
    return new LegendEntryModel(this.idx, this.deleteOrLegendEntryData, this.extLst);
  }

  public LegendEntryBuilder from(LegendEntryModel value) {
    this.idx = value.getIdx();
    this.deleteOrLegendEntryData = value.getDeleteOrLegendEntryData();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrLegendEntryDataValueBuilder {
    private int type;

    private Object value;

    public DeleteOrLegendEntryDataValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrLegendEntryDataValueBuilder setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrLegendEntryDataValueBuilder setTxPr(TextBodyModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public LegendEntryModel.DeleteOrLegendEntryDataValueModel build() {
      if (this.type == -1) return new LegendEntryModel.DeleteOrLegendEntryDataValueModel();
      if (this.type == 0) return LegendEntryModel.DeleteOrLegendEntryDataValueModel.newDelete((BooleanModel) this.value);
      if (this.type == 1) return LegendEntryModel.DeleteOrLegendEntryDataValueModel.newTxPr((TextBodyModel) this.value);
      return null;
    }

    public DeleteOrLegendEntryDataValueBuilder from(
        LegendEntryModel.DeleteOrLegendEntryDataValueModel value) {
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
  }
}
