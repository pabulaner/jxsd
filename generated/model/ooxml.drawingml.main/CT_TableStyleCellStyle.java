


public class CT_TableStyleCellStyleModel {


    private final CT_TableCellBorderStyleModel tcBdr;
    private final CT_Cell3DModel cell3D;

    public CT_TableStyleCellStyleModel(CT_TableCellBorderStyleModel tcBdr , CT_Cell3DModel cell3D ) {
        this.tcBdr = tcBdr;
        this.cell3D = cell3D;
    }

    public CT_TableCellBorderStyleModel getTcBdr() {
        return this.tcBdr;
    }
    public CT_Cell3DModel getCell3D() {
        return this.cell3D;
    }
}