package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LightRigDirectionModel;
import com.scell.model.drawingml.main.LightRigModel;
import com.scell.model.drawingml.main.LightRigTypeModel;
import com.scell.model.drawingml.main.SphereCoordsModel;

public class LightRigBuilder {
  private LightRigTypeModel rig;

  private LightRigDirectionModel dir;

  private SphereCoordsModel rot;

  public LightRigBuilder() {
  }

  public LightRigBuilder setRig(LightRigTypeModel rig) {
    this.rig = rig;
    return this;
  }

  public LightRigBuilder setDir(LightRigDirectionModel dir) {
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
