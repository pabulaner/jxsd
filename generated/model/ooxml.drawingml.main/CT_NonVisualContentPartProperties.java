


public class CT_NonVisualContentPartPropertiesModel {


    private final BooleanModel isComment;
    private final CT_ContentPartLockingModel cpLocks;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_NonVisualContentPartPropertiesModel(BooleanModel isComment , CT_ContentPartLockingModel cpLocks , CT_OfficeArtExtensionListModel extLst ) {
        this.isComment = isComment;
        this.cpLocks = cpLocks;
        this.extLst = extLst;
    }

    public BooleanModel getIsComment() {
        return this.isComment;
    }
    public CT_ContentPartLockingModel getCpLocks() {
        return this.cpLocks;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}