


public class ST_TextBulletSizePercentModel extends StringModel {

    public ST_TextBulletSizePercentModel(string value) {
        super(value);

        if (!(value.matches("0*((2[5-9])|([3-9][0-9])|([1-3][0-9][0-9])|400)%"))) throw new IllegalArgumentException();
    }
}