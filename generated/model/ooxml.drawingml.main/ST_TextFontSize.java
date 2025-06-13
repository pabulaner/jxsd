


public class ST_TextFontSizeModel extends IntModel {

    public ST_TextFontSizeModel(decimal value) {
        super(value);

        if (!(value >= 100)) throw new IllegalArgumentException();
        if (!(value <= 400000)) throw new IllegalArgumentException();
    }
}