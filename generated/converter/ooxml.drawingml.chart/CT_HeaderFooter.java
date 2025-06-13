


public class CT_HeaderFooterModel {


    private final BooleanModel differentOddEven;
    private final BooleanModel differentFirst;
    private final BooleanModel alignWithMargins;
    private final ST_XstringModel oddHeader;
    private final ST_XstringModel oddFooter;
    private final ST_XstringModel evenHeader;
    private final ST_XstringModel evenFooter;
    private final ST_XstringModel firstHeader;
    private final ST_XstringModel firstFooter;

    public CT_HeaderFooterModel(BooleanModel differentOddEven , BooleanModel differentFirst , BooleanModel alignWithMargins , ST_XstringModel oddHeader , ST_XstringModel oddFooter , ST_XstringModel evenHeader , ST_XstringModel evenFooter , ST_XstringModel firstHeader , ST_XstringModel firstFooter ) {
        this.differentOddEven = differentOddEven;
        this.differentFirst = differentFirst;
        this.alignWithMargins = alignWithMargins;
        this.oddHeader = oddHeader;
        this.oddFooter = oddFooter;
        this.evenHeader = evenHeader;
        this.evenFooter = evenFooter;
        this.firstHeader = firstHeader;
        this.firstFooter = firstFooter;
    }

    public BooleanModel getDifferentOddEven() {
        return this.differentOddEven;
    }
    public BooleanModel getDifferentFirst() {
        return this.differentFirst;
    }
    public BooleanModel getAlignWithMargins() {
        return this.alignWithMargins;
    }
    public ST_XstringModel getOddHeader() {
        return this.oddHeader;
    }
    public ST_XstringModel getOddFooter() {
        return this.oddFooter;
    }
    public ST_XstringModel getEvenHeader() {
        return this.evenHeader;
    }
    public ST_XstringModel getEvenFooter() {
        return this.evenFooter;
    }
    public ST_XstringModel getFirstHeader() {
        return this.firstHeader;
    }
    public ST_XstringModel getFirstFooter() {
        return this.firstFooter;
    }
}