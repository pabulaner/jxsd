


public class CT_TableStyleListModel {


    private final ST_GuidModel def;
    private final List<CT_TableStyleModel> tblStyle;

    public CT_TableStyleListModel(ST_GuidModel def , List<CT_TableStyleModel> tblStyle ) {
        this.def = def;
        this.tblStyle = tblStyle;
    }

    public ST_GuidModel getDef() {
        return this.def;
    }
    public List<CT_TableStyleModel> getTblStyle() {
        return this.tblStyle;
    }
}