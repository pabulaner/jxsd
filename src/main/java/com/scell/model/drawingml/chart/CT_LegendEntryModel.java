package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_LegendEntryModel {
  private final CT_UnsignedIntModel idx;

  private final DeleteOrTxPrModel deleteOrTxPr;

  private final CT_ExtensionListModel extLst;

  public CT_LegendEntryModel(CT_UnsignedIntModel idx, DeleteOrTxPrModel deleteOrTxPr,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrTxPr = deleteOrTxPr;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrTxPrModel getDeleteOrTxPr() {
    return this.deleteOrTxPr;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrTxPrModel {
    private final int type;

    private final Object value;

    public DeleteOrTxPrModel() {
      this(-1, null);
    }

    private DeleteOrTxPrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrTxPrModel newDelete(CT_BooleanModel value) {
      return new DeleteOrTxPrModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrTxPrModel newTxPr(CT_TextBodyModel value) {
      return new DeleteOrTxPrModel(1, value);
    }

    public boolean isTxPr() {
      return this.type == 1;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }
  }
}
