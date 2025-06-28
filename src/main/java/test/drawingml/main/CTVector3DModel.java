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
import test.drawingml.main.CTVector3DModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTVector3DModel
{
	
	private final STCoordinateModel dz;
	private final STCoordinateModel dy;
	private final STCoordinateModel dx;
	
	public CTVector3DModel(STCoordinateModel dz, STCoordinateModel dy, STCoordinateModel dx) {
		this.dz = dz;
		this.dy = dy;
		this.dx = dx;
	}
	
	public STCoordinateModel getDz() {
		return this.dz;
	}
	public STCoordinateModel getDy() {
		return this.dy;
	}
	public STCoordinateModel getDx() {
		return this.dx;
	}
}
