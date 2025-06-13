


public class CT_TableModel {


    private final CT_TablePropertiesModel tblPr;
    private final CT_TableGridModel tblGrid;
    private final List<CT_TableRowModel> tr;

    public CT_TableModel(CT_TablePropertiesModel tblPr , CT_TableGridModel tblGrid , List<CT_TableRowModel> tr ) {
        this.tblPr = tblPr;
        this.tblGrid = tblGrid;
        this.tr = tr;
    }

    public CT_TablePropertiesModel getTblPr() {
        return this.tblPr;
    }
    public CT_TableGridModel getTblGrid() {
        return this.tblGrid;
    }
    public List<CT_TableRowModel> getTr() {
        return this.tr;
    }
}