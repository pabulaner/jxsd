


public class ST_PositiveUniversalMeasureModel extends ST_UniversalMeasureModel {

    public ST_PositiveUniversalMeasureModel(string value) {
        super(value);

        if (!(value.matches("[0-9]+(\.[0-9]+)?(mm|cm|in|pt|pc|pi)"))) throw new IllegalArgumentException();
    }
}