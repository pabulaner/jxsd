


public class CT_DispUnitsModel {




public class CustUnitOrbuiltInUnitModel {


    private final Object value;

    public CustUnitOrbuiltInUnitModel(CT_DoubleModel value) {
        this.value = value;
    }
    public CustUnitOrbuiltInUnitModel(CT_BuiltInUnitModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_DoubleModel getCustUnit() {
        return (CT_DoubleModel) value;
    }
    public CT_BuiltInUnitModel getBuiltInUnit() {
        return (CT_BuiltInUnitModel) value;
    }
}

    private final CustUnitOrbuiltInUnitModel custUnitOrbuiltInUnit;
    private final CT_DispUnitsLblModel dispUnitsLbl;
    private final CT_ExtensionListModel extLst;

    public CT_DispUnitsModel(CustUnitOrbuiltInUnitModel custUnitOrbuiltInUnit , CT_DispUnitsLblModel dispUnitsLbl , CT_ExtensionListModel extLst ) {
        this.custUnitOrbuiltInUnit = custUnitOrbuiltInUnit;
        this.dispUnitsLbl = dispUnitsLbl;
        this.extLst = extLst;
    }

    public CustUnitOrbuiltInUnitModel getCustUnitOrbuiltInUnit() {
        return this.custUnitOrbuiltInUnit;
    }
    public CT_DispUnitsLblModel getDispUnitsLbl() {
        return this.dispUnitsLbl;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}