package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTTextParagraphPropertiesModel.BuClrTxOrBuClrModel.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.*;
import test.XMLSchema.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.*;
import test.drawingml.main.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.BuFontTxOrBuFontModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;

// SEQUENCE MODEL
public class CTTextParagraphPropertiesModel
{
	
	// CHOICE MODEL
	public static class BuClrTxOrBuClrModel
	{
		
		private final int type;
		
		private final Object value;
		
		public BuClrTxOrBuClrModel() {
			this(-1, null);
		}
		
		private BuClrTxOrBuClrModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static BuClrTxOrBuClrModel createBuClrTx(CTTextBulletColorFollowTextModel value) {
			return new BuClrTxOrBuClrModel(0, value);
		}
		public static BuClrTxOrBuClrModel createBuClr(CTColorModel value) {
			return new BuClrTxOrBuClrModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isBuClrTx() {
			return this.type == 0;
		}
		
		public CTTextBulletColorFollowTextModel getBuClrTx() {
			if (this.type != 0) throw new ClassCastException();
			return (CTTextBulletColorFollowTextModel) value;
		}
		public boolean isBuClr() {
			return this.type == 1;
		}
		
		public CTColorModel getBuClr() {
			if (this.type != 1) throw new ClassCastException();
			return (CTColorModel) value;
		}
	}
	// CHOICE MODEL
	public static class BuSzTxOrBuSzPctOrBuSzPtsModel
	{
		
		private final int type;
		
		private final Object value;
		
		public BuSzTxOrBuSzPctOrBuSzPtsModel() {
			this(-1, null);
		}
		
		private BuSzTxOrBuSzPctOrBuSzPtsModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static BuSzTxOrBuSzPctOrBuSzPtsModel createBuSzTx(CTTextBulletSizeFollowTextModel value) {
			return new BuSzTxOrBuSzPctOrBuSzPtsModel(0, value);
		}
		public static BuSzTxOrBuSzPctOrBuSzPtsModel createBuSzPct(CTTextBulletSizePercentModel value) {
			return new BuSzTxOrBuSzPctOrBuSzPtsModel(1, value);
		}
		public static BuSzTxOrBuSzPctOrBuSzPtsModel createBuSzPts(CTTextBulletSizePointModel value) {
			return new BuSzTxOrBuSzPctOrBuSzPtsModel(2, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isBuSzTx() {
			return this.type == 0;
		}
		
		public CTTextBulletSizeFollowTextModel getBuSzTx() {
			if (this.type != 0) throw new ClassCastException();
			return (CTTextBulletSizeFollowTextModel) value;
		}
		public boolean isBuSzPct() {
			return this.type == 1;
		}
		
		public CTTextBulletSizePercentModel getBuSzPct() {
			if (this.type != 1) throw new ClassCastException();
			return (CTTextBulletSizePercentModel) value;
		}
		public boolean isBuSzPts() {
			return this.type == 2;
		}
		
		public CTTextBulletSizePointModel getBuSzPts() {
			if (this.type != 2) throw new ClassCastException();
			return (CTTextBulletSizePointModel) value;
		}
	}
	// CHOICE MODEL
	public static class BuFontTxOrBuFontModel
	{
		
		private final int type;
		
		private final Object value;
		
		public BuFontTxOrBuFontModel() {
			this(-1, null);
		}
		
		private BuFontTxOrBuFontModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static BuFontTxOrBuFontModel createBuFontTx(CTTextBulletTypefaceFollowTextModel value) {
			return new BuFontTxOrBuFontModel(0, value);
		}
		public static BuFontTxOrBuFontModel createBuFont(CTTextFontModel value) {
			return new BuFontTxOrBuFontModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isBuFontTx() {
			return this.type == 0;
		}
		
		public CTTextBulletTypefaceFollowTextModel getBuFontTx() {
			if (this.type != 0) throw new ClassCastException();
			return (CTTextBulletTypefaceFollowTextModel) value;
		}
		public boolean isBuFont() {
			return this.type == 1;
		}
		
		public CTTextFontModel getBuFont() {
			if (this.type != 1) throw new ClassCastException();
			return (CTTextFontModel) value;
		}
	}
	// CHOICE MODEL
	public static class BuNoneOrBuAutoNumOrBuCharModel
	{
		
		private final int type;
		
		private final Object value;
		
		public BuNoneOrBuAutoNumOrBuCharModel() {
			this(-1, null);
		}
		
		private BuNoneOrBuAutoNumOrBuCharModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static BuNoneOrBuAutoNumOrBuCharModel createBuNone(CTTextNoBulletModel value) {
			return new BuNoneOrBuAutoNumOrBuCharModel(0, value);
		}
		public static BuNoneOrBuAutoNumOrBuCharModel createBuAutoNum(CTTextAutonumberBulletModel value) {
			return new BuNoneOrBuAutoNumOrBuCharModel(1, value);
		}
		public static BuNoneOrBuAutoNumOrBuCharModel createBuChar(CTTextCharBulletModel value) {
			return new BuNoneOrBuAutoNumOrBuCharModel(2, value);
		}
		public static BuNoneOrBuAutoNumOrBuCharModel createBuBlip(CTTextBlipBulletModel value) {
			return new BuNoneOrBuAutoNumOrBuCharModel(3, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isBuNone() {
			return this.type == 0;
		}
		
		public CTTextNoBulletModel getBuNone() {
			if (this.type != 0) throw new ClassCastException();
			return (CTTextNoBulletModel) value;
		}
		public boolean isBuAutoNum() {
			return this.type == 1;
		}
		
		public CTTextAutonumberBulletModel getBuAutoNum() {
			if (this.type != 1) throw new ClassCastException();
			return (CTTextAutonumberBulletModel) value;
		}
		public boolean isBuChar() {
			return this.type == 2;
		}
		
		public CTTextCharBulletModel getBuChar() {
			if (this.type != 2) throw new ClassCastException();
			return (CTTextCharBulletModel) value;
		}
		public boolean isBuBlip() {
			return this.type == 3;
		}
		
		public CTTextBlipBulletModel getBuBlip() {
			if (this.type != 3) throw new ClassCastException();
			return (CTTextBlipBulletModel) value;
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
