package Model.Package;

/**
 *
 * @author FRONT-END.06
 */
public class ReasonModel {
    public ReasonModel(){}

    public ReasonModel(int idReason, String reason) {
        this.idReason = idReason;
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public int getIdReason() {
        return idReason;
    }

    public void setIdReason(int idReason) {
        this.idReason = idReason;
    }
    private int idReason;
    private String reason;
}
