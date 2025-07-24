package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class DLblModel {
  private final UnsignedIntModel idx;

  private final DeleteOrGroup_DLblModel deleteorgroupDLbl;

  private final ExtensionListModel extLst;

  public DLblModel(UnsignedIntModel idx, DeleteOrGroup_DLblModel deleteorgroupDLbl,
      ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteorgroupDLbl = deleteorgroupDLbl;
    this.extLst = extLst;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrGroup_DLblModel getDeleteOrGroupDLbl() {
    return this.deleteorgroupDLbl;
  }

  public ExtensionListModel getExtLst() {
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

    public static DeleteOrGroup_DLblModel newDelete(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newLayout(LayoutModel value) {
      return new DeleteOrGroup_DLblModel(1, value);
    }

    public boolean isLayout() {
      return this.type == 1;
    }

    public LayoutModel getLayout() {
      return (LayoutModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newTx(TxModel value) {
      return new DeleteOrGroup_DLblModel(2, value);
    }

    public boolean isTx() {
      return this.type == 2;
    }

    public TxModel getTx() {
      return (TxModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newNumFmt(NumFmtModel value) {
      return new DeleteOrGroup_DLblModel(3, value);
    }

    public boolean isNumFmt() {
      return this.type == 3;
    }

    public NumFmtModel getNumFmt() {
      return (NumFmtModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newSpPr(ShapePropertiesModel value) {
      return new DeleteOrGroup_DLblModel(4, value);
    }

    public boolean isSpPr() {
      return this.type == 4;
    }

    public ShapePropertiesModel getSpPr() {
      return (ShapePropertiesModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newTxPr(TextBodyModel value) {
      return new DeleteOrGroup_DLblModel(5, value);
    }

    public boolean isTxPr() {
      return this.type == 5;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newDLblPos(DLblPosModel value) {
      return new DeleteOrGroup_DLblModel(6, value);
    }

    public boolean isDLblPos() {
      return this.type == 6;
    }

    public DLblPosModel getDLblPos() {
      return (DLblPosModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowLegendKey(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(7, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 7;
    }

    public BooleanModel getShowLegendKey() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowVal(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(8, value);
    }

    public boolean isShowVal() {
      return this.type == 8;
    }

    public BooleanModel getShowVal() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowCatName(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(9, value);
    }

    public boolean isShowCatName() {
      return this.type == 9;
    }

    public BooleanModel getShowCatName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowSerName(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(10, value);
    }

    public boolean isShowSerName() {
      return this.type == 10;
    }

    public BooleanModel getShowSerName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowPercent(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(11, value);
    }

    public boolean isShowPercent() {
      return this.type == 11;
    }

    public BooleanModel getShowPercent() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblModel newShowBubbleSize(BooleanModel value) {
      return new DeleteOrGroup_DLblModel(12, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public BooleanModel getShowBubbleSize() {
      return (BooleanModel) this.value;
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
