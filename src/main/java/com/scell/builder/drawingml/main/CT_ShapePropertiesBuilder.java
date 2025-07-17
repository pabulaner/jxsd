package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_CustomGeometry2DModel;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import com.scell.model.drawingml.main.CT_LinePropertiesModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_PresetGeometry2DModel;
import com.scell.model.drawingml.main.CT_Scene3DModel;
import com.scell.model.drawingml.main.CT_Shape3DModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.CT_Transform2DModel;
import com.scell.model.drawingml.main.ST_BlackWhiteModeModel;
import java.lang.Object;

public class CT_ShapePropertiesBuilder {
  private ST_BlackWhiteModeModel bwMode;

  private CT_Transform2DModel xfrm;

  private CT_ShapePropertiesModel.CustGeomOrPrstGeomModel custGeomOrPrstGeom;

  private CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private CT_LinePropertiesModel ln;

  private CT_ShapePropertiesModel.EffectLstOrEffectDagModel effectLstOrEffectDag;

  private CT_Scene3DModel scene3d;

  private CT_Shape3DModel sp3d;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_ShapePropertiesBuilder() {
  }

  public CT_ShapePropertiesBuilder setBwMode(ST_BlackWhiteModeModel bwMode) {
    this.bwMode = bwMode;
    return this;
  }

  public CT_ShapePropertiesBuilder setXfrm(CT_Transform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public CT_ShapePropertiesBuilder setCustGeomOrPrstGeom(
      CT_ShapePropertiesModel.CustGeomOrPrstGeomModel custGeomOrPrstGeom) {
    this.custGeomOrPrstGeom = custGeomOrPrstGeom;
    return this;
  }

  public CT_ShapePropertiesBuilder setNoFillOrSolidFillOrGradFill(
      CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    return this;
  }

  public CT_ShapePropertiesBuilder setLn(CT_LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public CT_ShapePropertiesBuilder setEffectLstOrEffectDag(
      CT_ShapePropertiesModel.EffectLstOrEffectDagModel effectLstOrEffectDag) {
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    return this;
  }

  public CT_ShapePropertiesBuilder setScene3d(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_ShapePropertiesBuilder setSp3d(CT_Shape3DModel sp3d) {
    this.sp3d = sp3d;
    return this;
  }

  public CT_ShapePropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ShapePropertiesModel build() {
    return new CT_ShapePropertiesModel(this.bwMode, this.xfrm, this.custGeomOrPrstGeom, this.noFillOrSolidFillOrGradFill, this.ln, this.effectLstOrEffectDag, this.scene3d, this.sp3d, this.extLst);
  }

  public CT_ShapePropertiesBuilder from(CT_ShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.custGeomOrPrstGeom = value.getCustGeomOrPrstGeom();
    this.noFillOrSolidFillOrGradFill = value.getNoFillOrSolidFillOrGradFill();
    this.ln = value.getLn();
    this.effectLstOrEffectDag = value.getEffectLstOrEffectDag();
    this.scene3d = value.getScene3d();
    this.sp3d = value.getSp3d();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class CustGeomOrPrstGeomBuilder {
    private int type;

    private Object value;

    public CustGeomOrPrstGeomBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CustGeomOrPrstGeomBuilder setCustGeom(CT_CustomGeometry2DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CustGeomOrPrstGeomBuilder setPrstGeom(CT_PresetGeometry2DModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_ShapePropertiesModel.CustGeomOrPrstGeomModel build() {
      if (this.type == -1) return new CT_ShapePropertiesModel.CustGeomOrPrstGeomModel();
      if (this.type == 0) return CT_ShapePropertiesModel.CustGeomOrPrstGeomModel.newCustGeom((CT_CustomGeometry2DModel) this.value);
      if (this.type == 1) return CT_ShapePropertiesModel.CustGeomOrPrstGeomModel.newPrstGeom((CT_PresetGeometry2DModel) this.value);
      return null;
    }

    public CustGeomOrPrstGeomBuilder from(CT_ShapePropertiesModel.CustGeomOrPrstGeomModel value) {
      this.type = -1;
      this.value = null;
      if (value.isCustGeom()) {
        this.type = 0;
        this.value = value.getCustGeom();
      }
      if (value.isPrstGeom()) {
        this.type = 1;
        this.value = value.getPrstGeom();
      }
      return this;
    }
  }

  public static class NoFillOrSolidFillOrGradFillBuilder {
    private int type;

    private Object value;

    public NoFillOrSolidFillOrGradFillBuilder() {
      this.type = -1;
      this.value = null;
    }

    public NoFillOrSolidFillOrGradFillBuilder setNoFill(CT_NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setGradFill(CT_GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setBlipFill(CT_BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setPattFill(CT_PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setGrpFill(CT_GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel build() {
      if (this.type == -1) return new CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel();
      if (this.type == 0) return CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
      if (this.type == 4) return CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      if (this.type == 5) return CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
      return null;
    }

    public NoFillOrSolidFillOrGradFillBuilder from(
        CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
      this.type = -1;
      this.value = null;
      if (value.isNoFill()) {
        this.type = 0;
        this.value = value.getNoFill();
      }
      if (value.isSolidFill()) {
        this.type = 1;
        this.value = value.getSolidFill();
      }
      if (value.isGradFill()) {
        this.type = 2;
        this.value = value.getGradFill();
      }
      if (value.isBlipFill()) {
        this.type = 3;
        this.value = value.getBlipFill();
      }
      if (value.isPattFill()) {
        this.type = 4;
        this.value = value.getPattFill();
      }
      if (value.isGrpFill()) {
        this.type = 5;
        this.value = value.getGrpFill();
      }
      return this;
    }
  }

  public static class EffectLstOrEffectDagBuilder {
    private int type;

    private Object value;

    public EffectLstOrEffectDagBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EffectLstOrEffectDagBuilder setEffectLst(CT_EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EffectLstOrEffectDagBuilder setEffectDag(CT_EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_ShapePropertiesModel.EffectLstOrEffectDagModel build() {
      if (this.type == -1) return new CT_ShapePropertiesModel.EffectLstOrEffectDagModel();
      if (this.type == 0) return CT_ShapePropertiesModel.EffectLstOrEffectDagModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_ShapePropertiesModel.EffectLstOrEffectDagModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EffectLstOrEffectDagBuilder from(
        CT_ShapePropertiesModel.EffectLstOrEffectDagModel value) {
      this.type = -1;
      this.value = null;
      if (value.isEffectLst()) {
        this.type = 0;
        this.value = value.getEffectLst();
      }
      if (value.isEffectDag()) {
        this.type = 1;
        this.value = value.getEffectDag();
      }
      return this;
    }
  }
}
