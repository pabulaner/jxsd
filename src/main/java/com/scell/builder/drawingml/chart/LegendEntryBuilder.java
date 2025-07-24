package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LegendEntryModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Object;

public class LegendEntryBuilder {
  private UnsignedIntModel idx;

  private LegendEntryModel.DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData;

  private ExtensionListModel extLst;

  public LegendEntryBuilder() {
  }

  public LegendEntryBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public LegendEntryBuilder setDeleteOrEGLegendEntryData(
      LegendEntryModel.DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData) {
    this.deleteoregLegendEntryData = deleteoregLegendEntryData;
    return this;
  }

  public LegendEntryBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LegendEntryModel build() {
    return new LegendEntryModel(this.idx, this.deleteoregLegendEntryData, this.extLst);
  }

  public LegendEntryBuilder from(LegendEntryModel value) {
    this.idx = value.getIdx();
    this.deleteoregLegendEntryData = value.getDeleteOrEGLegendEntryData();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrEG_LegendEntryDataBuilder {
    private int type;

    private Object value;

    public DeleteOrEG_LegendEntryDataBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrEG_LegendEntryDataBuilder setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrEG_LegendEntryDataBuilder setTxPr(TextBodyModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public LegendEntryModel.DeleteOrEG_LegendEntryDataModel build() {
      if (this.type == -1) return new LegendEntryModel.DeleteOrEG_LegendEntryDataModel();
      if (this.type == 0) return LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newDelete((BooleanModel) this.value);
      if (this.type == 1) return LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newTxPr((TextBodyModel) this.value);
      return null;
    }

    public DeleteOrEG_LegendEntryDataBuilder from(
        LegendEntryModel.DeleteOrEG_LegendEntryDataModel value) {
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
