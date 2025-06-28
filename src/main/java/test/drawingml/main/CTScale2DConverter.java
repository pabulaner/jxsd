package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTScale2DModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTScale2DConverter
{
	
	private CTScale2DConverter() {
		// empty
	}
	
	public static CTScale2DModel fromDocx4j(CTScale2D value)
	{
		return new CTScale2DModel(
		CTRatioConverter.fromDocx4j(value.getSx())
		,
		CTRatioConverter.fromDocx4j(value.getSy())
		
		);
	}
}
