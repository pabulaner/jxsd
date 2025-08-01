package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class LegendEntryModel {
  private final UnsignedIntModel idx;

  private final DeleteOrLegendEntryDataValueModel deleteOrLegendEntryData;

  private final ExtensionListModel extLst;

  public LegendEntryModel(UnsignedIntModel idx,
      DeleteOrLegendEntryDataValueModel deleteOrLegendEntryData, ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrLegendEntryData = deleteOrLegendEntryData;
    this.extLst = extLst;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrLegendEntryDataValueModel getDeleteOrLegendEntryData() {
    return this.deleteOrLegendEntryData;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrLegendEntryDataValueModel {
    private final int type;

    private final Object value;

    public DeleteOrLegendEntryDataValueModel() {
      this(-1, null);
    }

    private DeleteOrLegendEntryDataValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrLegendEntryDataValueModel newDelete(BooleanModel value) {
      return new DeleteOrLegendEntryDataValueModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrLegendEntryDataValueModel newTxPr(TextBodyModel value) {
      return new DeleteOrLegendEntryDataValueModel(1, value);
    }

    public boolean isTxPr() {
      return this.type == 1;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }
  }
}
