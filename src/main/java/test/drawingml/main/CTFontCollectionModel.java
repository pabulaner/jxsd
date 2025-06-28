package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTFontCollectionModel.FontModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTFontCollectionModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTFontCollectionModel
{
	
	// SEQUENCE MODEL
	public static class FontModel
	{
		
		private final STTextTypefaceModel typeface;
		private final StringModel script;
		
		public FontModel(STTextTypefaceModel typeface, StringModel script) {
			this.typeface = typeface;
			this.script = script;
		}
		
		public STTextTypefaceModel getTypeface() {
			return this.typeface;
		}
		public StringModel getScript() {
			return this.script;
		}
	}
	private final CTTextFontModel latin;
	private final CTTextFontModel ea;
	private final CTTextFontModel cs;
	private final List<FontModel> font;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTFontCollectionModel(CTTextFontModel latin, CTTextFontModel ea, CTTextFontModel cs, List<FontModel> font, CTOfficeArtExtensionListModel extLst) {
		this.latin = latin;
		this.ea = ea;
		this.cs = cs;
		this.font = font;
		this.extLst = extLst;
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
	public List<FontModel> getFont() {
		return this.font;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
