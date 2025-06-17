
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_LightRigTypeModel;
import test.ooxml.drawingml.main.ST_LightRigDirectionModel;
import test.ooxml.drawingml.main.CT_SphereCoordsModel;


public class CT_LightRigModel {


    private final ST_LightRigTypeModel rig;
    private final ST_LightRigDirectionModel dir;
    private final CT_SphereCoordsModel rot;

    public CT_LightRigModel(ST_LightRigTypeModel rig, ST_LightRigDirectionModel dir, CT_SphereCoordsModel rot) {
        this.rig = rig;
        this.dir = dir;
        this.rot = rot;
    }

    public ST_LightRigTypeModel getRig() {
        return this.rig;
    }
    public ST_LightRigDirectionModel getDir() {
        return this.dir;
    }
    public CT_SphereCoordsModel getRot() {
        return this.rot;
    }
}
