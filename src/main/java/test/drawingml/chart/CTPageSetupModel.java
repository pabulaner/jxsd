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
import test.drawingml.chart.CTPageSetupModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPageSetupModel
{
	
	private final IntModel verticalDpi;
	private final IntModel horizontalDpi;
	private final UnsignedIntModel firstPageNumber;
	private final STPageSetupOrientationModel orientation;
	private final BooleanModel draft;
	private final UnsignedIntModel copies;
	private final UnsignedIntModel paperSize;
	private final BooleanModel useFirstPageNumber;
	private final BooleanModel blackAndWhite;
	
	public CTPageSetupModel(IntModel verticalDpi, IntModel horizontalDpi, UnsignedIntModel firstPageNumber, STPageSetupOrientationModel orientation, BooleanModel draft, UnsignedIntModel copies, UnsignedIntModel paperSize, BooleanModel useFirstPageNumber, BooleanModel blackAndWhite) {
		this.verticalDpi = verticalDpi;
		this.horizontalDpi = horizontalDpi;
		this.firstPageNumber = firstPageNumber;
		this.orientation = orientation;
		this.draft = draft;
		this.copies = copies;
		this.paperSize = paperSize;
		this.useFirstPageNumber = useFirstPageNumber;
		this.blackAndWhite = blackAndWhite;
	}
	
	public IntModel getVerticalDpi() {
		return this.verticalDpi;
	}
	public IntModel getHorizontalDpi() {
		return this.horizontalDpi;
	}
	public UnsignedIntModel getFirstPageNumber() {
		return this.firstPageNumber;
	}
	public STPageSetupOrientationModel getOrientation() {
		return this.orientation;
	}
	public BooleanModel getDraft() {
		return this.draft;
	}
	public UnsignedIntModel getCopies() {
		return this.copies;
	}
	public UnsignedIntModel getPaperSize() {
		return this.paperSize;
	}
	public BooleanModel getUseFirstPageNumber() {
		return this.useFirstPageNumber;
	}
	public BooleanModel getBlackAndWhite() {
		return this.blackAndWhite;
	}
}
