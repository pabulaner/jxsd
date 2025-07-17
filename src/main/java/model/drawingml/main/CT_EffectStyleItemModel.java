package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_EffectStyleItemModel {
  private final effectLstOrEffectDagModel effectLstOrEffectDag;

  private final CT_Scene3DModel scene3d;

  private final CT_Shape3DModel sp3d;

  public CT_EffectStyleItemModel(effectLstOrEffectDagModel effectLstOrEffectDag,
      CT_Scene3DModel scene3d, CT_Shape3DModel sp3d) {
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    this.scene3d = scene3d;
    this.sp3d = sp3d;
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
