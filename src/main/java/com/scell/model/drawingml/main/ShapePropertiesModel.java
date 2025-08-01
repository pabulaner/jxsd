package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class ShapePropertiesModel {
  private final BlackWhiteModeValueModel bwMode;

  private final Transform2DModel xfrm;

  private final GeometryModel egGeometry;

  private final FillPropertiesModel egFillProperties;

  private final LinePropertiesModel ln;

  private final EffectPropertiesModel egEffectProperties;

  private final Scene3DModel scene3d;

  private final Shape3DModel sp3d;

  private final OfficeArtExtensionListModel extLst;

  public ShapePropertiesModel(BlackWhiteModeValueModel bwMode, Transform2DModel xfrm,
      GeometryModel egGeometry, FillPropertiesModel egFillProperties, LinePropertiesModel ln,
      EffectPropertiesModel egEffectProperties, Scene3DModel scene3d, Shape3DModel sp3d,
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

  public BlackWhiteModeValueModel getBwMode() {
    return this.bwMode;
  }

  public Transform2DModel getXfrm() {
    return this.xfrm;
  }

  public GeometryModel getEGGeometry() {
    return this.egGeometry;
  }

  public FillPropertiesModel getEGFillProperties() {
    return this.egFillProperties;
  }

  public LinePropertiesModel getLn() {
    return this.ln;
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

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class GeometryModel {
    private final int type;

    private final Object value;

    public GeometryModel() {
      this(-1, null);
    }

    private GeometryModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static GeometryModel newCustGeom(CustomGeometry2DModel value) {
      return new GeometryModel(0, value);
    }

    public boolean isCustGeom() {
      return this.type == 0;
    }

    public CustomGeometry2DModel getCustGeom() {
      return (CustomGeometry2DModel) this.value;
    }

    public static GeometryModel newPrstGeom(PresetGeometry2DModel value) {
      return new GeometryModel(1, value);
    }

    public boolean isPrstGeom() {
      return this.type == 1;
    }

    public PresetGeometry2DModel getPrstGeom() {
      return (PresetGeometry2DModel) this.value;
    }
  }

  public static class FillPropertiesModel {
    private final int type;

    private final Object value;

    public FillPropertiesModel() {
      this(-1, null);
    }

    private FillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static FillPropertiesModel newNoFill(NoFillPropertiesModel value) {
      return new FillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newSolidFill(SolidColorFillPropertiesModel value) {
      return new FillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newGradFill(GradientFillPropertiesModel value) {
      return new FillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newBlipFill(BlipFillPropertiesModel value) {
      return new FillPropertiesModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public BlipFillPropertiesModel getBlipFill() {
      return (BlipFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newPattFill(PatternFillPropertiesModel value) {
      return new FillPropertiesModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newGrpFill(GroupFillPropertiesModel value) {
      return new FillPropertiesModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public GroupFillPropertiesModel getGrpFill() {
      return (GroupFillPropertiesModel) this.value;
    }
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
