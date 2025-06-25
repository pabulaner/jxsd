package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTTextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.*;
import test.dml.chart.*;
import test.dml.CTTextParagraphPropertiesModel.BuClrTxOrBuClrModel.*;
import test.XMLSchema.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.dml.CTTextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.*;
import test.dml.CTTextParagraphPropertiesModel.*;
import test.dml.CTTextParagraphPropertiesModel.BuFontTxOrBuFontModel.*;
import test.dml.chartDrawing.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;

public class CTTextParagraphPropertiesModel
{
	
	public static class BuClrTxOrBuClrModel
	{
		
		private final CTTextBulletColorFollowTextModel buClrTx;
		private final CTColorModel buClr;
		
		public BuClrTxOrBuClrModel(CTTextBulletColorFollowTextModel buClrTx, CTColorModel buClr) {
			this.buClrTx = buClrTx;
			this.buClr = buClr;
		}
		
		public CTTextBulletColorFollowTextModel getBuClrTx() {
			return this.buClrTx;
		}
		public CTColorModel getBuClr() {
			return this.buClr;
		}
	}
	public static class BuSzTxOrBuSzPctOrBuSzPtsModel
	{
		
		private final CTTextBulletSizeFollowTextModel buSzTx;
		private final CTTextBulletSizePercentModel buSzPct;
		private final CTTextBulletSizePointModel buSzPts;
		
		public BuSzTxOrBuSzPctOrBuSzPtsModel(CTTextBulletSizeFollowTextModel buSzTx, CTTextBulletSizePercentModel buSzPct, CTTextBulletSizePointModel buSzPts) {
			this.buSzTx = buSzTx;
			this.buSzPct = buSzPct;
			this.buSzPts = buSzPts;
		}
		
		public CTTextBulletSizeFollowTextModel getBuSzTx() {
			return this.buSzTx;
		}
		public CTTextBulletSizePercentModel getBuSzPct() {
			return this.buSzPct;
		}
		public CTTextBulletSizePointModel getBuSzPts() {
			return this.buSzPts;
		}
	}
	public static class BuFontTxOrBuFontModel
	{
		
		private final CTTextBulletTypefaceFollowTextModel buFontTx;
		private final CTTextFontModel buFont;
		
		public BuFontTxOrBuFontModel(CTTextBulletTypefaceFollowTextModel buFontTx, CTTextFontModel buFont) {
			this.buFontTx = buFontTx;
			this.buFont = buFont;
		}
		
		public CTTextBulletTypefaceFollowTextModel getBuFontTx() {
			return this.buFontTx;
		}
		public CTTextFontModel getBuFont() {
			return this.buFont;
		}
	}
	public static class BuNoneOrBuAutoNumOrBuCharModel
	{
		
		private final CTTextNoBulletModel buNone;
		private final CTTextAutonumberBulletModel buAutoNum;
		private final CTTextCharBulletModel buChar;
		private final CTTextBlipBulletModel buBlip;
		
		public BuNoneOrBuAutoNumOrBuCharModel(CTTextNoBulletModel buNone, CTTextAutonumberBulletModel buAutoNum, CTTextCharBulletModel buChar, CTTextBlipBulletModel buBlip) {
			this.buNone = buNone;
			this.buAutoNum = buAutoNum;
			this.buChar = buChar;
			this.buBlip = buBlip;
		}
		
