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
import test.drawingml.main.CTBaseStylesOverrideModel.FontSchemeModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.CTBaseStylesOverrideModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBaseStylesOverrideConverter
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
	private CTBaseStylesOverrideConverter() {
		// empty
	}
	
	public static CTBaseStylesOverrideModel fromDocx4j(CTBaseStylesOverride value)
	{
		return new CTBaseStylesOverrideModel(
		CTColorSchemeConverter.fromDocx4j(value.getClrScheme())
		,
		FontSchemeConverter.fromDocx4j(value.getFontScheme())
		,
		CTStyleMatrixConverter.fromDocx4j(value.getFmtScheme())
		
		);
	}
}
