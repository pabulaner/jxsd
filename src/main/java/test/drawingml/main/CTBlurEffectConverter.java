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
import test.drawingml.main.CTBlurEffectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBlurEffectConverter
{
	
	private CTBlurEffectConverter() {
		// empty
	}
	
	public static CTBlurEffectModel fromDocx4j(CTBlurEffect value)
	{
		return new CTBlurEffectModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getRad())
		,
		BooleanConverter.fromDocx4j(value.getGrow())
		
		);
	}
}
