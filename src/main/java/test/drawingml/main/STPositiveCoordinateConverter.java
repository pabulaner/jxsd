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
import test.officeDocument.relationships.*;
import test.drawingml.main.STPositiveCoordinateModel.*;

// RESTRICTION CONVERTER
public class STPositiveCoordinateConverter
{
	
	private STPositiveCoordinateConverter() {
		// empty
	}
	
	public static STPositiveCoordinateModel fromDocx4j(Long value) {
		return new STPositiveCoordinateModel(value);
	}
}
