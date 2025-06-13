


public class CT_AudioCDTimeModel {


    private final UnsignedIntModel time;
    private final UnsignedByteModel track;

    public CT_AudioCDTimeModel(UnsignedIntModel time , UnsignedByteModel track ) {
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