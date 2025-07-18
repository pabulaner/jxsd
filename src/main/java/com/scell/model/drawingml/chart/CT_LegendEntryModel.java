package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_LegendEntryModel {
  private final CT_UnsignedIntModel idx;

  private final DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData;

  private final CT_ExtensionListModel extLst;

  public CT_LegendEntryModel(CT_UnsignedIntModel idx,
      DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData, CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteoregLegendEntryData = deleteoregLegendEntryData;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrEG_LegendEntryDataModel getDeleteOrEGLegendEntryData() {
    return this.deleteoregLegendEntryData;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrEG_LegendEntryDataModel {
    private final int type;

    private final Object value;

    public DeleteOrEG_LegendEntryDataModel() {
      this(-1, null);
    }

    private DeleteOrEG_LegendEntryDataModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrEG_LegendEntryDataModel newDelete(CT_BooleanModel value) {
      return new DeleteOrEG_LegendEntryDataModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrEG_LegendEntryDataModel newTxPr(CT_TextBodyModel value) {
      return new DeleteOrEG_LegendEntryDataModel(1, value);
    }

    public boolean isTxPr() {
      return this.type == 1;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }
  }
}
