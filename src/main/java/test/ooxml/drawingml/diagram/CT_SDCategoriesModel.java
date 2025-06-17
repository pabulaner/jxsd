
package test.ooxml.drawingml.diagram;

import test.ooxml.drawingml.diagram.CT_SDCategoryModel;


public class CT_SDCategoriesModel {

public class CatModel {


    private final CT_SDCategoryModel cat;

    public CatModel(CT_SDCategoryModel cat) {
        this.cat = cat;
    }

    public CT_SDCategoryModel getCat() {
        return this.cat;
    }
}

    private final CatModel cat;

    public CT_SDCategoriesModel(CatModel cat) {
        this.cat = cat;
    }

    public CatModel getCat() {
        return this.cat;
    }
}
