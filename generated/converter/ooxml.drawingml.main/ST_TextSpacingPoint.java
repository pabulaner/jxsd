


public class ST_TextSpacingPointModel extends IntModel {

    public ST_TextSpacingPointModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 158400)) throw new IllegalArgumentException();
    }
}