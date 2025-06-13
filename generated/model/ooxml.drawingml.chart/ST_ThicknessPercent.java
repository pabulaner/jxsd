


public class ST_ThicknessPercentModel extends StringModel {

    public ST_ThicknessPercentModel(string value) {
        super(value);

        if (!(value.matches("([0-9]+)%"))) throw new IllegalArgumentException();
    }
}