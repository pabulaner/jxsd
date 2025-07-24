package com.scell.model.drawingml.main;

public class LightRigModel {
  private final LightRigTypeModel rig;

  private final LightRigDirectionModel dir;

  private final SphereCoordsModel rot;

  public LightRigModel(LightRigTypeModel rig, LightRigDirectionModel dir, SphereCoordsModel rot) {
    this.rig = rig;
    this.dir = dir;
    this.rot = rot;
  }

  public LightRigTypeModel getRig() {
    return this.rig;
  }

  public LightRigDirectionModel getDir() {
    return this.dir;
  }

  public SphereCoordsModel getRot() {
    return this.rot;
  }
}
