


public class CT_ConstraintModel {


    private final ST_ConstraintTypeModel refType;
    private final ST_BoolOperatorModel op;
    private final ST_ConstraintTypeModel type;
    private final ST_ElementTypeModel ptType;
    private final ST_ConstraintRelationshipModel refFor;
    private final ST_ConstraintRelationshipModel for;
    private final DoubleModel fact;
    private final StringModel forName;
    private final DoubleModel val;
    private final ST_ElementTypeModel refPtType;
    private final StringModel refForName;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ConstraintModel(ST_ConstraintTypeModel refType , ST_BoolOperatorModel op , ST_ConstraintTypeModel type , ST_ElementTypeModel ptType , ST_ConstraintRelationshipModel refFor , ST_ConstraintRelationshipModel for , DoubleModel fact , StringModel forName , DoubleModel val , ST_ElementTypeModel refPtType , StringModel refForName , CT_OfficeArtExtensionListModel extLst ) {
        this.refType = refType;
        this.op = op;
        this.type = type;
        this.ptType = ptType;
        this.refFor = refFor;
        this.for = for;
        this.fact = fact;
        this.forName = forName;
        this.val = val;
        this.refPtType = refPtType;
        this.refForName = refForName;
        this.extLst = extLst;
    }

    public ST_ConstraintTypeModel getRefType() {
        return this.refType;
    }
    public ST_BoolOperatorModel getOp() {
        return this.op;
    }
    public ST_ConstraintTypeModel getType() {
        return this.type;
    }
    public ST_ElementTypeModel getPtType() {
        return this.ptType;
    }
    public ST_ConstraintRelationshipModel getRefFor() {
        return this.refFor;
    }
    public ST_ConstraintRelationshipModel getFor() {
        return this.for;
    }
    public DoubleModel getFact() {
        return this.fact;
    }
    public StringModel getForName() {
        return this.forName;
    }
    public DoubleModel getVal() {
        return this.val;
    }
    public ST_ElementTypeModel getRefPtType() {
        return this.refPtType;
    }
    public StringModel getRefForName() {
        return this.refForName;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}