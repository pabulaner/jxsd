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
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.dml.CTBaseStylesModel.FontSchemeModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTBaseStylesModel.*;
import test.officeDocument.relationships.*;

public class CTBaseStylesModel
{
	
	public static class FontSchemeModel
	{
		
		private final StringModel name;
		private final CTFontCollectionModel majorFont;
		private final CTFontCollectionModel minorFont;
		private final CTOfficeArtExtensionListModel extLst;
		
		public FontSchemeModel(StringModel name, CTFontCollectionModel majorFont, CTFontCollectionModel minorFont, CTOfficeArtExtensionListModel extLst) {
			this.name = name;
			this.majorFont = majorFont;
			this.minorFont = minorFont;
			this.extLst = extLst;
		}
		
		public StringModel getName() {
			return this.name;
		}
		public CTFontCollectionModel getMajorFont() {
			return this.majorFont;
		}
		public CTFontCollectionModel getMinorFont() {
			return this.minorFont;
		}
		public CTOfficeArtExtensionListModel getExtLst() {
			return this.extLst;
		}
	}
	private final CTColorSchemeModel clrScheme;
	private final FontSchemeModel fontScheme;
	private final CTStyleMatrixModel fmtScheme;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTBaseStylesModel(CTColorSchemeModel clrScheme, FontSchemeModel fontScheme, CTStyleMatrixModel fmtScheme, CTOfficeArtExtensionListModel extLst) {
		this.clrScheme = clrScheme;
		this.fontScheme = fontScheme;
		this.fmtScheme = fmtScheme;
		this.extLst = extLst;
	}
	
	public CTColorSchemeModel getClrScheme() {
		return this.clrScheme;
	}
	public FontSchemeModel getFontScheme() {
		return this.fontScheme;
	}
	public CTStyleMatrixModel getFmtScheme() {
		return this.fmtScheme;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
