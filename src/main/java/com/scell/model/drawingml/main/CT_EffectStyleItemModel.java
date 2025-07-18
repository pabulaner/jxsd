package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_EffectStyleItemModel {
  private final EG_EffectPropertiesModel egEffectProperties;

  private final CT_Scene3DModel scene3d;

  private final CT_Shape3DModel sp3d;

  public CT_EffectStyleItemModel(EG_EffectPropertiesModel egEffectProperties,
      CT_Scene3DModel scene3d, CT_Shape3DModel sp3d) {
    this.egEffectProperties = egEffectProperties;
    this.scene3d = scene3d;
    this.sp3d = sp3d;
  }

  public EG_EffectPropertiesModel getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public CT_Scene3DModel getScene3D() {
    return this.scene3d;
  }

  public CT_Shape3DModel getSp3D() {
    return this.sp3d;
  }

  public static class EG_EffectPropertiesModel {
    private final int type;

    private final Object value;

    public EG_EffectPropertiesModel() {
      this(-1, null);
    }

    private EG_EffectPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_EffectPropertiesModel newEffectLst(CT_EffectListModel value) {
      return new EG_EffectPropertiesModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public CT_EffectListModel getEffectLst() {
      return (CT_EffectListModel) this.value;
    }

    public static EG_EffectPropertiesModel newEffectDag(CT_EffectContainerModel value) {
      return new EG_EffectPropertiesModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public CT_EffectContainerModel getEffectDag() {
      return (CT_EffectContainerModel) this.value;
    }
  }
}
