package model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.stringModel;
import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_TextBodyModel;

public class CT_DLblModel {
  private final CT_UnsignedIntModel idx;

  private final deleteOrLayoutModel deleteOrLayout;

  private final CT_ExtensionListModel extLst;

  public CT_DLblModel(CT_UnsignedIntModel idx, deleteOrLayoutModel deleteOrLayout,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrLayout = deleteOrLayout;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public deleteOrLayoutModel getDeleteOrLayout() {
    return this.deleteOrLayout;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class deleteOrLayoutModel {
    private final int type;

    private final Object value;

    public deleteOrLayoutModel() {
      this(-1, null);
    }

    private deleteOrLayoutModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static deleteOrLayoutModel newDelete(CT_BooleanModel value) {
      return new deleteOrLayoutModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newLayout(CT_LayoutModel value) {
      return new deleteOrLayoutModel(1, value);
    }

    public boolean isLayout() {
      return this.type == 1;
    }

    public CT_LayoutModel getLayout() {
      return (CT_LayoutModel) this.value;
    }

    public static deleteOrLayoutModel newTx(CT_TxModel value) {
      return new deleteOrLayoutModel(2, value);
    }

    public boolean isTx() {
      return this.type == 2;
    }

    public CT_TxModel getTx() {
      return (CT_TxModel) this.value;
    }

    public static deleteOrLayoutModel newNumFmt(CT_NumFmtModel value) {
      return new deleteOrLayoutModel(3, value);
    }

    public boolean isNumFmt() {
      return this.type == 3;
    }

    public CT_NumFmtModel getNumFmt() {
      return (CT_NumFmtModel) this.value;
    }

    public static deleteOrLayoutModel newSpPr(CT_ShapePropertiesModel value) {
      return new deleteOrLayoutModel(4, value);
    }

    public boolean isSpPr() {
      return this.type == 4;
    }

    public CT_ShapePropertiesModel getSpPr() {
      return (CT_ShapePropertiesModel) this.value;
    }

    public static deleteOrLayoutModel newTxPr(CT_TextBodyModel value) {
      return new deleteOrLayoutModel(5, value);
    }

    public boolean isTxPr() {
      return this.type == 5;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }

    public static deleteOrLayoutModel newDLblPos(CT_DLblPosModel value) {
      return new deleteOrLayoutModel(6, value);
    }

    public boolean isDLblPos() {
      return this.type == 6;
    }

    public CT_DLblPosModel getDLblPos() {
      return (CT_DLblPosModel) this.value;
    }

    public static deleteOrLayoutModel newShowLegendKey(CT_BooleanModel value) {
      return new deleteOrLayoutModel(7, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 7;
    }

    public CT_BooleanModel getShowLegendKey() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newShowVal(CT_BooleanModel value) {
      return new deleteOrLayoutModel(8, value);
    }

    public boolean isShowVal() {
      return this.type == 8;
    }

    public CT_BooleanModel getShowVal() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newShowCatName(CT_BooleanModel value) {
      return new deleteOrLayoutModel(9, value);
    }

    public boolean isShowCatName() {
      return this.type == 9;
    }

    public CT_BooleanModel getShowCatName() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newShowSerName(CT_BooleanModel value) {
      return new deleteOrLayoutModel(10, value);
    }

    public boolean isShowSerName() {
      return this.type == 10;
    }

    public CT_BooleanModel getShowSerName() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newShowPercent(CT_BooleanModel value) {
      return new deleteOrLayoutModel(11, value);
    }

    public boolean isShowPercent() {
      return this.type == 11;
    }

    public CT_BooleanModel getShowPercent() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newShowBubbleSize(CT_BooleanModel value) {
      return new deleteOrLayoutModel(12, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public CT_BooleanModel getShowBubbleSize() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrLayoutModel newSeparator(stringModel value) {
      return new deleteOrLayoutModel(13, value);
    }

    public boolean isSeparator() {
      return this.type == 13;
    }

    public stringModel getSeparator() {
      return (stringModel) this.value;
    }
  }
}
