public class Skin {

    private String name;

    private String rarity;

    private String wear;

    private String weaponType;

    private double value;

    public Skin() {
    }

    public Skin(String name, String rarity, String wear, String weaponType, double value) {
        this.name = name;
        this.rarity = rarity;
        this.wear = wear;
        this.weaponType = weaponType;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getWear() {
        return wear;
    }

    public void setWear(String wear) {
        this.wear = wear;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Skin [name=" + name + ", rarity=" + rarity + ", wear=" + wear + ", weaponType=" + weaponType
                + ", value=" + value + "]";
    }
}