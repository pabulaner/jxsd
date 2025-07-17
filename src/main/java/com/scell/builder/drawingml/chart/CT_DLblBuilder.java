package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblModel;
import com.scell.model.drawingml.chart.CT_DLblPosModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.chart.CT_TxModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;

public class CT_DLblBuilder {
  private CT_UnsignedIntModel idx;

  private CT_DLblModel.DeleteOrLayoutModel deleteOrLayout;

  private CT_ExtensionListModel extLst;

  public CT_DLblBuilder() {
  }

  public CT_DLblBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_DLblBuilder setDeleteOrLayout(CT_DLblModel.DeleteOrLayoutModel deleteOrLayout) {
    this.deleteOrLayout = deleteOrLayout;
    return this;
  }

  public CT_DLblBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DLblModel build() {
    return new CT_DLblModel(this.idx, this.deleteOrLayout, this.extLst);
  }

  public CT_DLblBuilder from(CT_DLblModel value) {
    this.idx = value.getIdx();
    this.deleteOrLayout = value.getDeleteOrLayout();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrLayoutBuilder {
    private int type;

    private Object value;

    public DeleteOrLayoutBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrLayoutBuilder setDelete(CT_BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setLayout(CT_LayoutModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setTx(CT_TxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setNumFmt(CT_NumFmtModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setSpPr(CT_ShapePropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setTxPr(CT_TextBodyModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setDLblPos(CT_DLblPosModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setShowLegendKey(CT_BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setShowVal(CT_BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setShowCatName(CT_BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setShowSerName(CT_BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setShowPercent(CT_BooleanModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setShowBubbleSize(CT_BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrLayoutBuilder setSeparator(StringModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public CT_DLblModel.DeleteOrLayoutModel build() {
      if (this.type == -1) return new CT_DLblModel.DeleteOrLayoutModel();
      if (this.type == 0) return CT_DLblModel.DeleteOrLayoutModel.newDelete((CT_BooleanModel) this.value);
      if (this.type == 1) return CT_DLblModel.DeleteOrLayoutModel.newLayout((CT_LayoutModel) this.value);
      if (this.type == 2) return CT_DLblModel.DeleteOrLayoutModel.newTx((CT_TxModel) this.value);
      if (this.type == 3) return CT_DLblModel.DeleteOrLayoutModel.newNumFmt((CT_NumFmtModel) this.value);
      if (this.type == 4) return CT_DLblModel.DeleteOrLayoutModel.newSpPr((CT_ShapePropertiesModel) this.value);
      if (this.type == 5) return CT_DLblModel.DeleteOrLayoutModel.newTxPr((CT_TextBodyModel) this.value);
      if (this.type == 6) return CT_DLblModel.DeleteOrLayoutModel.newDLblPos((CT_DLblPosModel) this.value);
      if (this.type == 7) return CT_DLblModel.DeleteOrLayoutModel.newShowLegendKey((CT_BooleanModel) this.value);
      if (this.type == 8) return CT_DLblModel.DeleteOrLayoutModel.newShowVal((CT_BooleanModel) this.value);
      if (this.type == 9) return CT_DLblModel.DeleteOrLayoutModel.newShowCatName((CT_BooleanModel) this.value);
      if (this.type == 10) return CT_DLblModel.DeleteOrLayoutModel.newShowSerName((CT_BooleanModel) this.value);
      if (this.type == 11) return CT_DLblModel.DeleteOrLayoutModel.newShowPercent((CT_BooleanModel) this.value);
      if (this.type == 12) return CT_DLblModel.DeleteOrLayoutModel.newShowBubbleSize((CT_BooleanModel) this.value);
      if (this.type == 13) return CT_DLblModel.DeleteOrLayoutModel.newSeparator((StringModel) this.value);
      return null;
    }

    public DeleteOrLayoutBuilder from(CT_DLblModel.DeleteOrLayoutModel value) {
      this.type = -1;
      this.value = null;
      if (value.isDelete()) {
        this.type = 0;
        this.value = value.getDelete();
      }
      if (value.isLayout()) {
        this.type = 1;
        this.value = value.getLayout();
      }
      if (value.isTx()) {
        this.type = 2;
        this.value = value.getTx();
      }
      if (value.isNumFmt()) {
        this.type = 3;
        this.value = value.getNumFmt();
      }
      if (value.isSpPr()) {
        this.type = 4;
        this.value = value.getSpPr();
      }
      if (value.isTxPr()) {
        this.type = 5;
        this.value = value.getTxPr();
      }
      if (value.isDLblPos()) {
        this.type = 6;
        this.value = value.getDLblPos();
      }
      if (value.isShowLegendKey()) {
        this.type = 7;
        this.value = value.getShowLegendKey();
      }
      if (value.isShowVal()) {
        this.type = 8;
        this.value = value.getShowVal();
      }
      if (value.isShowCatName()) {
        this.type = 9;
        this.value = value.getShowCatName();
      }
      if (value.isShowSerName()) {
        this.type = 10;
        this.value = value.getShowSerName();
      }
      if (value.isShowPercent()) {
        this.type = 11;
        this.value = value.getShowPercent();
      }
      if (value.isShowBubbleSize()) {
        this.type = 12;
        this.value = value.getShowBubbleSize();
      }
      if (value.isSeparator()) {
        this.type = 13;
        this.value = value.getSeparator();
      }
      return this;
    }
  }
}
