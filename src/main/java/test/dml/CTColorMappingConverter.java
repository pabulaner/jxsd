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
import test.dml.CTColorMappingModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorMappingConverter
{
	
	private CTColorMappingConverter() {
		// empty
	}
	
	public static CTColorMappingModel fromDocx4j(CTColorMapping value)
	{
		return new CTColorMappingModel(
		STColorSchemeIndexConverter.fromDocx4j(value.getTx1())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getAccent3())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getAccent2())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getHlink())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getAccent1())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getFolHlink())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getAccent6())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getBg2())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getAccent5())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getBg1())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getTx2())
		,
		STColorSchemeIndexConverter.fromDocx4j(value.getAccent4())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
