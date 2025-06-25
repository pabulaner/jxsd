package test.dml.chart;

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
import org.docx4j.dml.*;
import test.dml.chart.CTTrendlineTypeModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTrendlineTypeConverter
{
	
	private CTTrendlineTypeConverter() {
		// empty
	}
	
	public static CTTrendlineTypeModel fromDocx4j(CTTrendlineType value)
	{
		return new CTTrendlineTypeModel(
		STTrendlineTypeConverter.fromDocx4j(value.getVal())
		
		);
	}
}
