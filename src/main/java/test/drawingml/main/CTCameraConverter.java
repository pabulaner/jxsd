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
import test.drawingml.main.CTCameraModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTCameraConverter
{
	
	private CTCameraConverter() {
		// empty
	}
	
	public static CTCameraModel fromDocx4j(CTCamera value)
	{
		return new CTCameraModel(
		STPresetCameraTypeConverter.fromDocx4j(value.getPrst())
		,
		STFOVAngleConverter.fromDocx4j(value.getFov())
		,
		STPositivePercentageConverter.fromDocx4j(value.getZoom())
		,
		CTSphereCoordsConverter.fromDocx4j(value.getRot())
		
		);
	}
}
