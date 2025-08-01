package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.DLblModel;
import com.scell.model.drawingml.chart.DLblPosModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumFmtModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Object;
import java.util.List;

public class DLblsBuilder {
  private List<DLblModel> dLbl;

  private DLblsModel.DeleteOrDLblsValueModel deleteOrDLbls;

  private ExtensionListModel extLst;

  public DLblsBuilder() {
  }

  public DLblsBuilder setDLbl(List<DLblModel> dLbl) {
    this.dLbl = dLbl;
    return this;
  }

  public DLblsBuilder setDeleteOrDLbls(DLblsModel.DeleteOrDLblsValueModel deleteOrDLbls) {
    this.deleteOrDLbls = deleteOrDLbls;
    return this;
  }

  public DLblsBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DLblsModel build() {
    return new DLblsModel(this.dLbl, this.deleteOrDLbls, this.extLst);
  }

  public DLblsBuilder from(DLblsModel value) {
    this.dLbl = value.getDLbl();
    this.deleteOrDLbls = value.getDeleteOrDLbls();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrDLblsValueBuilder {
    private int type;

    private Object value;

    public DeleteOrDLblsValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrDLblsValueBuilder setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setNumFmt(NumFmtModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setSpPr(ShapePropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setTxPr(TextBodyModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setDLblPos(DLblPosModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowLegendKey(BooleanModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowVal(BooleanModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowCatName(BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowSerName(BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowPercent(BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowBubbleSize(BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setSeparator(StringValueModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setShowLeaderLines(BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrDLblsValueBuilder setLeaderLines(ChartLinesModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public DLblsModel.DeleteOrDLblsValueModel build() {
      if (this.type == -1) return new DLblsModel.DeleteOrDLblsValueModel();
      if (this.type == 0) return DLblsModel.DeleteOrDLblsValueModel.newDelete((BooleanModel) this.value);
      if (this.type == 1) return DLblsModel.DeleteOrDLblsValueModel.newNumFmt((NumFmtModel) this.value);
      if (this.type == 2) return DLblsModel.DeleteOrDLblsValueModel.newSpPr((ShapePropertiesModel) this.value);
      if (this.type == 3) return DLblsModel.DeleteOrDLblsValueModel.newTxPr((TextBodyModel) this.value);
      if (this.type == 4) return DLblsModel.DeleteOrDLblsValueModel.newDLblPos((DLblPosModel) this.value);
      if (this.type == 5) return DLblsModel.DeleteOrDLblsValueModel.newShowLegendKey((BooleanModel) this.value);
      if (this.type == 6) return DLblsModel.DeleteOrDLblsValueModel.newShowVal((BooleanModel) this.value);
      if (this.type == 7) return DLblsModel.DeleteOrDLblsValueModel.newShowCatName((BooleanModel) this.value);
      if (this.type == 8) return DLblsModel.DeleteOrDLblsValueModel.newShowSerName((BooleanModel) this.value);
      if (this.type == 9) return DLblsModel.DeleteOrDLblsValueModel.newShowPercent((BooleanModel) this.value);
      if (this.type == 10) return DLblsModel.DeleteOrDLblsValueModel.newShowBubbleSize((BooleanModel) this.value);
      if (this.type == 11) return DLblsModel.DeleteOrDLblsValueModel.newSeparator((StringValueModel) this.value);
      if (this.type == 12) return DLblsModel.DeleteOrDLblsValueModel.newShowLeaderLines((BooleanModel) this.value);
      if (this.type == 13) return DLblsModel.DeleteOrDLblsValueModel.newLeaderLines((ChartLinesModel) this.value);
      return null;
    }

    public DeleteOrDLblsValueBuilder from(DLblsModel.DeleteOrDLblsValueModel value) {
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
  }
}
