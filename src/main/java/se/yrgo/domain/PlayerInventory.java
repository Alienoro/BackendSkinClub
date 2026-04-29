import java.util.List;

public class PlayerInventory {

    private String id;

    private String playerName;

    private List<Skin> skins;

    private double value;

    public PlayerInventory() {
    }

    public PlayerInventory(String id, String playerName, List<Skin> skins, double value) {
        this.id = id;
        this.playerName = playerName;
        this.skins = skins;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public void setSkins(List<Skin> skins) {
        this.skins = skins;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}