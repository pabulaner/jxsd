package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlackWhiteModeValueModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.EffectContainerModel;
import com.scell.model.drawingml.main.EffectListModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.GroupShapePropertiesModel;
import com.scell.model.drawingml.main.GroupTransform2DModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.Scene3DModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import java.lang.Object;

public class GroupShapePropertiesBuilder {
  private BlackWhiteModeValueModel bwMode;

  private GroupTransform2DModel xfrm;

  private GroupShapePropertiesModel.FillPropertiesModel egFillProperties;

  private GroupShapePropertiesModel.EffectPropertiesModel egEffectProperties;

  private Scene3DModel scene3d;

  private OfficeArtExtensionListModel extLst;

  public GroupShapePropertiesBuilder() {
  }

  public GroupShapePropertiesBuilder setBwMode(BlackWhiteModeValueModel bwMode) {
    this.bwMode = bwMode;
    return this;
  }

  public GroupShapePropertiesBuilder setXfrm(GroupTransform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public GroupShapePropertiesBuilder setEGFillProperties(
      GroupShapePropertiesModel.FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public GroupShapePropertiesBuilder setEGEffectProperties(
      GroupShapePropertiesModel.EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public GroupShapePropertiesBuilder setScene3D(Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public GroupShapePropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public GroupShapePropertiesModel build() {
    return new GroupShapePropertiesModel(this.bwMode, this.xfrm, this.egFillProperties, this.egEffectProperties, this.scene3d, this.extLst);
  }

  public GroupShapePropertiesBuilder from(GroupShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.egFillProperties = value.getEGFillProperties();
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class FillPropertiesBuilder {
    private int type;

    private Object value;

    public FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public FillPropertiesBuilder setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public GroupShapePropertiesModel.FillPropertiesModel build() {
      if (this.type == -1) return new GroupShapePropertiesModel.FillPropertiesModel();
      if (this.type == 0) return GroupShapePropertiesModel.FillPropertiesModel.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return GroupShapePropertiesModel.FillPropertiesModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return GroupShapePropertiesModel.FillPropertiesModel.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return GroupShapePropertiesModel.FillPropertiesModel.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return GroupShapePropertiesModel.FillPropertiesModel.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return GroupShapePropertiesModel.FillPropertiesModel.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }

    public FillPropertiesBuilder from(GroupShapePropertiesModel.FillPropertiesModel value) {
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

  public static class EffectPropertiesBuilder {
    private int type;

    private Object value;

    public EffectPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EffectPropertiesBuilder setEffectLst(EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EffectPropertiesBuilder setEffectDag(EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public GroupShapePropertiesModel.EffectPropertiesModel build() {
      if (this.type == -1) return new GroupShapePropertiesModel.EffectPropertiesModel();
      if (this.type == 0) return GroupShapePropertiesModel.EffectPropertiesModel.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return GroupShapePropertiesModel.EffectPropertiesModel.newEffectDag((EffectContainerModel) this.value);
      return null;
    }

    public EffectPropertiesBuilder from(GroupShapePropertiesModel.EffectPropertiesModel value) {
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
