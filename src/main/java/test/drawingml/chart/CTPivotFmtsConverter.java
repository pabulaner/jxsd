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
import test.drawingml.chart.CTPivotFmtsModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPivotFmtsConverter
{
	
	private CTPivotFmtsConverter() {
		// empty
	}
	
	public static CTPivotFmtsModel fromDocx4j(CTPivotFmts value)
	{
		return new CTPivotFmtsModel(
		value.getPivotFmt().stream().map(CTPivotFmtConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
