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

// SEQUENCE CONVERTER
public class CTFontCollectionConverter
{
	
	// SEQUENCE CONVERTER
	public static class FontConverter
	{
		
		private FontConverter() {
			// empty
		}
		
		public static FontModel fromDocx4j(Font value)
		{
			return new FontModel(
			STTextTypefaceConverter.fromDocx4j(value.getTypeface())
			,
			StringConverter.fromDocx4j(value.getScript())
			
			);
		}
	}
	private CTFontCollectionConverter() {
		// empty
	}
	
	public static CTFontCollectionModel fromDocx4j(CTFontCollection value)
	{
		return new CTFontCollectionModel(
		CTTextFontConverter.fromDocx4j(value.getLatin())
		,
		CTTextFontConverter.fromDocx4j(value.getEa())
		,
		CTTextFontConverter.fromDocx4j(value.getCs())
		,
		value.getFont().stream().map(FontConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
