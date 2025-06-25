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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.CTConnectionSiteListModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTConnectionSiteListConverter
{
	
	private CTConnectionSiteListConverter() {
		// empty
	}
	
	public static CTConnectionSiteListModel fromDocx4j(CTConnectionSiteList value)
	{
		return new CTConnectionSiteListModel(
		value.getCxn().stream().map(CTConnectionSiteConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
