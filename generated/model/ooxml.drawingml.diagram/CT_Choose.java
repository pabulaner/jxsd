


public class CT_ChooseModel {


    private final StringModel name;
    private final List<CT_WhenModel> if;
    private final CT_OtherwiseModel else;

    public CT_ChooseModel(StringModel name , List<CT_WhenModel> if , CT_OtherwiseModel else ) {
        this.name = name;
        this.if = if;
        this.else = else;
    }

    public StringModel getName() {
        return this.name;
    }
    public List<CT_WhenModel> getIf() {
        return this.if;
    }
    public CT_OtherwiseModel getElse() {
        return this.else;
    }
}