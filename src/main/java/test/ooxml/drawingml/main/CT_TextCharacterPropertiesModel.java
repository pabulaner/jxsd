
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_TextStrikeTypeModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.main.ST_PercentageModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.officeDocument.sharedTypes.ST_LangModel;
import test.ooxml.drawingml.main.ST_TextFontSizeModel;
import test._2001.XMLSchema.UnsignedIntModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TextUnderlineTypeModel;
import test.ooxml.drawingml.main.ST_TextNonNegativePointModel;
import test.ooxml.drawingml.main.ST_TextCapsTypeModel;
import test.ooxml.officeDocument.sharedTypes.ST_LangModel;
import test.ooxml.drawingml.main.ST_TextPointModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_ColorModel;
import test.ooxml.drawingml.main.CT_TextFontModel;
import test.ooxml.drawingml.main.CT_TextFontModel;
import test.ooxml.drawingml.main.CT_TextFontModel;
import test.ooxml.drawingml.main.CT_TextFontModel;
import test.ooxml.drawingml.main.CT_HyperlinkModel;
import test.ooxml.drawingml.main.CT_HyperlinkModel;
import test.ooxml.drawingml.main.CT_BooleanModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_TextCharacterPropertiesModel {


    private final ST_TextStrikeTypeModel strike;
    private final BooleanModel noProof;
    private final StringModel bmk;
    private final ST_PercentageModel baseline;
    private final BooleanModel dirty;
    private final BooleanModel smtClean;
    private final BooleanModel err;
    private final BooleanModel kumimoji;
    private final BooleanModel b;
    private final BooleanModel i;
    private final ST_LangModel lang;
    private final ST_TextFontSizeModel sz;
    private final UnsignedIntModel smtId;
    private final BooleanModel normalizeH;
    private final ST_TextUnderlineTypeModel u;
    private final ST_TextNonNegativePointModel kern;
    private final ST_TextCapsTypeModel cap;
    private final ST_LangModel altLang;
    private final ST_TextPointModel spc;
    private final CT_LinePropertiesModel ln;
    private final CT_ColorModel highlight;
    private final CT_TextFontModel latin;
    private final CT_TextFontModel ea;
    private final CT_TextFontModel cs;
    private final CT_TextFontModel sym;
    private final CT_HyperlinkModel hlinkClick;
    private final CT_HyperlinkModel hlinkMouseOver;
    private final CT_BooleanModel rtl;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TextCharacterPropertiesModel(ST_TextStrikeTypeModel strike, BooleanModel noProof, StringModel bmk, ST_PercentageModel baseline, BooleanModel dirty, BooleanModel smtClean, BooleanModel err, BooleanModel kumimoji, BooleanModel b, BooleanModel i, ST_LangModel lang, ST_TextFontSizeModel sz, UnsignedIntModel smtId, BooleanModel normalizeH, ST_TextUnderlineTypeModel u, ST_TextNonNegativePointModel kern, ST_TextCapsTypeModel cap, ST_LangModel altLang, ST_TextPointModel spc, CT_LinePropertiesModel ln, CT_ColorModel highlight, CT_TextFontModel latin, CT_TextFontModel ea, CT_TextFontModel cs, CT_TextFontModel sym, CT_HyperlinkModel hlinkClick, CT_HyperlinkModel hlinkMouseOver, CT_BooleanModel rtl, CT_OfficeArtExtensionListModel extLst) {
        this.strike = strike;
        this.noProof = noProof;
        this.bmk = bmk;
        this.baseline = baseline;
        this.dirty = dirty;
        this.smtClean = smtClean;
        this.err = err;
        this.kumimoji = kumimoji;
        this.b = b;
        this.i = i;
        this.lang = lang;
        this.sz = sz;
        this.smtId = smtId;
        this.normalizeH = normalizeH;
        this.u = u;
        this.kern = kern;
        this.cap = cap;
        this.altLang = altLang;
        this.spc = spc;
        this.ln = ln;
        this.highlight = highlight;
        this.latin = latin;
        this.ea = ea;
        this.cs = cs;
        this.sym = sym;
        this.hlinkClick = hlinkClick;
        this.hlinkMouseOver = hlinkMouseOver;
        this.rtl = rtl;
        this.extLst = extLst;
    }

    public ST_TextStrikeTypeModel getStrike() {
        return this.strike;
    }
    public BooleanModel getNoProof() {
        return this.noProof;
    }
    public StringModel getBmk() {
        return this.bmk;
    }
    public ST_PercentageModel getBaseline() {
        return this.baseline;
    }
    public BooleanModel getDirty() {
        return this.dirty;
    }
    public BooleanModel getSmtClean() {
        return this.smtClean;
    }
    public BooleanModel getErr() {
        return this.err;
    }
    public BooleanModel getKumimoji() {
        return this.kumimoji;
    }
    public BooleanModel getB() {
        return this.b;
    }
    public BooleanModel getI() {
        return this.i;
    }
    public ST_LangModel getLang() {
        return this.lang;
    }
    public ST_TextFontSizeModel getSz() {
        return this.sz;
    }
    public UnsignedIntModel getSmtId() {
        return this.smtId;
    }
    public BooleanModel getNormalizeH() {
        return this.normalizeH;
    }
    public ST_TextUnderlineTypeModel getU() {
        return this.u;
    }
    public ST_TextNonNegativePointModel getKern() {
        return this.kern;
    }
    public ST_TextCapsTypeModel getCap() {
        return this.cap;
    }
    public ST_LangModel getAltLang() {
        return this.altLang;
    }
    public ST_TextPointModel getSpc() {
        return this.spc;
    }
    public CT_LinePropertiesModel getLn() {
        return this.ln;
    }
    public CT_ColorModel getHighlight() {
        return this.highlight;
    }
    public CT_TextFontModel getLatin() {
        return this.latin;
    }
    public CT_TextFontModel getEa() {
        return this.ea;
    }
    public CT_TextFontModel getCs() {
        return this.cs;
    }
    public CT_TextFontModel getSym() {
        return this.sym;
    }
    public CT_HyperlinkModel getHlinkClick() {
        return this.hlinkClick;
    }
    public CT_HyperlinkModel getHlinkMouseOver() {
        return this.hlinkMouseOver;
    }
    public CT_BooleanModel getRtl() {
        return this.rtl;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
