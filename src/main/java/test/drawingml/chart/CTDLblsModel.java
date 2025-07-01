package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.StringModel;
import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTDLblsModel {
  private final CTDLblModel dLbl;

  private final DeleteOrNumFmtModel deleteOrNumFmt;

  private final CTExtensionListModel extLst;

  public CTDLblsModel(CTDLblModel dLbl, DeleteOrNumFmtModel deleteOrNumFmt,
      CTExtensionListModel extLst) {
    this.dLbl = dLbl;
    this.deleteOrNumFmt = deleteOrNumFmt;
    this.extLst = extLst;
  }

  public CTDLblModel getDLbl() {
    return this.dLbl;
  }

  public DeleteOrNumFmtModel getDeleteOrNumFmt() {
    return this.deleteOrNumFmt;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class DeleteOrNumFmtModel {
    private final Integer type;

    private final Object value;

    public DeleteOrNumFmtModel() {
      this(-1, null);
    }

    private DeleteOrNumFmtModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static DeleteOrNumFmtModel newDelete(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(0, value);
    }

    public Boolean isDelete() {
      return this.type == 0;
    }

    public CTBooleanModel getDelete() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newNumFmt(CTNumFmtModel value) {
      return new DeleteOrNumFmtModel(1, value);
    }

    public Boolean isNumFmt() {
      return this.type == 1;
    }

    public CTNumFmtModel getNumFmt() {
      return (CTNumFmtModel) this.value;
    }

    public static DeleteOrNumFmtModel newSpPr(CTShapePropertiesModel value) {
      return new DeleteOrNumFmtModel(2, value);
    }

    public Boolean isSpPr() {
      return this.type == 2;
    }

    public CTShapePropertiesModel getSpPr() {
      return (CTShapePropertiesModel) this.value;
    }

    public static DeleteOrNumFmtModel newTxPr(CTTextBodyModel value) {
      return new DeleteOrNumFmtModel(3, value);
    }

    public Boolean isTxPr() {
      return this.type == 3;
    }

    public CTTextBodyModel getTxPr() {
      return (CTTextBodyModel) this.value;
    }

    public static DeleteOrNumFmtModel newDLblPos(CTDLblPosModel value) {
      return new DeleteOrNumFmtModel(4, value);
    }

    public Boolean isDLblPos() {
      return this.type == 4;
    }

    public CTDLblPosModel getDLblPos() {
      return (CTDLblPosModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowLegendKey(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(5, value);
    }

    public Boolean isShowLegendKey() {
      return this.type == 5;
    }

    public CTBooleanModel getShowLegendKey() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowVal(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(6, value);
    }

    public Boolean isShowVal() {
      return this.type == 6;
    }

    public CTBooleanModel getShowVal() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowCatName(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(7, value);
    }

    public Boolean isShowCatName() {
      return this.type == 7;
    }

    public CTBooleanModel getShowCatName() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowSerName(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(8, value);
    }

    public Boolean isShowSerName() {
      return this.type == 8;
    }

    public CTBooleanModel getShowSerName() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowPercent(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(9, value);
    }

    public Boolean isShowPercent() {
      return this.type == 9;
    }

    public CTBooleanModel getShowPercent() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowBubbleSize(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(10, value);
    }

    public Boolean isShowBubbleSize() {
      return this.type == 10;
    }

    public CTBooleanModel getShowBubbleSize() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newSeparator(StringModel value) {
      return new DeleteOrNumFmtModel(11, value);
    }

    public Boolean isSeparator() {
      return this.type == 11;
    }

    public StringModel getSeparator() {
      return (StringModel) this.value;
    }

    public static DeleteOrNumFmtModel newShowLeaderLines(CTBooleanModel value) {
      return new DeleteOrNumFmtModel(12, value);
    }

    public Boolean isShowLeaderLines() {
      return this.type == 12;
    }

    public CTBooleanModel getShowLeaderLines() {
      return (CTBooleanModel) this.value;
    }

    public static DeleteOrNumFmtModel newLeaderLines(CTChartLinesModel value) {
      return new DeleteOrNumFmtModel(13, value);
    }

    public Boolean isLeaderLines() {
      return this.type == 13;
    }

    public CTChartLinesModel getLeaderLines() {
      return (CTChartLinesModel) this.value;
    }
  }
}
