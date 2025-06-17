
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_HeaderFooterModel;
import test.ooxml.drawingml.chart.CT_PageMarginsModel;
import test.ooxml.drawingml.chart.CT_PageSetupModel;


public class CT_PrintSettingsModel {


    private final CT_HeaderFooterModel headerFooter;
    private final CT_PageMarginsModel pageMargins;
    private final CT_PageSetupModel pageSetup;

    public CT_PrintSettingsModel(CT_HeaderFooterModel headerFooter, CT_PageMarginsModel pageMargins, CT_PageSetupModel pageSetup) {
        this.headerFooter = headerFooter;
        this.pageMargins = pageMargins;
        this.pageSetup = pageSetup;
    }

    public CT_HeaderFooterModel getHeaderFooter() {
        return this.headerFooter;
    }
    public CT_PageMarginsModel getPageMargins() {
        return this.pageMargins;
    }
    public CT_PageSetupModel getPageSetup() {
        return this.pageSetup;
    }
}
