package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
import jxsd.gen.model.drawingml.main.EffectListModel;
import jxsd.gen.model.drawingml.main.EffectStyleItemModel;
import jxsd.gen.model.drawingml.main.Scene3DModel;
import jxsd.gen.model.drawingml.main.Shape3DModel;

/**
 * This is a generated sequence class.
 */
public class EffectStyleItemBuilder {
  private EffectStyleItemModel.EG_EffectProperties egEffectProperties;

  private Scene3DModel scene3d;

  private Shape3DModel sp3d;

  public EffectStyleItemBuilder() {
  }

  public EffectStyleItemBuilder setEGEffectProperties(
      EffectStyleItemModel.EG_EffectProperties egEffectProperties) {
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

  public EffectStyleItemBuilder from(EffectStyleItemModel value) {
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.sp3d = value.getSp3D();
    return this;
  }

  public EffectStyleItemModel build() {
    return new EffectStyleItemModel(this.egEffectProperties, this.scene3d, this.sp3d);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_EffectProperties {
    private int type;

    private Object value;

    public EG_EffectProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_EffectProperties setEffectLst(EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_EffectProperties setEffectDag(EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_EffectProperties from(EffectStyleItemModel.EG_EffectProperties value) {
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

    public EffectStyleItemModel.EG_EffectProperties build() {
      if (this.type == -1) return new EffectStyleItemModel.EG_EffectProperties();
      if (this.type == 0) return EffectStyleItemModel.EG_EffectProperties.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return EffectStyleItemModel.EG_EffectProperties.newEffectDag((EffectContainerModel) this.value);
      return null;
    }
  }
}
