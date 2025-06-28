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
import test.drawingml.chart.CTBandFmtsModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBandFmtsConverter
{
	
	private CTBandFmtsConverter() {
		// empty
	}
	
	public static CTBandFmtsModel fromDocx4j(CTBandFmts value)
	{
		return new CTBandFmtsModel(
		value.getBandFmt().stream().map(CTBandFmtConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
