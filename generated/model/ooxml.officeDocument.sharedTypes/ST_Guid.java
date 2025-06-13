


public class ST_GuidModel extends TokenModel {

    public ST_GuidModel(string value) {
        super(value);

        if (!(value.matches("\{[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}\}"))) throw new IllegalArgumentException();
    }
}