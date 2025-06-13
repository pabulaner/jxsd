


public class CT_HeadersModel {




public class HeaderModel {


    private final StringModel header;

    public HeaderModel(StringModel header ) {
        this.header = header;
    }

    public StringModel getHeader() {
        return this.header;
    }
}

    private final List<HeaderModel> header;

    public CT_HeadersModel(List<HeaderModel> header ) {
        this.header = header;
    }

    public List<HeaderModel> getHeader() {
        return this.header;
    }
}