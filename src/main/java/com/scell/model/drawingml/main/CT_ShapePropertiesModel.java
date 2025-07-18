package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_ShapePropertiesModel {
  private final ST_BlackWhiteModeModel bwMode;

  private final CT_Transform2DModel xfrm;

  private final EG_GeometryModel egGeometry;

  private final EG_FillPropertiesModel egFillProperties;

  private final CT_LinePropertiesModel ln;

  private final EG_EffectPropertiesModel egEffectProperties;

  private final CT_Scene3DModel scene3d;

  private final CT_Shape3DModel sp3d;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_ShapePropertiesModel(ST_BlackWhiteModeModel bwMode, CT_Transform2DModel xfrm,
      EG_GeometryModel egGeometry, EG_FillPropertiesModel egFillProperties,
      CT_LinePropertiesModel ln, EG_EffectPropertiesModel egEffectProperties,
      CT_Scene3DModel scene3d, CT_Shape3DModel sp3d, CT_OfficeArtExtensionListModel extLst) {
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

  public ST_BlackWhiteModeModel getBwMode() {
    return this.bwMode;
  }

  public CT_Transform2DModel getXfrm() {
    return this.xfrm;
  }

  public EG_GeometryModel getEGGeometry() {
    return this.egGeometry;
  }

  public EG_FillPropertiesModel getEGFillProperties() {
    return this.egFillProperties;
  }

  public CT_LinePropertiesModel getLn() {
    return this.ln;
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

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class EG_GeometryModel {
    private final int type;

    private final Object value;

    public EG_GeometryModel() {
      this(-1, null);
    }

    private EG_GeometryModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_GeometryModel newCustGeom(CT_CustomGeometry2DModel value) {
      return new EG_GeometryModel(0, value);
    }

    public boolean isCustGeom() {
      return this.type == 0;
    }

    public CT_CustomGeometry2DModel getCustGeom() {
      return (CT_CustomGeometry2DModel) this.value;
    }

    public static EG_GeometryModel newPrstGeom(CT_PresetGeometry2DModel value) {
      return new EG_GeometryModel(1, value);
    }

    public boolean isPrstGeom() {
      return this.type == 1;
    }

    public CT_PresetGeometry2DModel getPrstGeom() {
      return (CT_PresetGeometry2DModel) this.value;
    }
  }

  public static class EG_FillPropertiesModel {
    private final int type;

    private final Object value;

    public EG_FillPropertiesModel() {
      this(-1, null);
    }

    private EG_FillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_FillPropertiesModel newNoFill(CT_NoFillPropertiesModel value) {
      return new EG_FillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newSolidFill(CT_SolidColorFillPropertiesModel value) {
      return new EG_FillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newGradFill(CT_GradientFillPropertiesModel value) {
      return new EG_FillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new EG_FillPropertiesModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newPattFill(CT_PatternFillPropertiesModel value) {
      return new EG_FillPropertiesModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new EG_FillPropertiesModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
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
