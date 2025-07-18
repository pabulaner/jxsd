package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_EffectStyleItemModel;
import com.scell.model.drawingml.main.CT_Scene3DModel;
import com.scell.model.drawingml.main.CT_Shape3DModel;
import java.lang.Object;

public class CT_EffectStyleItemBuilder {
  private CT_EffectStyleItemModel.EG_EffectPropertiesModel egEffectProperties;

  private CT_Scene3DModel scene3d;

  private CT_Shape3DModel sp3d;

  public CT_EffectStyleItemBuilder() {
  }

  public CT_EffectStyleItemBuilder setEGEffectProperties(
      CT_EffectStyleItemModel.EG_EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public CT_EffectStyleItemBuilder setScene3D(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_EffectStyleItemBuilder setSp3D(CT_Shape3DModel sp3d) {
    this.sp3d = sp3d;
    return this;
  }

  public CT_EffectStyleItemModel build() {
    return new CT_EffectStyleItemModel(this.egEffectProperties, this.scene3d, this.sp3d);
  }

  public CT_EffectStyleItemBuilder from(CT_EffectStyleItemModel value) {
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.sp3d = value.getSp3D();
    return this;
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

    public CT_EffectStyleItemModel.EG_EffectPropertiesModel build() {
      if (this.type == -1) return new CT_EffectStyleItemModel.EG_EffectPropertiesModel();
      if (this.type == 0) return CT_EffectStyleItemModel.EG_EffectPropertiesModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_EffectStyleItemModel.EG_EffectPropertiesModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EG_EffectPropertiesBuilder from(CT_EffectStyleItemModel.EG_EffectPropertiesModel value) {
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
