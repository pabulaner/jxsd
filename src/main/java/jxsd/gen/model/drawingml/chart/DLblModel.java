package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.DLblBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DLblModel {
  private final UnsignedIntModel idx;

  private final DeleteOrDLbl deleteOrDLbl;

  private final ExtensionListModel extLst;

  public DLblModel(UnsignedIntModel idx, DeleteOrDLbl deleteOrDLbl, ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrDLbl = deleteOrDLbl;
    this.extLst = extLst;
  }

  public DLblBuilder builder() {
    return new DLblBuilder().from(this);
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrDLbl getDeleteOrDLbl() {
    return this.deleteOrDLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class DeleteOrDLbl {
    private final int type;

    private final Object value;

    public DeleteOrDLbl() {
      this(-1, null);
    }

    private DeleteOrDLbl(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public DLblBuilder.DeleteOrDLbl builder() {
      return new DLblBuilder.DeleteOrDLbl().from(this);
    }

    public static DeleteOrDLbl newDelete(BooleanModel value) {
      return new DeleteOrDLbl(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newLayout(LayoutModel value) {
      return new DeleteOrDLbl(1, value);
    }

    public boolean isLayout() {
      return this.type == 1;
    }

    public LayoutModel getLayout() {
      return (LayoutModel) this.value;
    }

    public static DeleteOrDLbl newTx(TxModel value) {
      return new DeleteOrDLbl(2, value);
    }

    public boolean isTx() {
      return this.type == 2;
    }

    public TxModel getTx() {
      return (TxModel) this.value;
    }

    public static DeleteOrDLbl newNumFmt(NumFmtModel value) {
      return new DeleteOrDLbl(3, value);
    }

    public boolean isNumFmt() {
      return this.type == 3;
    }

    public NumFmtModel getNumFmt() {
      return (NumFmtModel) this.value;
    }

    public static DeleteOrDLbl newSpPr(ShapePropertiesModel value) {
      return new DeleteOrDLbl(4, value);
    }

    public boolean isSpPr() {
      return this.type == 4;
    }

    public ShapePropertiesModel getSpPr() {
      return (ShapePropertiesModel) this.value;
    }

    public static DeleteOrDLbl newTxPr(TextBodyModel value) {
      return new DeleteOrDLbl(5, value);
    }

    public boolean isTxPr() {
      return this.type == 5;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }

    public static DeleteOrDLbl newDLblPos(DLblPosModel value) {
      return new DeleteOrDLbl(6, value);
    }

    public boolean isDLblPos() {
      return this.type == 6;
    }

    public DLblPosModel getDLblPos() {
      return (DLblPosModel) this.value;
    }

    public static DeleteOrDLbl newShowLegendKey(BooleanModel value) {
      return new DeleteOrDLbl(7, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 7;
    }

    public BooleanModel getShowLegendKey() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newShowVal(BooleanModel value) {
      return new DeleteOrDLbl(8, value);
    }

    public boolean isShowVal() {
      return this.type == 8;
    }

    public BooleanModel getShowVal() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newShowCatName(BooleanModel value) {
      return new DeleteOrDLbl(9, value);
    }

    public boolean isShowCatName() {
      return this.type == 9;
    }

    public BooleanModel getShowCatName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newShowSerName(BooleanModel value) {
      return new DeleteOrDLbl(10, value);
    }

    public boolean isShowSerName() {
      return this.type == 10;
    }

    public BooleanModel getShowSerName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newShowPercent(BooleanModel value) {
      return new DeleteOrDLbl(11, value);
    }

    public boolean isShowPercent() {
      return this.type == 11;
    }

    public BooleanModel getShowPercent() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newShowBubbleSize(BooleanModel value) {
      return new DeleteOrDLbl(12, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 12;
    }

    public BooleanModel getShowBubbleSize() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbl newSeparator(String value) {
      return new DeleteOrDLbl(13, value);
    }

    public boolean isSeparator() {
      return this.type == 13;
    }

    public String getSeparator() {
      return (String) this.value;
    }
  }
}
