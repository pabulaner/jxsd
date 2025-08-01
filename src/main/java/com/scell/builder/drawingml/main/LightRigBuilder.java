package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LightRigDirectionValueModel;
import com.scell.model.drawingml.main.LightRigModel;
import com.scell.model.drawingml.main.LightRigTypeValueModel;
import com.scell.model.drawingml.main.SphereCoordsModel;

public class LightRigBuilder {
  private LightRigTypeValueModel rig;

  private LightRigDirectionValueModel dir;

  private SphereCoordsModel rot;

  public LightRigBuilder() {
  }

  public LightRigBuilder setRig(LightRigTypeValueModel rig) {
    this.rig = rig;
    return this;
  }

  public LightRigBuilder setDir(LightRigDirectionValueModel dir) {
    this.dir = dir;
    return this;
  }

  public LightRigBuilder setRot(SphereCoordsModel rot) {
    this.rot = rot;
    return this;
  }

  public LightRigModel build() {
    return new LightRigModel(this.rig, this.dir, this.rot);
  }

  public LightRigBuilder from(LightRigModel value) {
    this.rig = value.getRig();
    this.dir = value.getDir();
    this.rot = value.getRot();
    return this;
  }
}
