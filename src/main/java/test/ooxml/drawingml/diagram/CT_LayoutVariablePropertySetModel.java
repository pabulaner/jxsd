
package test.ooxml.drawingml.diagram;

import test.ooxml.drawingml.diagram.CT_OrgChartModel;
import test.ooxml.drawingml.diagram.CT_ChildMaxModel;
import test.ooxml.drawingml.diagram.CT_ChildPrefModel;
import test.ooxml.drawingml.diagram.CT_BulletEnabledModel;
import test.ooxml.drawingml.diagram.CT_DirectionModel;
import test.ooxml.drawingml.diagram.CT_HierBranchStyleModel;
import test.ooxml.drawingml.diagram.CT_AnimOneModel;
import test.ooxml.drawingml.diagram.CT_AnimLvlModel;
import test.ooxml.drawingml.diagram.CT_ResizeHandlesModel;


public class CT_LayoutVariablePropertySetModel {


    private final CT_OrgChartModel orgChart;
    private final CT_ChildMaxModel chMax;
    private final CT_ChildPrefModel chPref;
    private final CT_BulletEnabledModel bulletEnabled;
    private final CT_DirectionModel dir;
    private final CT_HierBranchStyleModel hierBranch;
    private final CT_AnimOneModel animOne;
    private final CT_AnimLvlModel animLvl;
    private final CT_ResizeHandlesModel resizeHandles;

    public CT_LayoutVariablePropertySetModel(CT_OrgChartModel orgChart, CT_ChildMaxModel chMax, CT_ChildPrefModel chPref, CT_BulletEnabledModel bulletEnabled, CT_DirectionModel dir, CT_HierBranchStyleModel hierBranch, CT_AnimOneModel animOne, CT_AnimLvlModel animLvl, CT_ResizeHandlesModel resizeHandles) {
        this.orgChart = orgChart;
        this.chMax = chMax;
        this.chPref = chPref;
        this.bulletEnabled = bulletEnabled;
        this.dir = dir;
        this.hierBranch = hierBranch;
        this.animOne = animOne;
        this.animLvl = animLvl;
        this.resizeHandles = resizeHandles;
    }

    public CT_OrgChartModel getOrgChart() {
        return this.orgChart;
    }
    public CT_ChildMaxModel getChMax() {
        return this.chMax;
    }
    public CT_ChildPrefModel getChPref() {
        return this.chPref;
    }
    public CT_BulletEnabledModel getBulletEnabled() {
        return this.bulletEnabled;
    }
    public CT_DirectionModel getDir() {
        return this.dir;
    }
    public CT_HierBranchStyleModel getHierBranch() {
        return this.hierBranch;
    }
    public CT_AnimOneModel getAnimOne() {
        return this.animOne;
    }
    public CT_AnimLvlModel getAnimLvl() {
        return this.animLvl;
    }
    public CT_ResizeHandlesModel getResizeHandles() {
        return this.resizeHandles;
    }
}
