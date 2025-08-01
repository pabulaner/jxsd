package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.AngleValueModel;
import com.scell.model.drawingml.main.Coordinate32ValueModel;
import com.scell.model.drawingml.main.FlatTextModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PositiveCoordinate32ValueModel;
import com.scell.model.drawingml.main.PresetTextShapeModel;
import com.scell.model.drawingml.main.Scene3DModel;
import com.scell.model.drawingml.main.Shape3DModel;
import com.scell.model.drawingml.main.TextAnchoringTypeValueModel;
import com.scell.model.drawingml.main.TextBodyPropertiesModel;
import com.scell.model.drawingml.main.TextColumnCountValueModel;
import com.scell.model.drawingml.main.TextHorzOverflowTypeValueModel;
import com.scell.model.drawingml.main.TextNoAutofitModel;
import com.scell.model.drawingml.main.TextNormalAutofitModel;
import com.scell.model.drawingml.main.TextShapeAutofitModel;
import com.scell.model.drawingml.main.TextVertOverflowTypeValueModel;
import com.scell.model.drawingml.main.TextVerticalTypeValueModel;
import com.scell.model.drawingml.main.TextWrappingTypeValueModel;
import java.lang.Object;

public class TextBodyPropertiesBuilder {
  private BooleanValueModel compatLnSpc;

  private TextVertOverflowTypeValueModel vertOverflow;

  private Coordinate32ValueModel bIns;

  private TextVerticalTypeValueModel vert;

  private BooleanValueModel anchorCtr;

  private TextColumnCountValueModel numCol;

  private AngleValueModel rot;

  private Coordinate32ValueModel tIns;

  private Coordinate32ValueModel lIns;

  private PositiveCoordinate32ValueModel spcCol;

  private TextWrappingTypeValueModel wrap;

  private BooleanValueModel fromWordArt;

  private BooleanValueModel spcFirstLastPara;

  private BooleanValueModel upright;

  private TextHorzOverflowTypeValueModel horzOverflow;

  private Coordinate32ValueModel rIns;

  private BooleanValueModel rtlCol;

  private BooleanValueModel forceAA;

  private TextAnchoringTypeValueModel anchor;

  private PresetTextShapeModel prstTxWarp;

  private TextBodyPropertiesModel.TextAutofitModel egTextAutofit;

  private Scene3DModel scene3d;

  private TextBodyPropertiesModel.Text3DModel egText3D;

  private OfficeArtExtensionListModel extLst;

  public TextBodyPropertiesBuilder() {
  }

  public TextBodyPropertiesBuilder setCompatLnSpc(BooleanValueModel compatLnSpc) {
    this.compatLnSpc = compatLnSpc;
    return this;
  }

  public TextBodyPropertiesBuilder setVertOverflow(TextVertOverflowTypeValueModel vertOverflow) {
    this.vertOverflow = vertOverflow;
    return this;
  }

  public TextBodyPropertiesBuilder setBIns(Coordinate32ValueModel bIns) {
    this.bIns = bIns;
    return this;
  }

  public TextBodyPropertiesBuilder setVert(TextVerticalTypeValueModel vert) {
    this.vert = vert;
    return this;
  }

  public TextBodyPropertiesBuilder setAnchorCtr(BooleanValueModel anchorCtr) {
    this.anchorCtr = anchorCtr;
    return this;
  }

  public TextBodyPropertiesBuilder setNumCol(TextColumnCountValueModel numCol) {
    this.numCol = numCol;
    return this;
  }

  public TextBodyPropertiesBuilder setRot(AngleValueModel rot) {
    this.rot = rot;
    return this;
  }

  public TextBodyPropertiesBuilder setTIns(Coordinate32ValueModel tIns) {
    this.tIns = tIns;
    return this;
  }

  public TextBodyPropertiesBuilder setLIns(Coordinate32ValueModel lIns) {
    this.lIns = lIns;
    return this;
  }

  public TextBodyPropertiesBuilder setSpcCol(PositiveCoordinate32ValueModel spcCol) {
    this.spcCol = spcCol;
    return this;
  }

  public TextBodyPropertiesBuilder setWrap(TextWrappingTypeValueModel wrap) {
    this.wrap = wrap;
    return this;
  }

  public TextBodyPropertiesBuilder setFromWordArt(BooleanValueModel fromWordArt) {
    this.fromWordArt = fromWordArt;
    return this;
  }

  public TextBodyPropertiesBuilder setSpcFirstLastPara(BooleanValueModel spcFirstLastPara) {
    this.spcFirstLastPara = spcFirstLastPara;
    return this;
  }

  public TextBodyPropertiesBuilder setUpright(BooleanValueModel upright) {
    this.upright = upright;
    return this;
  }

  public TextBodyPropertiesBuilder setHorzOverflow(TextHorzOverflowTypeValueModel horzOverflow) {
    this.horzOverflow = horzOverflow;
    return this;
  }

  public TextBodyPropertiesBuilder setRIns(Coordinate32ValueModel rIns) {
    this.rIns = rIns;
    return this;
  }

  public TextBodyPropertiesBuilder setRtlCol(BooleanValueModel rtlCol) {
    this.rtlCol = rtlCol;
    return this;
  }

