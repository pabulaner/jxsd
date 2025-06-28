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
import test.drawingml.main.STAdjCoordinateModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// UNION CONVERTER
public class STAdjCoordinateConverter
{
	
	private STAdjCoordinateConverter() {
		// empty
	}
	
	public static STAdjCoordinateModel fromDocx4j(STAdjCoordinate value)
	{
		if (value.getVal() instanceof type.toDocx4j()) return new STAdjCoordinateModel(
		STCoordinateConverter.fromDocx4j(value.getVal())
		);
		if (value.getVal() instanceof type.toDocx4j()) return new STAdjCoordinateModel(
		STGeomGuideNameConverter.fromDocx4j(value.getVal())
		);
		
		return new STAdjCoordinateModel();
	}
}
