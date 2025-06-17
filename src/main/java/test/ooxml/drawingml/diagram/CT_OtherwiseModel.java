
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_AlgorithmModel;
import test.ooxml.drawingml.diagram.CT_ShapeModel;
import test.ooxml.drawingml.diagram.CT_PresentationOfModel;
import test.ooxml.drawingml.diagram.CT_ConstraintsModel;
import test.ooxml.drawingml.diagram.CT_RulesModel;
import test.ooxml.drawingml.diagram.CT_ForEachModel;
import test.ooxml.drawingml.diagram.CT_LayoutNodeModel;
import test.ooxml.drawingml.diagram.CT_ChooseModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_OtherwiseModel {

public class AlgOrshapeOrpresOfModel {


    private final Object value;

    public AlgOrshapeOrpresOfModel(CT_AlgorithmModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ShapeModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_PresentationOfModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ConstraintsModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_RulesModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ForEachModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_LayoutNodeModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ChooseModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_OfficeArtExtensionListModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_AlgorithmModel getAlg() {
        return (CT_AlgorithmModel) value;
    }
    public CT_ShapeModel getShape() {
        return (CT_ShapeModel) value;
    }
    public CT_PresentationOfModel getPresOf() {
        return (CT_PresentationOfModel) value;
    }
    public CT_ConstraintsModel getConstrLst() {
        return (CT_ConstraintsModel) value;
    }
    public CT_RulesModel getRuleLst() {
        return (CT_RulesModel) value;
    }
    public CT_ForEachModel getForEach() {
        return (CT_ForEachModel) value;
    }
    public CT_LayoutNodeModel getLayoutNode() {
        return (CT_LayoutNodeModel) value;
    }
    public CT_ChooseModel getChoose() {
        return (CT_ChooseModel) value;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return (CT_OfficeArtExtensionListModel) value;
    }
}

    private final StringModel name;
    private final AlgOrshapeOrpresOfModel algOrshapeOrpresOf;

    public CT_OtherwiseModel(StringModel name, AlgOrshapeOrpresOfModel algOrshapeOrpresOf) {
        this.name = name;
        this.algOrshapeOrpresOf = algOrshapeOrpresOf;
    }

    public StringModel getName() {
        return this.name;
    }
    public AlgOrshapeOrpresOfModel getAlgOrshapeOrpresOf() {
        return this.algOrshapeOrpresOf;
    }
}
