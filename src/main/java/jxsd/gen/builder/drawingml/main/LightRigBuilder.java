package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LightRigDirectionValueModel;
import jxsd.gen.model.drawingml.main.LightRigModel;
import jxsd.gen.model.drawingml.main.LightRigTypeValueModel;
import jxsd.gen.model.drawingml.main.SphereCoordsModel;

/**
 * This is a generated sequence class.
 */
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

  public LightRigBuilder from(LightRigModel value) {
    this.rig = value.getRig();
    this.dir = value.getDir();
    this.rot = value.getRot();
    return this;
  }

  public LightRigModel build() {
    return new LightRigModel(this.rig, this.dir, this.rot);
  }
}
