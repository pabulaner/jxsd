package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.EffectContainerModel;
import com.scell.model.drawingml.main.EffectListModel;
import com.scell.model.drawingml.main.EffectStyleItemModel;
import com.scell.model.drawingml.main.Scene3DModel;
import com.scell.model.drawingml.main.Shape3DModel;
import java.lang.Object;

public class EffectStyleItemBuilder {
  private EffectStyleItemModel.EffectPropertiesModel egEffectProperties;

  private Scene3DModel scene3d;

  private Shape3DModel sp3d;

  public EffectStyleItemBuilder() {
  }

  public EffectStyleItemBuilder setEGEffectProperties(
      EffectStyleItemModel.EffectPropertiesModel egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public EffectStyleItemBuilder setScene3D(Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public EffectStyleItemBuilder setSp3D(Shape3DModel sp3d) {
    this.sp3d = sp3d;
    return this;
  }

  public EffectStyleItemModel build() {
    return new EffectStyleItemModel(this.egEffectProperties, this.scene3d, this.sp3d);
  }

  public EffectStyleItemBuilder from(EffectStyleItemModel value) {
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.sp3d = value.getSp3D();
    return this;
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

    public EffectStyleItemModel.EffectPropertiesModel build() {
      if (this.type == -1) return new EffectStyleItemModel.EffectPropertiesModel();
      if (this.type == 0) return EffectStyleItemModel.EffectPropertiesModel.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return EffectStyleItemModel.EffectPropertiesModel.newEffectDag((EffectContainerModel) this.value);
      return null;
    }

    public EffectPropertiesBuilder from(EffectStyleItemModel.EffectPropertiesModel value) {
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
