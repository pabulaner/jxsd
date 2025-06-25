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
import test.dml.chart.CTTxModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTxConverter
{
	
	private CTTxConverter() {
		// empty
	}
	
	public static CTTxModel fromDocx4j(CTTx value)
	{
		if (value.getStrRef() != null) return new CTTxModel(
		CTStrRefConverter.fromDocx4j(value.getStrRef())
		);
		if (value.getRich() != null) return new CTTxModel(
		CTTextBodyConverter.fromDocx4j(value.getRich())
		);
		
		return new CTTxModel();
	}
}
