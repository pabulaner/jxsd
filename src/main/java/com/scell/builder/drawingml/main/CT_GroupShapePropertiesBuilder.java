package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupShapePropertiesModel;
import com.scell.model.drawingml.main.CT_GroupTransform2DModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_Scene3DModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.ST_BlackWhiteModeModel;
import java.lang.Object;

public class CT_GroupShapePropertiesBuilder {
  private ST_BlackWhiteModeModel bwMode;

  private CT_GroupTransform2DModel xfrm;

  private CT_GroupShapePropertiesModel.EG_FillPropertiesModel egFillProperties;

  private CT_GroupShapePropertiesModel.EG_EffectPropertiesModel egEffectProperties;

  private CT_Scene3DModel scene3d;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_GroupShapePropertiesBuilder() {
  }

  public CT_GroupShapePropertiesBuilder setBwMode(ST_BlackWhiteModeModel bwMode) {
    this.bwMode = bwMode;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setXfrm(CT_GroupTransform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setEGFillProperties(
      CT_GroupShapePropertiesModel.EG_FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setEGEffectProperties(
      CT_GroupShapePropertiesModel.EG_EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setScene3D(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_GroupShapePropertiesModel build() {
    return new CT_GroupShapePropertiesModel(this.bwMode, this.xfrm, this.egFillProperties, this.egEffectProperties, this.scene3d, this.extLst);
  }

  public CT_GroupShapePropertiesBuilder from(CT_GroupShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.egFillProperties = value.getEGFillProperties();
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.extLst = value.getExtLst();
    return this;
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

    public CT_GroupShapePropertiesModel.EG_FillPropertiesModel build() {
      if (this.type == -1) return new CT_GroupShapePropertiesModel.EG_FillPropertiesModel();
      if (this.type == 0) return CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
      if (this.type == 4) return CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      if (this.type == 5) return CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
      return null;
    }

    public EG_FillPropertiesBuilder from(
        CT_GroupShapePropertiesModel.EG_FillPropertiesModel value) {
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

    public CT_GroupShapePropertiesModel.EG_EffectPropertiesModel build() {
      if (this.type == -1) return new CT_GroupShapePropertiesModel.EG_EffectPropertiesModel();
      if (this.type == 0) return CT_GroupShapePropertiesModel.EG_EffectPropertiesModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_GroupShapePropertiesModel.EG_EffectPropertiesModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EG_EffectPropertiesBuilder from(
        CT_GroupShapePropertiesModel.EG_EffectPropertiesModel value) {
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
