package Model.CustomerType;

/**
 *
 * @author FRONT-END.06
 */
public class SourceModel {

    public SourceModel(){}

    public SourceModel(int sourceId, String sourceName) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
    }

    
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }
    
    private int sourceId;
    private String sourceName;
}
