package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LegendEntryModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;

public class CT_LegendEntryBuilder {
  private CT_UnsignedIntModel idx;

  private CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData;

  private CT_ExtensionListModel extLst;

  public CT_LegendEntryBuilder() {
  }

  public CT_LegendEntryBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_LegendEntryBuilder setDeleteOrEGLegendEntryData(
      CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData) {
    this.deleteoregLegendEntryData = deleteoregLegendEntryData;
    return this;
  }

  public CT_LegendEntryBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_LegendEntryModel build() {
    return new CT_LegendEntryModel(this.idx, this.deleteoregLegendEntryData, this.extLst);
  }

  public CT_LegendEntryBuilder from(CT_LegendEntryModel value) {
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

    public DeleteOrEG_LegendEntryDataBuilder setDelete(CT_BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrEG_LegendEntryDataBuilder setTxPr(CT_TextBodyModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel build() {
      if (this.type == -1) return new CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel();
      if (this.type == 0) return CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newDelete((CT_BooleanModel) this.value);
      if (this.type == 1) return CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newTxPr((CT_TextBodyModel) this.value);
      return null;
    }

    public DeleteOrEG_LegendEntryDataBuilder from(
        CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel value) {
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
