package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class DLblsModel {
  private final List<DLblModel> dLbl;

  private final DeleteOrGroup_DLblsModel deleteorgroupDLbls;

  private final ExtensionListModel extLst;

  public DLblsModel(List<DLblModel> dLbl, DeleteOrGroup_DLblsModel deleteorgroupDLbls,
      ExtensionListModel extLst) {
    this.dLbl = dLbl;
    this.deleteorgroupDLbls = deleteorgroupDLbls;
    this.extLst = extLst;
  }

  public List<DLblModel> getDLbl() {
    return this.dLbl;
  }

  public DeleteOrGroup_DLblsModel getDeleteOrGroupDLbls() {
    return this.deleteorgroupDLbls;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrGroup_DLblsModel {
    private final int type;

    private final Object value;

    public DeleteOrGroup_DLblsModel() {
      this(-1, null);
    }

    private DeleteOrGroup_DLblsModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrGroup_DLblsModel newDelete(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newNumFmt(NumFmtModel value) {
      return new DeleteOrGroup_DLblsModel(1, value);
    }

    public boolean isNumFmt() {
      return this.type == 1;
    }

    public NumFmtModel getNumFmt() {
      return (NumFmtModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newSpPr(ShapePropertiesModel value) {
      return new DeleteOrGroup_DLblsModel(2, value);
    }

    public boolean isSpPr() {
      return this.type == 2;
    }

    public ShapePropertiesModel getSpPr() {
      return (ShapePropertiesModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newTxPr(TextBodyModel value) {
      return new DeleteOrGroup_DLblsModel(3, value);
    }

    public boolean isTxPr() {
      return this.type == 3;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newDLblPos(DLblPosModel value) {
      return new DeleteOrGroup_DLblsModel(4, value);
    }

    public boolean isDLblPos() {
      return this.type == 4;
    }

    public DLblPosModel getDLblPos() {
      return (DLblPosModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowLegendKey(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(5, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 5;
    }

    public BooleanModel getShowLegendKey() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowVal(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(6, value);
    }

    public boolean isShowVal() {
      return this.type == 6;
    }

    public BooleanModel getShowVal() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowCatName(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(7, value);
    }

    public boolean isShowCatName() {
      return this.type == 7;
    }

    public BooleanModel getShowCatName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowSerName(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(8, value);
    }

    public boolean isShowSerName() {
      return this.type == 8;
    }

    public BooleanModel getShowSerName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowPercent(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(9, value);
    }

    public boolean isShowPercent() {
      return this.type == 9;
    }

    public BooleanModel getShowPercent() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowBubbleSize(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(10, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 10;
    }

    public BooleanModel getShowBubbleSize() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newSeparator(StringModel value) {
      return new DeleteOrGroup_DLblsModel(11, value);
    }

    public boolean isSeparator() {
      return this.type == 11;
    }

    public StringModel getSeparator() {
      return (StringModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newShowLeaderLines(BooleanModel value) {
      return new DeleteOrGroup_DLblsModel(12, value);
    }

    public boolean isShowLeaderLines() {
      return this.type == 12;
    }

    public BooleanModel getShowLeaderLines() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrGroup_DLblsModel newLeaderLines(ChartLinesModel value) {
      return new DeleteOrGroup_DLblsModel(13, value);
    }

    public boolean isLeaderLines() {
      return this.type == 13;
    }

    public ChartLinesModel getLeaderLines() {
      return (ChartLinesModel) this.value;
    }
  }
}
