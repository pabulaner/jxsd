


public class ST_TextIndentLevelTypeModel extends IntModel {

    public ST_TextIndentLevelTypeModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 8)) throw new IllegalArgumentException();
    }
}