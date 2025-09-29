package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LightRigBuilder;

/**
 * This is a generated sequence class.
 */
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

  public LightRigBuilder builder() {
    return new LightRigBuilder().from(this);
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
