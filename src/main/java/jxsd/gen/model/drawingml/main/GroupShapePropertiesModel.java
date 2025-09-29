package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.GroupShapePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class GroupShapePropertiesModel {
  private final BlackWhiteModeValueModel bwMode;

  private final GroupTransform2DModel xfrm;

  private final EG_FillProperties egFillProperties;

  private final EG_EffectProperties egEffectProperties;

  private final Scene3DModel scene3d;

  private final OfficeArtExtensionListModel extLst;

  public GroupShapePropertiesModel(BlackWhiteModeValueModel bwMode, GroupTransform2DModel xfrm,
      EG_FillProperties egFillProperties, EG_EffectProperties egEffectProperties,
      Scene3DModel scene3d, OfficeArtExtensionListModel extLst) {
    this.bwMode = bwMode;
    this.xfrm = xfrm;
    this.egFillProperties = egFillProperties;
    this.egEffectProperties = egEffectProperties;
    this.scene3d = scene3d;
    this.extLst = extLst;
  }

  public GroupShapePropertiesBuilder builder() {
    return new GroupShapePropertiesBuilder().from(this);
  }

  public BlackWhiteModeValueModel getBwMode() {
    return this.bwMode;
  }

  public GroupTransform2DModel getXfrm() {
    return this.xfrm;
  }

  public EG_FillProperties getEGFillProperties() {
    return this.egFillProperties;
  }

  public EG_EffectProperties getEGEffectProperties() {
    return this.egEffectProperties;
  }

  public Scene3DModel getScene3D() {
    return this.scene3d;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillProperties {
    private final int type;

    private final Object value;

    public EG_FillProperties() {
      this(-1, null);
    }

    private EG_FillProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public GroupShapePropertiesBuilder.EG_FillProperties builder() {
      return new GroupShapePropertiesBuilder.EG_FillProperties().from(this);
    }

    public static EG_FillProperties newNoFill(NoFillPropertiesModel value) {
      return new EG_FillProperties(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newSolidFill(SolidColorFillPropertiesModel value) {
      return new EG_FillProperties(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newGradFill(GradientFillPropertiesModel value) {
      return new EG_FillProperties(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newBlipFill(BlipFillPropertiesModel value) {
      return new EG_FillProperties(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public BlipFillPropertiesModel getBlipFill() {
      return (BlipFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newPattFill(PatternFillPropertiesModel value) {
      return new EG_FillProperties(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newGrpFill(GroupFillPropertiesModel value) {
      return new EG_FillProperties(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public GroupFillPropertiesModel getGrpFill() {
      return (GroupFillPropertiesModel) this.value;
    }
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

    public GroupShapePropertiesBuilder.EG_EffectProperties builder() {
      return new GroupShapePropertiesBuilder.EG_EffectProperties().from(this);
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
