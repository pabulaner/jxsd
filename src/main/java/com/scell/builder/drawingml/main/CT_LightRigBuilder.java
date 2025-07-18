package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LightRigModel;
import com.scell.model.drawingml.main.CT_SphereCoordsModel;
import com.scell.model.drawingml.main.ST_LightRigDirectionModel;
import com.scell.model.drawingml.main.ST_LightRigTypeModel;

public class CT_LightRigBuilder {
  private ST_LightRigTypeModel rig;

  private ST_LightRigDirectionModel dir;

  private CT_SphereCoordsModel rot;

  public CT_LightRigBuilder() {
  }

  public CT_LightRigBuilder setRig(ST_LightRigTypeModel rig) {
    this.rig = rig;
    return this;
  }

  public CT_LightRigBuilder setDir(ST_LightRigDirectionModel dir) {
    this.dir = dir;
    return this;
  }

  public CT_LightRigBuilder setRot(CT_SphereCoordsModel rot) {
    this.rot = rot;
    return this;
  }

  public CT_LightRigModel build() {
    return new CT_LightRigModel(this.rig, this.dir, this.rot);
  }

  public CT_LightRigBuilder from(CT_LightRigModel value) {
    this.rig = value.getRig();
    this.dir = value.getDir();
    this.rot = value.getRot();
    return this;
  }
}
