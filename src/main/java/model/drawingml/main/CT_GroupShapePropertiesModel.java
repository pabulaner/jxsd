package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_GroupShapePropertiesModel {
  private final ST_BlackWhiteModeModel bwMode;

  private final CT_GroupTransform2DModel xfrm;

  private final noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final effectLstOrEffectDagModel effectLstOrEffectDag;

  private final CT_Scene3DModel scene3d;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_GroupShapePropertiesModel(ST_BlackWhiteModeModel bwMode, CT_GroupTransform2DModel xfrm,
      noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      effectLstOrEffectDagModel effectLstOrEffectDag, CT_Scene3DModel scene3d,
      CT_OfficeArtExtensionListModel extLst) {
    this.bwMode = bwMode;
    this.xfrm = xfrm;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    this.scene3d = scene3d;
    this.extLst = extLst;
  }

  public ST_BlackWhiteModeModel getBwMode() {
    return this.bwMode;
  }

  public CT_GroupTransform2DModel getXfrm() {
    return this.xfrm;
  }

  public noFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public effectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CT_Scene3DModel getScene3d() {
    return this.scene3d;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
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
