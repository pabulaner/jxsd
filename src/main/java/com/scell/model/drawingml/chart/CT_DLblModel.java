package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_DLblModel {
  private final CT_UnsignedIntModel idx;

  private final DeleteOrLayoutModel deleteOrLayout;

  private final CT_ExtensionListModel extLst;

  public CT_DLblModel(CT_UnsignedIntModel idx, DeleteOrLayoutModel deleteOrLayout,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrLayout = deleteOrLayout;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrLayoutModel getDeleteOrLayout() {
    return this.deleteOrLayout;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrLayoutModel {
    private final int type;

    private final Object value;

    public DeleteOrLayoutModel() {
      this(-1, null);
    }

    private DeleteOrLayoutModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrLayoutModel newDelete(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newLayout(CT_LayoutModel value) {
      return new DeleteOrLayoutModel(1, value);
    }

    public boolean isLayout() {
      return this.type == 1;
    }

    public CT_LayoutModel getLayout() {
      return (CT_LayoutModel) this.value;
    }

    public static DeleteOrLayoutModel newTx(CT_TxModel value) {
      return new DeleteOrLayoutModel(2, value);
    }

    public boolean isTx() {
      return this.type == 2;
    }

    public CT_TxModel getTx() {
      return (CT_TxModel) this.value;
    }

    public static DeleteOrLayoutModel newNumFmt(CT_NumFmtModel value) {
      return new DeleteOrLayoutModel(3, value);
    }

    public boolean isNumFmt() {
      return this.type == 3;
    }

    public CT_NumFmtModel getNumFmt() {
      return (CT_NumFmtModel) this.value;
    }

    public static DeleteOrLayoutModel newSpPr(CT_ShapePropertiesModel value) {
      return new DeleteOrLayoutModel(4, value);
    }

    public boolean isSpPr() {
      return this.type == 4;
    }

    public CT_ShapePropertiesModel getSpPr() {
      return (CT_ShapePropertiesModel) this.value;
    }

    public static DeleteOrLayoutModel newTxPr(CT_TextBodyModel value) {
      return new DeleteOrLayoutModel(5, value);
    }

    public boolean isTxPr() {
      return this.type == 5;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }

    public static DeleteOrLayoutModel newDLblPos(CT_DLblPosModel value) {
      return new DeleteOrLayoutModel(6, value);
    }

    public boolean isDLblPos() {
      return this.type == 6;
    }

    public CT_DLblPosModel getDLblPos() {
      return (CT_DLblPosModel) this.value;
    }

    public static DeleteOrLayoutModel newShowLegendKey(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(7, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 7;
    }

    public CT_BooleanModel getShowLegendKey() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowVal(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(8, value);
    }

    public boolean isShowVal() {
      return this.type == 8;
    }

    public CT_BooleanModel getShowVal() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowCatName(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(9, value);
    }

    public boolean isShowCatName() {
      return this.type == 9;
    }

    public CT_BooleanModel getShowCatName() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowSerName(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(10, value);
    }

    public boolean isShowSerName() {
      return this.type == 10;
    }

    public CT_BooleanModel getShowSerName() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowPercent(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(11, value);
    }

    public boolean isShowPercent() {
      return this.type == 11;
    }

    public CT_BooleanModel getShowPercent() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newShowBubbleSize(CT_BooleanModel value) {
      return new DeleteOrLayoutModel(12, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public CT_BooleanModel getShowBubbleSize() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrLayoutModel newSeparator(StringModel value) {
      return new DeleteOrLayoutModel(13, value);
    }

    public boolean isSeparator() {
      return this.type == 13;
    }

    public StringModel getSeparator() {
      return (StringModel) this.value;
    }
  }
}
