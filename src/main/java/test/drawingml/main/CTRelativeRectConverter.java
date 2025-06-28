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
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTRelativeRectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTRelativeRectConverter
{
	
	private CTRelativeRectConverter() {
		// empty
	}
	
	public static CTRelativeRectModel fromDocx4j(CTRelativeRect value)
	{
		return new CTRelativeRectModel(
		STPercentageConverter.fromDocx4j(value.getL())
		,
		STPercentageConverter.fromDocx4j(value.getT())
		,
		STPercentageConverter.fromDocx4j(value.getR())
		,
		STPercentageConverter.fromDocx4j(value.getB())
		
		);
	}
}
