package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class LegendEntryModel {
  private final UnsignedIntModel idx;

  private final DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData;

  private final ExtensionListModel extLst;

  public LegendEntryModel(UnsignedIntModel idx,
      DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData, ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteoregLegendEntryData = deleteoregLegendEntryData;
    this.extLst = extLst;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrEG_LegendEntryDataModel getDeleteOrEGLegendEntryData() {
    return this.deleteoregLegendEntryData;
  }

  public ExtensionListModel getExtLst() {
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

    public static DeleteOrEG_LegendEntryDataModel newDelete(BooleanModel value) {
      return new DeleteOrEG_LegendEntryDataModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrEG_LegendEntryDataModel newTxPr(TextBodyModel value) {
      return new DeleteOrEG_LegendEntryDataModel(1, value);
    }

    public boolean isTxPr() {
      return this.type == 1;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }
  }
}
