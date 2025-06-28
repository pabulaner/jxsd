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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTBaseStylesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTBaseStylesModel.FontSchemeModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBaseStylesConverter
{
	
	// SEQUENCE CONVERTER
	public static class FontSchemeConverter
	{
		
		private FontSchemeConverter() {
			// empty
		}
		
		public static FontSchemeModel fromDocx4j(FontScheme value)
		{
			return new FontSchemeModel(
			StringConverter.fromDocx4j(value.getName())
			,
			CTFontCollectionConverter.fromDocx4j(value.getMajorFont())
			,
			CTFontCollectionConverter.fromDocx4j(value.getMinorFont())
			,
			CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
			
			);
		}
	}
	private CTBaseStylesConverter() {
		// empty
	}
	
	public static CTBaseStylesModel fromDocx4j(CTBaseStyles value)
	{
		return new CTBaseStylesModel(
		CTColorSchemeConverter.fromDocx4j(value.getClrScheme())
		,
		FontSchemeConverter.fromDocx4j(value.getFontScheme())
		,
		CTStyleMatrixConverter.fromDocx4j(value.getFmtScheme())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
