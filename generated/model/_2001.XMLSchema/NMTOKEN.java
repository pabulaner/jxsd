


public class NMTOKENModel extends TokenModel {

    public NMTOKENModel(string value) {
        super(value);

        if (!(value.matches("\c+"))) throw new IllegalArgumentException();
    }
}