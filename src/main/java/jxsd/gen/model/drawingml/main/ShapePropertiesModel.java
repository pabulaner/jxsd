package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.ShapePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class ShapePropertiesModel {
  private final BlackWhiteModeValueModel bwMode;

  private final Transform2DModel xfrm;

  private final EG_Geometry egGeometry;

  private final EG_FillProperties egFillProperties;

  private final LinePropertiesModel ln;

  private final EG_EffectProperties egEffectProperties;

  private final Scene3DModel scene3d;

  private final Shape3DModel sp3d;

  private final OfficeArtExtensionListModel extLst;

  public ShapePropertiesModel(BlackWhiteModeValueModel bwMode, Transform2DModel xfrm,
      EG_Geometry egGeometry, EG_FillProperties egFillProperties, LinePropertiesModel ln,
      EG_EffectProperties egEffectProperties, Scene3DModel scene3d, Shape3DModel sp3d,
      OfficeArtExtensionListModel extLst) {
    this.bwMode = bwMode;
    this.xfrm = xfrm;
    this.egGeometry = egGeometry;
    this.egFillProperties = egFillProperties;
    this.ln = ln;
    this.egEffectProperties = egEffectProperties;
    this.scene3d = scene3d;
    this.sp3d = sp3d;
    this.extLst = extLst;
  }

  public ShapePropertiesBuilder builder() {
    return new ShapePropertiesBuilder().from(this);
  }

  public BlackWhiteModeValueModel getBwMode() {
    return this.bwMode;
  }

  public Transform2DModel getXfrm() {
    return this.xfrm;
  }

  public EG_Geometry getEGGeometry() {
    return this.egGeometry;
  }

  public EG_FillProperties getEGFillProperties() {
    return this.egFillProperties;
  }

  public LinePropertiesModel getLn() {
    return this.ln;
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

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Geometry {
    private final int type;

    private final Object value;

    public EG_Geometry() {
      this(-1, null);
    }

    private EG_Geometry(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public ShapePropertiesBuilder.EG_Geometry builder() {
      return new ShapePropertiesBuilder.EG_Geometry().from(this);
    }

    public static EG_Geometry newCustGeom(CustomGeometry2DModel value) {
      return new EG_Geometry(0, value);
    }

    public boolean isCustGeom() {
      return this.type == 0;
    }

    public CustomGeometry2DModel getCustGeom() {
      return (CustomGeometry2DModel) this.value;
    }

    public static EG_Geometry newPrstGeom(PresetGeometry2DModel value) {
      return new EG_Geometry(1, value);
    }

    public boolean isPrstGeom() {
      return this.type == 1;
    }

    public PresetGeometry2DModel getPrstGeom() {
      return (PresetGeometry2DModel) this.value;
    }
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

    public ShapePropertiesBuilder.EG_FillProperties builder() {
      return new ShapePropertiesBuilder.EG_FillProperties().from(this);
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

    public ShapePropertiesBuilder.EG_EffectProperties builder() {
      return new ShapePropertiesBuilder.EG_EffectProperties().from(this);
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
