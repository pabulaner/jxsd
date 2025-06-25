package test.dml.chart;

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
import test.dml.chartDrawing.*;
import test.dml.chart.CTScalingModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTScalingConverter
{
	
	private CTScalingConverter() {
		// empty
	}
	
	public static CTScalingModel fromDocx4j(CTScaling value)
	{
		return new CTScalingModel(
		CTLogBaseConverter.fromDocx4j(value.getLogBase())
		,
		CTOrientationConverter.fromDocx4j(value.getOrientation())
		,
		CTDoubleConverter.fromDocx4j(value.getMax())
		,
		CTDoubleConverter.fromDocx4j(value.getMin())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
