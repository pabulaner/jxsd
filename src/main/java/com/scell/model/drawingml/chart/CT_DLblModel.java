package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_DLblModel {
  private final CT_UnsignedIntModel idx;

  private final DeleteOrGroup_DLblModel deleteorgroupDLbl;

  private final CT_ExtensionListModel extLst;

  public CT_DLblModel(CT_UnsignedIntModel idx, DeleteOrGroup_DLblModel deleteorgroupDLbl,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteorgroupDLbl = deleteorgroupDLbl;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrGroup_DLblModel getDeleteOrGroupDLbl() {
    return this.deleteorgroupDLbl;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrGroup_DLblModel {
    private final int type;

    private final Object value;

    public DeleteOrGroup_DLblModel() {
      this(-1, null);
    }

    private DeleteOrGroup_DLblModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrGroup_DLblModel newDelete(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newLayout(CT_LayoutModel value) {
      return new DeleteOrGroup_DLblModel(1, value);
    }

    public boolean isLayout() {
      return this.type == 1;
    }

    public CT_LayoutModel getLayout() {
      return (CT_LayoutModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newTx(CT_TxModel value) {
      return new DeleteOrGroup_DLblModel(2, value);
    }

    public boolean isTx() {
      return this.type == 2;
    }

    public CT_TxModel getTx() {
      return (CT_TxModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newNumFmt(CT_NumFmtModel value) {
      return new DeleteOrGroup_DLblModel(3, value);
    }

    public boolean isNumFmt() {
      return this.type == 3;
    }

    public CT_NumFmtModel getNumFmt() {
      return (CT_NumFmtModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newSpPr(CT_ShapePropertiesModel value) {
      return new DeleteOrGroup_DLblModel(4, value);
    }

    public boolean isSpPr() {
      return this.type == 4;
    }

    public CT_ShapePropertiesModel getSpPr() {
      return (CT_ShapePropertiesModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newTxPr(CT_TextBodyModel value) {
      return new DeleteOrGroup_DLblModel(5, value);
    }

    public boolean isTxPr() {
      return this.type == 5;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newDLblPos(CT_DLblPosModel value) {
      return new DeleteOrGroup_DLblModel(6, value);
    }

    public boolean isDLblPos() {
      return this.type == 6;
    }

    public CT_DLblPosModel getDLblPos() {
      return (CT_DLblPosModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowLegendKey(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(7, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 7;
    }

    public CT_BooleanModel getShowLegendKey() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowVal(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(8, value);
    }

    public boolean isShowVal() {
      return this.type == 8;
    }

    public CT_BooleanModel getShowVal() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowCatName(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(9, value);
    }

    public boolean isShowCatName() {
      return this.type == 9;
    }

    public CT_BooleanModel getShowCatName() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowSerName(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(10, value);
    }

    public boolean isShowSerName() {
      return this.type == 10;
    }

    public CT_BooleanModel getShowSerName() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowPercent(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(11, value);
    }

    public boolean isShowPercent() {
      return this.type == 11;
    }

    public CT_BooleanModel getShowPercent() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowBubbleSize(CT_BooleanModel value) {
      return new DeleteOrGroup_DLblModel(12, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public CT_BooleanModel getShowBubbleSize() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newSeparator(StringModel value) {
      return new DeleteOrGroup_DLblModel(13, value);
    }

    public boolean isSeparator() {
      return this.type == 13;
    }

    public StringModel getSeparator() {
      return (StringModel) this.value;
    }
  }
}
