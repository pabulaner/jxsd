package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import test.dml.CTTextCharacterPropertiesModel.UFillTxOrUFillModel.*;
import test.XMLSchema.*;
import test.dml.CTTextCharacterPropertiesModel.ULnTxOrULnModel.*;
import test.dml.CTTextCharacterPropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.dml.CTTextCharacterPropertiesModel.*;
import test.dml.chartDrawing.*;
import test.dml.CTTextCharacterPropertiesModel.EffectLstOrEffectDagModel.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;

public class CTTextCharacterPropertiesModel
{
	
	public static class NoFillOrSolidFillOrGradFillModel
	{
		
		private final CTNoFillPropertiesModel noFill;
		private final CTSolidColorFillPropertiesModel solidFill;
		private final CTGradientFillPropertiesModel gradFill;
		private final CTBlipFillPropertiesModel blipFill;
		private final CTPatternFillPropertiesModel pattFill;
		private final CTGroupFillPropertiesModel grpFill;
		
		public NoFillOrSolidFillOrGradFillModel(CTNoFillPropertiesModel noFill, CTSolidColorFillPropertiesModel solidFill, CTGradientFillPropertiesModel gradFill, CTBlipFillPropertiesModel blipFill, CTPatternFillPropertiesModel pattFill, CTGroupFillPropertiesModel grpFill) {
			this.noFill = noFill;
			this.solidFill = solidFill;
			this.gradFill = gradFill;
			this.blipFill = blipFill;
			this.pattFill = pattFill;
			this.grpFill = grpFill;
		}
		
		public CTNoFillPropertiesModel getNoFill() {
			return this.noFill;
		}
		public CTSolidColorFillPropertiesModel getSolidFill() {
			return this.solidFill;
		}
		public CTGradientFillPropertiesModel getGradFill() {
			return this.gradFill;
		}
		public CTBlipFillPropertiesModel getBlipFill() {
			return this.blipFill;
		}
		public CTPatternFillPropertiesModel getPattFill() {
			return this.pattFill;
		}
		public CTGroupFillPropertiesModel getGrpFill() {
			return this.grpFill;
		}
	}
	public static class EffectLstOrEffectDagModel
	{
		
		private final CTEffectListModel effectLst;
		private final CTEffectContainerModel effectDag;
		
		public EffectLstOrEffectDagModel(CTEffectListModel effectLst, CTEffectContainerModel effectDag) {
			this.effectLst = effectLst;
			this.effectDag = effectDag;
		}
		
		public CTEffectListModel getEffectLst() {
			return this.effectLst;
		}
		public CTEffectContainerModel getEffectDag() {
			return this.effectDag;
		}
	}
	public static class ULnTxOrULnModel
	{
		
		private final CTTextUnderlineLineFollowTextModel uLnTx;
		private final CTLinePropertiesModel uLn;
		
		public ULnTxOrULnModel(CTTextUnderlineLineFollowTextModel uLnTx, CTLinePropertiesModel uLn) {
			this.uLnTx = uLnTx;
			this.uLn = uLn;
		}
		
		public CTTextUnderlineLineFollowTextModel getULnTx() {
			return this.uLnTx;
		}
		public CTLinePropertiesModel getULn() {
			return this.uLn;
		}
	}
	public static class UFillTxOrUFillModel
	{
		
		private final CTTextUnderlineFillFollowTextModel uFillTx;
		private final CTTextUnderlineFillGroupWrapperModel uFill;
		
		public UFillTxOrUFillModel(CTTextUnderlineFillFollowTextModel uFillTx, CTTextUnderlineFillGroupWrapperModel uFill) {
			this.uFillTx = uFillTx;
			this.uFill = uFill;
		}
		
