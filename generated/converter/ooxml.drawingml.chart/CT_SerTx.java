


public class CT_SerTxModel {




public class StrRefOrvModel {


    private final Object value;

    public StrRefOrvModel(CT_StrRefModel value) {
        this.value = value;
    }
    public StrRefOrvModel(ST_XstringModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_StrRefModel getStrRef() {
        return (CT_StrRefModel) value;
    }
    public ST_XstringModel getV() {
        return (ST_XstringModel) value;
    }
}

    private final StrRefOrvModel strRefOrv;

    public CT_SerTxModel(StrRefOrvModel strRefOrv ) {
        this.strRefOrv = strRefOrv;
    }

    public StrRefOrvModel getStrRefOrv() {
        return this.strRefOrv;
    }
}