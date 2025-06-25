package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTVector3DModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
