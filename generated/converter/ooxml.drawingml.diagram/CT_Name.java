


public class CT_NameModel {


    private final StringModel lang;
    private final StringModel val;

    public CT_NameModel(StringModel lang , StringModel val ) {
        this.lang = lang;
        this.val = val;
    }

    public StringModel getLang() {
        return this.lang;
    }
    public StringModel getVal() {
        return this.val;
    }
}