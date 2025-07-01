package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.drawingml.main.CTTextBodyModel;

public class CTLegendEntryModel {
  private final CTUnsignedIntModel idx;

  private final DeleteOrTxPrModel deleteOrTxPr;

  private final CTExtensionListModel extLst;

  public CTLegendEntryModel(CTUnsignedIntModel idx, DeleteOrTxPrModel deleteOrTxPr,
      CTExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrTxPr = deleteOrTxPr;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrTxPrModel getDeleteOrTxPr() {
    return this.deleteOrTxPr;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrTxPrModel {
    private final Integer type;

    private final Object value;

    public DeleteOrTxPrModel() {
      this(-1, null);
    }

    private DeleteOrTxPrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrTxPrModel newDelete(CTBooleanModel value) {
      return new DeleteOrTxPrModel(0, value);
    }

    public Boolean isDelete() {
      return this.type == 0;
    }

    public CTBooleanModel getDelete() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrTxPrModel newTxPr(CTTextBodyModel value) {
      return new DeleteOrTxPrModel(1, value);
    }

    public Boolean isTxPr() {
      return this.type == 1;
    }

    public CTTextBodyModel getTxPr() {
      return (CTTextBodyModel) this.value;
    }
  }
}
