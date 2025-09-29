package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblModel;
import jxsd.gen.model.drawingml.chart.DLblPosModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import jxsd.gen.model.drawingml.chart.TxModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DLblBuilder {
  private UnsignedIntModel idx;

  private DLblModel.DeleteOrDLbl deleteOrDLbl;

  private ExtensionListModel extLst;

  public DLblBuilder() {
  }

  public DLblBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public DLblBuilder setDeleteOrDLbl(DLblModel.DeleteOrDLbl deleteOrDLbl) {
    this.deleteOrDLbl = deleteOrDLbl;
    return this;
  }

  public DLblBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DLblBuilder from(DLblModel value) {
    this.idx = value.getIdx();
    this.deleteOrDLbl = value.getDeleteOrDLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public DLblModel build() {
    return new DLblModel(this.idx, this.deleteOrDLbl, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class DeleteOrDLbl {
    private int type;

    private Object value;

    public DeleteOrDLbl() {
      this.type = -1;
      this.value = null;
    }

    public DeleteOrDLbl setDelete(BooleanModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setLayout(LayoutModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setTx(TxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setNumFmt(NumFmtModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setSpPr(ShapePropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setTxPr(TextBodyModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setDLblPos(DLblPosModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setShowLegendKey(BooleanModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setShowVal(BooleanModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setShowCatName(BooleanModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setShowSerName(BooleanModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setShowPercent(BooleanModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setShowBubbleSize(BooleanModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl setSeparator(String value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public DeleteOrDLbl from(DLblModel.DeleteOrDLbl value) {
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

    public DLblModel.DeleteOrDLbl build() {
      if (this.type == -1) return new DLblModel.DeleteOrDLbl();
      if (this.type == 0) return DLblModel.DeleteOrDLbl.newDelete((BooleanModel) this.value);
      if (this.type == 1) return DLblModel.DeleteOrDLbl.newLayout((LayoutModel) this.value);
      if (this.type == 2) return DLblModel.DeleteOrDLbl.newTx((TxModel) this.value);
      if (this.type == 3) return DLblModel.DeleteOrDLbl.newNumFmt((NumFmtModel) this.value);
      if (this.type == 4) return DLblModel.DeleteOrDLbl.newSpPr((ShapePropertiesModel) this.value);
      if (this.type == 5) return DLblModel.DeleteOrDLbl.newTxPr((TextBodyModel) this.value);
      if (this.type == 6) return DLblModel.DeleteOrDLbl.newDLblPos((DLblPosModel) this.value);
      if (this.type == 7) return DLblModel.DeleteOrDLbl.newShowLegendKey((BooleanModel) this.value);
      if (this.type == 8) return DLblModel.DeleteOrDLbl.newShowVal((BooleanModel) this.value);
      if (this.type == 9) return DLblModel.DeleteOrDLbl.newShowCatName((BooleanModel) this.value);
      if (this.type == 10) return DLblModel.DeleteOrDLbl.newShowSerName((BooleanModel) this.value);
      if (this.type == 11) return DLblModel.DeleteOrDLbl.newShowPercent((BooleanModel) this.value);
      if (this.type == 12) return DLblModel.DeleteOrDLbl.newShowBubbleSize((BooleanModel) this.value);
      if (this.type == 13) return DLblModel.DeleteOrDLbl.newSeparator((String) this.value);
      return null;
    }
  }
}
