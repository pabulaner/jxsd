package model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import model.drawingml.main.CT_TextBodyModel;

public class CT_LegendEntryModel {
  private final CT_UnsignedIntModel idx;

  private final deleteOrTxPrModel deleteOrTxPr;

  private final CT_ExtensionListModel extLst;

  public CT_LegendEntryModel(CT_UnsignedIntModel idx, deleteOrTxPrModel deleteOrTxPr,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrTxPr = deleteOrTxPr;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public deleteOrTxPrModel getDeleteOrTxPr() {
    return this.deleteOrTxPr;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class deleteOrTxPrModel {
    private final int type;

    private final Object value;

    public deleteOrTxPrModel() {
      this(-1, null);
    }

    private deleteOrTxPrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static deleteOrTxPrModel newDelete(CT_BooleanModel value) {
      return new deleteOrTxPrModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrTxPrModel newTxPr(CT_TextBodyModel value) {
      return new deleteOrTxPrModel(1, value);
    }

    public boolean isTxPr() {
      return this.type == 1;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }
  }
}
