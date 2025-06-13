


public class ST_AdjCoordinateModel {

    private final Object value;

    public ST_AdjCoordinateModel(ST_CoordinateModel value) {
        this.value = value;
    }
    public ST_AdjCoordinateModel(ST_GeomGuideNameModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_CoordinateModel getST_Coordinate() {
        return (ST_CoordinateModel) this.value;
    }
    public ST_GeomGuideNameModel getST_GeomGuideName() {
        return (ST_GeomGuideNameModel) this.value;
    }
}