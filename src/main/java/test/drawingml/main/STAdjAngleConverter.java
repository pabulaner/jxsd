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
import test.drawingml.main.STAdjAngleModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// UNION CONVERTER
public class STAdjAngleConverter
{
	
	private STAdjAngleConverter() {
		// empty
	}
	
	public static STAdjAngleModel fromDocx4j(STAdjAngle value)
	{
		if (value.getVal() instanceof type.toDocx4j()) return new STAdjAngleModel(
		STAngleConverter.fromDocx4j(value.getVal())
		);
		if (value.getVal() instanceof type.toDocx4j()) return new STAdjAngleModel(
		STGeomGuideNameConverter.fromDocx4j(value.getVal())
		);
		
		return new STAdjAngleModel();
	}
}
