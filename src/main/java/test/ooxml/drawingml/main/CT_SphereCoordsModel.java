
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;
import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;
import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;


public class CT_SphereCoordsModel {


    private final ST_PositiveFixedAngleModel lat;
    private final ST_PositiveFixedAngleModel rev;
    private final ST_PositiveFixedAngleModel lon;

    public CT_SphereCoordsModel(ST_PositiveFixedAngleModel lat, ST_PositiveFixedAngleModel rev, ST_PositiveFixedAngleModel lon) {
        this.lat = lat;
        this.rev = rev;
        this.lon = lon;
    }

    public ST_PositiveFixedAngleModel getLat() {
        return this.lat;
    }
    public ST_PositiveFixedAngleModel getRev() {
        return this.rev;
    }
    public ST_PositiveFixedAngleModel getLon() {
        return this.lon;
    }
}
