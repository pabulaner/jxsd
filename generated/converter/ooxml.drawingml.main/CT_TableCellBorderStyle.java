


public class CT_TableCellBorderStyleModel {


    private final CT_ThemeableLineStyleModel left;
    private final CT_ThemeableLineStyleModel right;
    private final CT_ThemeableLineStyleModel top;
    private final CT_ThemeableLineStyleModel bottom;
    private final CT_ThemeableLineStyleModel insideH;
    private final CT_ThemeableLineStyleModel insideV;
    private final CT_ThemeableLineStyleModel tl2br;
    private final CT_ThemeableLineStyleModel tr2bl;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableCellBorderStyleModel(CT_ThemeableLineStyleModel left , CT_ThemeableLineStyleModel right , CT_ThemeableLineStyleModel top , CT_ThemeableLineStyleModel bottom , CT_ThemeableLineStyleModel insideH , CT_ThemeableLineStyleModel insideV , CT_ThemeableLineStyleModel tl2br , CT_ThemeableLineStyleModel tr2bl , CT_OfficeArtExtensionListModel extLst ) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.insideH = insideH;
        this.insideV = insideV;
        this.tl2br = tl2br;
        this.tr2bl = tr2bl;
        this.extLst = extLst;
    }

    public CT_ThemeableLineStyleModel getLeft() {
        return this.left;
    }
    public CT_ThemeableLineStyleModel getRight() {
        return this.right;
    }
    public CT_ThemeableLineStyleModel getTop() {
        return this.top;
    }
    public CT_ThemeableLineStyleModel getBottom() {
        return this.bottom;
    }
    public CT_ThemeableLineStyleModel getInsideH() {
        return this.insideH;
    }
    public CT_ThemeableLineStyleModel getInsideV() {
        return this.insideV;
    }
    public CT_ThemeableLineStyleModel getTl2br() {
        return this.tl2br;
    }
    public CT_ThemeableLineStyleModel getTr2bl() {
        return this.tr2bl;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}