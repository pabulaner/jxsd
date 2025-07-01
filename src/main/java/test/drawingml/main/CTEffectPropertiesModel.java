package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTEffectPropertiesModel {
  private final Integer type;

  private final Object value;

  public CTEffectPropertiesModel() {
    this(-1, null);
  }

  private CTEffectPropertiesModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTEffectPropertiesModel newEffectLst(CTEffectListModel value) {
    return new CTEffectPropertiesModel(0, value);
  }

  public Boolean isEffectLst() {
    return this.type == 0;
  }

  public CTEffectListModel getEffectLst() {
    return (CTEffectListModel) this.value;
  }

  public static CTEffectPropertiesModel newEffectDag(CTEffectContainerModel value) {
    return new CTEffectPropertiesModel(1, value);
  }

  public Boolean isEffectDag() {
    return this.type == 1;
  }

  public CTEffectContainerModel getEffectDag() {
    return (CTEffectContainerModel) this.value;
  }
}
