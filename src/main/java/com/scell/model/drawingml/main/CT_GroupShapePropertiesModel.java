package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_GroupShapePropertiesModel {
  private final ST_BlackWhiteModeModel bwMode;

  private final CT_GroupTransform2DModel xfrm;

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final EffectLstOrEffectDagModel effectLstOrEffectDag;

  private final CT_Scene3DModel scene3d;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_GroupShapePropertiesModel(ST_BlackWhiteModeModel bwMode, CT_GroupTransform2DModel xfrm,
      NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      EffectLstOrEffectDagModel effectLstOrEffectDag, CT_Scene3DModel scene3d,
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

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CT_Scene3DModel getScene3d() {
    return this.scene3d;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class NoFillOrSolidFillOrGradFillModel {
    private final int type;

    private final Object value;

    public NoFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private NoFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoFillOrSolidFillOrGradFillModel newNoFill(CT_NoFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newSolidFill(
        CT_SolidColorFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGradFill(
        CT_GradientFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }

  public static class EffectLstOrEffectDagModel {
    private final int type;

    private final Object value;

    public EffectLstOrEffectDagModel() {
      this(-1, null);
    }

    private EffectLstOrEffectDagModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectLstOrEffectDagModel newEffectLst(CT_EffectListModel value) {
      return new EffectLstOrEffectDagModel(0, value);
    }

    public boolean isEffectLst() {
      return this.type == 0;
    }

    public CT_EffectListModel getEffectLst() {
      return (CT_EffectListModel) this.value;
    }

    public static EffectLstOrEffectDagModel newEffectDag(CT_EffectContainerModel value) {
      return new EffectLstOrEffectDagModel(1, value);
    }

    public boolean isEffectDag() {
      return this.type == 1;
    }

    public CT_EffectContainerModel getEffectDag() {
      return (CT_EffectContainerModel) this.value;
    }
  }
}
