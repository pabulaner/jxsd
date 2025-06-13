


public class CT_ThemeableLineStyleModel {




public class LnOrlnRefModel {


    private final Object value;

    public LnOrlnRefModel(CT_LinePropertiesModel value) {
        this.value = value;
    }
    public LnOrlnRefModel(CT_StyleMatrixReferenceModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_LinePropertiesModel getLn() {
        return (CT_LinePropertiesModel) value;
    }
    public CT_StyleMatrixReferenceModel getLnRef() {
        return (CT_StyleMatrixReferenceModel) value;
    }
}

    private final LnOrlnRefModel lnOrlnRef;

    public CT_ThemeableLineStyleModel(LnOrlnRefModel lnOrlnRef ) {
        this.lnOrlnRef = lnOrlnRef;
    }

    public LnOrlnRefModel getLnOrlnRef() {
        return this.lnOrlnRef;
    }
}