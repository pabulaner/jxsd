


public class ST_NodeCountModel extends IntModel {

    public ST_NodeCountModel(decimal value) {
        super(value);

        if (!(value >= -1)) throw new IllegalArgumentException();
    }
}