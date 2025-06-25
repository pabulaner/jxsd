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
import test.dml.CTFontCollectionModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTFontCollectionModel.FontModel.*;
import test.officeDocument.relationships.*;

public class CTFontCollectionConverter
{
	
	public static class FontConverter
	{
		
		private CTFontCollectionConverter() {
			// empty
		}
		
		public static CTFontCollectionModel fromDocx4j(CTFontCollection value)
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
		value.getFont().stream().map(FontConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