  public TextBodyPropertiesBuilder setForceAA(BooleanValueModel forceAA) {
    this.forceAA = forceAA;
    return this;
  }

  public TextBodyPropertiesBuilder setAnchor(TextAnchoringTypeValueModel anchor) {
    this.anchor = anchor;
    return this;
  }

  public TextBodyPropertiesBuilder setPrstTxWarp(PresetTextShapeModel prstTxWarp) {
    this.prstTxWarp = prstTxWarp;
    return this;
  }

  public TextBodyPropertiesBuilder setEGTextAutofit(
      TextBodyPropertiesModel.TextAutofitModel egTextAutofit) {
    this.egTextAutofit = egTextAutofit;
    return this;
  }

  public TextBodyPropertiesBuilder setScene3D(Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public TextBodyPropertiesBuilder setEGText3D(TextBodyPropertiesModel.Text3DModel egText3D) {
    this.egText3D = egText3D;
    return this;
  }

  public TextBodyPropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TextBodyPropertiesModel build() {
    return new TextBodyPropertiesModel(this.compatLnSpc, this.vertOverflow, this.bIns, this.vert, this.anchorCtr, this.numCol, this.rot, this.tIns, this.lIns, this.spcCol, this.wrap, this.fromWordArt, this.spcFirstLastPara, this.upright, this.horzOverflow, this.rIns, this.rtlCol, this.forceAA, this.anchor, this.prstTxWarp, this.egTextAutofit, this.scene3d, this.egText3D, this.extLst);
  }

  public TextBodyPropertiesBuilder from(TextBodyPropertiesModel value) {
    this.compatLnSpc = value.getCompatLnSpc();
    this.vertOverflow = value.getVertOverflow();
    this.bIns = value.getBIns();
    this.vert = value.getVert();
    this.anchorCtr = value.getAnchorCtr();
    this.numCol = value.getNumCol();
    this.rot = value.getRot();
    this.tIns = value.getTIns();
    this.lIns = value.getLIns();
    this.spcCol = value.getSpcCol();
    this.wrap = value.getWrap();
    this.fromWordArt = value.getFromWordArt();
    this.spcFirstLastPara = value.getSpcFirstLastPara();
    this.upright = value.getUpright();
    this.horzOverflow = value.getHorzOverflow();
    this.rIns = value.getRIns();
    this.rtlCol = value.getRtlCol();
    this.forceAA = value.getForceAA();
    this.anchor = value.getAnchor();
    this.prstTxWarp = value.getPrstTxWarp();
    this.egTextAutofit = value.getEGTextAutofit();
    this.scene3d = value.getScene3D();
    this.egText3D = value.getEGText3D();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class TextAutofitBuilder {
    private int type;

    private Object value;

    public TextAutofitBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextAutofitBuilder setNoAutofit(TextNoAutofitModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextAutofitBuilder setNormAutofit(TextNormalAutofitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextAutofitBuilder setSpAutoFit(TextShapeAutofitModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public TextBodyPropertiesModel.TextAutofitModel build() {
      if (this.type == -1) return new TextBodyPropertiesModel.TextAutofitModel();
      if (this.type == 0) return TextBodyPropertiesModel.TextAutofitModel.newNoAutofit((TextNoAutofitModel) this.value);
      if (this.type == 1) return TextBodyPropertiesModel.TextAutofitModel.newNormAutofit((TextNormalAutofitModel) this.value);
      if (this.type == 2) return TextBodyPropertiesModel.TextAutofitModel.newSpAutoFit((TextShapeAutofitModel) this.value);
      return null;
    }

    public TextAutofitBuilder from(TextBodyPropertiesModel.TextAutofitModel value) {
      this.type = -1;
      this.value = null;
      if (value.isNoAutofit()) {
        this.type = 0;
        this.value = value.getNoAutofit();
      }
      if (value.isNormAutofit()) {
        this.type = 1;
        this.value = value.getNormAutofit();
      }
      if (value.isSpAutoFit()) {
        this.type = 2;
        this.value = value.getSpAutoFit();
      }
      return this;
    }
  }

  public static class Text3DBuilder {
    private int type;

    private Object value;

    public Text3DBuilder() {
      this.type = -1;
      this.value = null;
    }

    public Text3DBuilder setSp3D(Shape3DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public Text3DBuilder setFlatTx(FlatTextModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextBodyPropertiesModel.Text3DModel build() {
      if (this.type == -1) return new TextBodyPropertiesModel.Text3DModel();
      if (this.type == 0) return TextBodyPropertiesModel.Text3DModel.newSp3D((Shape3DModel) this.value);
      if (this.type == 1) return TextBodyPropertiesModel.Text3DModel.newFlatTx((FlatTextModel) this.value);
      return null;
    }

    public Text3DBuilder from(TextBodyPropertiesModel.Text3DModel value) {
      this.type = -1;
      this.value = null;
      if (value.isSp3D()) {
        this.type = 0;
        this.value = value.getSp3D();
      }
      if (value.isFlatTx()) {
        this.type = 1;
        this.value = value.getFlatTx();
      }
      return this;
    }
  }
}
