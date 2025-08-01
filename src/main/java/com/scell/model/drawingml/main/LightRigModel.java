package com.scell.model.drawingml.main;

public class LightRigModel {
  private final LightRigTypeValueModel rig;

  private final LightRigDirectionValueModel dir;

  private final SphereCoordsModel rot;

  public LightRigModel(LightRigTypeValueModel rig, LightRigDirectionValueModel dir,
      SphereCoordsModel rot) {
    this.rig = rig;
    this.dir = dir;
    this.rot = rot;
  }

  public LightRigTypeValueModel getRig() {
    return this.rig;
  }

  public LightRigDirectionValueModel getDir() {
    return this.dir;
  }

  public SphereCoordsModel getRot() {
    return this.rot;
  }
}
