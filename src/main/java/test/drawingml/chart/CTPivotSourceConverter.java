package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.CTPivotSourceModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPivotSourceConverter
{
	
	private CTPivotSourceConverter() {
		// empty
	}
	
	public static CTPivotSourceModel fromDocx4j(CTPivotSource value)
	{
		return new CTPivotSourceModel(
		STXstringConverter.fromDocx4j(value.getName())
		,
		CTUnsignedIntConverter.fromDocx4j(value.getFmtId())
		,
		value.getExtLst().stream().map(CTExtensionListConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
