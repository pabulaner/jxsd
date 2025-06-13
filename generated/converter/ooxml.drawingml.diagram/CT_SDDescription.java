


public class CT_SDDescriptionModel {


    private final StringModel lang;
    private final StringModel val;

    public CT_SDDescriptionModel(StringModel lang , StringModel val ) {
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