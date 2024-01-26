package Model.CashierReport;

/**
 *
 * @author FRONT-END.06
 */
public class DataSuccessModelReport {
    private Data data;
    private String msg;
//    private ReportCashier report;

    public DataSuccessModelReport(){}
    public DataSuccessModelReport(String msg,Data data){
        this.msg=msg;
        this.data=data;
//        this.report=report;
    }
    
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }    
    
}
