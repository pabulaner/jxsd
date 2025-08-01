package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DLblModel;
import com.scell.model.drawingml.chart.DLblPosModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.NumFmtModel;
import com.scell.model.drawingml.chart.TxModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Object;

public class DLblBuilder {
  private UnsignedIntModel idx;

  private DLblModel.DeleteOrDLblValueModel deleteOrDLbl;

  private ExtensionListModel extLst;

  public DLblBuilder() {
  }

  public DLblBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public DLblBuilder setDeleteOrDLbl(DLblModel.DeleteOrDLblValueModel deleteOrDLbl) {
    this.deleteOrDLbl = deleteOrDLbl;
    return this;
  }

  public DLblBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DLblModel build() {
    return new DLblModel(this.idx, this.deleteOrDLbl, this.extLst);
  }

  public DLblBuilder from(DLblModel value) {
    this.idx = value.getIdx();
    this.deleteOrDLbl = value.getDeleteOrDLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrDLblValueBuilder {
    private int type;

    private Object value;

    public DeleteOrDLblValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrDLblValueBuilder setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setLayout(LayoutModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setTx(TxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setNumFmt(NumFmtModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setSpPr(ShapePropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setTxPr(TextBodyModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setDLblPos(DLblPosModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setShowLegendKey(BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setShowVal(BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setShowCatName(BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setShowSerName(BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setShowPercent(BooleanModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setShowBubbleSize(BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrDLblValueBuilder setSeparator(StringValueModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public DLblModel.DeleteOrDLblValueModel build() {
      if (this.type == -1) return new DLblModel.DeleteOrDLblValueModel();
      if (this.type == 0) return DLblModel.DeleteOrDLblValueModel.newDelete((BooleanModel) this.value);
      if (this.type == 1) return DLblModel.DeleteOrDLblValueModel.newLayout((LayoutModel) this.value);
      if (this.type == 2) return DLblModel.DeleteOrDLblValueModel.newTx((TxModel) this.value);
      if (this.type == 3) return DLblModel.DeleteOrDLblValueModel.newNumFmt((NumFmtModel) this.value);
      if (this.type == 4) return DLblModel.DeleteOrDLblValueModel.newSpPr((ShapePropertiesModel) this.value);
      if (this.type == 5) return DLblModel.DeleteOrDLblValueModel.newTxPr((TextBodyModel) this.value);
      if (this.type == 6) return DLblModel.DeleteOrDLblValueModel.newDLblPos((DLblPosModel) this.value);
      if (this.type == 7) return DLblModel.DeleteOrDLblValueModel.newShowLegendKey((BooleanModel) this.value);
      if (this.type == 8) return DLblModel.DeleteOrDLblValueModel.newShowVal((BooleanModel) this.value);
      if (this.type == 9) return DLblModel.DeleteOrDLblValueModel.newShowCatName((BooleanModel) this.value);
      if (this.type == 10) return DLblModel.DeleteOrDLblValueModel.newShowSerName((BooleanModel) this.value);
      if (this.type == 11) return DLblModel.DeleteOrDLblValueModel.newShowPercent((BooleanModel) this.value);
      if (this.type == 12) return DLblModel.DeleteOrDLblValueModel.newShowBubbleSize((BooleanModel) this.value);
      if (this.type == 13) return DLblModel.DeleteOrDLblValueModel.newSeparator((StringValueModel) this.value);
      return null;
    }

    public DeleteOrDLblValueBuilder from(DLblModel.DeleteOrDLblValueModel value) {
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
