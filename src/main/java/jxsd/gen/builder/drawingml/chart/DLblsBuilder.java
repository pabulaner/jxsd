package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.DLblModel;
import jxsd.gen.model.drawingml.chart.DLblPosModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DLblsBuilder {
  private List<DLblModel> dLbl;

  private DLblsModel.DeleteOrDLbls deleteOrDLbls;

  private ExtensionListModel extLst;

  public DLblsBuilder() {
  }

  public DLblsBuilder setDLbl(List<DLblModel> dLbl) {
    this.dLbl = dLbl;
    return this;
  }

  public DLblsBuilder setDeleteOrDLbls(DLblsModel.DeleteOrDLbls deleteOrDLbls) {
    this.deleteOrDLbls = deleteOrDLbls;
    return this;
  }

  public DLblsBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DLblsBuilder from(DLblsModel value) {
    this.dLbl = value.getDLbl();
    this.deleteOrDLbls = value.getDeleteOrDLbls();
    this.extLst = value.getExtLst();
    return this;
  }

  public DLblsModel build() {
    return new DLblsModel(this.dLbl, this.deleteOrDLbls, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class DeleteOrDLbls {
    private int type;

    private Object value;

    public DeleteOrDLbls() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrDLbls setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setNumFmt(NumFmtModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setSpPr(ShapePropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setTxPr(TextBodyModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setDLblPos(DLblPosModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowLegendKey(BooleanModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowVal(BooleanModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowCatName(BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowSerName(BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowPercent(BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowBubbleSize(BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setSeparator(String value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setShowLeaderLines(BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls setLeaderLines(ChartLinesModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public DeleteOrDLbls from(DLblsModel.DeleteOrDLbls value) {
      this.type = -1;
      this.value = null;
      if (value.isDelete()) {
        this.type = 0;
        this.value = value.getDelete();
      }
      if (value.isNumFmt()) {
        this.type = 1;
        this.value = value.getNumFmt();
      }
      if (value.isSpPr()) {
        this.type = 2;
        this.value = value.getSpPr();
      }
      if (value.isTxPr()) {
        this.type = 3;
        this.value = value.getTxPr();
      }
      if (value.isDLblPos()) {
        this.type = 4;
        this.value = value.getDLblPos();
      }
      if (value.isShowLegendKey()) {
        this.type = 5;
        this.value = value.getShowLegendKey();
      }
      if (value.isShowVal()) {
        this.type = 6;
        this.value = value.getShowVal();
      }
      if (value.isShowCatName()) {
        this.type = 7;
        this.value = value.getShowCatName();
      }
      if (value.isShowSerName()) {
        this.type = 8;
        this.value = value.getShowSerName();
      }
      if (value.isShowPercent()) {
        this.type = 9;
        this.value = value.getShowPercent();
      }
      if (value.isShowBubbleSize()) {
        this.type = 10;
        this.value = value.getShowBubbleSize();
      }
      if (value.isSeparator()) {
        this.type = 11;
        this.value = value.getSeparator();
      }
      if (value.isShowLeaderLines()) {
        this.type = 12;
        this.value = value.getShowLeaderLines();
      }
      if (value.isLeaderLines()) {
        this.type = 13;
        this.value = value.getLeaderLines();
      }
      return this;
    }

    public DLblsModel.DeleteOrDLbls build() {
      if (this.type == -1) return new DLblsModel.DeleteOrDLbls();
      if (this.type == 0) return DLblsModel.DeleteOrDLbls.newDelete((BooleanModel) this.value);
      if (this.type == 1) return DLblsModel.DeleteOrDLbls.newNumFmt((NumFmtModel) this.value);
      if (this.type == 2) return DLblsModel.DeleteOrDLbls.newSpPr((ShapePropertiesModel) this.value);
      if (this.type == 3) return DLblsModel.DeleteOrDLbls.newTxPr((TextBodyModel) this.value);
      if (this.type == 4) return DLblsModel.DeleteOrDLbls.newDLblPos((DLblPosModel) this.value);
      if (this.type == 5) return DLblsModel.DeleteOrDLbls.newShowLegendKey((BooleanModel) this.value);
      if (this.type == 6) return DLblsModel.DeleteOrDLbls.newShowVal((BooleanModel) this.value);
      if (this.type == 7) return DLblsModel.DeleteOrDLbls.newShowCatName((BooleanModel) this.value);
      if (this.type == 8) return DLblsModel.DeleteOrDLbls.newShowSerName((BooleanModel) this.value);
      if (this.type == 9) return DLblsModel.DeleteOrDLbls.newShowPercent((BooleanModel) this.value);
      if (this.type == 10) return DLblsModel.DeleteOrDLbls.newShowBubbleSize((BooleanModel) this.value);
      if (this.type == 11) return DLblsModel.DeleteOrDLbls.newSeparator((String) this.value);
      if (this.type == 12) return DLblsModel.DeleteOrDLbls.newShowLeaderLines((BooleanModel) this.value);
      if (this.type == 13) return DLblsModel.DeleteOrDLbls.newLeaderLines((ChartLinesModel) this.value);
      return null;
    }
  }
}
