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
import test.XMLSchema.*;
import test.dml.*;
import test.dml.CTColorSchemeListModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorSchemeListConverter
{
	
	private CTColorSchemeListConverter() {
		// empty
	}
	
	public static CTColorSchemeListModel fromDocx4j(CTColorSchemeList value)
	{
		return new CTColorSchemeListModel(
		value.getExtraClrScheme().stream().map(CTColorSchemeAndMappingConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
