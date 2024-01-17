package Model.PackageProduct;

public class CategoryModel {
    private int id;
    private String catNameEn;
    private int parentId;
    private int movePosition;
    
    public CategoryModel(){}

    public CategoryModel(int id, String catNameEn, int parentId, int movePosition) {
        this.id = id;
        this.catNameEn = catNameEn;
        this.parentId = parentId;
        this.movePosition = movePosition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatNameEn() {
        return catNameEn;
    }

    public void setCatNameEn(String catNameEn) {
        this.catNameEn = catNameEn;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getMovePosition() {
        return movePosition;
    }

    public void setMovePosition(int movePosition) {
        this.movePosition = movePosition;
    }
    
    
    
}
