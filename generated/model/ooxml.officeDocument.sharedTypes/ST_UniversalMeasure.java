


public class ST_UniversalMeasureModel extends StringModel {

    public ST_UniversalMeasureModel(string value) {
        super(value);

        if (!(value.matches("-?[0-9]+(\.[0-9]+)?(mm|cm|in|pt|pc|pi)"))) throw new IllegalArgumentException();
    }
}