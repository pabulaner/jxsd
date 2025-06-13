


public class CT_LineEndPropertiesModel {


    private final ST_LineEndTypeModel type;
    private final ST_LineEndWidthModel w;
    private final ST_LineEndLengthModel len;

    public CT_LineEndPropertiesModel(ST_LineEndTypeModel type , ST_LineEndWidthModel w , ST_LineEndLengthModel len ) {
        this.type = type;
        this.w = w;
        this.len = len;
    }

    public ST_LineEndTypeModel getType() {
        return this.type;
    }
    public ST_LineEndWidthModel getW() {
        return this.w;
    }
    public ST_LineEndLengthModel getLen() {
        return this.len;
    }
}