package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class EffectStyleItemModel {
  private final EffectPropertiesModel egEffectProperties;

  private final Scene3DModel scene3d;

  private final Shape3DModel sp3d;

  public EffectStyleItemModel(EffectPropertiesModel egEffectProperties, Scene3DModel scene3d,
      Shape3DModel sp3d) {
    this.egEffectProperties = egEffectProperties;
    this.scene3d = scene3d;
    this.sp3d = sp3d;
  }

  public EffectPropertiesModel getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public Scene3DModel getScene3D() {
    return this.scene3d;
  }

  public Shape3DModel getSp3D() {
    return this.sp3d;
  }

  public static class EffectPropertiesModel {
    private final int type;

    private final Object value;

    public EffectPropertiesModel() {
      this(-1, null);
    }

    private EffectPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectPropertiesModel newEffectLst(EffectListModel value) {
      return new EffectPropertiesModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public EffectListModel getEffectLst() {
      return (EffectListModel) this.value;
    }

    public static EffectPropertiesModel newEffectDag(EffectContainerModel value) {
      return new EffectPropertiesModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public EffectContainerModel getEffectDag() {
      return (EffectContainerModel) this.value;
    }
  }
}
