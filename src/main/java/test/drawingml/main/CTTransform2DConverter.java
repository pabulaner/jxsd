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
import test.drawingml.main.CTTransform2DModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTransform2DConverter
{
	
	private CTTransform2DConverter() {
		// empty
	}
	
	public static CTTransform2DModel fromDocx4j(CTTransform2D value)
	{
		return new CTTransform2DModel(
		BooleanConverter.fromDocx4j(value.getFlipV())
		,
		STAngleConverter.fromDocx4j(value.getRot())
		,
		BooleanConverter.fromDocx4j(value.getFlipH())
		,
		CTPoint2DConverter.fromDocx4j(value.getOff())
		,
		CTPositiveSize2DConverter.fromDocx4j(value.getExt())
		
		);
	}
}
