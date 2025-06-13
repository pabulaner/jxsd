


public class CT_SDCategoryModel {


    private final AnyURIModel type;
    private final UnsignedIntModel pri;

    public CT_SDCategoryModel(AnyURIModel type , UnsignedIntModel pri ) {
        this.type = type;
        this.pri = pri;
    }

    public AnyURIModel getType() {
        return this.type;
    }
    public UnsignedIntModel getPri() {
        return this.pri;
    }
}