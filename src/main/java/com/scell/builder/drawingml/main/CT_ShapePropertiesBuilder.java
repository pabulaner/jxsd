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

  private CT_ShapePropertiesModel.EG_GeometryModel egGeometry;

  private CT_ShapePropertiesModel.EG_FillPropertiesModel egFillProperties;

  private CT_LinePropertiesModel ln;

  private CT_ShapePropertiesModel.EG_EffectPropertiesModel egEffectProperties;

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

  public CT_ShapePropertiesBuilder setEGGeometry(
      CT_ShapePropertiesModel.EG_GeometryModel egGeometry) {
    this.egGeometry = egGeometry;
    return this;
  }

  public CT_ShapePropertiesBuilder setEGFillProperties(
      CT_ShapePropertiesModel.EG_FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public CT_ShapePropertiesBuilder setLn(CT_LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public CT_ShapePropertiesBuilder setEGEffectProperties(
      CT_ShapePropertiesModel.EG_EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public CT_ShapePropertiesBuilder setScene3D(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_ShapePropertiesBuilder setSp3D(CT_Shape3DModel sp3d) {
    this.sp3d = sp3d;
    return this;
  }

  public CT_ShapePropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ShapePropertiesModel build() {
    return new CT_ShapePropertiesModel(this.bwMode, this.xfrm, this.egGeometry, this.egFillProperties, this.ln, this.egEffectProperties, this.scene3d, this.sp3d, this.extLst);
  }

  public CT_ShapePropertiesBuilder from(CT_ShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.egGeometry = value.getEGGeometry();
    this.egFillProperties = value.getEGFillProperties();
    this.ln = value.getLn();
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.sp3d = value.getSp3D();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class EG_GeometryBuilder {
    private int type;

    private Object value;

    public EG_GeometryBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_GeometryBuilder setCustGeom(CT_CustomGeometry2DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_GeometryBuilder setPrstGeom(CT_PresetGeometry2DModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_ShapePropertiesModel.EG_GeometryModel build() {
      if (this.type == -1) return new CT_ShapePropertiesModel.EG_GeometryModel();
      if (this.type == 0) return CT_ShapePropertiesModel.EG_GeometryModel.newCustGeom((CT_CustomGeometry2DModel) this.value);
      if (this.type == 1) return CT_ShapePropertiesModel.EG_GeometryModel.newPrstGeom((CT_PresetGeometry2DModel) this.value);
      return null;
    }

    public EG_GeometryBuilder from(CT_ShapePropertiesModel.EG_GeometryModel value) {
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

  public static class EG_FillPropertiesBuilder {
    private int type;

    private Object value;

    public EG_FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillPropertiesBuilder setNoFill(CT_NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setGradFill(CT_GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setBlipFill(CT_BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setPattFill(CT_PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_FillPropertiesBuilder setGrpFill(CT_GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_ShapePropertiesModel.EG_FillPropertiesModel build() {
      if (this.type == -1) return new CT_ShapePropertiesModel.EG_FillPropertiesModel();
      if (this.type == 0) return CT_ShapePropertiesModel.EG_FillPropertiesModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_ShapePropertiesModel.EG_FillPropertiesModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_ShapePropertiesModel.EG_FillPropertiesModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_ShapePropertiesModel.EG_FillPropertiesModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
      if (this.type == 4) return CT_ShapePropertiesModel.EG_FillPropertiesModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      if (this.type == 5) return CT_ShapePropertiesModel.EG_FillPropertiesModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
      return null;
    }

    public EG_FillPropertiesBuilder from(CT_ShapePropertiesModel.EG_FillPropertiesModel value) {
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

  public static class EG_EffectPropertiesBuilder {
    private int type;

    private Object value;

    public EG_EffectPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_EffectPropertiesBuilder setEffectLst(CT_EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_EffectPropertiesBuilder setEffectDag(CT_EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_ShapePropertiesModel.EG_EffectPropertiesModel build() {
      if (this.type == -1) return new CT_ShapePropertiesModel.EG_EffectPropertiesModel();
      if (this.type == 0) return CT_ShapePropertiesModel.EG_EffectPropertiesModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_ShapePropertiesModel.EG_EffectPropertiesModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EG_EffectPropertiesBuilder from(CT_ShapePropertiesModel.EG_EffectPropertiesModel value) {
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
