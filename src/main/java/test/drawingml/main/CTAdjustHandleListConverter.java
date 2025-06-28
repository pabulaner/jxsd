package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTAdjustHandleListModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTAdjustHandleListConverter
{
	
	private CTAdjustHandleListConverter() {
		// empty
	}
	
	public static CTAdjustHandleListModel fromDocx4j(CTAdjustHandleList value)
	{
		if (value.getAhXY() != null) return CTAdjustHandleListModel.createAhXY(
		CTXYAdjustHandleConverter.fromDocx4j(value.getAhXY())
		);
		if (value.getAhPolar() != null) return CTAdjustHandleListModel.createAhPolar(
		CTPolarAdjustHandleConverter.fromDocx4j(value.getAhPolar())
		);
		
		return new CTAdjustHandleListModel();
	}
}
