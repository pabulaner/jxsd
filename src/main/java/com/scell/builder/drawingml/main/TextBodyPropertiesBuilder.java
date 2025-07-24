package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.AngleModel;
import com.scell.model.drawingml.main.Coordinate32Model;
import com.scell.model.drawingml.main.FlatTextModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PositiveCoordinate32Model;
import com.scell.model.drawingml.main.PresetTextShapeModel;
import com.scell.model.drawingml.main.Scene3DModel;
import com.scell.model.drawingml.main.Shape3DModel;
import com.scell.model.drawingml.main.TextAnchoringTypeModel;
import com.scell.model.drawingml.main.TextBodyPropertiesModel;
import com.scell.model.drawingml.main.TextColumnCountModel;
import com.scell.model.drawingml.main.TextHorzOverflowTypeModel;
import com.scell.model.drawingml.main.TextNoAutofitModel;
import com.scell.model.drawingml.main.TextNormalAutofitModel;
import com.scell.model.drawingml.main.TextShapeAutofitModel;
import com.scell.model.drawingml.main.TextVertOverflowTypeModel;
import com.scell.model.drawingml.main.TextVerticalTypeModel;
import com.scell.model.drawingml.main.TextWrappingTypeModel;
import java.lang.Object;

public class TextBodyPropertiesBuilder {
  private BooleanModel compatLnSpc;

  private TextVertOverflowTypeModel vertOverflow;

  private Coordinate32Model bIns;

  private TextVerticalTypeModel vert;

  private BooleanModel anchorCtr;

  private TextColumnCountModel numCol;

  private AngleModel rot;

  private Coordinate32Model tIns;

  private Coordinate32Model lIns;

  private PositiveCoordinate32Model spcCol;

  private TextWrappingTypeModel wrap;

  private BooleanModel fromWordArt;

  private BooleanModel spcFirstLastPara;

  private BooleanModel upright;

  private TextHorzOverflowTypeModel horzOverflow;

  private Coordinate32Model rIns;

  private BooleanModel rtlCol;

  private BooleanModel forceAA;

  private TextAnchoringTypeModel anchor;

  private PresetTextShapeModel prstTxWarp;

  private TextBodyPropertiesModel.TextAutofitModel egTextAutofit;

  private Scene3DModel scene3d;

  private TextBodyPropertiesModel.Text3DModel egText3D;

  private OfficeArtExtensionListModel extLst;

  public TextBodyPropertiesBuilder() {
  }

  public TextBodyPropertiesBuilder setCompatLnSpc(BooleanModel compatLnSpc) {
    this.compatLnSpc = compatLnSpc;
    return this;
  }

  public TextBodyPropertiesBuilder setVertOverflow(TextVertOverflowTypeModel vertOverflow) {
    this.vertOverflow = vertOverflow;
    return this;
  }

  public TextBodyPropertiesBuilder setBIns(Coordinate32Model bIns) {
    this.bIns = bIns;
    return this;
  }

  public TextBodyPropertiesBuilder setVert(TextVerticalTypeModel vert) {
    this.vert = vert;
    return this;
  }

  public TextBodyPropertiesBuilder setAnchorCtr(BooleanModel anchorCtr) {
    this.anchorCtr = anchorCtr;
    return this;
  }

  public TextBodyPropertiesBuilder setNumCol(TextColumnCountModel numCol) {
    this.numCol = numCol;
    return this;
  }

  public TextBodyPropertiesBuilder setRot(AngleModel rot) {
    this.rot = rot;
    return this;
  }

  public TextBodyPropertiesBuilder setTIns(Coordinate32Model tIns) {
    this.tIns = tIns;
    return this;
  }

  public TextBodyPropertiesBuilder setLIns(Coordinate32Model lIns) {
    this.lIns = lIns;
    return this;
  }

  public TextBodyPropertiesBuilder setSpcCol(PositiveCoordinate32Model spcCol) {
    this.spcCol = spcCol;
    return this;
  }

  public TextBodyPropertiesBuilder setWrap(TextWrappingTypeModel wrap) {
    this.wrap = wrap;
    return this;
  }

  public TextBodyPropertiesBuilder setFromWordArt(BooleanModel fromWordArt) {
    this.fromWordArt = fromWordArt;
    return this;
  }

  public TextBodyPropertiesBuilder setSpcFirstLastPara(BooleanModel spcFirstLastPara) {
    this.spcFirstLastPara = spcFirstLastPara;
    return this;
  }

  public TextBodyPropertiesBuilder setUpright(BooleanModel upright) {
    this.upright = upright;
    return this;
  }

  public TextBodyPropertiesBuilder setHorzOverflow(TextHorzOverflowTypeModel horzOverflow) {
    this.horzOverflow = horzOverflow;
    return this;
  }

  public TextBodyPropertiesBuilder setRIns(Coordinate32Model rIns) {
    this.rIns = rIns;
    return this;
  }

  public TextBodyPropertiesBuilder setRtlCol(BooleanModel rtlCol) {
    this.rtlCol = rtlCol;
    return this;
  }

  public TextBodyPropertiesBuilder setForceAA(BooleanModel forceAA) {
    this.forceAA = forceAA;
    return this;
  }

  public TextBodyPropertiesBuilder setAnchor(TextAnchoringTypeModel anchor) {
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
