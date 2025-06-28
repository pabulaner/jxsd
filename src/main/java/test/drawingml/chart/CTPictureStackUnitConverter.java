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
import test.drawingml.chart.CTPictureStackUnitModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPictureStackUnitConverter
{
	
	private CTPictureStackUnitConverter() {
		// empty
	}
	
	public static CTPictureStackUnitModel fromDocx4j(CTPictureStackUnit value)
	{
		return new CTPictureStackUnitModel(
		STPictureStackUnitConverter.fromDocx4j(value.getVal())
		
		);
	}
}
