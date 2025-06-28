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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTTxModel.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTTxConverter
{
	
	private CTTxConverter() {
		// empty
	}
	
	public static CTTxModel fromDocx4j(CTTx value)
	{
		if (value.getStrRef() != null) return CTTxModel.createStrRef(
		CTStrRefConverter.fromDocx4j(value.getStrRef())
		);
		if (value.getRich() != null) return CTTxModel.createRich(
		CTTextBodyConverter.fromDocx4j(value.getRich())
		);
		
		return new CTTxModel();
	}
}
