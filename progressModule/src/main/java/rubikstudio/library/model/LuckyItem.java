package rubikstudio.library.model;

public class LuckyItem {

    private String topText;
    private String secondaryText;
    private String secondaryTextAr;
    private int icon;
    private int color;
    private int amount;

    public LuckyItem() {
        // empty instructor
    }

    public LuckyItem(String secondaryText, String secondaryTextAr, int amount, int sliceColor) {
        this.secondaryText = secondaryText;
        this.secondaryTextAr = secondaryTextAr;
        this.amount = amount;
        this.color = sliceColor;
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getSecondaryText() {
        return secondaryText;
    }

    public void setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
    }

    public String getSecondaryTextAr() {
        return secondaryTextAr;
    }

    public void setSecondaryTextAr(String secondaryTextAr) {
        this.secondaryTextAr = secondaryTextAr;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