		public CTTextNoBulletModel getBuNone() {
			return this.buNone;
		}
		public CTTextAutonumberBulletModel getBuAutoNum() {
			return this.buAutoNum;
		}
		public CTTextCharBulletModel getBuChar() {
			return this.buChar;
		}
		public CTTextBlipBulletModel getBuBlip() {
			return this.buBlip;
		}
	}
	private final STTextIndentModel indent;
	private final BooleanModel latinLnBrk;
	private final STTextMarginModel marR;
	private final BooleanModel hangingPunct;
	private final STTextFontAlignTypeModel fontAlgn;
	private final BooleanModel eaLnBrk;
	private final BooleanModel rtl;
	private final STTextIndentLevelTypeModel lvl;
	private final STTextMarginModel marL;
	private final STCoordinate32Model defTabSz;
	private final STTextAlignTypeModel algn;
	private final CTTextSpacingModel lnSpc;
	private final CTTextSpacingModel spcBef;
	private final CTTextSpacingModel spcAft;
	private final BuClrTxOrBuClrModel buClrTxOrBuClr;
	private final BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts;
	private final BuFontTxOrBuFontModel buFontTxOrBuFont;
	private final BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar;
	private final CTTextTabStopListModel tabLst;
	private final CTTextCharacterPropertiesModel defRPr;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTTextParagraphPropertiesModel(STTextIndentModel indent, BooleanModel latinLnBrk, STTextMarginModel marR, BooleanModel hangingPunct, STTextFontAlignTypeModel fontAlgn, BooleanModel eaLnBrk, BooleanModel rtl, STTextIndentLevelTypeModel lvl, STTextMarginModel marL, STCoordinate32Model defTabSz, STTextAlignTypeModel algn, CTTextSpacingModel lnSpc, CTTextSpacingModel spcBef, CTTextSpacingModel spcAft, BuClrTxOrBuClrModel buClrTxOrBuClr, BuSzTxOrBuSzPctOrBuSzPtsModel buSzTxOrBuSzPctOrBuSzPts, BuFontTxOrBuFontModel buFontTxOrBuFont, BuNoneOrBuAutoNumOrBuCharModel buNoneOrBuAutoNumOrBuChar, CTTextTabStopListModel tabLst, CTTextCharacterPropertiesModel defRPr, CTOfficeArtExtensionListModel extLst) {
		this.indent = indent;
		this.latinLnBrk = latinLnBrk;
		this.marR = marR;
		this.hangingPunct = hangingPunct;
		this.fontAlgn = fontAlgn;
		this.eaLnBrk = eaLnBrk;
		this.rtl = rtl;
		this.lvl = lvl;
		this.marL = marL;
		this.defTabSz = defTabSz;
		this.algn = algn;
		this.lnSpc = lnSpc;
		this.spcBef = spcBef;
		this.spcAft = spcAft;
		this.buClrTxOrBuClr = buClrTxOrBuClr;
		this.buSzTxOrBuSzPctOrBuSzPts = buSzTxOrBuSzPctOrBuSzPts;
		this.buFontTxOrBuFont = buFontTxOrBuFont;
		this.buNoneOrBuAutoNumOrBuChar = buNoneOrBuAutoNumOrBuChar;
		this.tabLst = tabLst;
		this.defRPr = defRPr;
		this.extLst = extLst;
	}
	
	public STTextIndentModel getIndent() {
		return this.indent;
	}
	public BooleanModel getLatinLnBrk() {
		return this.latinLnBrk;
	}
	public STTextMarginModel getMarR() {
		return this.marR;
	}
	public BooleanModel getHangingPunct() {
		return this.hangingPunct;
	}
	public STTextFontAlignTypeModel getFontAlgn() {
		return this.fontAlgn;
	}
	public BooleanModel getEaLnBrk() {
		return this.eaLnBrk;
	}
	public BooleanModel getRtl() {
		return this.rtl;
	}
	public STTextIndentLevelTypeModel getLvl() {
		return this.lvl;
	}
	public STTextMarginModel getMarL() {
		return this.marL;
	}
	public STCoordinate32Model getDefTabSz() {
		return this.defTabSz;
	}
	public STTextAlignTypeModel getAlgn() {
		return this.algn;
	}
	public CTTextSpacingModel getLnSpc() {
		return this.lnSpc;
	}
	public CTTextSpacingModel getSpcBef() {
		return this.spcBef;
	}
	public CTTextSpacingModel getSpcAft() {
		return this.spcAft;
	}
	public BuClrTxOrBuClrModel getBuClrTxOrBuClr() {
		return this.buClrTxOrBuClr;
	}
	public BuSzTxOrBuSzPctOrBuSzPtsModel getBuSzTxOrBuSzPctOrBuSzPts() {
		return this.buSzTxOrBuSzPctOrBuSzPts;
	}
	public BuFontTxOrBuFontModel getBuFontTxOrBuFont() {
		return this.buFontTxOrBuFont;
	}
	public BuNoneOrBuAutoNumOrBuCharModel getBuNoneOrBuAutoNumOrBuChar() {
		return this.buNoneOrBuAutoNumOrBuChar;
	}
	public CTTextTabStopListModel getTabLst() {
		return this.tabLst;
	}
	public CTTextCharacterPropertiesModel getDefRPr() {
		return this.defRPr;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
