package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.EffectStyleItemBuilder;

/**
 * This is a generated sequence class.
 */
public class EffectStyleItemModel {
  private final EG_EffectProperties egEffectProperties;

  private final Scene3DModel scene3d;

  private final Shape3DModel sp3d;

  public EffectStyleItemModel(EG_EffectProperties egEffectProperties, Scene3DModel scene3d,
      Shape3DModel sp3d) {
    this.egEffectProperties = egEffectProperties;
    this.scene3d = scene3d;
    this.sp3d = sp3d;
  }

  public EffectStyleItemBuilder builder() {
    return new EffectStyleItemBuilder().from(this);
  }

  public EG_EffectProperties getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public Scene3DModel getScene3D() {
    return this.scene3d;
  }

  public Shape3DModel getSp3D() {
    return this.sp3d;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_EffectProperties {
    private final int type;

    private final Object value;

    public EG_EffectProperties() {
      this(-1, null);
    }

    private EG_EffectProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public EffectStyleItemBuilder.EG_EffectProperties builder() {
      return new EffectStyleItemBuilder.EG_EffectProperties().from(this);
    }

    public static EG_EffectProperties newEffectLst(EffectListModel value) {
      return new EG_EffectProperties(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public EffectListModel getEffectLst() {
      return (EffectListModel) this.value;
    }

    public static EG_EffectProperties newEffectDag(EffectContainerModel value) {
      return new EG_EffectProperties(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public EffectContainerModel getEffectDag() {
      return (EffectContainerModel) this.value;
    }
  }
}
