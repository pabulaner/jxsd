package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_EffectPropertiesModel {
  private final int type;

  private final Object value;

  public CT_EffectPropertiesModel() {
    this(-1, null);
  }

  private CT_EffectPropertiesModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_EffectPropertiesModel newEffectLst(CT_EffectListModel value) {
    return new CT_EffectPropertiesModel(0, value);
  }

  public boolean isEffectLst() {
    return this.type == 0;
  }

  public CT_EffectListModel getEffectLst() {
    return (CT_EffectListModel) this.value;
  }

  public static CT_EffectPropertiesModel newEffectDag(CT_EffectContainerModel value) {
    return new CT_EffectPropertiesModel(1, value);
  }

  public boolean isEffectDag() {
    return this.type == 1;
  }

  public CT_EffectContainerModel getEffectDag() {
    return (CT_EffectContainerModel) this.value;
  }
}
