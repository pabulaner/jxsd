package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_ShapePropertiesModel {
  private final ST_BlackWhiteModeModel bwMode;

  private final CT_Transform2DModel xfrm;

  private final custGeomOrPrstGeomModel custGeomOrPrstGeom;

  private final noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final CT_LinePropertiesModel ln;

  private final effectLstOrEffectDagModel effectLstOrEffectDag;

  private final CT_Scene3DModel scene3d;

  private final CT_Shape3DModel sp3d;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_ShapePropertiesModel(ST_BlackWhiteModeModel bwMode, CT_Transform2DModel xfrm,
      custGeomOrPrstGeomModel custGeomOrPrstGeom,
      noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill, CT_LinePropertiesModel ln,
      effectLstOrEffectDagModel effectLstOrEffectDag, CT_Scene3DModel scene3d, CT_Shape3DModel sp3d,
      CT_OfficeArtExtensionListModel extLst) {
    this.bwMode = bwMode;
    this.xfrm = xfrm;
    this.custGeomOrPrstGeom = custGeomOrPrstGeom;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    this.ln = ln;
    this.effectLstOrEffectDag = effectLstOrEffectDag;
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

  public custGeomOrPrstGeomModel getCustGeomOrPrstGeom() {
    return this.custGeomOrPrstGeom;
  }

  public noFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public CT_LinePropertiesModel getLn() {
    return this.ln;
  }

  public effectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CT_Scene3DModel getScene3d() {
    return this.scene3d;
  }

  public CT_Shape3DModel getSp3d() {
    return this.sp3d;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class custGeomOrPrstGeomModel {
    private final int type;

    private final Object value;

    public custGeomOrPrstGeomModel() {
      this(-1, null);
    }

    private custGeomOrPrstGeomModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static custGeomOrPrstGeomModel newCustGeom(CT_CustomGeometry2DModel value) {
      return new custGeomOrPrstGeomModel(0, value);
    }

    public boolean isCustGeom() {
      return this.type == 0;
    }

    public CT_CustomGeometry2DModel getCustGeom() {
      return (CT_CustomGeometry2DModel) this.value;
    }

    public static custGeomOrPrstGeomModel newPrstGeom(CT_PresetGeometry2DModel value) {
      return new custGeomOrPrstGeomModel(1, value);
    }

    public boolean isPrstGeom() {
      return this.type == 1;
    }

    public CT_PresetGeometry2DModel getPrstGeom() {
      return (CT_PresetGeometry2DModel) this.value;
    }
  }

  public static class noFillOrSolidFillOrGradFillModel {
    private final int type;

    private final Object value;

    public noFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private noFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static noFillOrSolidFillOrGradFillModel newNoFill(CT_NoFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newSolidFill(
        CT_SolidColorFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newGradFill(
        CT_GradientFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }

  public static class effectLstOrEffectDagModel {
    private final int type;

    private final Object value;

    public effectLstOrEffectDagModel() {
      this(-1, null);
    }

    private effectLstOrEffectDagModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static effectLstOrEffectDagModel newEffectLst(CT_EffectListModel value) {
      return new effectLstOrEffectDagModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public CT_EffectListModel getEffectLst() {
      return (CT_EffectListModel) this.value;
    }

    public static effectLstOrEffectDagModel newEffectDag(CT_EffectContainerModel value) {
      return new effectLstOrEffectDagModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public CT_EffectContainerModel getEffectDag() {
      return (CT_EffectContainerModel) this.value;
    }
  }
}
