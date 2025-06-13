


public class ST_TextBulletStartAtNumModel extends IntModel {

    public ST_TextBulletStartAtNumModel(decimal value) {
        super(value);

        if (!(value >= 1)) throw new IllegalArgumentException();
        if (!(value <= 32767)) throw new IllegalArgumentException();
    }
}