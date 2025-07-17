package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_DLblModel;
import com.scell.model.drawingml.chart.CT_DLblPosModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;
import java.util.List;

public class CT_DLblsBuilder {
  private List<CT_DLblModel> dLbl;

  private CT_DLblsModel.DeleteOrNumFmtModel deleteOrNumFmt;

  private CT_ExtensionListModel extLst;

  public CT_DLblsBuilder() {
  }

  public CT_DLblsBuilder setDLbl(List<CT_DLblModel> dLbl) {
    this.dLbl = dLbl;
    return this;
  }

  public CT_DLblsBuilder setDeleteOrNumFmt(CT_DLblsModel.DeleteOrNumFmtModel deleteOrNumFmt) {
    this.deleteOrNumFmt = deleteOrNumFmt;
    return this;
  }

  public CT_DLblsBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DLblsModel build() {
    return new CT_DLblsModel(this.dLbl, this.deleteOrNumFmt, this.extLst);
  }

  public CT_DLblsBuilder from(CT_DLblsModel value) {
    this.dLbl = value.getDLbl();
    this.deleteOrNumFmt = value.getDeleteOrNumFmt();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrNumFmtBuilder {
    private int type;

    private Object value;

    public DeleteOrNumFmtBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrNumFmtBuilder setDelete(CT_BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setNumFmt(CT_NumFmtModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setSpPr(CT_ShapePropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setTxPr(CT_TextBodyModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setDLblPos(CT_DLblPosModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowLegendKey(CT_BooleanModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowVal(CT_BooleanModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowCatName(CT_BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowSerName(CT_BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowPercent(CT_BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowBubbleSize(CT_BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setSeparator(StringModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setShowLeaderLines(CT_BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrNumFmtBuilder setLeaderLines(CT_ChartLinesModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public CT_DLblsModel.DeleteOrNumFmtModel build() {
      if (this.type == -1) return new CT_DLblsModel.DeleteOrNumFmtModel();
      if (this.type == 0) return CT_DLblsModel.DeleteOrNumFmtModel.newDelete((CT_BooleanModel) this.value);
      if (this.type == 1) return CT_DLblsModel.DeleteOrNumFmtModel.newNumFmt((CT_NumFmtModel) this.value);
      if (this.type == 2) return CT_DLblsModel.DeleteOrNumFmtModel.newSpPr((CT_ShapePropertiesModel) this.value);
      if (this.type == 3) return CT_DLblsModel.DeleteOrNumFmtModel.newTxPr((CT_TextBodyModel) this.value);
      if (this.type == 4) return CT_DLblsModel.DeleteOrNumFmtModel.newDLblPos((CT_DLblPosModel) this.value);
      if (this.type == 5) return CT_DLblsModel.DeleteOrNumFmtModel.newShowLegendKey((CT_BooleanModel) this.value);
      if (this.type == 6) return CT_DLblsModel.DeleteOrNumFmtModel.newShowVal((CT_BooleanModel) this.value);
      if (this.type == 7) return CT_DLblsModel.DeleteOrNumFmtModel.newShowCatName((CT_BooleanModel) this.value);
      if (this.type == 8) return CT_DLblsModel.DeleteOrNumFmtModel.newShowSerName((CT_BooleanModel) this.value);
      if (this.type == 9) return CT_DLblsModel.DeleteOrNumFmtModel.newShowPercent((CT_BooleanModel) this.value);
      if (this.type == 10) return CT_DLblsModel.DeleteOrNumFmtModel.newShowBubbleSize((CT_BooleanModel) this.value);
      if (this.type == 11) return CT_DLblsModel.DeleteOrNumFmtModel.newSeparator((StringModel) this.value);
      if (this.type == 12) return CT_DLblsModel.DeleteOrNumFmtModel.newShowLeaderLines((CT_BooleanModel) this.value);
      if (this.type == 13) return CT_DLblsModel.DeleteOrNumFmtModel.newLeaderLines((CT_ChartLinesModel) this.value);
      return null;
    }

    public DeleteOrNumFmtBuilder from(CT_DLblsModel.DeleteOrNumFmtModel value) {
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
