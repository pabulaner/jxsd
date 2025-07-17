package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_DLblsModel {
  private final List<CT_DLblModel> dLbl;

  private final DeleteOrNumFmtModel deleteOrNumFmt;

  private final CT_ExtensionListModel extLst;

  public CT_DLblsModel(List<CT_DLblModel> dLbl, DeleteOrNumFmtModel deleteOrNumFmt,
      CT_ExtensionListModel extLst) {
    this.dLbl = dLbl;
    this.deleteOrNumFmt = deleteOrNumFmt;
    this.extLst = extLst;
  }

  public List<CT_DLblModel> getDLbl() {
    return this.dLbl;
  }

  public DeleteOrNumFmtModel getDeleteOrNumFmt() {
    return this.deleteOrNumFmt;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrNumFmtModel {
    private final int type;

    private final Object value;

    public DeleteOrNumFmtModel() {
      this(-1, null);
    }

    private DeleteOrNumFmtModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrNumFmtModel newDelete(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newNumFmt(CT_NumFmtModel value) {
      return new DeleteOrNumFmtModel(1, value);
    }

    public boolean isNumFmt() {
      return this.type == 1;
    }

    public CT_NumFmtModel getNumFmt() {
      return (CT_NumFmtModel) this.value;
    }

    public static DeleteOrNumFmtModel newSpPr(CT_ShapePropertiesModel value) {
      return new DeleteOrNumFmtModel(2, value);
    }

    public boolean isSpPr() {
      return this.type == 2;
    }

    public CT_ShapePropertiesModel getSpPr() {
      return (CT_ShapePropertiesModel) this.value;
    }

    public static DeleteOrNumFmtModel newTxPr(CT_TextBodyModel value) {
      return new DeleteOrNumFmtModel(3, value);
    }

    public boolean isTxPr() {
      return this.type == 3;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }

    public static DeleteOrNumFmtModel newDLblPos(CT_DLblPosModel value) {
      return new DeleteOrNumFmtModel(4, value);
    }

    public boolean isDLblPos() {
      return this.type == 4;
    }

    public CT_DLblPosModel getDLblPos() {
      return (CT_DLblPosModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowLegendKey(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(5, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 5;
    }

    public CT_BooleanModel getShowLegendKey() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowVal(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(6, value);
    }

    public boolean isShowVal() {
      return this.type == 6;
    }

    public CT_BooleanModel getShowVal() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowCatName(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(7, value);
    }

    public boolean isShowCatName() {
      return this.type == 7;
    }

    public CT_BooleanModel getShowCatName() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowSerName(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(8, value);
    }

    public boolean isShowSerName() {
      return this.type == 8;
    }

    public CT_BooleanModel getShowSerName() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowPercent(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(9, value);
    }

    public boolean isShowPercent() {
      return this.type == 9;
    }

    public CT_BooleanModel getShowPercent() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowBubbleSize(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(10, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 10;
    }

    public CT_BooleanModel getShowBubbleSize() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newSeparator(StringModel value) {
      return new DeleteOrNumFmtModel(11, value);
    }

    public boolean isSeparator() {
      return this.type == 11;
    }

    public StringModel getSeparator() {
      return (StringModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowLeaderLines(CT_BooleanModel value) {
      return new DeleteOrNumFmtModel(12, value);
    }

    public boolean isShowLeaderLines() {
      return this.type == 12;
    }

    public CT_BooleanModel getShowLeaderLines() {
      return (CT_BooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newLeaderLines(CT_ChartLinesModel value) {
      return new DeleteOrNumFmtModel(13, value);
    }

    public boolean isLeaderLines() {
      return this.type == 13;
    }

    public CT_ChartLinesModel getLeaderLines() {
      return (CT_ChartLinesModel) this.value;
    }
  }
}
