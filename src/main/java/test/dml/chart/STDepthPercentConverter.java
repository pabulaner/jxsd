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
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.STDepthPercentModel.*;
import test.officeDocument.relationships.*;

public class STDepthPercentConverter
{
	
	private STDepthPercentConverter() {
		// empty
	}
	
	public static STDepthPercentModel fromDocx4j(Long value) {
		return new STDepthPercentModel(value);
	}
}
