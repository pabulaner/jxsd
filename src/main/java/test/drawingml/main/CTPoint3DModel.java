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
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTPoint3DModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPoint3DModel
{
	
	private final STCoordinateModel y;
	private final STCoordinateModel x;
	private final STCoordinateModel z;
	
	public CTPoint3DModel(STCoordinateModel y, STCoordinateModel x, STCoordinateModel z) {
		this.y = y;
		this.x = x;
		this.z = z;
	}
	
	public STCoordinateModel getY() {
		return this.y;
	}
	public STCoordinateModel getX() {
		return this.x;
	}
	public STCoordinateModel getZ() {
		return this.z;
	}
}
