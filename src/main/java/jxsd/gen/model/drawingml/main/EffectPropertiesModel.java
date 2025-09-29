package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.EffectPropertiesBuilder;

/**
 * This is a generated choice class.
 */
public class EffectPropertiesModel {
  private final int type;

  private final Object value;

  public EffectPropertiesModel() {
    this(-1, null);
  }

  private EffectPropertiesModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public EffectPropertiesBuilder builder() {
    return new EffectPropertiesBuilder().from(this);
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
