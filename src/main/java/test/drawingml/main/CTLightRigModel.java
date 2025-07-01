package test.drawingml.main;

public class CTLightRigModel {
  private final STLightRigTypeModel rig;

  private final STLightRigDirectionModel dir;

  private final CTSphereCoordsModel rot;

  public CTLightRigModel(STLightRigTypeModel rig, STLightRigDirectionModel dir,
      CTSphereCoordsModel rot) {
    this.rig = rig;
    this.dir = dir;
    this.rot = rot;
  }

  public STLightRigTypeModel getRig() {
    return this.rig;
  }

  public STLightRigDirectionModel getDir() {
    return this.dir;
  }

  public CTSphereCoordsModel getRot() {
    return this.rot;
  }
}
