package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTGroupShapePropertiesModel {
  private final STBlackWhiteModeModel bwMode;

  private final CTGroupTransform2DModel xfrm;

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private final EffectLstOrEffectDagModel effectLstOrEffectDag;

  private final CTScene3DModel scene3d;

  private final CTOfficeArtExtensionListModel extLst;

  public CTGroupShapePropertiesModel(STBlackWhiteModeModel bwMode, CTGroupTransform2DModel xfrm,
      NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill,
      EffectLstOrEffectDagModel effectLstOrEffectDag, CTScene3DModel scene3d,
      CTOfficeArtExtensionListModel extLst) {
    this.bwMode = bwMode;
    this.xfrm = xfrm;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    this.scene3d = scene3d;
    this.extLst = extLst;
  }

  public STBlackWhiteModeModel getBwMode() {
    return this.bwMode;
  }

  public CTGroupTransform2DModel getXfrm() {
    return this.xfrm;
  }

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CTScene3DModel getScene3d() {
    return this.scene3d;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class NoFillOrSolidFillOrGradFillModel {
    private final Integer type;

    private final Object value;

    public NoFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private NoFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoFillOrSolidFillOrGradFillModel newNoFill(CTNoFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(0, value);
    }

    public Boolean isNoFill() {
      return this.type == 0;
    }

    public CTNoFillPropertiesModel getNoFill() {
      return (CTNoFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newSolidFill(
        CTSolidColorFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(1, value);
    }

    public Boolean isSolidFill() {
      return this.type == 1;
    }

    public CTSolidColorFillPropertiesModel getSolidFill() {
      return (CTSolidColorFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGradFill(
        CTGradientFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(2, value);
    }

    public Boolean isGradFill() {
      return this.type == 2;
    }

    public CTGradientFillPropertiesModel getGradFill() {
      return (CTGradientFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newBlipFill(CTBlipFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public Boolean isBlipFill() {
      return this.type == 3;
    }

    public CTBlipFillPropertiesModel getBlipFill() {
      return (CTBlipFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newPattFill(CTPatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(4, value);
    }

    public Boolean isPattFill() {
      return this.type == 4;
    }

    public CTPatternFillPropertiesModel getPattFill() {
      return (CTPatternFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGrpFill(CTGroupFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(5, value);
    }

    public Boolean isGrpFill() {
      return this.type == 5;
    }

    public CTGroupFillPropertiesModel getGrpFill() {
      return (CTGroupFillPropertiesModel) this.value;
    }
  }

  public static class EffectLstOrEffectDagModel {
    private final Integer type;

    private final Object value;

    public EffectLstOrEffectDagModel() {
      this(-1, null);
    }

    private EffectLstOrEffectDagModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EffectLstOrEffectDagModel newEffectLst(CTEffectListModel value) {
      return new EffectLstOrEffectDagModel(0, value);
    }

    public Boolean isEffectLst() {
      return this.type == 0;
    }

    public CTEffectListModel getEffectLst() {
      return (CTEffectListModel) this.value;
    }

    public static EffectLstOrEffectDagModel newEffectDag(CTEffectContainerModel value) {
      return new EffectLstOrEffectDagModel(1, value);
    }

    public Boolean isEffectDag() {
      return this.type == 1;
    }

    public CTEffectContainerModel getEffectDag() {
      return (CTEffectContainerModel) this.value;
    }
  }
}
