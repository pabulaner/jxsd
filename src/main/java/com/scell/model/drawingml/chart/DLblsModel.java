package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class DLblsModel {
  private final List<DLblModel> dLbl;

  private final DeleteOrDLblsValueModel deleteOrDLbls;

  private final ExtensionListModel extLst;

  public DLblsModel(List<DLblModel> dLbl, DeleteOrDLblsValueModel deleteOrDLbls,
      ExtensionListModel extLst) {
    this.dLbl = dLbl;
    this.deleteOrDLbls = deleteOrDLbls;
    this.extLst = extLst;
  }

  public List<DLblModel> getDLbl() {
    return this.dLbl;
  }

  public DeleteOrDLblsValueModel getDeleteOrDLbls() {
    return this.deleteOrDLbls;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrDLblsValueModel {
    private final int type;

    private final Object value;

    public DeleteOrDLblsValueModel() {
      this(-1, null);
    }

    private DeleteOrDLblsValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrDLblsValueModel newDelete(BooleanModel value) {
      return new DeleteOrDLblsValueModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newNumFmt(NumFmtModel value) {
      return new DeleteOrDLblsValueModel(1, value);
    }

    public boolean isNumFmt() {
      return this.type == 1;
    }

    public NumFmtModel getNumFmt() {
      return (NumFmtModel) this.value;
    }

    public static DeleteOrDLblsValueModel newSpPr(ShapePropertiesModel value) {
      return new DeleteOrDLblsValueModel(2, value);
    }

    public boolean isSpPr() {
      return this.type == 2;
    }

    public ShapePropertiesModel getSpPr() {
      return (ShapePropertiesModel) this.value;
    }

    public static DeleteOrDLblsValueModel newTxPr(TextBodyModel value) {
      return new DeleteOrDLblsValueModel(3, value);
    }

    public boolean isTxPr() {
      return this.type == 3;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }

    public static DeleteOrDLblsValueModel newDLblPos(DLblPosModel value) {
      return new DeleteOrDLblsValueModel(4, value);
    }

    public boolean isDLblPos() {
      return this.type == 4;
    }

    public DLblPosModel getDLblPos() {
      return (DLblPosModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowLegendKey(BooleanModel value) {
      return new DeleteOrDLblsValueModel(5, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 5;
    }

    public BooleanModel getShowLegendKey() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowVal(BooleanModel value) {
      return new DeleteOrDLblsValueModel(6, value);
    }

    public boolean isShowVal() {
      return this.type == 6;
    }

    public BooleanModel getShowVal() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowCatName(BooleanModel value) {
      return new DeleteOrDLblsValueModel(7, value);
    }

    public boolean isShowCatName() {
      return this.type == 7;
    }

    public BooleanModel getShowCatName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowSerName(BooleanModel value) {
      return new DeleteOrDLblsValueModel(8, value);
    }

    public boolean isShowSerName() {
      return this.type == 8;
    }

    public BooleanModel getShowSerName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowPercent(BooleanModel value) {
      return new DeleteOrDLblsValueModel(9, value);
    }

    public boolean isShowPercent() {
      return this.type == 9;
    }

    public BooleanModel getShowPercent() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowBubbleSize(BooleanModel value) {
      return new DeleteOrDLblsValueModel(10, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 10;
    }

    public BooleanModel getShowBubbleSize() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newSeparator(StringValueModel value) {
      return new DeleteOrDLblsValueModel(11, value);
    }

    public boolean isSeparator() {
      return this.type == 11;
    }

    public StringValueModel getSeparator() {
      return (StringValueModel) this.value;
    }

    public static DeleteOrDLblsValueModel newShowLeaderLines(BooleanModel value) {
      return new DeleteOrDLblsValueModel(12, value);
    }

    public boolean isShowLeaderLines() {
      return this.type == 12;
    }

    public BooleanModel getShowLeaderLines() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLblsValueModel newLeaderLines(ChartLinesModel value) {
      return new DeleteOrDLblsValueModel(13, value);
    }

    public boolean isLeaderLines() {
      return this.type == 13;
    }

    public ChartLinesModel getLeaderLines() {
      return (ChartLinesModel) this.value;
    }
  }
}
