package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_EffectStyleItemModel;
import com.scell.model.drawingml.main.CT_Scene3DModel;
import com.scell.model.drawingml.main.CT_Shape3DModel;
import java.lang.Object;

public class CT_EffectStyleItemBuilder {
  private CT_EffectStyleItemModel.EffectLstOrEffectDagModel effectLstOrEffectDag;

  private CT_Scene3DModel scene3d;

  private CT_Shape3DModel sp3d;

  public CT_EffectStyleItemBuilder() {
  }

  public CT_EffectStyleItemBuilder setEffectLstOrEffectDag(
      CT_EffectStyleItemModel.EffectLstOrEffectDagModel effectLstOrEffectDag) {
    this.effectLstOrEffectDag = effectLstOrEffectDag;
    return this;
  }

  public CT_EffectStyleItemBuilder setScene3d(CT_Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public CT_EffectStyleItemBuilder setSp3d(CT_Shape3DModel sp3d) {
    this.sp3d = sp3d;
    return this;
  }

  public CT_EffectStyleItemModel build() {
    return new CT_EffectStyleItemModel(this.effectLstOrEffectDag, this.scene3d, this.sp3d);
  }

  public CT_EffectStyleItemBuilder from(CT_EffectStyleItemModel value) {
    this.effectLstOrEffectDag = value.getEffectLstOrEffectDag();
    this.scene3d = value.getScene3d();
    this.sp3d = value.getSp3d();
    return this;
  }

  public static class EffectLstOrEffectDagBuilder {
    private int type;

    private Object value;

    public EffectLstOrEffectDagBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EffectLstOrEffectDagBuilder setEffectLst(CT_EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EffectLstOrEffectDagBuilder setEffectDag(CT_EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_EffectStyleItemModel.EffectLstOrEffectDagModel build() {
      if (this.type == -1) return new CT_EffectStyleItemModel.EffectLstOrEffectDagModel();
      if (this.type == 0) return CT_EffectStyleItemModel.EffectLstOrEffectDagModel.newEffectLst((CT_EffectListModel) this.value);
      if (this.type == 1) return CT_EffectStyleItemModel.EffectLstOrEffectDagModel.newEffectDag((CT_EffectContainerModel) this.value);
      return null;
    }

    public EffectLstOrEffectDagBuilder from(
        CT_EffectStyleItemModel.EffectLstOrEffectDagModel value) {
      this.type = -1;
      this.value = null;
      if (value.isEffectLst()) {
        this.type = 0;
        this.value = value.getEffectLst();
      }
      if (value.isEffectDag()) {
        this.type = 1;
        this.value = value.getEffectDag();
      }
      return this;
    }
  }
}
