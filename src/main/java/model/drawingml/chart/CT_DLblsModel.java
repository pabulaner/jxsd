package model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import model.XMLSchema.stringModel;
import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_TextBodyModel;

public class CT_DLblsModel {
  private final List<CT_DLblModel> dLbl;

  private final deleteOrNumFmtModel deleteOrNumFmt;

  private final CT_ExtensionListModel extLst;

  public CT_DLblsModel(List<CT_DLblModel> dLbl, deleteOrNumFmtModel deleteOrNumFmt,
      CT_ExtensionListModel extLst) {
    this.dLbl = dLbl;
    this.deleteOrNumFmt = deleteOrNumFmt;
    this.extLst = extLst;
  }

  public List<CT_DLblModel> getDLbl() {
    return this.dLbl;
  }

  public deleteOrNumFmtModel getDeleteOrNumFmt() {
    return this.deleteOrNumFmt;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class deleteOrNumFmtModel {
    private final int type;

    private final Object value;

    public deleteOrNumFmtModel() {
      this(-1, null);
    }

    private deleteOrNumFmtModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static deleteOrNumFmtModel newDelete(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public CT_BooleanModel getDelete() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newNumFmt(CT_NumFmtModel value) {
      return new deleteOrNumFmtModel(1, value);
    }

    public boolean isNumFmt() {
      return this.type == 1;
    }

    public CT_NumFmtModel getNumFmt() {
      return (CT_NumFmtModel) this.value;
    }

    public static deleteOrNumFmtModel newSpPr(CT_ShapePropertiesModel value) {
      return new deleteOrNumFmtModel(2, value);
    }

    public boolean isSpPr() {
      return this.type == 2;
    }

    public CT_ShapePropertiesModel getSpPr() {
      return (CT_ShapePropertiesModel) this.value;
    }

    public static deleteOrNumFmtModel newTxPr(CT_TextBodyModel value) {
      return new deleteOrNumFmtModel(3, value);
    }

    public boolean isTxPr() {
      return this.type == 3;
    }

    public CT_TextBodyModel getTxPr() {
      return (CT_TextBodyModel) this.value;
    }

    public static deleteOrNumFmtModel newDLblPos(CT_DLblPosModel value) {
      return new deleteOrNumFmtModel(4, value);
    }

    public boolean isDLblPos() {
      return this.type == 4;
    }

    public CT_DLblPosModel getDLblPos() {
      return (CT_DLblPosModel) this.value;
    }

    public static deleteOrNumFmtModel newShowLegendKey(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(5, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 5;
    }

    public CT_BooleanModel getShowLegendKey() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newShowVal(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(6, value);
    }

    public boolean isShowVal() {
      return this.type == 6;
    }

    public CT_BooleanModel getShowVal() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newShowCatName(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(7, value);
    }

    public boolean isShowCatName() {
      return this.type == 7;
    }

    public CT_BooleanModel getShowCatName() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newShowSerName(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(8, value);
    }

    public boolean isShowSerName() {
      return this.type == 8;
    }

    public CT_BooleanModel getShowSerName() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newShowPercent(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(9, value);
    }

    public boolean isShowPercent() {
      return this.type == 9;
    }

    public CT_BooleanModel getShowPercent() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newShowBubbleSize(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(10, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 10;
    }

    public CT_BooleanModel getShowBubbleSize() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newSeparator(stringModel value) {
      return new deleteOrNumFmtModel(11, value);
    }

    public boolean isSeparator() {
      return this.type == 11;
    }

    public stringModel getSeparator() {
      return (stringModel) this.value;
    }

    public static deleteOrNumFmtModel newShowLeaderLines(CT_BooleanModel value) {
      return new deleteOrNumFmtModel(12, value);
    }

    public boolean isShowLeaderLines() {
      return this.type == 12;
    }

    public CT_BooleanModel getShowLeaderLines() {
      return (CT_BooleanModel) this.value;
    }

    public static deleteOrNumFmtModel newLeaderLines(CT_ChartLinesModel value) {
      return new deleteOrNumFmtModel(13, value);
    }

    public boolean isLeaderLines() {
      return this.type == 13;
    }

    public CT_ChartLinesModel getLeaderLines() {
      return (CT_ChartLinesModel) this.value;
    }
  }
}
