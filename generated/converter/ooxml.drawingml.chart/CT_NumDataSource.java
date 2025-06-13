


public class CT_NumDataSourceModel {




public class NumRefOrnumLitModel {


    private final Object value;

    public NumRefOrnumLitModel(CT_NumRefModel value) {
        this.value = value;
    }
    public NumRefOrnumLitModel(CT_NumDataModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_NumRefModel getNumRef() {
        return (CT_NumRefModel) value;
    }
    public CT_NumDataModel getNumLit() {
        return (CT_NumDataModel) value;
    }
}

    private final NumRefOrnumLitModel numRefOrnumLit;

    public CT_NumDataSourceModel(NumRefOrnumLitModel numRefOrnumLit ) {
        this.numRefOrnumLit = numRefOrnumLit;
    }

    public NumRefOrnumLitModel getNumRefOrnumLit() {
        return this.numRefOrnumLit;
    }
}