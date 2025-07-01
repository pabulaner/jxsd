package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTEffectStyleItemModel {
  private final EffectLstOrEffectDagModel effectLstOrEffectDag;

  private final CTScene3DModel scene3d;

  private final CTShape3DModel sp3d;

  public CTEffectStyleItemModel(EffectLstOrEffectDagModel effectLstOrEffectDag,
      CTScene3DModel scene3d, CTShape3DModel sp3d) {
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    this.scene3d = scene3d;
    this.sp3d = sp3d;
  }

  public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
    return this.effectLstOrEffectDag;
  }

  public CTScene3DModel getScene3d() {
    return this.scene3d;
  }

  public CTShape3DModel getSp3d() {
    return this.sp3d;
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
