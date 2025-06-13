


public class ST_TextPointUnqualifiedModel extends IntModel {

    public ST_TextPointUnqualifiedModel(decimal value) {
        super(value);

        if (!(value >= -400000)) throw new IllegalArgumentException();
        if (!(value <= 400000)) throw new IllegalArgumentException();
    }
}