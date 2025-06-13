


public class ST_FunctionValueModel {

    private final Object value;

    public ST_FunctionValueModel(IntModel value) {
        this.value = value;
    }
    public ST_FunctionValueModel(BooleanModel value) {
        this.value = value;
    }
    public ST_FunctionValueModel(ST_DirectionModel value) {
        this.value = value;
    }
    public ST_FunctionValueModel(ST_HierBranchStyleModel value) {
        this.value = value;
    }
    public ST_FunctionValueModel(ST_AnimOneStrModel value) {
        this.value = value;
    }
    public ST_FunctionValueModel(ST_AnimLvlStrModel value) {
        this.value = value;
    }
    public ST_FunctionValueModel(ST_ResizeHandlesStrModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public IntModel getInt() {
        return (IntModel) this.value;
    }
    public BooleanModel getBoolean() {
        return (BooleanModel) this.value;
    }
    public ST_DirectionModel getST_Direction() {
        return (ST_DirectionModel) this.value;
    }
    public ST_HierBranchStyleModel getST_HierBranchStyle() {
        return (ST_HierBranchStyleModel) this.value;
    }
    public ST_AnimOneStrModel getST_AnimOneStr() {
        return (ST_AnimOneStrModel) this.value;
    }
    public ST_AnimLvlStrModel getST_AnimLvlStr() {
        return (ST_AnimLvlStrModel) this.value;
    }
    public ST_ResizeHandlesStrModel getST_ResizeHandlesStr() {
        return (ST_ResizeHandlesStrModel) this.value;
    }
}