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
import test.drawingml.chart.CTLblOffsetModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTLblOffsetConverter
{
	
	private CTLblOffsetConverter() {
		// empty
	}
	
	public static CTLblOffsetModel fromDocx4j(CTLblOffset value)
	{
		return new CTLblOffsetModel(
		STLblOffsetConverter.fromDocx4j(value.getVal())
		
		);
	}
}
