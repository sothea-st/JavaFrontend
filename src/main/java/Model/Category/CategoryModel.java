package Model.Category;

/**
 *
 * @author FRONT-END.06
 */
public class CategoryModel {

    public String getCatNameEn() {
        return catNameEn;
    }

    public void setCatNameEn(String catNameEn) {
        this.catNameEn = catNameEn;
    }

//    public String getCatNameKh() {
//        return catNameKh;
//    }
//
//    public void setCatNameKh(String catNameKh) {
//        this.catNameKh = catNameKh;
//    }
//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
//    private int id;
//    private String catNameKh;
    private String catNameEn;
    private int id;
    
    public CategoryModel(int id,String catNameEn){
        this.id=id;
        this.catNameEn=catNameEn;
//        this.catNameKh=catNameKh;
    }
}
