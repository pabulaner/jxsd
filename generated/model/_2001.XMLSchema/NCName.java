


public class NCNameModel extends NameModel {

    public NCNameModel(string value) {
        super(value);

        if (!(value.matches("[\i-[:]][\c-[:]]*"))) throw new IllegalArgumentException();
    }
}