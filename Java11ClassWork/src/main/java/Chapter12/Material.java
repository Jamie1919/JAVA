/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author jaypr
 */
public abstract class Material {

    private String materialType = "cotton";
    private String materialType02 = "Wool";
    private String materialType03 = "Silk";

    public String getMaterialType() {
        return materialType;
    }

    public String getMaterialType02() {
        return materialType02;
    }

    public String getMaterialType03() {
        return materialType03;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public abstract double getPrice();
}
