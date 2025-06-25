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
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.dml.CTPositiveSize2DModel.*;

public class CTPositiveSize2DModel
{
	
	private final STPositiveCoordinateModel cy;
	private final STPositiveCoordinateModel cx;
	
	public CTPositiveSize2DModel(STPositiveCoordinateModel cy, STPositiveCoordinateModel cx) {
		this.cy = cy;
		this.cx = cx;
	}
	
	public STPositiveCoordinateModel getCy() {
		return this.cy;
	}
	public STPositiveCoordinateModel getCx() {
		return this.cx;
	}
}
