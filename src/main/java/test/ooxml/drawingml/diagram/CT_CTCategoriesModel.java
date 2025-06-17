
package test.ooxml.drawingml.diagram;

import test.ooxml.drawingml.diagram.CT_CTCategoryModel;


public class CT_CTCategoriesModel {

public class CatModel {


    private final CT_CTCategoryModel cat;

    public CatModel(CT_CTCategoryModel cat) {
        this.cat = cat;
    }

    public CT_CTCategoryModel getCat() {
        return this.cat;
    }
}

    private final CatModel cat;

    public CT_CTCategoriesModel(CatModel cat) {
        this.cat = cat;
    }

    public CatModel getCat() {
        return this.cat;
    }
}
