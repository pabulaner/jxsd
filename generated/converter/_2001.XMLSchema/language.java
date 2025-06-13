


public class LanguageModel extends TokenModel {

    public LanguageModel(string value) {
        super(value);

        if (!(value.matches("([a-zA-Z]{2}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*"))) throw new IllegalArgumentException();
    }
}