package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTTextAutonumberBulletModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTextAutonumberBulletConverter
{
	
	private CTTextAutonumberBulletConverter() {
		// empty
	}
	
	public static CTTextAutonumberBulletModel fromDocx4j(CTTextAutonumberBullet value)
	{
		return new CTTextAutonumberBulletModel(
		STTextAutonumberSchemeConverter.fromDocx4j(value.getType())
		,
		STTextBulletStartAtNumConverter.fromDocx4j(value.getStartAt())
		
		);
	}
}
