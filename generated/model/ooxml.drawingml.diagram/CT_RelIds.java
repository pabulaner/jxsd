


public class CT_RelIdsModel {


    private final ST_RelationshipIdModel dm;
    private final ST_RelationshipIdModel cs;
    private final ST_RelationshipIdModel lo;
    private final ST_RelationshipIdModel qs;

    public CT_RelIdsModel(ST_RelationshipIdModel dm , ST_RelationshipIdModel cs , ST_RelationshipIdModel lo , ST_RelationshipIdModel qs ) {
        this.dm = dm;
        this.cs = cs;
        this.lo = lo;
        this.qs = qs;
    }

    public ST_RelationshipIdModel getDm() {
        return this.dm;
    }
    public ST_RelationshipIdModel getCs() {
        return this.cs;
    }
    public ST_RelationshipIdModel getLo() {
        return this.lo;
    }
    public ST_RelationshipIdModel getQs() {
        return this.qs;
    }
}