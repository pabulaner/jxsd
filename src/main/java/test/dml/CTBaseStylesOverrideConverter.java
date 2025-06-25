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
import test.dml.CTBaseStylesOverrideModel.*;
import test.dml.chartDrawing.*;
import test.dml.CTBaseStylesOverrideModel.FontSchemeModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBaseStylesOverrideConverter
{
	
	public static class FontSchemeConverter
	{
		
		private CTBaseStylesOverrideConverter() {
			// empty
		}
		
		public static CTBaseStylesOverrideModel fromDocx4j(CTBaseStylesOverride value)
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
