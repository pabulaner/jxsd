


public class NameModel extends TokenModel {

    public NameModel(string value) {
        super(value);

        if (!(value.matches("\i\c*"))) throw new IllegalArgumentException();
    }
}