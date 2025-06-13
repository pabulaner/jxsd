


public class CT_NumericRuleModel {


    private final ST_ConstraintTypeModel type;
    private final ST_ElementTypeModel ptType;
    private final ST_ConstraintRelationshipModel for;
    private final DoubleModel fact;
    private final StringModel forName;
    private final DoubleModel val;
    private final DoubleModel max;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_NumericRuleModel(ST_ConstraintTypeModel type , ST_ElementTypeModel ptType , ST_ConstraintRelationshipModel for , DoubleModel fact , StringModel forName , DoubleModel val , DoubleModel max , CT_OfficeArtExtensionListModel extLst ) {
        this.type = type;
        this.ptType = ptType;
        this.for = for;
        this.fact = fact;
        this.forName = forName;
        this.val = val;
        this.max = max;
        this.extLst = extLst;
    }

    public ST_ConstraintTypeModel getType() {
        return this.type;
    }
    public ST_ElementTypeModel getPtType() {
        return this.ptType;
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
    public DoubleModel getMax() {
        return this.max;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}