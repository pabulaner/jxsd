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
import test.drawingml.main.CTTextBulletSizePercentModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTextBulletSizePercentConverter
{
	
	private CTTextBulletSizePercentConverter() {
		// empty
	}
	
	public static CTTextBulletSizePercentModel fromDocx4j(CTTextBulletSizePercent value)
	{
		return new CTTextBulletSizePercentModel(
		STTextBulletSizePercentConverter.fromDocx4j(value.getVal())
		
		);
	}
}
