package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
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

  private DLblModel.DeleteOrGroup_DLblModel deleteorgroupDLbl;

  private ExtensionListModel extLst;

  public DLblBuilder() {
  }

  public DLblBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public DLblBuilder setDeleteOrGroupDLbl(DLblModel.DeleteOrGroup_DLblModel deleteorgroupDLbl) {
    this.deleteorgroupDLbl = deleteorgroupDLbl;
    return this;
  }

  public DLblBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DLblModel build() {
    return new DLblModel(this.idx, this.deleteorgroupDLbl, this.extLst);
  }

  public DLblBuilder from(DLblModel value) {
    this.idx = value.getIdx();
    this.deleteorgroupDLbl = value.getDeleteOrGroupDLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class DeleteOrGroup_DLblBuilder {
    private int type;

    private Object value;

    public DeleteOrGroup_DLblBuilder() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrGroup_DLblBuilder setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setLayout(LayoutModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setTx(TxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setNumFmt(NumFmtModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setSpPr(ShapePropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setTxPr(TextBodyModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setDLblPos(DLblPosModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setShowLegendKey(BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setShowVal(BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setShowCatName(BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setShowSerName(BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setShowPercent(BooleanModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setShowBubbleSize(BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrGroup_DLblBuilder setSeparator(StringModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public DLblModel.DeleteOrGroup_DLblModel build() {
      if (this.type == -1) return new DLblModel.DeleteOrGroup_DLblModel();
      if (this.type == 0) return DLblModel.DeleteOrGroup_DLblModel.newDelete((BooleanModel) this.value);
      if (this.type == 1) return DLblModel.DeleteOrGroup_DLblModel.newLayout((LayoutModel) this.value);
      if (this.type == 2) return DLblModel.DeleteOrGroup_DLblModel.newTx((TxModel) this.value);
      if (this.type == 3) return DLblModel.DeleteOrGroup_DLblModel.newNumFmt((NumFmtModel) this.value);
      if (this.type == 4) return DLblModel.DeleteOrGroup_DLblModel.newSpPr((ShapePropertiesModel) this.value);
      if (this.type == 5) return DLblModel.DeleteOrGroup_DLblModel.newTxPr((TextBodyModel) this.value);
      if (this.type == 6) return DLblModel.DeleteOrGroup_DLblModel.newDLblPos((DLblPosModel) this.value);
      if (this.type == 7) return DLblModel.DeleteOrGroup_DLblModel.newShowLegendKey((BooleanModel) this.value);
      if (this.type == 8) return DLblModel.DeleteOrGroup_DLblModel.newShowVal((BooleanModel) this.value);
      if (this.type == 9) return DLblModel.DeleteOrGroup_DLblModel.newShowCatName((BooleanModel) this.value);
      if (this.type == 10) return DLblModel.DeleteOrGroup_DLblModel.newShowSerName((BooleanModel) this.value);
      if (this.type == 11) return DLblModel.DeleteOrGroup_DLblModel.newShowPercent((BooleanModel) this.value);
      if (this.type == 12) return DLblModel.DeleteOrGroup_DLblModel.newShowBubbleSize((BooleanModel) this.value);
      if (this.type == 13) return DLblModel.DeleteOrGroup_DLblModel.newSeparator((StringModel) this.value);
      return null;
    }

    public DeleteOrGroup_DLblBuilder from(DLblModel.DeleteOrGroup_DLblModel value) {
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
