
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.UnsignedIntModel;
import test._2001.XMLSchema.UnsignedByteModel;


public class CT_AudioCDTimeModel {


    private final UnsignedIntModel time;
    private final UnsignedByteModel track;

    public CT_AudioCDTimeModel(UnsignedIntModel time, UnsignedByteModel track) {
        this.time = time;
        this.track = track;
    }

    public UnsignedIntModel getTime() {
        return this.time;
    }
    public UnsignedByteModel getTrack() {
        return this.track;
    }
}
