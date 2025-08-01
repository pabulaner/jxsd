package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class DLblModel {
  private final UnsignedIntModel idx;

  private final DeleteOrDLblValueModel deleteOrDLbl;

  private final ExtensionListModel extLst;

  public DLblModel(UnsignedIntModel idx, DeleteOrDLblValueModel deleteOrDLbl,
      ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrDLbl = deleteOrDLbl;
    this.extLst = extLst;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrDLblValueModel getDeleteOrDLbl() {
    return this.deleteOrDLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrDLblValueModel {
    private final int type;

    private final Object value;

    public DeleteOrDLblValueModel() {
      this(-1, null);
    }

    private DeleteOrDLblValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrDLblValueModel newDelete(BooleanModel value) {
      return new DeleteOrDLblValueModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newLayout(LayoutModel value) {
      return new DeleteOrDLblValueModel(1, value);
    }

    public boolean isLayout() {
      return this.type == 1;
    }

    public LayoutModel getLayout() {
      return (LayoutModel) this.value;
    }

    public static DeleteOrDLblValueModel newTx(TxModel value) {
      return new DeleteOrDLblValueModel(2, value);
    }

    public boolean isTx() {
      return this.type == 2;
    }

    public TxModel getTx() {
      return (TxModel) this.value;
    }

    public static DeleteOrDLblValueModel newNumFmt(NumFmtModel value) {
      return new DeleteOrDLblValueModel(3, value);
    }

    public boolean isNumFmt() {
      return this.type == 3;
    }

    public NumFmtModel getNumFmt() {
      return (NumFmtModel) this.value;
    }

    public static DeleteOrDLblValueModel newSpPr(ShapePropertiesModel value) {
      return new DeleteOrDLblValueModel(4, value);
    }

    public boolean isSpPr() {
      return this.type == 4;
    }

    public ShapePropertiesModel getSpPr() {
      return (ShapePropertiesModel) this.value;
    }

    public static DeleteOrDLblValueModel newTxPr(TextBodyModel value) {
      return new DeleteOrDLblValueModel(5, value);
    }

    public boolean isTxPr() {
      return this.type == 5;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }

    public static DeleteOrDLblValueModel newDLblPos(DLblPosModel value) {
      return new DeleteOrDLblValueModel(6, value);
    }

    public boolean isDLblPos() {
      return this.type == 6;
    }

    public DLblPosModel getDLblPos() {
      return (DLblPosModel) this.value;
    }

    public static DeleteOrDLblValueModel newShowLegendKey(BooleanModel value) {
      return new DeleteOrDLblValueModel(7, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 7;
    }

    public BooleanModel getShowLegendKey() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newShowVal(BooleanModel value) {
      return new DeleteOrDLblValueModel(8, value);
    }

    public boolean isShowVal() {
      return this.type == 8;
    }

    public BooleanModel getShowVal() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newShowCatName(BooleanModel value) {
      return new DeleteOrDLblValueModel(9, value);
    }

    public boolean isShowCatName() {
      return this.type == 9;
    }

    public BooleanModel getShowCatName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newShowSerName(BooleanModel value) {
      return new DeleteOrDLblValueModel(10, value);
    }

    public boolean isShowSerName() {
      return this.type == 10;
    }

    public BooleanModel getShowSerName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newShowPercent(BooleanModel value) {
      return new DeleteOrDLblValueModel(11, value);
    }

    public boolean isShowPercent() {
      return this.type == 11;
    }

    public BooleanModel getShowPercent() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newShowBubbleSize(BooleanModel value) {
      return new DeleteOrDLblValueModel(12, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public BooleanModel getShowBubbleSize() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblValueModel newSeparator(StringValueModel value) {
      return new DeleteOrDLblValueModel(13, value);
    }

    public boolean isSeparator() {
      return this.type == 13;
    }

    public StringValueModel getSeparator() {
      return (StringValueModel) this.value;
    }
  }
}
