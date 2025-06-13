


public class ST_PositiveCoordinate32Model extends ST_Coordinate32UnqualifiedModel {

    public ST_PositiveCoordinate32Model(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
    }
}