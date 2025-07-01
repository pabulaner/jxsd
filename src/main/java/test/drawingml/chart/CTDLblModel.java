package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.StringModel;
import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTDLblModel {
  private final CTUnsignedIntModel idx;

  private final DeleteOrLayoutModel deleteOrLayout;

  private final CTExtensionListModel extLst;

  public CTDLblModel(CTUnsignedIntModel idx, DeleteOrLayoutModel deleteOrLayout,
      CTExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrLayout = deleteOrLayout;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrLayoutModel getDeleteOrLayout() {
    return this.deleteOrLayout;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrLayoutModel {
    private final Integer type;

    private final Object value;

    public DeleteOrLayoutModel() {
      this(-1, null);
    }

    private DeleteOrLayoutModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrLayoutModel newDelete(CTBooleanModel value) {
      return new DeleteOrLayoutModel(0, value);
    }

    public Boolean isDelete() {
      return this.type == 0;
    }

    public CTBooleanModel getDelete() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newLayout(CTLayoutModel value) {
      return new DeleteOrLayoutModel(1, value);
    }

    public Boolean isLayout() {
      return this.type == 1;
    }

    public CTLayoutModel getLayout() {
      return (CTLayoutModel) this.value;
    }

    public static DeleteOrLayoutModel newTx(CTTxModel value) {
      return new DeleteOrLayoutModel(2, value);
    }

    public Boolean isTx() {
      return this.type == 2;
    }

    public CTTxModel getTx() {
      return (CTTxModel) this.value;
    }

    public static DeleteOrLayoutModel newNumFmt(CTNumFmtModel value) {
      return new DeleteOrLayoutModel(3, value);
    }

    public Boolean isNumFmt() {
      return this.type == 3;
    }

    public CTNumFmtModel getNumFmt() {
      return (CTNumFmtModel) this.value;
    }

    public static DeleteOrLayoutModel newSpPr(CTShapePropertiesModel value) {
      return new DeleteOrLayoutModel(4, value);
    }

    public Boolean isSpPr() {
      return this.type == 4;
    }

    public CTShapePropertiesModel getSpPr() {
      return (CTShapePropertiesModel) this.value;
    }

    public static DeleteOrLayoutModel newTxPr(CTTextBodyModel value) {
      return new DeleteOrLayoutModel(5, value);
    }

    public Boolean isTxPr() {
      return this.type == 5;
    }

    public CTTextBodyModel getTxPr() {
      return (CTTextBodyModel) this.value;
    }

    public static DeleteOrLayoutModel newDLblPos(CTDLblPosModel value) {
      return new DeleteOrLayoutModel(6, value);
    }

    public Boolean isDLblPos() {
      return this.type == 6;
    }

    public CTDLblPosModel getDLblPos() {
      return (CTDLblPosModel) this.value;
    }

    public static DeleteOrLayoutModel newShowLegendKey(CTBooleanModel value) {
      return new DeleteOrLayoutModel(7, value);
    }

    public Boolean isShowLegendKey() {
      return this.type == 7;
    }

    public CTBooleanModel getShowLegendKey() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowVal(CTBooleanModel value) {
      return new DeleteOrLayoutModel(8, value);
    }

    public Boolean isShowVal() {
      return this.type == 8;
    }

    public CTBooleanModel getShowVal() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowCatName(CTBooleanModel value) {
      return new DeleteOrLayoutModel(9, value);
    }

    public Boolean isShowCatName() {
      return this.type == 9;
    }

    public CTBooleanModel getShowCatName() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowSerName(CTBooleanModel value) {
      return new DeleteOrLayoutModel(10, value);
    }

    public Boolean isShowSerName() {
      return this.type == 10;
    }

    public CTBooleanModel getShowSerName() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowPercent(CTBooleanModel value) {
      return new DeleteOrLayoutModel(11, value);
    }

    public Boolean isShowPercent() {
      return this.type == 11;
    }

    public CTBooleanModel getShowPercent() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowBubbleSize(CTBooleanModel value) {
      return new DeleteOrLayoutModel(12, value);
    }

    public Boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public CTBooleanModel getShowBubbleSize() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newSeparator(StringModel value) {
      return new DeleteOrLayoutModel(13, value);
    }

    public Boolean isSeparator() {
      return this.type == 13;
    }

    public StringModel getSeparator() {
      return (StringModel) this.value;
    }
  }
}
