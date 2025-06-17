
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_AudioCDTimeModel;
import test.ooxml.drawingml.main.CT_AudioCDTimeModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_AudioCDModel {


    private final CT_AudioCDTimeModel st;
    private final CT_AudioCDTimeModel end;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_AudioCDModel(CT_AudioCDTimeModel st, CT_AudioCDTimeModel end, CT_OfficeArtExtensionListModel extLst) {
        this.st = st;
        this.end = end;
        this.extLst = extLst;
    }

    public CT_AudioCDTimeModel getSt() {
        return this.st;
    }
    public CT_AudioCDTimeModel getEnd() {
        return this.end;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
