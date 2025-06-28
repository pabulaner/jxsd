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
import test.drawingml.chart.CTBubbleScaleModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBubbleScaleConverter
{
	
	private CTBubbleScaleConverter() {
		// empty
	}
	
	public static CTBubbleScaleModel fromDocx4j(CTBubbleScale value)
	{
		return new CTBubbleScaleModel(
		STBubbleScaleConverter.fromDocx4j(value.getVal())
		
		);
	}
}
