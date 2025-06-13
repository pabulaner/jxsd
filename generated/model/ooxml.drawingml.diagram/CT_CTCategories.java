


public class CT_CTCategoriesModel {




public class CatModel {


    private final List<CT_CTCategoryModel> cat;

    public CatModel(List<CT_CTCategoryModel> cat ) {
        this.cat = cat;
    }

    public List<CT_CTCategoryModel> getCat() {
        return this.cat;
    }
}

    private final List<CatModel> cat;

    public CT_CTCategoriesModel(List<CatModel> cat ) {
        this.cat = cat;
    }

    public List<CatModel> getCat() {
        return this.cat;
    }
}