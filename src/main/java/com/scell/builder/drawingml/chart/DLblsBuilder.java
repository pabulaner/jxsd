package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
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

  private DLblsModel.DeleteOrGroup_DLblsModel deleteorgroupDLbls;

  private ExtensionListModel extLst;

  public DLblsBuilder() {
  }

  public DLblsBuilder setDLbl(List<DLblModel> dLbl) {
    this.dLbl = dLbl;
    return this;
  }

  public DLblsBuilder setDeleteOrGroupDLbls(
      DLblsModel.DeleteOrGroup_DLblsModel deleteorgroupDLbls) {
    this.deleteorgroupDLbls = deleteorgroupDLbls;
    return this;
  }

  public DLblsBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DLblsModel build() {
    return new DLblsModel(this.dLbl, this.deleteorgroupDLbls, this.extLst);
  }

  public DLblsBuilder from(DLblsModel value) {
    this.dLbl = value.getDLbl();
    this.deleteorgroupDLbls = value.getDeleteOrGroupDLbls();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrGroup_DLblsBuilder {
    private int type;

    private Object value;

    public DeleteOrGroup_DLblsBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrGroup_DLblsBuilder setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setNumFmt(NumFmtModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setSpPr(ShapePropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setTxPr(TextBodyModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setDLblPos(DLblPosModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowLegendKey(BooleanModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowVal(BooleanModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowCatName(BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowSerName(BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowPercent(BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowBubbleSize(BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setSeparator(StringModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setShowLeaderLines(BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblsBuilder setLeaderLines(ChartLinesModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public DLblsModel.DeleteOrGroup_DLblsModel build() {
      if (this.type == -1) return new DLblsModel.DeleteOrGroup_DLblsModel();
      if (this.type == 0) return DLblsModel.DeleteOrGroup_DLblsModel.newDelete((BooleanModel) this.value);
      if (this.type == 1) return DLblsModel.DeleteOrGroup_DLblsModel.newNumFmt((NumFmtModel) this.value);
      if (this.type == 2) return DLblsModel.DeleteOrGroup_DLblsModel.newSpPr((ShapePropertiesModel) this.value);
      if (this.type == 3) return DLblsModel.DeleteOrGroup_DLblsModel.newTxPr((TextBodyModel) this.value);
      if (this.type == 4) return DLblsModel.DeleteOrGroup_DLblsModel.newDLblPos((DLblPosModel) this.value);
      if (this.type == 5) return DLblsModel.DeleteOrGroup_DLblsModel.newShowLegendKey((BooleanModel) this.value);
      if (this.type == 6) return DLblsModel.DeleteOrGroup_DLblsModel.newShowVal((BooleanModel) this.value);
      if (this.type == 7) return DLblsModel.DeleteOrGroup_DLblsModel.newShowCatName((BooleanModel) this.value);
      if (this.type == 8) return DLblsModel.DeleteOrGroup_DLblsModel.newShowSerName((BooleanModel) this.value);
      if (this.type == 9) return DLblsModel.DeleteOrGroup_DLblsModel.newShowPercent((BooleanModel) this.value);
      if (this.type == 10) return DLblsModel.DeleteOrGroup_DLblsModel.newShowBubbleSize((BooleanModel) this.value);
      if (this.type == 11) return DLblsModel.DeleteOrGroup_DLblsModel.newSeparator((StringModel) this.value);
      if (this.type == 12) return DLblsModel.DeleteOrGroup_DLblsModel.newShowLeaderLines((BooleanModel) this.value);
      if (this.type == 13) return DLblsModel.DeleteOrGroup_DLblsModel.newLeaderLines((ChartLinesModel) this.value);
      return null;
    }

    public DeleteOrGroup_DLblsBuilder from(DLblsModel.DeleteOrGroup_DLblsModel value) {
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
