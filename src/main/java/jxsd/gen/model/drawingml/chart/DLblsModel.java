package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.chart.DLblsBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DLblsModel {
  private final List<DLblModel> dLbl;

  private final DeleteOrDLbls deleteOrDLbls;

  private final ExtensionListModel extLst;

  public DLblsModel(List<DLblModel> dLbl, DeleteOrDLbls deleteOrDLbls, ExtensionListModel extLst) {
    this.dLbl = dLbl;
    this.deleteOrDLbls = deleteOrDLbls;
    this.extLst = extLst;
  }

  public DLblsBuilder builder() {
    return new DLblsBuilder().from(this);
  }

  public List<DLblModel> getDLbl() {
    return this.dLbl;
  }

  public DeleteOrDLbls getDeleteOrDLbls() {
    return this.deleteOrDLbls;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class DeleteOrDLbls {
    private final int type;

    private final Object value;

    public DeleteOrDLbls() {
      this(-1, null);
    }

    private DeleteOrDLbls(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public DLblsBuilder.DeleteOrDLbls builder() {
      return new DLblsBuilder.DeleteOrDLbls().from(this);
    }

    public static DeleteOrDLbls newDelete(BooleanModel value) {
      return new DeleteOrDLbls(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newNumFmt(NumFmtModel value) {
      return new DeleteOrDLbls(1, value);
    }

    public boolean isNumFmt() {
      return this.type == 1;
    }

    public NumFmtModel getNumFmt() {
      return (NumFmtModel) this.value;
    }

    public static DeleteOrDLbls newSpPr(ShapePropertiesModel value) {
      return new DeleteOrDLbls(2, value);
    }

    public boolean isSpPr() {
      return this.type == 2;
    }

    public ShapePropertiesModel getSpPr() {
      return (ShapePropertiesModel) this.value;
    }

    public static DeleteOrDLbls newTxPr(TextBodyModel value) {
      return new DeleteOrDLbls(3, value);
    }

    public boolean isTxPr() {
      return this.type == 3;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }

    public static DeleteOrDLbls newDLblPos(DLblPosModel value) {
      return new DeleteOrDLbls(4, value);
    }

    public boolean isDLblPos() {
      return this.type == 4;
    }

    public DLblPosModel getDLblPos() {
      return (DLblPosModel) this.value;
    }

    public static DeleteOrDLbls newShowLegendKey(BooleanModel value) {
      return new DeleteOrDLbls(5, value);
    }

    public boolean isShowLegendKey() {
      return this.type == 5;
    }

    public BooleanModel getShowLegendKey() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newShowVal(BooleanModel value) {
      return new DeleteOrDLbls(6, value);
    }

    public boolean isShowVal() {
      return this.type == 6;
    }

    public BooleanModel getShowVal() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newShowCatName(BooleanModel value) {
      return new DeleteOrDLbls(7, value);
    }

    public boolean isShowCatName() {
      return this.type == 7;
    }

    public BooleanModel getShowCatName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newShowSerName(BooleanModel value) {
      return new DeleteOrDLbls(8, value);
    }

    public boolean isShowSerName() {
      return this.type == 8;
    }

    public BooleanModel getShowSerName() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newShowPercent(BooleanModel value) {
      return new DeleteOrDLbls(9, value);
    }

    public boolean isShowPercent() {
      return this.type == 9;
    }

    public BooleanModel getShowPercent() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newShowBubbleSize(BooleanModel value) {
      return new DeleteOrDLbls(10, value);
    }

    public boolean isShowBubbleSize() {
      return this.type == 10;
    }

    public BooleanModel getShowBubbleSize() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newSeparator(String value) {
      return new DeleteOrDLbls(11, value);
    }

    public boolean isSeparator() {
      return this.type == 11;
    }

    public String getSeparator() {
      return (String) this.value;
    }

    public static DeleteOrDLbls newShowLeaderLines(BooleanModel value) {
      return new DeleteOrDLbls(12, value);
    }

    public boolean isShowLeaderLines() {
      return this.type == 12;
    }

    public BooleanModel getShowLeaderLines() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrDLbls newLeaderLines(ChartLinesModel value) {
      return new DeleteOrDLbls(13, value);
    }

    public boolean isLeaderLines() {
      return this.type == 13;
    }

    public ChartLinesModel getLeaderLines() {
      return (ChartLinesModel) this.value;
    }
  }
}
