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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTDTableModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTDTableConverter
{
	
	private CTDTableConverter() {
		// empty
	}
	
	public static CTDTableModel fromDocx4j(CTDTable value)
	{
		return new CTDTableModel(
		CTBooleanConverter.fromDocx4j(value.getShowHorzBorder())
		,
		CTBooleanConverter.fromDocx4j(value.getShowVertBorder())
		,
		CTBooleanConverter.fromDocx4j(value.getShowOutline())
		,
		CTBooleanConverter.fromDocx4j(value.getShowKeys())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