		public CTTextUnderlineFillFollowTextModel getUFillTx() {
			return this.uFillTx;
		}
		public CTTextUnderlineFillGroupWrapperModel getUFill() {
			return this.uFill;
		}
	}
	private final STTextStrikeTypeModel strike;
	private final BooleanModel noProof;
	private final StringModel bmk;
	private final STPercentageModel baseline;
	private final BooleanModel dirty;
	private final BooleanModel smtClean;
	private final BooleanModel err;
	private final BooleanModel kumimoji;
	private final BooleanModel b;
	private final BooleanModel i;
	private final STTextLanguageIDModel lang;
	private final STTextFontSizeModel sz;
	private final UnsignedIntModel smtId;
	private final BooleanModel normalizeH;
	private final STTextUnderlineTypeModel u;
	private final STTextNonNegativePointModel kern;
	private final STTextCapsTypeModel cap;
	private final STTextLanguageIDModel altLang;
	private final STTextPointModel spc;
	private final CTLinePropertiesModel ln;
	private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;
	private final EffectLstOrEffectDagModel effectLstOrEffectDag;
	private final CTColorModel highlight;
	private final ULnTxOrULnModel uLnTxOrULn;
	private final UFillTxOrUFillModel uFillTxOrUFill;
	private final CTTextFontModel latin;
	private final CTTextFontModel ea;
	private final CTTextFontModel cs;
	private final CTTextFontModel sym;
	private final CTHyperlinkModel hlinkClick;
	private final CTHyperlinkModel hlinkMouseOver;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTTextCharacterPropertiesModel(STTextStrikeTypeModel strike, BooleanModel noProof, StringModel bmk, STPercentageModel baseline, BooleanModel dirty, BooleanModel smtClean, BooleanModel err, BooleanModel kumimoji, BooleanModel b, BooleanModel i, STTextLanguageIDModel lang, STTextFontSizeModel sz, UnsignedIntModel smtId, BooleanModel normalizeH, STTextUnderlineTypeModel u, STTextNonNegativePointModel kern, STTextCapsTypeModel cap, STTextLanguageIDModel altLang, STTextPointModel spc, CTLinePropertiesModel ln, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill, EffectLstOrEffectDagModel effectLstOrEffectDag, CTColorModel highlight, ULnTxOrULnModel uLnTxOrULn, UFillTxOrUFillModel uFillTxOrUFill, CTTextFontModel latin, CTTextFontModel ea, CTTextFontModel cs, CTTextFontModel sym, CTHyperlinkModel hlinkClick, CTHyperlinkModel hlinkMouseOver, CTOfficeArtExtensionListModel extLst) {
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
		this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
		this.effectLstOrEffectDag = effectLstOrEffectDag;
		this.highlight = highlight;
		this.uLnTxOrULn = uLnTxOrULn;
		this.uFillTxOrUFill = uFillTxOrUFill;
		this.latin = latin;
		this.ea = ea;
		this.cs = cs;
		this.sym = sym;
		this.hlinkClick = hlinkClick;
		this.hlinkMouseOver = hlinkMouseOver;
		this.extLst = extLst;
	}
	
	public STTextStrikeTypeModel getStrike() {
		return this.strike;
	}
	public BooleanModel getNoProof() {
		return this.noProof;
	}
	public StringModel getBmk() {
		return this.bmk;
	}
	public STPercentageModel getBaseline() {
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
	public STTextLanguageIDModel getLang() {
		return this.lang;
	}
	public STTextFontSizeModel getSz() {
		return this.sz;
	}
	public UnsignedIntModel getSmtId() {
		return this.smtId;
	}
	public BooleanModel getNormalizeH() {
		return this.normalizeH;
	}
	public STTextUnderlineTypeModel getU() {
		return this.u;
	}
	public STTextNonNegativePointModel getKern() {
		return this.kern;
	}
	public STTextCapsTypeModel getCap() {
		return this.cap;
	}
	public STTextLanguageIDModel getAltLang() {
		return this.altLang;
	}
	public STTextPointModel getSpc() {
		return this.spc;
	}
	public CTLinePropertiesModel getLn() {
		return this.ln;
	}
	public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
		return this.noFillOrSolidFillOrGradFill;
	}
	public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
		return this.effectLstOrEffectDag;
	}
	public CTColorModel getHighlight() {
		return this.highlight;
	}
	public ULnTxOrULnModel getULnTxOrULn() {
		return this.uLnTxOrULn;
	}
	public UFillTxOrUFillModel getUFillTxOrUFill() {
		return this.uFillTxOrUFill;
	}
	public CTTextFontModel getLatin() {
		return this.latin;
	}
	public CTTextFontModel getEa() {
		return this.ea;
	}
	public CTTextFontModel getCs() {
		return this.cs;
	}
	public CTTextFontModel getSym() {
		return this.sym;
	}
	public CTHyperlinkModel getHlinkClick() {
		return this.hlinkClick;
	}
	public CTHyperlinkModel getHlinkMouseOver() {
		return this.hlinkMouseOver;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
