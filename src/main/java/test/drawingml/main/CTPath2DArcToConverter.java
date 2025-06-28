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
import test.drawingml.main.CTPath2DArcToModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPath2DArcToConverter
{
	
	private CTPath2DArcToConverter() {
		// empty
	}
	
	public static CTPath2DArcToModel fromDocx4j(CTPath2DArcTo value)
	{
		return new CTPath2DArcToModel(
		STAdjAngleConverter.fromDocx4j(value.getStAng())
		,
		STAdjAngleConverter.fromDocx4j(value.getSwAng())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getWR())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getHR())
		
		);
	}
}
