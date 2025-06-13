


public class CT_SystemColorModel {


    private final ST_SystemColorValModel val;
    private final ST_HexColorRGBModel lastClr;

    public CT_SystemColorModel(ST_SystemColorValModel val , ST_HexColorRGBModel lastClr ) {
        this.val = val;
        this.lastClr = lastClr;
    }

    public ST_SystemColorValModel getVal() {
        return this.val;
    }
    public ST_HexColorRGBModel getLastClr() {
        return this.lastClr;
    }
}