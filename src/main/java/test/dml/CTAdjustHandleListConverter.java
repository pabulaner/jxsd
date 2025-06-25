package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTAdjustHandleListModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAdjustHandleListConverter
{
	
	private CTAdjustHandleListConverter() {
		// empty
	}
	
	public static CTAdjustHandleListModel fromDocx4j(CTAdjustHandleList value)
	{
		if (value.getAhXY() != null) return new CTAdjustHandleListModel(
		CTXYAdjustHandleConverter.fromDocx4j(value.getAhXY())
		);
		if (value.getAhPolar() != null) return new CTAdjustHandleListModel(
		CTPolarAdjustHandleConverter.fromDocx4j(value.getAhPolar())
		);
		
		return new CTAdjustHandleListModel();
	}
}
