
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.officeDocument.relationships.ST_RelationshipIdModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.CT_EmbeddedWAVAudioFileModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_HyperlinkModel {


    private final StringModel invalidUrl;
    private final StringModel tgtFrame;
    private final BooleanModel history;
    private final StringModel tooltip;
    private final ST_RelationshipIdModel id;
    private final BooleanModel highlightClick;
    private final StringModel action;
    private final BooleanModel endSnd;
    private final CT_EmbeddedWAVAudioFileModel snd;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_HyperlinkModel(StringModel invalidUrl, StringModel tgtFrame, BooleanModel history, StringModel tooltip, ST_RelationshipIdModel id, BooleanModel highlightClick, StringModel action, BooleanModel endSnd, CT_EmbeddedWAVAudioFileModel snd, CT_OfficeArtExtensionListModel extLst) {
        this.invalidUrl = invalidUrl;
        this.tgtFrame = tgtFrame;
        this.history = history;
        this.tooltip = tooltip;
        this.id = id;
        this.highlightClick = highlightClick;
        this.action = action;
        this.endSnd = endSnd;
        this.snd = snd;
        this.extLst = extLst;
    }

    public StringModel getInvalidUrl() {
        return this.invalidUrl;
    }
    public StringModel getTgtFrame() {
        return this.tgtFrame;
    }
    public BooleanModel getHistory() {
        return this.history;
    }
    public StringModel getTooltip() {
        return this.tooltip;
    }
    public ST_RelationshipIdModel getId() {
        return this.id;
    }
    public BooleanModel getHighlightClick() {
        return this.highlightClick;
    }
    public StringModel getAction() {
        return this.action;
    }
    public BooleanModel getEndSnd() {
        return this.endSnd;
    }
    public CT_EmbeddedWAVAudioFileModel getSnd() {
        return this.snd;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
