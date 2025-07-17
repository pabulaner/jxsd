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

  private CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel effectLstOrEffectDag;

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

  public CT_GroupShapePropertiesBuilder setNoFillOrSolidFillOrGradFill(
      CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setEffectLstOrEffectDag(
      CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel effectLstOrEffectDag) {
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setScene3d(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_GroupShapePropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_GroupShapePropertiesModel build() {
    return new CT_GroupShapePropertiesModel(this.bwMode, this.xfrm, this.noFillOrSolidFillOrGradFill, this.effectLstOrEffectDag, this.scene3d, this.extLst);
  }

  public CT_GroupShapePropertiesBuilder from(CT_GroupShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.noFillOrSolidFillOrGradFill = value.getNoFillOrSolidFillOrGradFill();
    this.effectLstOrEffectDag = value.getEffectLstOrEffectDag();
    this.scene3d = value.getScene3d();
    this.extLst = value.getExtLst();
    return this;
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

    public CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel build() {
      if (this.type == -1) return new CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel();
      if (this.type == 0) return CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
      if (this.type == 4) return CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      if (this.type == 5) return CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
      return null;
    }

    public NoFillOrSolidFillOrGradFillBuilder from(
        CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
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

    public CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel build() {
      if (this.type == -1) return new CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel();
      if (this.type == 0) return CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EffectLstOrEffectDagBuilder from(
        CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel value) {
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
