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
import test.drawingml.main.CTRegularTextRunModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTRegularTextRunConverter
{
	
	private CTRegularTextRunConverter() {
		// empty
	}
	
	public static CTRegularTextRunModel fromDocx4j(CTRegularTextRun value)
	{
		return new CTRegularTextRunModel(
		CTTextCharacterPropertiesConverter.fromDocx4j(value.getRPr())
		,
		StringConverter.fromDocx4j(value.getT())
		
		);
	}
}
