package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
import jxsd.gen.model.drawingml.main.EffectListModel;
import jxsd.gen.model.drawingml.main.EffectPropertiesModel;

/**
 * This is a generated choice class.
 */
public class EffectPropertiesBuilder {
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

  public EffectPropertiesBuilder from(EffectPropertiesModel value) {
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

  public EffectPropertiesModel build() {
    if (this.type == -1) return new EffectPropertiesModel();
    if (this.type == 0) return EffectPropertiesModel.newEffectLst((EffectListModel) this.value);
    if (this.type == 1) return EffectPropertiesModel.newEffectDag((EffectContainerModel) this.value);
    return null;
  }
}
