package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_FlatTextModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PresetTextShapeModel;
import com.scell.model.drawingml.main.CT_Scene3DModel;
import com.scell.model.drawingml.main.CT_Shape3DModel;
import com.scell.model.drawingml.main.CT_TextBodyPropertiesModel;
import com.scell.model.drawingml.main.CT_TextNoAutofitModel;
import com.scell.model.drawingml.main.CT_TextNormalAutofitModel;
import com.scell.model.drawingml.main.CT_TextShapeAutofitModel;
import com.scell.model.drawingml.main.ST_AngleModel;
import com.scell.model.drawingml.main.ST_Coordinate32Model;
import com.scell.model.drawingml.main.ST_PositiveCoordinate32Model;
import com.scell.model.drawingml.main.ST_TextAnchoringTypeModel;
import com.scell.model.drawingml.main.ST_TextColumnCountModel;
import com.scell.model.drawingml.main.ST_TextHorzOverflowTypeModel;
import com.scell.model.drawingml.main.ST_TextVertOverflowTypeModel;
import com.scell.model.drawingml.main.ST_TextVerticalTypeModel;
import com.scell.model.drawingml.main.ST_TextWrappingTypeModel;
import java.lang.Object;

public class CT_TextBodyPropertiesBuilder {
  private BooleanModel compatLnSpc;

  private ST_TextVertOverflowTypeModel vertOverflow;

  private ST_Coordinate32Model bIns;

  private ST_TextVerticalTypeModel vert;

  private BooleanModel anchorCtr;

  private ST_TextColumnCountModel numCol;

  private ST_AngleModel rot;

  private ST_Coordinate32Model tIns;

  private ST_Coordinate32Model lIns;

  private ST_PositiveCoordinate32Model spcCol;

  private ST_TextWrappingTypeModel wrap;

  private BooleanModel fromWordArt;

  private BooleanModel spcFirstLastPara;

  private BooleanModel upright;

  private ST_TextHorzOverflowTypeModel horzOverflow;

  private ST_Coordinate32Model rIns;

  private BooleanModel rtlCol;

  private BooleanModel forceAA;

  private ST_TextAnchoringTypeModel anchor;

  private CT_PresetTextShapeModel prstTxWarp;

  private CT_TextBodyPropertiesModel.EG_TextAutofitModel egTextAutofit;

  private CT_Scene3DModel scene3d;

  private CT_TextBodyPropertiesModel.EG_Text3DModel egText3D;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_TextBodyPropertiesBuilder() {
  }

  public CT_TextBodyPropertiesBuilder setCompatLnSpc(BooleanModel compatLnSpc) {
    this.compatLnSpc = compatLnSpc;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setVertOverflow(ST_TextVertOverflowTypeModel vertOverflow) {
    this.vertOverflow = vertOverflow;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setBIns(ST_Coordinate32Model bIns) {
    this.bIns = bIns;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setVert(ST_TextVerticalTypeModel vert) {
    this.vert = vert;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setAnchorCtr(BooleanModel anchorCtr) {
    this.anchorCtr = anchorCtr;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setNumCol(ST_TextColumnCountModel numCol) {
    this.numCol = numCol;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setRot(ST_AngleModel rot) {
    this.rot = rot;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setTIns(ST_Coordinate32Model tIns) {
    this.tIns = tIns;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setLIns(ST_Coordinate32Model lIns) {
    this.lIns = lIns;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setSpcCol(ST_PositiveCoordinate32Model spcCol) {
    this.spcCol = spcCol;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setWrap(ST_TextWrappingTypeModel wrap) {
    this.wrap = wrap;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setFromWordArt(BooleanModel fromWordArt) {
    this.fromWordArt = fromWordArt;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setSpcFirstLastPara(BooleanModel spcFirstLastPara) {
    this.spcFirstLastPara = spcFirstLastPara;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setUpright(BooleanModel upright) {
    this.upright = upright;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setHorzOverflow(ST_TextHorzOverflowTypeModel horzOverflow) {
    this.horzOverflow = horzOverflow;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setRIns(ST_Coordinate32Model rIns) {
    this.rIns = rIns;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setRtlCol(BooleanModel rtlCol) {
    this.rtlCol = rtlCol;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setForceAA(BooleanModel forceAA) {
    this.forceAA = forceAA;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setAnchor(ST_TextAnchoringTypeModel anchor) {
    this.anchor = anchor;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setPrstTxWarp(CT_PresetTextShapeModel prstTxWarp) {
    this.prstTxWarp = prstTxWarp;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setEGTextAutofit(
      CT_TextBodyPropertiesModel.EG_TextAutofitModel egTextAutofit) {
    this.egTextAutofit = egTextAutofit;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setScene3D(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setEGText3D(
      CT_TextBodyPropertiesModel.EG_Text3DModel egText3D) {
    this.egText3D = egText3D;
    return this;
  }

  public CT_TextBodyPropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TextBodyPropertiesModel build() {
    return new CT_TextBodyPropertiesModel(this.compatLnSpc, this.vertOverflow, this.bIns, this.vert, this.anchorCtr, this.numCol, this.rot, this.tIns, this.lIns, this.spcCol, this.wrap, this.fromWordArt, this.spcFirstLastPara, this.upright, this.horzOverflow, this.rIns, this.rtlCol, this.forceAA, this.anchor, this.prstTxWarp, this.egTextAutofit, this.scene3d, this.egText3D, this.extLst);
  }

  public CT_TextBodyPropertiesBuilder from(CT_TextBodyPropertiesModel value) {
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

  public static class EG_TextAutofitBuilder {
    private int type;

    private Object value;

    public EG_TextAutofitBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextAutofitBuilder setNoAutofit(CT_TextNoAutofitModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextAutofitBuilder setNormAutofit(CT_TextNormalAutofitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextAutofitBuilder setSpAutoFit(CT_TextShapeAutofitModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_TextBodyPropertiesModel.EG_TextAutofitModel build() {
      if (this.type == -1) return new CT_TextBodyPropertiesModel.EG_TextAutofitModel();
      if (this.type == 0) return CT_TextBodyPropertiesModel.EG_TextAutofitModel.newNoAutofit((CT_TextNoAutofitModel) this.value);
      if (this.type == 1) return CT_TextBodyPropertiesModel.EG_TextAutofitModel.newNormAutofit((CT_TextNormalAutofitModel) this.value);
      if (this.type == 2) return CT_TextBodyPropertiesModel.EG_TextAutofitModel.newSpAutoFit((CT_TextShapeAutofitModel) this.value);
      return null;
    }

    public EG_TextAutofitBuilder from(CT_TextBodyPropertiesModel.EG_TextAutofitModel value) {
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

  public static class EG_Text3DBuilder {
    private int type;

    private Object value;

    public EG_Text3DBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_Text3DBuilder setSp3D(CT_Shape3DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_Text3DBuilder setFlatTx(CT_FlatTextModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_TextBodyPropertiesModel.EG_Text3DModel build() {
      if (this.type == -1) return new CT_TextBodyPropertiesModel.EG_Text3DModel();
      if (this.type == 0) return CT_TextBodyPropertiesModel.EG_Text3DModel.newSp3D((CT_Shape3DModel) this.value);
      if (this.type == 1) return CT_TextBodyPropertiesModel.EG_Text3DModel.newFlatTx((CT_FlatTextModel) this.value);
      return null;
    }

    public EG_Text3DBuilder from(CT_TextBodyPropertiesModel.EG_Text3DModel value) {
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
