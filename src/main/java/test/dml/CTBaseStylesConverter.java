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

public class CTBaseStylesConverter
{
	
	public static class FontSchemeConverter
	{
		
		private CTBaseStylesConverter() {
			// empty
		}
		
		public static CTBaseStylesModel fromDocx4j(CTBaseStyles value)
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
