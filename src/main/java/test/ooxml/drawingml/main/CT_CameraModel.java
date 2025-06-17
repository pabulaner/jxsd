
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PresetCameraTypeModel;
import test.ooxml.drawingml.main.ST_FOVAngleModel;
import test.ooxml.drawingml.main.ST_PositivePercentageModel;
import test.ooxml.drawingml.main.CT_SphereCoordsModel;


public class CT_CameraModel {


    private final ST_PresetCameraTypeModel prst;
    private final ST_FOVAngleModel fov;
    private final ST_PositivePercentageModel zoom;
    private final CT_SphereCoordsModel rot;

    public CT_CameraModel(ST_PresetCameraTypeModel prst, ST_FOVAngleModel fov, ST_PositivePercentageModel zoom, CT_SphereCoordsModel rot) {
        this.prst = prst;
        this.fov = fov;
        this.zoom = zoom;
        this.rot = rot;
    }

    public ST_PresetCameraTypeModel getPrst() {
        return this.prst;
    }
    public ST_FOVAngleModel getFov() {
        return this.fov;
    }
    public ST_PositivePercentageModel getZoom() {
        return this.zoom;
    }
    public CT_SphereCoordsModel getRot() {
        return this.rot;
    }
}
