


public class CT_SDCategoriesModel {




public class CatModel {


    private final List<CT_SDCategoryModel> cat;

    public CatModel(List<CT_SDCategoryModel> cat ) {
        this.cat = cat;
    }

    public List<CT_SDCategoryModel> getCat() {
        return this.cat;
    }
}

    private final List<CatModel> cat;

    public CT_SDCategoriesModel(List<CatModel> cat ) {
        this.cat = cat;
    }

    public List<CatModel> getCat() {
        return this.cat;
    }
}